// public class constructors {
//     String name;
//     int age;
//     constructors(){     //default constructor
//         this.name="anirudh";
//         this.age=20;
//         System.out.println("Name: "+ name + "\t" +" Age: " +age);
//     }
//     public static void main(String[] args) {
//         constructors ex = new constructors();
//     }
// }

// overloading constructors 
public class constructors{
    constructors(String name){
        System.out.println("Name: " + name);
    }
    constructors(String name, int age){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }
    public static void main(String[] args) {
        constructors ex1 = new constructors("Anirudh");
        constructors ex2 = new constructors("Anirudh",20);

    }
}