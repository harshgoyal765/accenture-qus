import java.util.*;

public class third{
  public static void main(String args[]){
    String str1="listen";
    String str2="silent";
    str1=str1.replaceAll("\\s","").toLowerCase();
    str2=str2.replaceAll("\\s","").toLowerCase();

    char arr1[] = str1.toCharArray();
    char arr2[] = str2.toCharArray();
     Arrays.sort(arr1);
     Arrays.sort(arr2);

     if(Arrays.equals(arr1,arr2)){
      System.out.println("Anagram");
     }
     else{
      System.out.println("Not Anagram");
     }
  }

}