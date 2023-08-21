public class test {
    public static void main(String[] args) {
        int a1 =3;
        int b1 = ++a1;           // a1 값에 더하기 (전위형) -> a1 값을 b1에 대입
        System.out.println(a1);  //4
        System.out.println(b1);  //4
        
        int a2 =3;
        int b2 =a2++;            // a2 값에 b2 대입 -> a2 값을 b2에 더하기(후위형)
        System.out.println(a2);  // 4
        System.out.println(b2);  // 3
    }
}
