public class Sixth {
  public static void main(String args[]) {
    int num1 = 451;
    int num2 = 349;
    int result = carry(num1, num2);
    System.out.println(result);
  }

  public static int carry(int num1, int num2) {
    int carry = 0;
    int carryCount = 0;

    while (num1 >0 || num2 >0) {
      int rem1 = num1 % 10;
      int rem2 = num2 % 10;

      int digitSum = rem1 + rem2 + carry;

      if (digitSum >= 10) {
        carry = 1;        
        carryCount++;    
      } else {
        carry = 0;// Reset carry if no carry is generated
      }
      num1 /= 10;
      num2 /= 10;
    }

    return carryCount;
  }
}
