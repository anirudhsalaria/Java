class demo{
    private int num=10;
    public void access(){
        System.out.println(num);
    }
}

class aadhaar{
    private int aadhaar_no;
    private String name;
    private String address;

    public void setdata(int aadhaar_no, String name, String address){
        this.aadhaar_no=aadhaar_no;
        this.address=address;
        this.name=name;
    }
     public void getdata(){
        System.out.println("Welcome "+ name);
        System.out.println("Name :"+ name);
        System.out.println("Address :"+ address);
        System.out.println("Aadhaar Number :"+aadhaar_no);
     }
}


public class Main {
    public static void main(String[] args) {
        demo x;
        aadhaar y;
        y= new aadhaar();
        x= new demo();
        x.access();
        y.setdata(47569562, "Anirudh Salaria", "Greater Kailash Jammu");
        y.getdata();
    }
}