import java.util.Scanner;

class calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true) { 
            System.out.print("Enter the Operator: ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter first number: ");
                int num1 = in.nextInt();
                System.out.print("Enter second number: ");
                int num2 = in.nextInt();

                if (op == '/' && num2 == 0) {
                    System.out.println("Error: Cannot divide by zero!");
                    continue;
                } 

                ans = switch (op) {
                    case '+'-> num1  + num2;
                    case '-'-> num1  - num2;
                    case '*'-> num1  * num2;
                    case '/'-> num1 / num2;
                    case '%'-> num1  % num2;
                    default -> 0;
                } ;
            System.out.println(" -> Answer: " + ans);
            } else if (op == 'X' || op == 'x') {
                System.out.println("Exiting Calculator. Thank you!");
                in.close();
                break;
            } else {
                System.out.println("Invalid Operator, try again.");
            }
        }
    }
}