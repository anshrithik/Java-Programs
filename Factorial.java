public class Factorial {
    public static void main(String[] args) {
        int i,n,fact;
        for(i=1;i<=10;i++)  {
            fact = 1;
            n = i;
            while(n>1)  {
                fact *= n;
                n--;
            }
            System.out.println("Factorial of "+i+" = "+fact);
        }
    }
}
