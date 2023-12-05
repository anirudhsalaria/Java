class parent{
    String name;
    parent(){
        this.name= "anirudh";
    }
    void show(){
        System.out.println(this.name);
    }
}

class child extends parent{
    String name;
    child(){
        this.name= "father";
    }
    void show(){
        System.out.println(this.name);
    }
}


public class q39 {
    public static void main(String[] args) {
        child c = new child();
        c.show();
    }
}
