import java.io.*;

class Fibonacci
{
    public static void main(String args[]) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Fibonacci Series");
        System.out.println("-----------------");
        System.out.println("Enter the Number:");

        String s1 = br.readLine();
        int n = Integer.parseInt(s1);

        System.out.println("Report");
        System.out.println("Fibonacci Series");

        int a = -1;
        int b = 1;
        int c;

        for(int i = 1; i <= n; i++)
        {
            c = a + b;
            System.out.print(c + ",");
            a = b;
            b = c;
        }
    }
}