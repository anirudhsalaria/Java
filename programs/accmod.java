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
}

class accmod{
    public static void main(String[] args) {
        A ex = new A();
        ex.display();
    }
}
