package Chapter02;

public class PrintfEx2 {
    public static void main(String[] args) {
        String url = "www.codechobo.com";

        float f1 = .10f;    // 0.10, 1.0e-1
        float f2 = 1e1f;    // 10.0, 1.0e1, 1.0e+1
        float f3 = 3.14e3f;
        double d = 1.23456789;

        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);   // %g는 값을 간략하게 표현할 때 사용
        System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);   // %f 지시자는 소수점 아래 6자리까지만 출력한다.
        System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);

        System.out.printf("d=%f%n", d); // %f 지시자가 소수점 6자리까지만 출력하므로 맨 끝자리는 반올림되어 출력
        System.out.printf("d=%14.10f%n", d);    // 전체 14자리 중 소수점이 10자리, 값이 차지하지 않는 부분은 공백으로 표시

        System.out.printf("[12345678901234567890]%n");
        System.out.printf("[%s]%n", url);
        System.out.printf("[%20s]%n", url);
        System.out.printf("[%-20s]%n", url);
        System.out.printf("[%.8s]%n", url);     // 왼쪽에서 8글자만 출력

    }
}
