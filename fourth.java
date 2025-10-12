public class fourth{
  public static void main(String args[]){
    int arr[]={5, 4, 2 ,3, 9, 1, 7};
    int arr2[]={9,8,-7,3,9,3};

  // int sum=9;
  int sum=4;
  int result=check(arr2,sum);
  System.out.println(result);
  }
  

  public static int check(int arr[],int sum){
    int n= arr.length;
    if(n<2 || n==0){
      return -1;
    }
    int smallest =arr[0];
    int secsmal=Integer.MAX_VALUE;

      for (int i = 0; i < n; i++) {
      if (arr[i] < smallest) {
        secsmal = smallest;
        smallest = arr[i];
      } else if (arr[i] < secsmal && arr[i] != smallest) {
        secsmal = arr[i];
      }
    }
    if(secsmal+smallest<=sum){
        return secsmal*smallest;
    }
    return 0;
  }
}
