import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //Insert Inclass Project code Below!
    boolean apples = true;
    int applenum = 0;
    double applestars = 0.0;

    Scanner input = new Scanner(System.in);
    System.out.println("How many apples are there?");
    applenum = input.nextInt();
    System.out.println(applenum);
  }
  // random num gen
  public static int randomInt(int min, int max) {
    return (int) (Math.random() * (max - min + 1)) + min;
  }
}