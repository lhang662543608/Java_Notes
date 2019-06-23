package sylu.exer;

/**
 * MyDate 类包含:
 * private 成员变量 year,month,day；并为每一个属性定义 getter, setter方法；
 *
 * @author lhang
 * @create 2019-06-22 10:49
 */
public class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
    //是使用泛型之前的写法。
    /*@Override
    public int compareTo(Object o) {
        if (o instanceof MyDate){
            MyDate m = (MyDate) o;
            //比较年
            int minusYear = this.getYear() - m.getYear();
            if (minusYear!=0){
                return minusYear;
            }

            //比较月
            int minusMonth = this.getMonth() - m.getMonth();
            if (minusMonth!=0){
                return minusMonth;
            }
            //比较日
            return this.getDay()-m.getDay();
        }
        throw new RuntimeException("输入的类型错误！");
    }*/
    //是使用泛型之后的写法。
    @Override
    public int compareTo(MyDate o) {
        //比较年
        int minusYear = this.getYear() - o.getYear();
        if (minusYear!=0){
            return minusYear;
        }

        //比较月
        int minusMonth = this.getMonth() - o.getMonth();
        if (minusMonth!=0){
            return minusMonth;
        }
        //比较日
        return this.getDay()-o.getDay();
    }
}
