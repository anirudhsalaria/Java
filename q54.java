public class q54{
    public static void divide() throws ArithmeticException{
        int a = 36/0;
    }

    public static void main(String[] args) {
        System.out.println("Normal Working");
        try{
            divide();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("After exception");
    }
}