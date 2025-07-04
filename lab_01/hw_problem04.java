public class hw_problem04{
  public static void main(String [] args){
    int a = 8;
    int b = 3;
    
    double s = Math.sqrt(Math.pow(a/2, 2) + Math.pow(b, 2));
    double area = 3 * Math.sqrt(3)/2 * s*s;
    double circum = 6 * s;
    System.out.println(area);
    System.out.println(circum);
  }
}
