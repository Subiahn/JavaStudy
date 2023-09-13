package this_2;

class A {
    int m;
    int n;
    void init(int m, int n) {
        m = m;
        n = n;
    }
}

class B {
    int m;
    int n;
    void init(int m, int n) {
        this.m = m;
        this.n = n;
    }
}
public class this_2 {
    public static void main(String[] args) {
        // 필드명과 지역 변수명이 같고, this 키워드를 사용하지않음.
        A a = new A();
        a.init(2,3);
        System.out.println(a.m);
        System.out.println(a.n);

        // 필드명과 지역변수 명이 같고 this 키워드 사용함
        B b = new B();
        b.init(2,3);
        System.out.println(b.m);
        System.out.println(b.n);
    }
}
