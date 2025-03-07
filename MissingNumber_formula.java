import java.util.Scanner;
public class MissingNumber_formula{
    public static int missingNumber(int[] arr){
        int n=arr.length+1;
        //calculate the sum of ArrayStoreException
        int sum =0;
        for(int i=0;i<n-1;i++){
            sum+=arr[i];
        }
        //calculate the expected sum
        int formula=(n*(n+1))/2;
        return formula-sum;
    }
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Array Numbers:");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();}
        System.out.println(missingNumber(arr));
        sc.close();
    }
}