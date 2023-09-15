package import_package_2;

import package_import.A;

public class import_package_2 {
    public static void main(String[] args) {
        // 객체 생성
        A a = new A();

        // 멤버 활용
        System.out.println(a.m);
        System.out.println(a.n);
        a.print();
    }
}
