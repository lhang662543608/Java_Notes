package sylu.java1;


import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 一、网络编程中的两个主要问题：
 * 1.如何准确的定位网络上的一台或多台主机；定位主机上的特定的应用。
 * 2.找到主机后如何可靠高效的进行数据传输。
 * <p>
 * 二、网络编程中的两个要素：
 * 1、对应问题一：IP和端口号
 * 2、对应问题二：提供网络通信协议：tcp/ip参考模型(应用层、传输层、网络层、物理+数据链路层)
 * <p>
 * 三、通信要素一：Ip和端口号
 * 1.IP：唯一的标识互联网上的一台主机(通信实体)。
 * 2.在java中使用InetAddress类代表IP。
 * 3.IP分类：IPV4和IPV6;万维网和局域网。
 * 4.域名：  www.baidu.com   www.sina.com.cn
 * 5.本地回路地址：127.0.0.1  对应着：localhost
 * 6.如何实例化InetAddress：两个方法：getByName(String host);getLocalHost();
 *            两个常用方法：getHostName()、getHostAddress()
 * 7.端口号：正在计算机上运行的进程。
 *    要求：不同的进程有不同的端口号。
 *    范围：0~65535
 * 8.端口号与IP地址的组合得出一个网络套接字：Socket
 *
 * @author lhang
 * @create 2019-06-30 15:04
 */
public class InetAddressTest {
    public static void main(String[] args) {

        try {
            //File file = new File("hello.txt");
            InetAddress inet1 = InetAddress.getByName("localhost");
            System.out.println(inet1);
            InetAddress inet2 = InetAddress.getByName("www.sylu.edu.cn");
            System.out.println(inet2);

            //获取本机IP
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);


            //getHostName()
            String hostName = localHost.getHostName();
            System.out.println(hostName);
            //getHostAddress()
            String hostAddress = localHost.getHostAddress();
            System.out.println(hostAddress);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


    }
}
