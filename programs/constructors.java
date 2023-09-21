public class constructors {
    String name;
    int age;
    constructors(){     //default constructor
        this.name="anirudh";
        this.age=20;
        System.out.println("Name: "+ name + "\t" +" Age: " +age);
    }
    public static void main(String[] args) {
        constructors ex = new constructors();
    }
}
