import java.util.Arrays;

/*
    로또 프로그램 구현하기
    : 1~45번호중 중복되지 않는 6자리 추출하기
    Math.random() : 0<= ? < 1 사이의 랜덤한 실수발생
 */
public class RandomExam_teach4 {
    public static void main(String[] args) {
        int[] lotto = new int[6];


        int count = 0; // for문 반복횟수 카운트

        // for문을 무한 루프 while문으로 수정하기
        boolean stop = false;

        while (!stop) {
            int num = (int) (Math.floor(Math.random() * 45) + 1);

            //동일 번호가 존재하면 번호를 다시 생성
            if (isExist(lotto, num)) {
                continue;
            //동일 번호가 존재하지 않으면 배열요소에 저장
            }else {
                lotto[count++] = num;

            }
            
            //로또 번호 6개가 모두 추출되면 무한루프를 빠져 나온다
            if (count == lotto.length) {
                stop = true;
            }
        }
        System.out.println("for문 반복횟수 : " + count);
        System.out.println(Arrays.toString(lotto));
    }

    // 배열내 중복값이 있는지 체크하는 메소드
    public static boolean isExist(int[] arr, int num) {
        boolean result = false;

        for (int i = 0; i < arr.length; i++) {
            //배열내에 동일한 번호가 있으면
            if (arr[i] == num) {
                result = true;
                break; // 가장 가까운 반복문을 빠져나온다.
            }
        }
        return result;

    }
}
