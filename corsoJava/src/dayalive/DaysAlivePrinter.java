package dayalive;

public class DaysAlivePrinter
{
   public static void main(String[] args)
   {
	   Day maboglia = new Day(1969, 7, 28);
	   Day angelo = new Day(1987, 3, 23);
      Day today = new Day();
      System.out.print("Today: ");
      System.out.println(today.toString());
      int daysAlive = today.daysFrom(angelo);
      System.out.print("Days alive: ");
      System.out.println(daysAlive);
   }
}