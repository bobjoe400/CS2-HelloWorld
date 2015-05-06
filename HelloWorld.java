import java.util.Scanner;

public class HelloWorld
{
  private static Scanner in = new Scanner(System.in);
  public static void main(String[] args)
  {
    System.out.println("Hello World!");
    System.out.println("What is your quest");
    String s = in.nextLine();
    System.out.println(s +"! That sounds like fun.");
    System.out.println("Goodbye.");
  }
}
