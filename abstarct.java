abstract class fruits{
    public abstract void taste();
    public void eat(){
        System.out.println("Lets eat");
    }
}
class Mango extends fruits{
    public void taste(){
        System.out.println("Mango is sweet");
    }
}


public class abstarct {
    public static void main(String[] args) {
        Mango obj = new Mango();
        obj.eat();
        obj.taste();
    }
}
