package sylu.java1;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 例题二：客户端发送文件给服务端，服务端将文件保存在本地。
 *
 * @author lhang
 * @create 2019-07-01 7:19
 */
public class TCPtest2 {
    //
    @Test
    public void client() {

        Socket socket = null;
        OutputStream os = null;
        FileInputStream fis = null;
        try {
            //1.创建Socket
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 9090);
            //2.创建输出流
            os = socket.getOutputStream();
            //3.创建文件输入流
            fis = new FileInputStream(new File("beauty.jpg"));
            //4.文件的写出操作。
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.资源关闭
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //
    @Test
    public void server()  {

        ServerSocket ss = null;
        Socket socket = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            //1.创建ServerSocket
            ss = new ServerSocket(9090);
            //2.获取客户端的Socket
            socket = ss.accept();
            //3.获取客户端的输入流
            is = socket.getInputStream();
            //4.创建文件输出流
            fos = new FileOutputStream(new File("beauty1.jpg"));
            //5.读写过程
            byte[] buffer = new byte[1024];
            int len;
            while ((len=is.read(buffer))!=-1){
                fos.write(buffer,0,len);
            }
            System.out.println("接受成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //6.资源关闭
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos!=null){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
