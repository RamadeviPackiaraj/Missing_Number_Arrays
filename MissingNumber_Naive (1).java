import java.util.Scanner;
//1-n
public class MissingNumber_Naive{
    static int missingNumber(int[] arr){
        int n=arr.length+1;
        //iterate 1 to nums
        for(int i=1;i<=n;i++){
        boolean found=false;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==i){
                found=true;
                break;
            }
        }
        if(!found)
        return i;
          }
       return -1 ;
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