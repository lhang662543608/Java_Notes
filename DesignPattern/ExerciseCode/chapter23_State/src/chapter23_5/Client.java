package chapter23_5;

/**
 * 在某论坛系统中用户可以发表留言、发表留言将增加积分；用户也可以回复留言，回复留言也会增加积分；用户还可以下载文件，下载文件将扣除积分。
 * 该系统用户分为三个等级，分别是新手、高手和专家，这三个等级对应3中不同的状态，这三个状态分别定义如下：
 * （1）如果积分小于100分，则为新手状态，用户可以发表留言、回复留言，但是不能下载文件。
 * 如果积分大于等于1000分，则转换为专家状态；如果积分大于等于100分，则转换为高手状态。
 * （2）如果积分大于等于100分但小于1000分则为高手状态，用户可以发表留言、回复留言，还可以下载文件，而且用户在发表留言是可以获取双倍积分。
 * 如果积分小于100分，则转换为新手状态；如果积分大于等于1000分，则转换为专家状态；如果下载文件后积分积分小于0，则不能下载该文件。
 * （3）如果积分大于等于1000分，则为专家状态，用户可以发表留言、回复留言和下载文件，用户除了在发表留言时可以获取双倍积分外，下载文件只需扣除所需积分的一半。
 * 如果积分小于100，则转换为新手状态；如果积分小于1000分，但大于等于100分，则转换为高手状态；如果下载文件后积分小于0，则不能下载该文件。
 *
 * @author lhang
 * @create 2019-11-19 9:40
 */
public class Client {
    public static void main(String[] args) {
        ForumAccount acc = new ForumAccount("阿飞");
        acc.setState(new PrimaryState(acc));
        acc.writeNote(50);
        acc.downloadFile(2);
        acc.replyNote(50);
        acc.downloadFile(102);
        acc.downloadFile(10);
        acc.downloadFile(10);
        acc.writeNote(200);
        acc.writeNote(10);
        acc.writeNote(1000);
        acc.downloadFile(1000);

    }
}
