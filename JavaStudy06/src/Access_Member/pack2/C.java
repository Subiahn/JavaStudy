package Access_Member.pack2;

import Access_Member.pack1.A;

public class C {
    public void print () {
        // 객체 생성
        A a = new A();

        // 멤버 활동
        System.out.print(a.a + " ");
//        System.out.print(a.b + " ");
//        System.out.print(a.c + " ");
//        System.out.println(a.d + " " );
        // 다른패키지는 접근 X
        System.out.println();
    }
}
