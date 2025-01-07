package Arrays;

public class Check_Sorted_GFG {
 public static boolean Array_Check(int[]a){
     for(int i=1;i< a.length;i++){
         boolean found=false;
        if(a[i-1]<a[i]){
            found=true;
        }
     }
    if(found!=true) return false;
 }
}
