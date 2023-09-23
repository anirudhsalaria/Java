class parent{
    void show(){
        System.out.println("This is parent show");
    }
}

class child extends parent{
     void show(){
        System.out.println("This is child show");
    }
}


public class over {
    public static void main(String[] args) {
        child ex = new child();
        ex.show();
        parent ex2 = new parent();
        ex2.show();
    }
}
