public class using_runnable_interface {
    public static void main(String[] args) {
        thread1 one = new thread1();
        Thread one1 = new Thread(one);
        
        thread2 two = new thread2();
        Thread two2 = new Thread(two);

        two2.start();
        one1.start();
    }
}

class thread1 implements Runnable{
    public void run(){
        int i=0;
        while (i<500) {
            System.out.println("I am from thread 1 ");
            i++;
        }
    }
}

class thread2 implements Runnable{
    public void run(){
        int i=0;
        while (i<500) {
            System.out.println("I am from thread 2 ");
            i++;
        }
    }
}