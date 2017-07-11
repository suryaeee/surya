import java.util.*;
public class Power {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num = 0;
        int p= 0;
        int pow = 0;

        System.out.print("Enter number: ");
        num = sc.nextInt();

        System.out.print("Enter power: ");
        p = sc.nextInt();

        System.out.print(pow(num,p));
    }
    public static int pow(int a, int b)
    {
            int pow = 1;
            for(int c=0;c<b;c++)
            pow*=a;
            return pow;
        }

}
