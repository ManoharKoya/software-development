public class fact{
    public native int factorial(int a);
    public static void main(String []args){
        fact f = new fact();
        System.out.println("5 fact is : "+ f.factorial(5));
    }
    static {
        System.loadLibrary("fact");
    }
}