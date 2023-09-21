// class A{
//     private int a=15;
//     private void display(){
//         System.out.println("Anirudh");
//     }
//     public int access(){
//         return a;
//     }

    
// }

// public class accmod {
//     public static void main(String[] args) {
//         A ex = new A();
//         System.out.println(ex.access());
//     }
// }

class A{
    protected void display(){
        System.out.println("Anirudh");
    }

    private int b=11;
    public int a=15;
}

class accmod extends A{
    public static void main(String[] args) {
        accmod ex = new accmod();
        ex.display();
        System.out.println(ex.a);
        // System.out.println(ex.b);
    }
}
