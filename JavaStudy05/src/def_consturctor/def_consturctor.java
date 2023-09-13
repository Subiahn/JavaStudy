package def_consturctor;

class A {
    int m;
    void work() {
        System.out.println(m);
    }

    // 생성자 X -> 컴파일러가 자동으로 추가 [매개 변수 X]
}
class B {
    int m;
    void work() {
        System.out.println(m);
    }
    B() {

    }
    // 기본 생성자 직접 정의
}
class C {
    int m;
    void work() {
        System.out.println(m); // 생성자로 넘어온 값
    }
    C(int a) {   // 입력 매개변수 를 포함한 생성자 정의
        m = a;   // 입력 매개변수로 전달된 값으로 필드 초기화
    }
}

public class def_consturctor {
    public static void main(String[] args) {

        // 클래스 객체 생성
        A a = new A();    // 컴파일러가 기본 생성자 정의
        B b = new B();    // 직접 기본 생성자 정의
        // C c = new C(); // 기본 생성자 호출 X
        C c = new C(3); // 직접 정의한 생성자 사용

        // 매서즈 호출
        a.work();
        b.work();
        c.work();

    }
}
