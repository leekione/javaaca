import java.util.Arrays;

public class Ex {
    public static void main(String[] args) {
        int[] lotto =new int[6];

        int i = 0;
        while (i < lotto.length) {
            int num = (int) (Math.floor(Math.random() * 45) + 1);

            if (isExist(lotto, num)) {
                i--;
                continue;
            }

            lotto[i++] = num;
        }
        System.out.println(Arrays.toString(lotto));


    }

    public static boolean isExist(int[] arr, int num) {
        boolean result = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                result = true;
                break;
            }
        }
        return result;

    }
}
