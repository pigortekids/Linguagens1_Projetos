package exercicio3;

import java.util.Scanner;

public class Exercicio3 {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        boolean sair = false;
        System.out.print("Digite a quantidade de Vendedores: ");
        int m = scanner.nextInt();
        System.out.print("Digite a quantidade de gerentes: ");
        int n = scanner.nextInt();
        System.out.println(m + " " + n);
        Concessionaria cons = new Concessionaria(m,n);
        do{
            System.out.println("Digite a opção desejada");
            System.out.println("1.Inserir Funcionário");
            System.out.println("2.Gerir Funcionários");
            System.out.println("3.Realizar Venda");
            System.out.println("4.Exibir Resumo");
            System.out.println("5.Sair");
            int escolha = scanner.nextInt();
            switch(escolha){
                case 1: inserirFuncionario(cons) ;break;
                case 2: gerirFuncionarios(cons) ;break;
                case 3: realizarVenda(cons) ;break;
                case 4: exibirResumo(cons) ;break;
                case 5: sair = false ;break;
            }
        }while(!sair);
          
    }
    
    private static void inserirFuncionario(Concessionaria c){
        boolean sair = false;
        do{
            System.out.println("Digite a opção desejada");
            System.out.println("1.Inserir Vendedor");
            System.out.println("2.Inserir Gerente");
            System.out.println("3.Sair para menu principal");
            int escolha = scanner.nextInt();
            System.out.println("Insira");
            System.out.print("nome: ");
            String nome = scanner.nextLine();
            System.out.print("cpf: ");
            String cpf = scanner.nextLine();
            System.out.print("registro: ");
            int registro = scanner.nextInt();
            System.out.print("salario base: ");
            double salarioBase = scanner.nextDouble();
            switch(escolha){
                case 1: c.novoVendedor(nome, cpf, registro, salarioBase); break;
                case 2: c.novoGerente(nome, cpf, registro, salarioBase); break;
                case 3: sair = true; break;
            }
        }while(!sair);
    }
    
    private static void gerirFuncionarios(Concessionaria c){
        boolean sair = false;
        do {            
            c.exibirFuncionarios(); //////////////////////////////////////////////////////////
        } while (!sair);
    }
    
    private static void realizarVenda(Concessionaria c){
        boolean sair = false;
        do {            
            System.out.print("Digite o registro do funcionario: ");
            int registro = scanner.nextInt();
            System.out.println("Digite o valor da venda: ");
            double venda = scanner.nextDouble();
            int nV = 0;
            int i=0;
            boolean achou = false;
            for( i = 0 ; i < c.getNGerentes() ; i++ ){
                if(c.getVendedor(i).getRegistro() != registro){
                    nV = 1;
                    achou = true;
                    break;
                }
            }
            if(achou){
                c.getVendedor(i).venda(venda);
            }
            else{
                for( i = 0 ; i < c.getNVenderoes() ; i++ ){
                    if(c.getVendedor(i).getRegistro() != registro){
                        nV = 2;
                        achou = true;
                        break;
                    }
                }
                if(achou){
                    c.getGerente(i).venda(venda);
                }
                else{
                    System.out.println("Registro não encontrado");
                }
            }
            System.out.println("Deseja realizar outra venda?");
            System.out.println("1.Sim");
            System.out.println("2.Não");
            int escolha = scanner.nextInt();
            if(escolha == 1){
                sair = true;
            }
            
        } while (!sair);
    }
    
    private static void exibirResumo(Concessionaria c){
        c.exibirFuncionarios();
        scanner.next();
    }
    
}
