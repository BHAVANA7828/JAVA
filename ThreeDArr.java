class ThreeDArr {
    public static void main(String[] args) {

        int[][][] arr = new int[2][2][3];

        arr[0][0][0] = 1;
        arr[0][0][1] = 2;
        arr[0][0][2] = 3;

        arr[0][1][0] = 4;
        arr[0][1][1] = 5;
        arr[0][1][2] = 6;

        arr[1][0][0] = 7;
        arr[1][0][1] = 8;
        arr[1][0][2] = 9;

        arr[1][1][0] = 10;
        arr[1][1][1] = 11;
        arr[1][1][2] = 12;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                for(int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
