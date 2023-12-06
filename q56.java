class sample{
    static String s="Anirudh";
    public void getdata(){
        System.out.println(this.s);
    }

    class innerClass{
        public void data(){
            System.out.println("I am non static inner class");
            System.out.println(s);
        }
    }

    static class innerStaticClass{
        public void data(){
            System.out.println("I am static inner class");
            System.out.println(s);
        }
    }
}

public class q56{
    public static void main(String[] args) {
        sample obj = new sample();
        sample.innerClass obj1= obj.new innerClass();
        obj1.data();

        sample.innerStaticClass obj2 = new sample.innerStaticClass();
        obj2.data();
    }
}
