package InterviewQuestions;

public class AIRTEL_SumMiddleMatrix {
    public static void main(String[] args)
    {
        int data[][] = {
                {2,5,7},
                {3,7,2},
                {5,6,9}
        };
        middleSum(data, 3);
    }

    private static void middleSum(int[][] data, int n) {
        int rowSum = 0, colSum = 0;
        for(int i=0;i<n;i++){
            rowSum += data[n/2][i];
        }
        for(int i=0;i<n;i++){
            colSum += data[i][n/2];
        }
        System.out.println("Row Sum : "+rowSum+" \nCol Sum: "+colSum);
    }
}
