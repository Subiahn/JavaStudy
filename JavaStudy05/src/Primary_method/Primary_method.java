package Primary_method;

public class Primary_method {
    public static void main(String[] args) {
        int a = 3;
        int result1 = twice(3);
        System.out.println(result1);
        int result2 = twice(a);
        System.out.println(result2);
        System.out.println(a);
        // main() 의 지역변수 a
    }
    public static int twice(int a) {
        a = a * 2;
        return a;
        // twice()의 매개변수 a
    }
}
