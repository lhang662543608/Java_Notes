package sylu.java;

import org.junit.Test;

import java.io.*;

/**
 * 处理流之一：缓冲流的使用
 * <p>
 * 1.缓冲流：
 * BufferedInputStream
 * BufferedOutputStream
 * BufferedReader
 * BufferedWriter
 * <p>
 * 2.作用：提供流的读取、写入的速度
 * 提高读写速度的原因：内部提供了一个缓冲区
 * <p>
 * 3. 处理流，就是“套接”在已有的流的基础上。
 *
 * @author lhang
 * @create 2019-06-24 10:16
 */
public class BufferedTest {
    /*
        实现非文本文件的复制。
     */
    @Test
    public void BufferedStreamTest() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1.造文件
            File srcFile = new File("爱情与友情.jpg");
            File destFile = new File("爱情与友情3.jpg");

            //2.造流
            //2.1造两个节点流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);
            //2.2造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            //3.复制的细节：读取，写入。
            byte[] buffer = new byte[10];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);

                //刷新缓冲区
//                bos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源关闭
        /*
        要求：先关闭外层的流，在关闭内层的流。
         */
            try {
                if (bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //说明：关闭外层流的同时，内层流也会自动关闭。关于内层流的关闭，我们可以省略。
//        fis.close();
//        fos.close();
        }

    }


    //实现文件的复制的方法。
    public void copyFileWithBuffered(String srcPath, String destPath) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1.造文件
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

            //2.造流
            //2.1造两个节点流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);
            //2.2造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            //3.复制的细节：读取，写入。
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("Success!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源关闭
        /*
        要求：先关闭外层的流，在关闭内层的流。
         */
            try {
                if (bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //说明：关闭外层流的同时，内层流也会自动关闭。关于内层流的关闭，我们可以省略。
//        fis.close();
//        fos.close();
        }
    }

    @Test
    public void testcopyFileWithBuffered() {
        String srcPath = "C:\\Users\\lhang\\Desktop\\01.avi";
        String destPath = "C:\\Users\\lhang\\Desktop\\03.avi";

        long start = System.currentTimeMillis();
        copyFileWithBuffered(srcPath, destPath);
        long end = System.currentTimeMillis();
        System.out.println("复制花费的时间为：" + (end - start) + "毫秒");//229毫秒
    }


    /*
    使用bufferedReader和bufferedWriter实现文本文件的复制。
     */
    @Test
    public void testBUfferedReaderWriter() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            //
            br = new BufferedReader(new FileReader(new File("dbcp.txt")));
            bw = new BufferedWriter(new FileWriter(new File("dbcp1.txt")));

            //读写操作
            //方式一：使用char[]数组
            /*char[] cbuf = new char[1024];
            int len;
            while ((len = br.read(cbuf)) != -1) {
                bw.write(cbuf, 0, len);
//                bw.flush();
            }*/
            //方式二：使用String。
            String data;
            while ((data = br.readLine())!= null){
                //方法一：
//                bw.write(data+"\n");
                //方法二：
                bw.write(data);//data中不包含换行符
                bw.newLine();//提供换行操作。
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
