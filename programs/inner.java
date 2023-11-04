class A{
    int age;
    public void show(){
        System.out.println("in show");
    }
    class B{
        public void config(){
            System.out.println("in config");
        }
    }
}

public class inner{
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}