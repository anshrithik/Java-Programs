import java.util.Scanner;
public class StudentMarks {
    int eno;
    String name;
    int m1,m2,m3,total;
    Scanner sc = new Scanner(System.in);

    StudentMarks()  {
        System.out.print("Enter Enrollment ID : ");
        eno = sc.nextInt();
        System.out.print("Enter Name : ");
        name = sc.next();
        System.out.print("Enter three subject Marks : ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
    }

    public void result()    {
        if(this.m1>50&&this.m2>50&&this.m3>50) {
            this.total = this.m1+this.m2+this.m3;
            System.out.println("PASS");
            System.out.println("TOTAL : " +this.total+"/300");
        }
        else    {
            System.out.println("FAIL");
        }
        System.out.println("**********************************");
    }
    public void display()   {
        System.out.println("*********** Students Result : **********");
        System.out.println("Enrollment ID : "+this.eno);
        System.out.println("Name : "+this.name);
        this.result();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Students : ");
        int n = sc.nextInt();
        StudentMarks[] s = new StudentMarks[n];
        for(int i=0;i<n;i++)    {
            s[i] = new StudentMarks();
            s[i].display();
        }
    }
}
