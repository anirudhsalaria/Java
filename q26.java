class students{
    String name;
    String roll;
    students(String name, String roll){
        this.name=name;
        this.roll=roll;
    }

    void getdata(){
        System.out.println("NAme of Student: " + name);
        System.out.println("Roll of the student" + roll);
    }
}



public class q26 {
    public static void main(String[] args) {
        students student[] = new students[3];
        students obj1 = new students("Anirudh", "21bcs015");
        students obj2 = new students("Ani", "20bcs015");
        students obj3 = new students("Salaria", "19bcs015");

        student[0]= obj1;
        student[1]= obj2;
        student[2]= obj3;

        for (int i=0; i<student.length;i++){
            student[i].getdata();
        }
    }
}
