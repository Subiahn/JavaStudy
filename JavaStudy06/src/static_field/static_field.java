package static_field;

class A {
    int m = 3; // 인스턴스 필드
    static int n = 5; // 정적 필드
}

public class static_field {
    public static void main(String[] args) {
        // 인스턴스 필드 활용 방법 (객체를 생성한 후 사용가능)
        A a1 = new A();
        System.out.println(a1.m);

        // 정적 필드 활용방법
        // 객체 생성 없이 바로 클래스명 으로 사용
        System.out.println(A.n);
        // 객체를 생성한 후 활용(권장 안함)
        A a2 = new A();
        System.out.println(a2.n);
    }
}
