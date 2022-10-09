public class FunctionOverloading {
    void add(int a,int b)    {
        System.out.println(a+b);
    }
    void add(float a,float b)    {
        System.out.println(a+b);
    }
    void add()    {
        int a=10,b=20;
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        FunctionOverloading fo = new FunctionOverloading();
        fo.add();
        fo.add(30,20);
        fo.add(10.1f,10.5f);
    }
}
