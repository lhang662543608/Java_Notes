package nowcoder;

/**
 * @author lhang
 * @create 2019-09-19 17:11
 */
public class Inc {
    public static void main(String[] args) {
        Inc inc = new Inc();
        int i = 0;
        inc.fermin(i);
        i = i++;
        System.out.println(i);

    }

    void fermin(int i) {
        i++;
    }
}
