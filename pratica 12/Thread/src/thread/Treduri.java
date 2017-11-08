package thread;

public class Treduri {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        Thread threadCliente = new Thread(cliente);
        threadCliente.start();
        
        Rede rede = new Rede(); 
        Thread threadRede = new Thread(rede);
        threadRede.start();
        
    }
    
}
