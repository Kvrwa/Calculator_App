import java.util.*;

public class calculator {

    public static void main(String[] args){
        int num1, num2;
        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to Karma's Calculator");

        System.out.println("Enter the first number: ");
        num1 = kb.nextInt();

        System.out.println("Enter the second number: ");
        num2 = kb.nextInt();
        
        System.out.println("Enter your selection: \n1 for Addition \n2 for substraction \n3 for Multiplication"
        +"\n4 for division\n5 for power \n Enter here: ");
        int choose = kb.nextInt();
        mathChoice(choose,num1,num2);
        System.out.println("Do you wish to continue?\n 1 for yes , 2 for no");
        int keepPlaying = kb.nextInt();
        while(keepPlaying == 1){
            System.out.println("Enter the first number: ");
            num1 = kb.nextInt();

            System.out.println("Enter the second number: ");
            num2 = kb.nextInt();
        
            System.out.println("Enter your selection: \n1 for Addition \n2 for substraction \n3 for Multiplication"
            +"\n4 for division\n5 for power \n Enter here: ");
            choose = kb.nextInt();
            mathChoice(choose, num1, num2);
            System.out.println("Do you wish to continue?\n 1 for yes , 2 for no");
            keepPlaying = kb.nextInt();
        }
        kb.close();
        System.out.println("Thank you for using the calculator today!");
        
    }
    public static void mathChoice(int choose,int num1,int num2){
        String yourTotal = "Your total is: ";
        switch (choose){
            case 1:
                System.out.println(yourTotal + addition( num1,num2));
                break;
            case 2:
                System.out.println(yourTotal + subtract( num1,num2));
                break;      
            case 3:
                System.out.println(yourTotal + multiply( num1,num2));
                break;
            case 4:
                System.out.println(yourTotal + divide( num1,num2));
                break;
            case 5:
                System.out.println(yourTotal + power(num1, num2));
                break;
                default:
                    System.out.println("Illigal Operation");
        }
    }

    public static int addition(int x, int y){
        int result = x + y;
        return result;
    }
    public static int subtract(int x, int y){
        int result = x - y;
        return result;
    }
    public static int multiply(int x, int y){
        int result = x*y;
        return result;
    }
    public static int divide(int x, int y){
        int result = x/y;
        return result;
    }
    public static int power(int x, int y){
        double result = Math.pow(x,y);
        return (int)result;
    }
}
