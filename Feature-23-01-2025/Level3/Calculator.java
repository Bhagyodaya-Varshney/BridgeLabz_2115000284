import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Calculation: ");
        int num = sc.nextInt();
        for(int i=1;i<num;i++){
            System.out.println("Enter 1st number: ");
            double FirstNum = sc.nextDouble();
            System.out.println("Enter 2nd Number: ");
            double SecondNum = sc.nextDouble();
            System.out.println("Enter Operator: ");
            String operator =sc.next();
            switch(operator){
                case "+": 
                    System.out.println("The answer is "+(FirstNum+SecondNum));
                    break;
                case "-": 
                    System.out.println("The answer is "+(FirstNum-SecondNum));
                    break;
                case "*": 
                    System.out.println("The answer is "+(FirstNum*SecondNum));
                    break;
                case "/": 
                    System.out.println("The answer is "+(FirstNum/SecondNum));
                    break;
                default:
                    System.out.println("Invalid Operator");
            }
        }
    }
}
