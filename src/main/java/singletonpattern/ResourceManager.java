package singletonpattern;


public class ResourceManager {
    public static void main(String[] args) {
    
        PrintSpooler spooler = PrintSpooler.getInstance();
        
        Thread threadOne = new Thread(() -> {
            PrintSpooler spooler2 = PrintSpooler.getInstance();
        });
    
        Thread threadTwo = new Thread(() -> {
            PrintSpooler spooler3 = PrintSpooler.getInstance();
        });
        
        threadOne.start();
        threadTwo.start();
    
    }
}
