public class errors {

    public static void A() throws ArithmeticException{
        int num = 36/0;
    }
    public static void main(String[] args) {
        try {
            A();
        } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            // System.out.println(e.getMessage());
        }
        // finally {
        //             System.out.println("ddd");
        // }
        System.out.println("ddd");
    }
}