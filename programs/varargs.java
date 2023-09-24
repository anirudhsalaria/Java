public class varargs {
    public int sum(int ... args){
        System.out.println("argument length: " + args.length );
        int sum=0;
        for(int i=0; i<args.length; i++){
            sum=sum+args[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        varargs a = new varargs();
        System.out.println(a.sum(4,6,9));
        System.out.println(a.sum(4,64,6,7,9,9));
    }
}
