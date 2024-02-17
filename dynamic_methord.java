package exam;

public class dynamic_methord{
    public static void main(String[] args) {
        vehicle obj = new plane();
        obj.car();
    }
}

class vehicle{
    public void car(){
        System.out.println("I am a car");
    }
    public void bike(){
        System.out.println("I am a bike");
    }
}

class plane extends vehicle{
    public void car(){
        System.out.println("I am plane");
    }
}