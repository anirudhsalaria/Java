public class string {
    public static void main(String[] args) {
        // String name= "anirudh";
        // String n ="anirudh";
        // System.out.println(name.equals(n));
        // System.out.println(name);
        // System.out.println(name.length());
        // System.out.println(name.concat( " Salaria"));
        // System.out.println(name);
        // name = name + " Salaria";
        // System.out.println(name);


        StringBuffer name = new StringBuffer("Anirudh");
        System.out.println(name);
        name.append(" Salaria");
        System.out.println(name);
        name.deleteCharAt(4);
        System.out.println(name);
    }
}
