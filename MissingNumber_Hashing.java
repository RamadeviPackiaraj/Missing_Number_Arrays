import java.util.Scanner;
public class MissingNumber_Hashing{
    static int missingNumber(int[] arr){
       int n=arr.length+1;
        //create hase arr of size n+1
        int[] hash=new int[n+1];
        //Store frequencies of Elements
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;
        }
        //find the missing Number
        for(int i=1;i<=n;i++){
            if(hash[i]==0){
                return i;
            }
        }
        return -1;
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