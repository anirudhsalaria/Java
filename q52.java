public class q52 {
    public static void main(String[] args) {
        try{
            int a = 36/0;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("AlwaysPrint");
        }
    }
}
