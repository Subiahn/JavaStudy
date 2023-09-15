package AM_class;

import AM_class.pack.AA;
import AM_class.pack.CC;
//BB 는 default 라 안됨

public class AM_class {
    public static void main(String[] args) {
        // 객체 생성
        AA a =new AA();
        // BB 임포트 불가
        // CC 객체 선언 O default 생성자이므로 호출 X
    }
}
