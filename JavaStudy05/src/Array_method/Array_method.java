package Array_method;

import java.util.Arrays;

public class Array_method {
    public static void main(String[] args) {
        // 배열울 매개변수로 하는 매서드 호출
        int[] a = new int[] {1,2,3};
        printArray(a);
        printArray(new int[] {1, 2, 3});
        // printArray({1, 2, 3});         // 오류
    }

    public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}
