package static_method;

class A {
    void abc() {
        System.out.println("instace 메서드");
    }
    static void bcd() {
        System.out.println("static 메서드");
    }
}
public class static_method {
    public static void main(String[] args) {
        // 인스턴스 메서드 활용 (객체 생성 후)
        A a1 = new A();
        a1.abc();

        // 정적 메서드 활용
        // 클래스명
        A.bcd();
        // 객체 생성후
        A a2 = new A();
        a2.bcd();
    }
}
