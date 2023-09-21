// public class oops {

//     String name = "Rajesh";
//     int age = 20;
    
//     public static void main(String[] args) {
//         oops ex1 = new oops();
//         oops ex2 = new oops();
//         System.out.println("Name: " + ex1.name);
//         System.out.println("Age: " + ex2.age);
//     }
// }

// class Example3 {
//     String name = "Rajesh";
//     int age = 20;
// }
// public class oops {

//     public static void main(String[] args) {
//         Example3 ex3 = new Example3();
//         System.out.println("Name: " + ex3.name);
//         System.out.println("Age: " + ex3.age);
//     }
// }

public class oops {
    //public method
     public void fruits() {
        String fruits[] = {"Apple", "Banana", "Mango", "Strawberry"};
        System.out.println("Fruits:");
        for (int i=0; i<fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
    
    //static method
    static void vegetables() {
        String vegies[] = {"Onion", "Potato", "Carrot", "Raddish"};
        System.out.println("Vegetables:");
        for (int i=0; i<vegies.length; i++) {
            System.out.println(vegies[i]);
        }
    }
    
    public static void main(String[] args) {
        oops ex5 = new oops();        //need to create object
        ex5.fruits();
        System.out.println();
        
        vegetables();                        // no need to create object
    }
}