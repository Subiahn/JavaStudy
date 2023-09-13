package field;

class A {
    int m = 3;
    int n =4;
    // 상위 중괄호가 클래스 일때는 필드
    void work1() {
        int k = 5;
        // 상위 중괄호가 메서드 일때는 지역 변수
        System.out.println(k);
        work2(3);
    }
    void work2 (int i) {
        int j =4;
        // 상위 중괄호가 메서드 일때는 지역변수
        System.out.println( i + j);
    }
}
public class field {
    public static void main(String[] args) {
        // 클래스로 객체 생성
        A a = new A();
        // 필드 값 출력
        System.out.println(a.m);
        System.out.println(a.n);
        // 메서드 값 출력
        a.work1(); // 안에 정의된 지역변수를 스택 메모리에 추가
    }
}
