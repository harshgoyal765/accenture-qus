import java.util.*;
public class second{
  public static void main(String args[]){
    int arr[] ={3,2,1,7,5,4};
    Arrays.sort(arr);
    int secSmallest=arr[1];
    int secLargest=arr[2];
    
    for(int i=0 ;i<arr.length ;i++){
      if(i%2==0){
        if(arr[i]>secLargest){
            secLargest=arr[i];
        }
      }
      else if(arr[i]<secSmallest){
        secSmallest=arr[i];
      }
    }
    int sum=secLargest+secSmallest;
    System.out.println(sum);
  }
}