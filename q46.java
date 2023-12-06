abstract class sample {
    abstract void show();

    void display() {
        System.out.println("I am a non abstract function in abstract class");
    }
}

class child extends sample {
    void show() {
        System.out.println("I am abstract function of abstract class defined in child class");
    }

    void print() {
        System.out.println("I am a normal function of child class");
    }
}

public class q46 {
    public static void main(String[] args) {
        child obj = new child();
        obj.show();
        obj.display();
        obj.print();
    }
}
