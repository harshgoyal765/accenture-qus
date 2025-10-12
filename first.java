import java.util.*;

class first {
    public static void main(String[] args) {
       int m=6;
       int n=30 ;
       ArrayList<Integer> arr1 =new ArrayList<>();
       ArrayList<Integer> arr2 =new ArrayList<>();
       for(int i=1 ;i<6;i++){
           arr1.add(6*i);
       }
        int sum1 = 0;
        for (int x : arr1) {
            sum1 += x;
        }
       for(int i=0 ;i<n ;i++){
           if(i%6!=0){
               arr2.add(i);
           }
       }
       int sum2=0;
       for(int y:arr2){
           sum2+=y;
       }
       int sum=sum2-sum1;
       System.out.println(sum);
    }
}
