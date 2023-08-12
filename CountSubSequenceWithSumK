import java.util.Scanner;

public class CountSubSequenceWithSumK {

    private static int CountSubSequence(int[] arr,int sum,int n,int index,int currSum){

        if(index>=n) {
            if (sum == currSum) return 1;
            else return 0;
        }
        currSum+=arr[index];
        int left=CountSubSequence(arr, sum, n, index+1, currSum);
        currSum-=arr[index];
        int right=CountSubSequence(arr, sum, n, index+1, currSum);
         return left+right;

    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(CountSubSequence(arr,sum,n,0,0));

    }
}
