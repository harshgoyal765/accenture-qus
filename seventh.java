public class seventh{
  public static void main(String args[]){
    String str="apples";
    char temp='#';
    str=str.replace('a',temp);
    str=str.replace('p','a');
    str=str.replace(temp,'p');
    System.out.println(str);
  }
}

