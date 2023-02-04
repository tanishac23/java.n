import java.io.*;
import java.util.*;
class addition
{
    public static void main(String[] args)
    {
        int num1, num2, ch;
        float add, sub, mul, div;
        System.out.println("*****Menu program*****");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. division");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter two Numbers:");
        num1= input.nextInt();
        num2= input.nextInt();
        System.out.println("Enter your Choice:");
        ch= input.nextInt();
        switch(ch)
        {
            case 1: add= num1+num2;
             System.out.println("Addition ="+add);
             break;
            case 2: sub= num1-num2;
             System.out.println("Subtraction="+sub);
             break;
            case 3: mul= num1* num2;
             System.out.println("Multiplication="+mul);
             break;
            case 4: div= num1/num2;
             System.out.println("Division="+div);
             break;
         
            default: 
            System.out.println("Oh no!! You have enteres wrong choice!");
        }

    }
}
