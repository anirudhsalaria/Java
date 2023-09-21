class Example{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String N){
        this.name=N;
    }
}

public class getset {
    public static void main(String[] args) {
        Example ex = new Example();
        ex.setName("Anirudh");
        System.out.println(ex.getName());
    }
}
