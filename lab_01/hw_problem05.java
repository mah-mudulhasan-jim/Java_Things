public class hw_problem05{
  public static void main(String [] args){
    double a = 4.5;
    double b = 9.5;
    double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    
    double sin_A = a/c;
    double cos_A = b/c;
    double cos_B = a/c;
    double sin_B = b/c;
    
    System.out.println(sin_A);
    System.out.println(sin_B);
    System.out.println(cos_A);
    System.out.println(cos_B);
  }
}
