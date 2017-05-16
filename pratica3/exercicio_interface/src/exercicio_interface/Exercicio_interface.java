package exercicio_interface;

public class Exercicio_interface {

    public static void main(String[] args) {
        
        Secretario secretario = new Secretario("Igor", "111.111.111-11", 1, 10);
        Gerente gerente = new Gerente("Higor", "222.222.222-22", 2, 20, "123");
        Diretor diretor = new Diretor("Ygor", "333.333.333-33", 3, 30, "234");
        Cliente cliente = new Cliente("Hygor", "444.444.444-44", "345");
        
        Sistema sistema = new Sistema();        
        
        
        
    }
    
}
