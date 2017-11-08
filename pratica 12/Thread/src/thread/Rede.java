package thread;

public class Rede implements Runnable{

    private int id = 2;
    
    @Override
    public void run() {
        
        for ( int i = 0 ; i < 20 ; i++ ){
            System.out.println("Rede " + id + " numero -----> " + i);
        }
        
    }
    
}
