public class NullPointer {
    public static void main(String[] args) {
        String str = null;
        try{
            System.out.println("First character of str is : " + str.charAt(0));
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException Caught is catch block...");
        }
        finally{
            System.out.println("Finally is Executed Always");

        }
    }
}
