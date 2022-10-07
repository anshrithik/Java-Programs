import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int c=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)    {
            if(n%i==0)
            c++;
        }
        if(c==2)
        System.out.println("Number is Prime");
        else
        System.out.println("Number is not Prime");
    }
}
