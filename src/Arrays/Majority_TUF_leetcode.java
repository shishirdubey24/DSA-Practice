package Arrays;

public class Majority_TUF_leetcode {
  public static int  check(int []arr){
      int n=arr.length;
      int count=0;
     for(int i=0;i<n;i++){
    for(int j=i+1;j<n-1;j++){
      if(arr[j]==arr[i]){
         count++;
      }
    }
    if(count>(n/2)) return arr[i];
     }
   return -1;
  }
    public static void main(String[] args) {
        int []arr ={2, 2, 1, 1, 1, 2, 2};
        int ans=check(arr);
        System.out.println("The majority element is: " + ans);
    }
}
