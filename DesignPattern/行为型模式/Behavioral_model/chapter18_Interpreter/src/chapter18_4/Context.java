package chapter18_4;

import java.util.Stack;

/**
 * @author lhang
 * @create 2019-11-13 17:15
 */
public class Context {
    private String statement;
    private Node node;

    public void parse(String statement) {
        Node left = null, right = null;
        Stack stack = new Stack();
        String[] statementArr = statement.split(" "); //分割输入字符串
        for (int i = 0; i < statementArr.length; i++) {
            if (statementArr[i].equalsIgnoreCase("and")) {
                left = (Node) stack.pop();
                int val = Integer.parseInt(statementArr[++i]);
                right = new ValueNode(val);
                stack.push(new AndNode(left, right));
            } else if (statementArr[i].equalsIgnoreCase("or")) {
                left = (Node) stack.pop();
                int val = Integer.parseInt(statementArr[++i]);
                right = new ValueNode(val);
                stack.push(new OrNode(left, right));
            } else {
                stack.push(new ValueNode(Integer.parseInt(statementArr[i])));
            }
        }
        this.node = (Node) stack.pop();
    }

    public int execute() {
        return node.interpret();
    }
}
