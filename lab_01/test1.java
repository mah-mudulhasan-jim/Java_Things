public class test1{
  public static void main(String [] args){
    int num1 = 3647;
    System.out.println(num1 / 10);
    System.out.println(num1 % 10);
    int last = num1%10;
    int last2 = (num1 / 10)%10;
    
    System.out.println(last + "" + last2);
  }
}