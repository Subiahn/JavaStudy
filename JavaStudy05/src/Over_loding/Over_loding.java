package Over_loding;

public class Over_loding {
    public static void main(String[] args) {
        print();
        print(3);
        print(5.8);
        print(2, 5);
    }
    public static void print() {
        System.out.println("데이터가 없습니다.");
    }
    public static void print(int a) {
        System.out.println(a);
    }
    public static void print(double a) {
        System.out.println(a);
    }

    // 중복으로 정의 X
//    public static void print(double b) {
//        System.out.println(b);
//    }
    public static void print(int a, int b) {
        System.out.println("a: " + a + "b: " + b);
    }
    // 중복으로 정의 X
//    public static int print(int a, int b) {
//        System.out.println("a: " + a + "b: " + b);
//        return a+b;
//    }
}
