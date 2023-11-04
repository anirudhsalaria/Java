class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

public class custom {
    int num;

    public static void main(String[] args) {        
        try{
            throw new MyException("Yeh mera hai");
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}