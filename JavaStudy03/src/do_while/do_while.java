package do_while;

public class do_while {
    public static void main(String[] args) {
        // 반복 횟수가 0일떄 do-while 문과 while 문 비교
        int a;
        a = 0;
        while (a < 0) {
            System.out.print(a+" ");
            a++;
        }                         // 실행 횟수 0번
        System.out.println();
        a=0;
        do {
            System.out.print(a+ " ");
            a++;
        } while (a <0);          // 실행 횟수 1번
        System.out.println();

        // 납복 횟수가 1 일떄 do-while 문과 while 문과의 비교
        a = 0;
        while (a<1) {
            System.out.print(a+ " ");
            a++;
        }
        System.out.println();
        a = 0;
        do {
            System.out.print(a + " ");
            a++;
        } while (a<1);
        System.out.println();

        // 반복 횟수 가 10일떄 do-while 문과 while 문 비교
        a= 0;
        while (a <10) {
            System.out.print(a+ " ");
            a++;
        }
        System.out.println();
        a=0;
        do {
            System.out.print(a+ " ");
            a++;
        } while (a < 10);
    }
}
