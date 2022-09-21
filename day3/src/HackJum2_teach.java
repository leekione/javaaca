public class HackJum2_teach {
    public static void main (String[]args){
            int kor = 82;
            int eng = 73;
            int math = 65;

            int sum = 0;
            double average = 0.0;

            sum = total( kor,eng,math);
            average = geaAverage(sum,3);

            System.out.println("총점 = " + sum);
            System.out.println("평균 = " + average);

            System.out.println(total(1,2,3));
            System.out.println(geaAverage(100,10));

    }

    public static int total(int kor, int eng, int math) {
//        return kor + eng + math;
        int result = kor + eng + math;
        return result;
    }

    public static double geaAverage(int total, int count) {
        return total /(double) count;
    }
}
