public class CW_problem01{
  public static void main(String [] args){
    int minute = 3456789;
    int year = minute / 525600;
    int temp_min = minute % 525600;
    int day = temp_min / 1440;

    System.out.println(minute + " minutes is approximately " + year + " years and " + day + " days.");
  }
}
