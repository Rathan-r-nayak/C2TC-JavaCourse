import java.util.Scanner;

public class pencil_dist
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int pencil;
        int cls=9;
        System.out.println("Enter the no. of pencils:");
        pencil=in.nextInt();

        System.out.println("library :"+pencil%cls);
        System.out.println("class :"+(int)pencil/cls);

    }
}