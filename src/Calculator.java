import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
     Scanner in =new Scanner(System.in);
     // take input from user till user does not press X or x

    int ans=0;

    while (true) {
        System.out.print("Enter the operation you want to perform:");
        // take the operator as input
        char op = in.next().trim().charAt(0);
        System.out.println();
        if(op =='+'|| op == '-' || op == '*' || op == '/'|| op=='%') {
            System.out.print("Enter two numbers:");
            int num1 = in.nextInt();
            int num2 = in.nextInt();

            if (op == '+') {
                ans = num1 + num2;
            }
            if (op == '-') {
                ans = num1 - num2;
            }
            if (op == '*') {
                ans = num1 * num2;
            }
            if (op == '/') {
                if (num2 == 0) {
                    System.out.println("Error! Dividing by zero");
                    break;
                } else {
                    ans = num1 / num2;
                }
            }
            if(op=='%'){
                ans=num1%num2;
            }
            System.out.println(ans);
        } else if (op == 'x' || op == 'X') {
            break;
        } else {
            System.out.println("Invalid operation");
        }

    }
    }
}
