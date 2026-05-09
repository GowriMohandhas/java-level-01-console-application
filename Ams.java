import java.io.*;

class Ams
{
    public static void main(String args[]) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Amstrong Number");
        System.out.println("---------------");
        System.out.println("Enter the Number:");

        String s1 = br.readLine();
        int n = Integer.parseInt(s1);

        int num = n;   
        int sum = 0;
        int r;

        while (n > 0)   
        {
            r = n % 10;
            n = n / 10;
            sum = sum + (r * r * r);
        }

        System.out.println("Report");

        if (num == sum)
        {
            System.out.println(num + " is an Armstrong number");
        }
        else
        {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}