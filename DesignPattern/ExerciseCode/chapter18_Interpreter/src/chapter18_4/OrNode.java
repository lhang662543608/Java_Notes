package chapter18_4;

/**
 * @author lhang
 * @create 2019-11-13 17:14
 */
public class OrNode implements Node {
    private Node left;
    private Node right;

    public OrNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    public int interpret() {
        if (left.interpret() == 1 || right.interpret() == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
