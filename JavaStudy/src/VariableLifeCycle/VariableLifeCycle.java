package VariableLifeCycle;

public class VariableLifeCycle {
    public static void main(String[] args) {
        int value1 = 3; // value1 생성시점
        {
            int value2 =5; // value2 생성시점
            System.out.println(value1);
            System.out.println(value2);
        } // value2 소멸시점

        System.out.println(value1);
        // System.out.println(value2); // 오류 
    } // value1 소멸시점
}
