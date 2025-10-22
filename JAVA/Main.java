import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //Insert Inclass Project code Below!
    int temp = 0;

    Scanner input = new Scanner(System.in);
    temp  = input.nextInt();
    input.close();

    System.out.println(temp);
  }
  // random num gen
  public static int randomInt(int min, int max) {
    return (int) (Math.random() * (max - min + 1)) + min;
  }
}