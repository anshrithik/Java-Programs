public class NegetiveArray {
    public static void main(String[] args) {
        try {
            int[] a = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("Negetive Array Size!!");
        }
        System.out.println("Continuing execution...");
    }
}
