package Bitwise;

public class Bittwise {
    public static void main(String[] args) {
        // 자바 매서드로 진법 변환
        int data =13;
        System.out.println(Integer.toBinaryString(data)); // 10진수 -> 2진수
        System.out.println(Integer.toOctalString(data)); // 10진수 -> 8진수
        System.out.println(Integer.toHexString(data)); // 10진수 -> 16 진수
        System.out.println();

        System.out.println(Integer.parseInt("1101",2)); // 2진수 -> 10진수
        System.out.println(Integer.parseInt("15",8)); // 8진수 -> 10진수
        System.out.println(Integer.parseInt("0D", 16)); // 16진수 -> 10진수
        System.out.println();

        // 다양한 진법표현
        System.out.println(13);
        System.out.println(0b1101);
        System.out.println(015);
        System.out.println(0x0D);
        System.out.println();

        // 비트 연산자
        // @AND 비트 연산자
        System.out.println(3 & 10);
        System.out.println(0b0011 & 0b1010);
        System.out.println(0x03 & 0x0A);
        System.out.println();

        // @OR 비트 연산자
        System.out.println(3 | 10);
        System.out.println(0b0011 | 0b1010);
        System.out.println(0x03 | 0x0A);
        System.out.println();

        // @XOR 비트 연산자
        System.out.println(3 ^ 10);
        System.out.println(0b0011 ^ 0b1010);
        System.out.println(0x03 ^ 0x0A);
        System.out.println();

        // @NOT 바트 연산자
        System.out.println(~3);
        System.out.println(~0b0011);
        System.out.println(~0x03);
    }
}
