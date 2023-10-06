package randomjavawork;
import java.util.*;
public class CalculatorProject {
    public static void main(String[] args)
    {

        Scanner kb= new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter first number:");
        num1 = kb.nextInt();
        System.out.println("Enter second number:");
        num2 = kb.nextInt();
        System.out.println("Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
        int choose;
        choose = kb.nextInt();
        kb.close();
        switch (choose){
        case 1:
            System.out.println(add( num1,num2));
            break;
        case 2:
            System.out.println(sub( num1,num2));
            break;      
        case 3:
            System.out.println(mult( num1,num2));
            break;
        case 4:
            System.out.println(div( num1,num2));
            break;
            default:
                System.out.println("Illigal Operation");


        }



    }
    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int sub(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static double div(int x, int y)
    {
        int result = x/y;
        double remainder = x % y;

        return result + remainder;
    }
}
