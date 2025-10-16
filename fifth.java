public class fifth{
  public static void main(String args[]){
    int num=5678;
    int base=21;
    System.out.println(convertBase(num,base));
  }
  public static String convertBase(int num,int base){
    
     if (base < 2 || base > 36) {
      return "Base not supported (must be 2–36)";
    }
    StringBuilder sb=new StringBuilder();
    String digits="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    while(num>0){
      int rem=num%base;
      sb.append(digits.charAt(rem));
      num=num/base;
    }
    return sb.reverse().toString();
  }
}

