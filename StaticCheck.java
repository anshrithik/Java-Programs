public class StaticCheck {
    String name;
    int roll;
    static String college;
    public void info()  {
        System.out.println("Name : "+this.name);
        System.out.println("Roll : "+this.roll);
        System.out.println("College : "+this.college);
    }
    public static void main(String[] args) {
        StaticCheck sc1 = new StaticCheck();
        StaticCheck sc2 = new StaticCheck();
        sc1.name="Ansh";
        sc1.roll=10;
        sc1.college="NHCM";
        sc2.name="Rithik";
        sc2.roll=20;
        sc2.college="NHCE";
        sc1.info();
        sc2.info();


    }
}
