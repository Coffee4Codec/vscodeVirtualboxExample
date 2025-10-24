import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Insert Inclass Project code Below!
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a phrase (every wrod first letter uppercase): ");
    String line = in.nextLine();

    // add the method calls

    System.out.println("ACRONYM: " + acronym(line));
    System.out.println("EVERY NTH (n=3): " + );
    System.out.println("ALTERNATING CASE: " + );
    System.out.println("CONSONANTS ONLY: " + );
  }
  // random num gen

  // Returns e.g. "Big Apple" -> "BA"
  public static String acronym(String line) {
    String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String acro = "";

    for(int i = line.length(); i < line.length(); i++) {
      if (uppercase.indexOf(line.charAt(i)) != -1) {
        acro += line.charAt(i);
      }
    }
    
    return acro;
  }

  // Returns every nth character starting at index 0
  public static String everyNth(String line, int n) {

  }

  // "hello" -> "HeLlO"
  public static String alternatingCase(String line) {

  }

  // Remove spaces, vowels, and punctuation
  public static String consonantsOnly(String line) {

  }

  public static int randomInt(int min, int max) {
    return (int) (Math.random() * (max - min + 1)) + min;
  }
}