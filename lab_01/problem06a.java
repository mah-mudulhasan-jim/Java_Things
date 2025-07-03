public class problem06a{
  public static void main(String [] args){
    int num1 = 23;
    int num2 = 72;
    int num3 = num2;
    num2 = num1;
    num1 = num3;
    System.out.println(num1 +" " + num2);
  }
}
