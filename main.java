import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
        boolean isRunning = true;
        boolean exit = false;
        while (true){
            System.out.println("To exit after this message, type 'exit'.");
            System.out.println("Type an arithmetic symbol here.");
            Scanner scan = new Scanner(System.in);
            String symbol = scan.nextLine();
            switch (symbol) {
                case "+":
                    System.out.println("Please enter the first digit.");
                    String stringAdd1 = scan.nextLine();
                    double add1 = Double.parseDouble(stringAdd1);
                    System.out.println("Please enter the second digit.");
                    String stringAdd2 = scan.nextLine();
                    double add2 = Double.parseDouble(stringAdd2);
                    System.out.println(add1 + add2);
                    break;
                case "-":
                    System.out.println("Please enter the first digit.");
                    String stringSubtract1 = scan.nextLine();
                    double subtract1 = Double.parseDouble(stringSubtract1);
                    System.out.println("Please enter the second digit.");
                    String stringSubtract2 = scan.nextLine();
                    double subtract2 = Double.parseDouble(stringSubtract2);
                    System.out.println(subtract1 - subtract2);
                    break;
                case "/":
                    System.out.println("Please enter the first digit.");
                    String stringDivide1 = scan.nextLine();
                    double divide1 = Double.parseDouble(stringDivide1);
                    System.out.println("Please enter the second digit.");
                    String stringDivide2 = scan.nextLine();
                    double divide2 = Double.parseDouble(stringDivide2);
                    System.out.println(divide1 / divide2);
                    break;
                case "*":
                    System.out.println("Please enter the first digit.");
                    String stringMultiply1 = scan.nextLine();
                    double multiply1 = Double.parseDouble(stringMultiply1);
                    System.out.println("Please enter the second digit.");
                    String stringMultiply2 = scan.nextLine();
                    double multiply2 = Double.parseDouble(stringMultiply2);
                    System.out.println(multiply1 * multiply2);
                    break;
                case "exit": System.exit(0);
                default:
                    System.out.println("Please put in a real arithmetic symbol");
            }
        }
    }
}
