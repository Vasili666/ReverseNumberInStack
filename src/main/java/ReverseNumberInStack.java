
import java.util.Scanner;
import java.util.Stack;
// 2.   Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.
public class ReverseNumberInStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");

        if (sc.hasNextInt()){
            int number=sc.nextInt();
            Stack<Integer> stack = new Stack<Integer>();
            for(int a=number; a>0; a/=10){
               stack.push(a%10);
           }                                               // Вносим данные в стек;


        System.out.println("Number in reverse order: ");
        int a=1;
        int reverseNumber=0;
        while ( !stack.isEmpty()){
           reverseNumber=reverseNumber+stack.pop()*a;
           a=a*10;
        }
        System.out.print(reverseNumber);


        }
        else{
            System.out.println("That is not number... Try again!");
        }

    }

}
