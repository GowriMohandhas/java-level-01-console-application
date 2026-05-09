import java.io.*;

class Marklist
{
    public static void main(String args[]) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Student Marklist");

        System.out.println("Enter Enrollment No:");
        String s1 = br.readLine();

        System.out.println("Enter the Name:");
        String s2 = br.readLine();

        System.out.println("Enter Java Mark:");
        String s3 = br.readLine();
        int m1 = Integer.parseInt(s3);

        System.out.println("Enter CWS Mark:");
        String s4 = br.readLine();
        int m2 = Integer.parseInt(s4);

        System.out.println("Enter OS Mark:");
        String s5 = br.readLine();
        int m3 = Integer.parseInt(s5);

        int tot = m1 + m2 + m3;
        System.out.println("Total Mark: " + tot);

        int avg = tot / 3;
        System.out.println("Average Mark: " + avg);

        if(tot >= 250)
            System.out.println("Grade: O");
        else if(tot >= 200)
            System.out.println("Grade: A+");
        else if(tot >= 100)
            System.out.println("Grade: A");

        if(m1 >= 35 && m2 >= 35 && m3 >= 35)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }
}