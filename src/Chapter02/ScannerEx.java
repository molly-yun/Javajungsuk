package Chapter02;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두자리 정수를 하나 입력해주세요.>");
        String input = scanner.nextLine();  // 연속적으로 값을 입력받기 위해서는 nextLine메소드를 사용
        int num = Integer.parseInt(input);  // 입력값에 숫자가 아닌 값이나 공백이 들어가면 문자열을 숫자로 변환하는 과정에서 에러가 발생

        System.out.println("입력내용: " + input);
        System.out.printf("num=%d%n", num);
    }
}
