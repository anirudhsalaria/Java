import java.util.Scanner;

public class throw{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        try{
            if(age != 0){
                System.out.println(36/age);
            } else if (age == 0) {
                throw new Exception("Age can't be zero");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
