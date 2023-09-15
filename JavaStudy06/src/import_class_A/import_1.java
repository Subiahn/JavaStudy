package import_class_A;

public class import_1 {
    public static void main(String[] args) {
        // 객체 생성
        // A a = new A(); // 오류
        package_import.A a = new package_import.A();

        // 멤버 활용
        System.out.println(a.m);
        System.out.println(a.n);
        a.print();
    }
}
