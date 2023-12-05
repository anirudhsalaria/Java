class varargs {
    int count = 0;

    void sum(int... args) {
        for (int i = 0; i < args.length; i++) {
            count = count + args[i];
        }
    }

    void getdata() {
        System.out.println(count);
    }
}

public class q44 {
    public static void main(String[] args) {
        varargs var = new varargs();
        var.sum(4, 5, 6);
        var.getdata();
    }
}
