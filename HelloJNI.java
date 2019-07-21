class HelloJNI {
    static {
        System.loadLibrary("hello");
    }
    private native void sayHello(); 
    public static void main(String args[]){
        // System.out.println("HELLO MANOHAR");
        new HelloJNI().sayHello();
    }
}