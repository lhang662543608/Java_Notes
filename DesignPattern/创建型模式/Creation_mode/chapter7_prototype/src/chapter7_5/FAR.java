package chapter7_5;

/**
 * @author lhang
 * @create 2019-10-16 22:27
 */
public class FAR implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        Object object = null;
        try {
            object = super.clone();
            return (OfficialDocument) object;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！！");
            return null;
        }
    }

    @Override
    public void display() {
        System.out.println("FAR display...");
    }
}
