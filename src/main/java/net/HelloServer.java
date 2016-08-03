package net;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = null;
        Socket client = null;
        PrintStream out = null;
        server = new ServerSocket(8888);
        System.out.println("aaaaaaaaaaa gogo ");
        client = server.accept();
        String str = "hello world";
        out = new PrintStream(client.getOutputStream());
        out.println(str);
        out.close();
        client.close();
        server.close();
    }
}
/**
 * 命令行运行 java HelloServer
 * 再起一个 命令行 打开 telnet  输入 open localhost 8888
 */
