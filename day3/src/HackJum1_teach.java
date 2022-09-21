public class HackJum1_teach {
    public static void main(String[] args) {
        int korean = 82;
        int english = 73;
        int math = 65;

        int sum = 0;
        double average = 0.0;

        sum = korean + english + math;
//        average = (double)sum / 3;
//        average = sum / (double)3;
        average = sum / (3 * 1.0);

        System.out.println("총점 = " + sum);
        System.out.println("평균 = " + average);
    }
}
