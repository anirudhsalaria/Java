class MyException extends Exception{
    MyException(String s){
        super(s);
    }
}


public class q55{
    public static void main(String[] args) {
        try{
            throw new MyException("This exception is created by me");
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }

}