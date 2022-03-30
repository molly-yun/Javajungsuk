package Chapter03;

public class Exercise3_1 {
        public static void main(String[] args) {
            int x = 2;
            int y = 5;
            char c = 'A'; // 'A' 65 의 문자코드는

            System.out.println(1 + x << 33);
            // int 범위는 32bit이므로 33번 쉬프트하지 않고 1번만 쉬프트한다.
            // 1번 쉬프트하는 것은 2의 1제곱을 곱하는 것과 같다.
            System.out.println(y >= 5 || x < 0 && x > 2);
            System.out.println(y += 10 - x++);
            System.out.println(x+=2);   // 위 코드에서 x = 3으로 증가한 상태
            System.out.println( !('A' <= c && c <='Z') );
            System.out.println('C'-c);  // int보다 작은 범위의 기본형은 int형으로 변환되어 계산된다.
            System.out.println('5'-'0');    // '0': 48
            System.out.println(c+1);
            System.out.println(++c);    // 단항연산자는 int형보다 작은 타입의 변수라도 자료형을 바꾸지 않는다. 문자형으로 계산
            System.out.println(c++);
            System.out.println(c);
        }
}
