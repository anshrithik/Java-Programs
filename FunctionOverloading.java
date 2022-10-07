public class FunctionOverloading {
    public int add(int a,int b)    {
        return a+b;
    }
    public double add(double a,double b)    {
        return a+b;
    }
    public int add()    {
        int a=10,b=20;
        return a+b;
    }
    public static void main(String[] args) {
        FunctionOverloading fo = new FunctionOverloading();
        System.out.println(fo.add());
        System.out.println(fo.add(10, 5));
        System.out.println(fo.add(10.5, 20.5));
    }
}
