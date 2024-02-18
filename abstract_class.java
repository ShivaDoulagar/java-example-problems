package exam;

public class abstract_class {
    public static void main(String[] args) {
        animals sound = new animals();
        sound.cat();
    }
}

abstract class sounds{
    public void dog(){
        System.out.println("bhav bhav");
    }
    public abstract void cat();
}

class animals extends sounds{
    public void cat(){
        System.out.println("meao meao");
    }
}