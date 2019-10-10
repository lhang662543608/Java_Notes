package Exer.ExerStream;

import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 测试Stream的实例化
 *
 * @author lhang
 * @create 2019-10-07 17:31
 */
public class Exer_Stream {
    //创建 Stream方式一：通过集合
    @Test
    public void test1() {
        List<Employee> employees = EmployeeData.getEmployees();

//        default Stream<E> stream() : 返回一个顺序流
        Stream<Employee> stream = employees.stream();
        stream.forEach(System.out::println);

        System.out.println("----------------------");

//        default Stream<E> parallelStream() : 返回一个并行流
        Stream<Employee> parallelStream = employees.parallelStream();
        parallelStream.forEach(System.out::println);

    }

    //创建 Stream方式二：通过数组
    @Test
    public void test2() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        //调用Arrays类的static <T> Stream<T> stream(T[] array): 返回一个流
        IntStream stream = Arrays.stream(arr);
        stream.forEach(a -> System.out.print(a + "\t"));

        System.out.println("\n---------------------------");

        Employee e1 = new Employee(1001, "Tom");
        Employee e2 = new Employee(1002, "Jerry");
        Employee[] arr1 = new Employee[]{e1, e2};
        Stream<Employee> stream1 = Arrays.stream(arr1);
        stream1.forEach(a -> System.out.print(a + "\t"));

    }

    //创建 Stream方式三：通过Stream的of()
    @Test
    public void test3() {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        stream.forEach(System.out::print);
    }

    //创建 Stream方式四：创建无限流
    @Test
    public void test4() {

//      迭代
//      public static<T> Stream<T> iterate(final T seed, final UnaryOperator<T> f)
        //遍历前10个偶数
        Stream.iterate(0, t -> t + 2).limit(10).forEach(System.out::println);


//      生成
//      public static<T> Stream<T> generate(Supplier<T> s)
        Stream.generate(Math::random).limit(10).forEach(System.out::println);

    }

    public static class EmployeeData {

        public static List<Employee> getEmployees() {
            List<Employee> list = new ArrayList<>();

            list.add(new Employee(1001, "马化腾", 34, 6000.38));
            list.add(new Employee(1002, "马云", 12, 9876.12));
            list.add(new Employee(1003, "刘强东", 33, 3000.82));
            list.add(new Employee(1004, "雷军", 26, 7657.37));
            list.add(new Employee(1005, "李彦宏", 65, 5555.32));
            list.add(new Employee(1006, "比尔盖茨", 42, 9500.43));
            list.add(new Employee(1007, "任正非", 26, 4333.32));
            list.add(new Employee(1008, "扎克伯格", 35, 2500.32));

            return list;
        }

    }


    public static class Employee {

        private int id;
        private String name;
        private int age;
        private double salary;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public Employee() {
            System.out.println("Employee().....");
        }

        public Employee(int id) {
            this.id = id;
            System.out.println("Employee(int id).....");
        }

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Employee(int id, String name, int age, double salary) {

            this.id = id;
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", salary=" + salary + '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;

            Employee employee = (Employee) o;

            if (id != employee.id)
                return false;
            if (age != employee.age)
                return false;
            if (Double.compare(employee.salary, salary) != 0)
                return false;
            return name != null ? name.equals(employee.name) : employee.name == null;
        }

        @Override
        public int hashCode() {
            int result;
            long temp;
            result = id;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            result = 31 * result + age;
            temp = Double.doubleToLongBits(salary);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            return result;
        }
    }


}
