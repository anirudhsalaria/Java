class tyre{
    String company;
    tyre(String company){
        this.company=company;
    }

    String getCompany(){
        return company;
    }
}

class engine{
    int cc;
    engine(int cc){
        this.cc=cc;
    }
    int getcc(){
        return cc;
    }
}

class Car{
    tyre wheel;
    engine power;

    Car(){
        this.wheel = new tyre("MRF");
        this.power = new engine(1800);
    }

    String getTyre(){
        return wheel.getCompany();
    }

    int getPower(){
        return power.getcc();
    }
}


public class q29 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Tyre Company= " + car.getTyre());
        System.out.println("Power= " + car.getPower());
    }
}
