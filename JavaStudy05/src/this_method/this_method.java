package this_method;

// 클래스 정의
class A {
    A() {
        System.out.println("첫번째 생성자");
    }
    A(int a) {
        this(); // 반드시 생성자의 첫줄에 위치 해야한다.
        System.out.println("두번쨰 생성자");
    }
    // 메서드 에서는 this  사용 불가
}

public class this_method {
    public static void main(String[] args) {
        // 객체 생성
        A a1 = new A(); // 첫번째 생성자 호출
        System.out.println();
        A a2 = new A(3); // 두번째 생성자 호출 (생성자 내부에서 첫번째 생성자 호출)
    }
}
