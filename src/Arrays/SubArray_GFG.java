package Arrays;
import java.util.Scanner;
public class SubArray_GFG {
  public static boolean Check(int[] a,int[]b){
      int n=a.length;
      System.out.println("Received Array Length is"+ n);
      int m=b.length;
      System.out.println("Received Array Length is"+ n);
for(int i=0;i<m;i++){
    boolean found=false;
   for(int j=0;j<n;j++){
       if(a[i]==a[j]){
           found=true;
           break;
       }
   if(!found){
       return true;
   }
   }

}
      return true;
  }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length Of array-1:");
       int n= sc.nextInt();

        System.out.println("Enter Length Of array-1:");
        int m= sc.nextInt();
       int[] a=new int[n];
        int[] b=new int[m];
        System.out.println("Enter Values for arr-1:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Values for arr-2:");
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }

        boolean var= Check(a,b);
        System.out.println(var);
    }
}
