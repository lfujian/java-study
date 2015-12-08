package io.pipeddemo;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 管道流 -- 进行两个线程间的通信
 * @author lfj  2015年12月1日
 * @Description: 验证管道流
 */
public class PipedDemo {
    public static void main(String[] args) {
        Send s = new Send();
        Receive r = new Receive();
        try {
            s.getPos().connect(r.getpis()); // 连接管道
        } catch (IOException e) {
            e.printStackTrace();
        }
        new Thread(s).start();
        new Thread(r).start();
    }
}
class Send implements Runnable {
    private PipedOutputStream pos = null;
    public Send() {
        this.pos = new PipedOutputStream();
    }
    public void run() {
        String str = "Hello WildDog!!!";
        try {
            this.pos.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            this.pos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public PipedOutputStream getPos() {
        return pos;
    }
}
class Receive implements Runnable {
    private PipedInputStream pis = null;
    public Receive() {
        this.pis = new PipedInputStream();
    }
    public void run() {
        byte b[] = new byte[1024];
        int len = 0;
        try {
            len = this.pis.read(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            this.pis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("接受的内容为："+new String(b,0,len));
    }
    public PipedInputStream getpis() {
        return pis;
    }
}

