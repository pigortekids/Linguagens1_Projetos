package thread;

public class Cliente implements Runnable{

    private int id = 1;
    
    @Override
    public void run() {
        
        for ( int i = 0 ; i < 20 ; i++ ){
            System.out.println("Cliente " + id + " numero --> " + i);
        }
        
    }
    
}