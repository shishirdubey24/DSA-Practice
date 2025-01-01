package Arrays;

import java.util.Scanner;

public class Non_repeating_GFG {
 public static void FirstNon(int[] arr){
     int n = arr.length;
    for(int i=0;i<n;i++){
   for(int j=i+1;j<n-1;j++){
       if(arr[i]!=arr[j]){

       }
   }
 }
 }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter values here");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
     FirstNon(arr);
    }
}
