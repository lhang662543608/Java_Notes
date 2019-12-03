package chapter17_5;

/**
 * 设计并实现一个简单的请求日志记录程序，将一组命令对象通过序列化写到日志文件中，并通过该日志文件实现批处理操作。
 * <p>
 * 解答思路：使用序列化机制将多个命令对象写入文件，形成日志文件；在执行批处理时，
 * 读取该日志文件，还原命令对象，再逐个调用命令对象的执行方法实现批处理。
 *
 * @author lhang
 * @create 2019-11-13 13:37
 */
public class Client {
}