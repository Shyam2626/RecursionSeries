import java.util.ArrayList;
import java.util.Scanner;

public class SubSequenceWithSumK {

    private static void PrintSubSequence(ArrayList<Integer> list, int[] arr, int sum, int n,int index,int currSum){

        if(index>=n){
            if(sum==currSum){
                for (Integer integer : list) System.out.print(integer + " ");
                System.out.println();
            }
            return;
        }
            list.add(arr[index]);
            currSum+=arr[index];
            PrintSubSequence(list, arr, sum, n, index+1, currSum);
            list.remove(list.size()-1);
            currSum-=arr[index];
            PrintSubSequence(list, arr, sum, n, index+1,currSum);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int sum= sc.nextInt();
        PrintSubSequence(new ArrayList<>(),arr,sum,n,0,0);

    }

}
