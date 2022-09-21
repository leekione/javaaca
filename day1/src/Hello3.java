public class Hello3 {
    public static void main(String[] args){
        int x; //변수 선언
        //System.out.println(x); 지역변수는 초기화후에 접근 가능.

        x = 10; //값 할당 , 초기화 (변수 선언후 최초값을 할당하는 표현식)

        System.out.println(x);

        int y = 20; //변수 선언 + 할당

        x = 30; //재할당 (초기화라고 하지 않는다)
        System.out.println(x);

        int sum = x + y; // x,y값을 산술연산후 sum변수에 할당
        System.out.println(sum);

        int result = calculate(3,5); // 메소드 호출결과를 변수에 할당
        System.out.println(result);

        int result2 = calculate(10,5);
        System.out.println(result2);
    }

    public static int calculate(int x, int y){
        int result = x * y;
        return result; //return : 메소드를 종료하고 반환값 반환
    }


}
