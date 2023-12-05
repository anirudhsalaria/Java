class student{
    private int students;

    int getStudents(){
        return students;
    }

    void setStudents(int students){
        this.students=students;
    }
}

class chair{
    private int chairs;

    int getChairs(){
        return chairs;
    }

    void setChairs(int chairs){
        this.chairs=chairs;
    }
}

class Classroom{
    student children;
    chair sitting;

    Classroom(){
        this.children = new student();
        this.sitting = new chair();

        children.setStudents(50);
        sitting.setChairs(100);
    }

    int getStrength(){
        return children.getStudents();
    }

    int getkursi(){
        return sitting.getChairs();
    }
}

public class q28 {
    public static void main(String[] args) {
        Classroom classroom =new Classroom();

        System.out.println("Total students: " + classroom.getStrength());
        System.out.println("Total Chairs: " + classroom.getkursi());
    }
}
