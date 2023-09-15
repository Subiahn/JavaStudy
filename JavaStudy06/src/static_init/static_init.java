package static_init;

class A {
    int a;
    static int b;
    static {
        b = 5; // 정적 필드의 초기화는 static {} 내에서 수행
        System.out.println("클래스 A 가 로딩 되었습니다.");
    }
    A() {
        a = 3; // 인슽너슨 필드 초기화는 일반 적으로 생산자에서 수행
    }
}

public class static_init {
    public static void main(String[] args) {
        System.out.println(A.b);
    } // A.b 가 실행되는 시점에 class A 가 메모리에 로딩 되고 이때 static {} 초기화 블록 실행
}
