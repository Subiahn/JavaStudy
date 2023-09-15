package EX_class;

class A {
    int m = 3;
    int n = 4;

    void print () {
        System.out.println(m + ", " + n);
    }
}

public class EX_class {
    public static void main(String[] args) {
        A a = new A();
        a.print();
    }
}
