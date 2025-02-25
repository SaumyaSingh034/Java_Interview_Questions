package test;

public class Question3 {
    public static void main(String[] args){

        int[][] ints1 = {{1,3,5}, {2,5,6},{5,8,9}};

        /*
        1 3 5
        2 5 6
        5 8 9


         */
        int row = 2;
        int col = 2;
        int sum = 0;
        int value = 1;


        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(j==value){
                    sum += ints1[row][col]; //ints1[0][1] -->
                }

            }
            System.out.println(sum);
        }



    }
}
