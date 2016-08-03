import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Ddxc {
    public static void down(String URL, long nPos, String savePathAndFile) {
        HttpURLConnection conn = null;
        try {
            
              String content="<?xml version=\"1.0\" encoding=\"utf-8\" ?>"
              + "<xmlRequest>" + "<header>04</header>" +"<body>"
              + "<user userName=\"222\" password=\"222222\" currentVision=\"20101020165216\" >"
              + "</user>" +"</body>" +"</xmlRequest>";
             
            conn = (HttpURLConnection) new URL(URL).openConnection();
            
              conn.setRequestProperty("content-type", "text/html");
              conn.setRequestProperty("User-Agent", "NetFox");// 设置User-Agent
              conn.setRequestProperty("RANGE", "bytes=" + nPos);// 设置断点续传的开始位置
              conn.setRequestMethod("POST"); //设置请求方法为POST, 也可以为GET
              conn.setDoInput(true); 
              conn.setDoOutput(true);
              
              OutputStream outStream = conn.getOutputStream(); 
              PrintWriter out = new PrintWriter(outStream); 
              out.print(content); 
              out.flush();
              out.close();
             
            // 获得输入流
            InputStream input = conn.getInputStream();
            RandomAccessFile oSavedFile = new RandomAccessFile(savePathAndFile, "rw");
            // 定位文件指针到nPos位置
            oSavedFile.seek(nPos);
            byte[] b = new byte[1024];
            int nRead;
            // 从输入流中读入字节流，然后写到文件中
            while ((nRead = input.read(b, 0, 1024)) > 0) {
                (oSavedFile).write(b, 0, nRead);
            }
            conn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String url = "http://localhost:8080/a";
        String savePath = "f://";
        String fileName = "tmp.exe";
//        String fileNam = fileName;
//        HttpURLConnection conn = null;
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        File file = new File(savePath + fileName);

        int i = 0;
        if (file.exists()) {
            // 先看看是否是完整的，完整，换名字，跳出循环，不完整，继续下载
            long localFileSize = file.length();
            System.out.println("已有文件大小为:" + localFileSize);

            if (localFileSize > 0) {
                System.out.println("文件续传");
                down(url, localFileSize, savePath + fileName);
            } else {
                System.out.println("文件存在，重新下载");
                down(url, 0, savePath + fileName);
            }
        } else {
            try {
                file.createNewFile();
                System.out.println("下载中");
                down(url, 0, savePath + fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}


