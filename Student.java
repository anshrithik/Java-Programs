public class Student {
    String name;
    int roll;
    static String college;
    Student(int r, String n, String c)   {
        roll = r;
        name = n;
        college = c;
    }
    public void display() {
        System.out.println(roll+" "+name+" "+college);
    }
    public static void main(String[] args) {
        Student s1 = new Student(1,"Ansh","NHCM");
        s1.display();
        Student s2 = new Student(2,"Rithik","NHCE");
        s2.display();
        s1.display();
    }
}
