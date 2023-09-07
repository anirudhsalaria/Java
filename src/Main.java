class demo{
    private int num=10;
    public void access(){
        System.out.println(num);
    }
}


public class Main {
    public static void main(String[] args) {
        demo x;
        x= new demo();
        x.access();
    }
}