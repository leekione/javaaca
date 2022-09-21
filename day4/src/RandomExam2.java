import java.util.Arrays;

/*
    로또 프로그램 구현하기
    : 1~45번호중 중복되지 않는 6자리 추출하기
    Math.random() : 0<= ? < 1 사이의 랜덤한 실수발생
 */
public class RandomExam2 {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        System.out.println(Arrays.toString(lotto));

        for (int i = 0; i < lotto.length; i++) {
           int num = (int)(Math.floor(Math.random()*45)+1);
           lotto[i] = num;
           int [] arr = new int[6];

            boolean result = isExist(arr, num);

        }
        System.out.println(Arrays.toString(lotto));

    }
        // 배열내 중복값이 있는지 체크하는 메소드
        public static boolean isExist(int[] arr, int num){
            boolean result = false;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 1; j < arr.length; j++) {
                    if (i != j) {

                    }

                    if (arr[i] == arr[j]) {


                    }
                        result = true;
                    break;

                }
            }
            return result;
    }

}
