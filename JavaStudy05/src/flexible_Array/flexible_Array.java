package flexible_Array;

import java.util.Arrays;

public class flexible_Array {
    public static void main(String[] args) {
        // method 1 (int...values)
        method1(1, 2);
        method1(1, 2, 3);
        method1();

        // method 2 (string ...values)
        method2("안녕", "반가");
        method2("땡큐", "배리", "감사");
        method2();
    }
    public static void method1(int...value) {
        System.out.println("배열의 길이: " + value.length);
        // 배열 출력 방법 1
//        for(int i = 0; i < value.length; i++) {
//            System.out.println(value[i] + " ");
//        }
        // 배열 출력 방법 2
        for (int k: value) {
            System.out.println(k + " ");
        }
        // 배열 출력 방법 3
//        System.out.println(Arrays.toString(value));
        System.out.println();
    }
    public static void method2(String...value) {
        System.out.println("배열의 길이: " + value.length);
        // 배열 출력 방법 1
//        for(int i = 0; i < value.length; i++) {
//            System.out.println(value[i] + " ");
//        }
        // 배열 출력 방법 2
        for (String k: value) {
            System.out.println(k + " ");
        }
        // 배열 출력 방법 3
//        System.out.println(Arrays.toString(value));
        System.out.println();
    }

}

