package switch_1;

public class switch_1 {
    public static void main(String[] args) {
        // break 가 포함 안되었을떄
        int value1 =2;
        switch (value1) {
            case 1:
                System.out.println("A");
            case 2:
                System.out.println("B");
            case 3:
                System.out.println("C");
            default:
                System.out.println("D");
        }
        System.out.println();

        //break 가 포함되어 있을떄
        int value2 =2;
        switch(value2) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
        }
        System.out.println();

        //if - else 구문으로 의 변환
        if(value1==1){
            System.out.println("a");
        }
        else if (value1 == 2) {
            System.out.println("B");
        }
        else if (value2 == 3) {
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
    }
}
