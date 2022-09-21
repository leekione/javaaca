public class ArrayTest6 {
    public static void main(String[] args) {
        int[][] x = new int[2][];
        //case1
//        x[0] = new int[]{1,2};
//        x[1] = new int[]{3, 4, 5};

        //case2
        x[0] = new int[2];
        x[0][0] = 1;
        x[0][1] = 2;

        x[1] = new int[3];
        x[1][0] = 3;
        x[1][1] = 4;
        x[1][2] = 5;


        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.println("x[" + i + "][" + j + "]=" + x[i][j]);
            }
        }

        int[][][] y = new int[3][][];
        y[0] = new int[][]{{1, 2, 3}};
        y[1] = new int[][]{{4, 5}};
        y[2] = new int[][]{{1}};



        int[][][] z = new int[3][2][];

    }
}
