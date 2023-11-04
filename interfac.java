interface Fruits {
    public abstract void taste();
    public void eat();
}
interface vage{
    public void display();
}

class Mango implements Fruits,vage{
    
    public void taste() {
        System.out.println("Mango is sweet.");
    }

    public void display(){
        System.out.println("SHOW");
    }
    
    public void eat() {
        System.out.println("Let's eat Fruits.");
    }
}



public class interfac {
    public static void main(String[] args) {
        Mango m = new Mango();
        m.eat();
        m.taste();
    }
}