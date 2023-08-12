import java.util.*;


public class PrintSubSequence {

    private static void PrintSubsequence(List<Integer> list, int[] arr, int n, int index){
        if(index>=n){
            for(int i=0;i<list.size();i++) System.out.print(list.get(i)+" ");
            System.out.println();
            return;
        }
        list.add(arr[index]);
        PrintSubsequence(list,arr,n,index+1);
        list.remove(list.size()-1);
        PrintSubsequence(list,arr,n,index+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        PrintSubsequence(list,arr,n,0);
    }
}
