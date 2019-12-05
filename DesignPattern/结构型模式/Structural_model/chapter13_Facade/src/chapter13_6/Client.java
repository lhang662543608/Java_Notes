package chapter13_6;

/**
 * 某软件公司为新开发的智能手机控制与管理软件提供了一套备份功能，通过该功能可以将原本存储在手机中的通信录、短信、照片、歌曲等资料一次性全部复制到移动存储介质
 * （例如MMC卡、SD卡）中。在实现过程中需要与多个已有的类进行交互，例如通信录管理类、短信管理类等，为了降低系统的耦合度，
 * 试使用外观模式来设计并使用java语言编程模拟实现该意见备份功能。
 * @author lhang
 * @create 2019-10-25 21:51
 */
public class Client {
    public static void main(String[] args) {
        OneKeyBackup oneKeyBackup = new OneKeyBackup();
        oneKeyBackup.click();
    }
}
