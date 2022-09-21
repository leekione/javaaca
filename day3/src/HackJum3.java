import java.util.Scanner;

public class HackJum3 {
    public static void main(String[] args) {


        System.out.println("총점 및 평균을 구하는 프로그램");



        System.out.println("점수를 입력하세요 : ");

        Scanner input = new Scanner(System.in);



        int kor = input.nextInt();
        int eng = input.nextInt();
        int math = input.nextInt();

        int sum = kor + eng + math;
        double average = (double) sum / 3;

        System.out.println("총점 = " + sum);
        System.out.println("평균 = " + average);





    }
}
