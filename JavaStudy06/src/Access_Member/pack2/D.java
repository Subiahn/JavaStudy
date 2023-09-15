package Access_Member.pack2;

import Access_Member.pack1.A;

public class D extends A { // D는 A의 자식 클래스
    public void print() {
        // 객체 생성
        System.out.print(a + " ");
        System.out.print(b + " ");
        // 자식은 protected 까지는 접근 가능
        // System.out.print(c + " ");
        //System.out.print(d);
        System.out.println();
    }
}
