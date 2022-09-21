/*
1.국,영,수 점수를 임의로 주어 총점, 평균을 구하는 프로그램을 작성하지오
HackJum.java
	메소드 : main
2. 1번 문제에서 총점과 평균을 구하는 로직은 별도의 메소드를 만들어서 작성하시오
HackJum2.java
	메소드 : main, sum, average
3. 2번 문제에서 국,영,수 점수를 키보드로 부터 입력받도록 작성하시오
HackJum3.java
	Scanner객체 사용
	메소드 : main, sum, average
 */
public class HackJum1 {
    public static void main(String[] args) {
        int korean = 60;
        int english = 70;
        int math = 80;

        int sum = korean + english + math;
        System.out.println("총점 = " + sum);
        System.out.println("평균 = " + (sum / 3));
    }
}
