package exam;

public class inheritance {
    public static void main(String[] args) {
       bike one = new bike();
       one.car();
       //here we created the object of the bike class and implemented the methord form the vehicle class 
    }
}

class vehicle{
    public void car(){
        System.out.println("I am a car");
    }
}

class bike extends vehicle{
    public void bike(){
        System.out.println("I am bike");
    }
}
