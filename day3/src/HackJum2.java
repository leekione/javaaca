public class HackJum2 {
    public static void main(String[] args) {
        int korean = 60;
        int english = 70;
        int math = 80;
        int sum = (korean + english + math);
        int average = sum / 3;
        {
            System.out.println("총점 및 평균을 구하는 프로그램");

        }
        sum(sum);
        average(average);

    }

    public static void sum(int sum) {
        System.out.println("총점 = " + sum);

    }

    public static void average(int average) {
        System.out.println("평균 = " + average);
    }
}
