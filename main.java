import java.util.Scanner;

/* Please write a function that returns the product of two numbers */
class main {

  public static void main(String[] args) {
    double first;
    double second;

    Scanner myObj = new Scanner(System.in);
    System.out.print("Enter the first number: ");

    first = Double.parseDouble(myObj.nextLine()); // Read user input

    System.out.println();

    System.out.print("Enter the second number: ");

    second = Double.parseDouble(myObj.nextLine()); // Read user input

    System.out.println();

    System.out.println("The product of " + first + " and " + second + " is: " + first * second);
  }
}