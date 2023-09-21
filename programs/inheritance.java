class Aa{
    public void display(){
        System.out.println("I am class A");
    }
    int a=10;
    private int b=99;
    public int give(){
        return b;
    }
    protected int c=111;
}

class B extends Aa{
    public void show(){
        System.out.println("I am class B");
    }
}

class C extends Aa{
    public void dis(){
        System.out.println("I am in C");
    }
}

public class inheritance{
    public static void main(String[] args) {
        C c = new C();
        c.display();
        c.dis();
        System.out.println(c.a);
        System.out.println(c.give());
        System.out.println(c.c);
    }
}



