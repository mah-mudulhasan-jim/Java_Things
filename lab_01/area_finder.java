public class area_finder{
  public static void main(String [] args){
    double rad = 4.0;
    double circum = 2 * Math.PI * rad;
    double area = Math.PI * Math.pow(rad, 2);
    System.out.println("Circumference= " + circum + "  Area= " + area);
  }
}