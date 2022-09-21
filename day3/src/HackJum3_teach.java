import java.util.Scanner;

public class HackJum3_teach {
    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("<< 3개의 과목을 입력받아 총점/평균 구하는 프로그램>>");
        System.out.print("국어 점수 >> ");
        String input1 = scanner.nextLine();
            int kor = Integer.parseInt(input1);

        System.out.print("영어 점수 >> ");
        String input2 = scanner.nextLine();
            int eng = Integer.parseInt(input2);

        System.out.print("수학 점수 >> ");
        String input3 = scanner.nextLine();
            int math = Integer.parseInt(input3);

            int sum = 0;
            double average = 0.0;

            sum = total( kor,eng,math);
            average = getAverage(sum,3);

            System.out.println("총점 = " + sum);
            System.out.println("평균 = " + average);


    }

    public static int total(int kor, int eng, int math) {
//        return kor + eng + math;
        int result = kor + eng + math;
        return result;
    }

    public static double getAverage(int total, int count) {
        return total /(double) count;
    }
}
