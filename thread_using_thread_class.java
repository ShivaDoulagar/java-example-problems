public class thread_using_thread_class {
    public static void main(String[] args) {
        parent obj1 = new parent();
        son obj2 = new son();
        obj1.start();
        obj2.start();
    }
}

class parent extends Thread{
    public void run(){
        int i=0;
        while (i<5000) {
            System.out.println("I am cooking");
            i++;
        }
    }
}

class son extends Thread{
    public void run(){
        int i=0;
        while (i<5000) {
            System.out.println("I am playing");
            i++;
        }
    }
}