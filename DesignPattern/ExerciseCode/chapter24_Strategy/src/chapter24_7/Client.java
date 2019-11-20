package chapter24_7;

/**
 * 某软件公司要开发一款飞机模拟系统，该系统主要模拟不同种类的飞机的飞行特征与起飞特征，需要模拟的飞机种类及其特征如下表所示：
 * 飞机种类         起飞特征        飞行特征
 * 直升机          垂直起飞          亚音速飞行
 * 客机           长距离飞行         亚音速飞行
 * 歼击机         长距离飞行         超音速飞行
 * 鹞式战斗机      垂直起飞          超音速飞行
 * 为了将来能模拟更多种类的飞机，试采用策略模式设计该飞机。
 *
 * @author lhang
 * @create 2019-11-20 9:22
 */
public class Client {
    public static void main(String[] args) {
        AirCraft craft = new Fighter();
        craft.takeOff();
        craft.fly();
    }

}
