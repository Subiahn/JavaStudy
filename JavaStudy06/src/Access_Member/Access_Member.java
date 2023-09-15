package Access_Member;

import Access_Member.pack1.A;
import Access_Member.pack1.B;
import Access_Member.pack2.C;
import Access_Member.pack2.D;

public class Access_Member {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.print();
        b.print();
        c.print();
        d.print();
    }
}
