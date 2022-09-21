public class SumOfOneToTen {
    public static void main(String[] args) {
        final int NUMBER = 10;
        System.out.println("[for문] 1~" + NUMBER + "합 =" + sumByfor(NUMBER));
        System.out.println("[while문] 1~" + NUMBER + "합 =" + sumBywhile(NUMBER));
        System.out.println("[Dowhile문] 1~10합 = " + sumByDoWhile());


    }
    public static int sumByfor(int end) {
        int sum = 0;
        for (int i = 1; i <= end; i++) {
            sum +=i;
        }
        return sum;
    }

    public static int sumBywhile(int end) {
        int sum = 0;
        int i = 1;
        while (i <= end) {
            sum +=i;
            i++;
        }
        return sum;
    }

    public static int sumByDoWhile() {
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        } while (i <= 10);
    return sum;
    }

}
