public class nine{
  public static void main(String args[]){
    int m=100;
    int n=160;
    int sum=0;
    for(int i=m+1;i<n ;i++){
      if(i%15==0){
        sum+=i;
      }
    }
    System.out.println(sum);
  }
}