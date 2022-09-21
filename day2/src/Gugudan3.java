import java.util.Scanner;

public class Gugudan3 {
    public static void main(String[] args) {
        
        boolean stop = false;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println(">> 구구단을 출력하는 프로그램 <<");

        do{

            System.out.print("출력하고자 하는 구구단을 입력하세요 [Q]:종료 >> ");
            String input = scanner.nextLine();
            if (input.equals("Q")) { // 문자열 비교 equals()사용
                System.out.println("종료!");
                stop = true;
                continue; // 조건식으로 이동
            }
            int gugudan = Integer.parseInt(input); // 문자열을 정수로 변환

            for (int i = 1; i <= 9; i++) {
                System.out.println( gugudan + " * " + i + " = " + (gugudan * i));
            }

        }while(!stop);
    }
}