class sample{
    int x;
    sample(int x){
        this.x=x;
    }

    public String toString(){
        return "Number: " + this.x;
    }

    public int hashCode(){
        return super.hashCode();
    }
}


public class q42 {
    public static void main(String[] args) {
        sample obj = new sample(5);
        System.out.println(obj.hashCode());
        System.out.println(obj);
    }
}
