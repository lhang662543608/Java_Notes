package chapter24_6;

/**
 * @author lhang
 * @create 2019-11-20 9:21
 */
public class ArrayHandler {
    private Sort sortObj;

    public void setSortObj(Sort sortObj) {
        this.sortObj = sortObj;
    }

    public int[] sort(int arr[]) {
        return sortObj.sort(arr);
    }
}
