public class VarEx3 {
    public static void main(String[] args) {
        final int SCORE = 100;
        //SCORE = 200; 상수에는 값을 한 번 저장하면 다른 값으로 변경 불가능

        boolean power = true;
        //boolean power = 10; boolean형에는 true, false 두 가지 값만 저장 가능

        byte b = 127;   // byte 저장 가능 범위: 128~127

        int oct = 010;
        int hex = 0x10;

        long l = 100_000_000;   // 접미사 L 안 적으면 int형으로 인식, long타입에 int형 값 저장 가능
        long l2 = 10_000_000_000L;   // int형의 저장 범위를 벗어난 값이므로 에러 발생, 뒤에 접미사 L 붙여줘서 long형으로 바꿔줘줘야 함

        float f = 3.14f;
        double d = 3.14f;   // 변수의 타입형보다 크기가 작은 타입의 값 입력 가능

        char ch = 'A';
        int i = 'A';    // int형에 문자 타입의 값을 저장하면 해당 문자의 아스키코드 값을 반환한다.

       System.out.println(SCORE);
       System.out.println(i);
       System.out.println(""+7+7);  // ""으로 시작하므로 문자열로 바뀐 뒤 문자 7 더하기 문자 7
       System.out.println(7+7+""+"ABC");    // 숫자 7 더하기 숫자 7이 계산된 뒤 ""로 인해 문자로 바뀌고 문자열 ABC와 결합


    }
}
