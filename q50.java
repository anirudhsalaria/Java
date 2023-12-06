import java.util.*;
class student implements Comparable<student>{
    String name;
    int num;

    student(String name, int num){
        this.name = name;
        this.num = num;
    }

    public String toString(){
        return "(" + name + "," + num  + ")";
    }

    public int compareTo(student a){
        return this.num - a.num;
    }
}


public class q50 {

    public static void print(student arr[]){
        for(int i =0 ; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        student arr[] = new student[3];
        arr[0] = new student("Anirudh", 15);
        arr[1] = new student("Ankit", 02);
        arr[2] = new student("Vivek", 14);

        Arrays.sort(arr);
        print(arr);

    }
}
