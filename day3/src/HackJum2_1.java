public class HackJum2_1 {
    public static void main(String[] args) {
        int korean = 60;
        int english = 70;
        int math = 81;
        int sum = 0;
        double average = 0.0;

        sum = korean + english + math;
        average = (double)sum / 3;
        {
            System.out.println("총점 및 평균을 구하는 프로그램");

        }
        total(sum);
        getAverage((double) average);

    }

    public static void total(int sum) {
        System.out.println("총점 = " + sum);

    }

    public static void getAverage(double average) {
        System.out.println("평균 = " + average);
    }
}
