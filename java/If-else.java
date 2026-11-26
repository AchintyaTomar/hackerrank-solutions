import java.util.*;
public class Test
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if (1<=n && n<=100)
        {
        if (n%2!=0)
        System.out.println("Weird");
        else if (2<=n && n<=5)
        System.out.println("Not Weird");
        else if(6<=n && n<=20)
        System.out.println("Weird");
        else
        System.out.println("Not Weird");
        }
        sc.close();
        
    }
}
