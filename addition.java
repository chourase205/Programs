import java.util.Scanner;
public class addition
{
    public static void main(String[] args)
    {
        int x, y, sum;
        Scanner scan = new Scanner(System.in);
        System.out.println( "Enter the first number: ");
        x = scan.nextInt();
        System.out.println( "Enter the scond number: ");
        y = scan.nextInt();
        sum = sum(x,y);
        System.out.println("The sum of two number x and y is: " + sum);
    }
    public static int sum(int a, int b)
    {
        int sum = a + b;
        return sum;
    }
}