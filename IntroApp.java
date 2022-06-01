import java.util.Scanner;

public class IntroApp {

    public static double askForNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number: ");
        double num1 = sc.nextDouble();
        return num1;
    }

    public static String askForOperator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me the operator: ");
        String op = sc.next();
        return op;
    }

    public static void calculator(String op, double num1, double num2){
        switch (op) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String again;
        System.out.println("Welcome to the calculator");
        do {
            double num1 = askForNumber();
            double num2 = askForNumber();
            String op = askForOperator();
            calculator(op, num1, num2);
            System.out.println("Again?");
            again = sc.next();
        }while(again.equals("y"));
    }
}
