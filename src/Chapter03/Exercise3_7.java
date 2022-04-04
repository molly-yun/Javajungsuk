package Chapter03;

public class Exercise3_7 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = (int)((5/9f * (fahrenheit - 32) * 100) + 0.5) / 100f;
        //float celcius = ((float)(5/9) * (fahrenheit - 32)) ;
        // 5/9 는 둘 다 정수형이므로 0.5... 에서 소수점 이하는 버려지고 결과는 0이 된다.
        // 따라서 5 와 9 둘 중 하나를 실수형으로 변환한 뒤에 계산해야 실수형 결과가 나온다.
        // 5/9 계산을 한 뒤에 (float)5/9 형변환을 하면 이미 결과값이 0이므로 0.0 이라는 결과값만 얻게 된다.
        // 소수점을 버리려면 int로 형변환하면 되고, 소수점을 포함하려면 실수형의 값으로 계산하면 된다.
        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}
