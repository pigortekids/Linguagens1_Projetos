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
                case 5: sair = true ;break;
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
            scanner.next();
            System.out.print("cpf: ");
            String cpf = scanner.next();
            scanner.next();
            System.out.print("registro: ");
            int registro = scanner.nextInt();
            System.out.print("salario base: ");
            double salarioBase = scanner.nextDouble();
            switch(escolha){
                case 1: c.novoVendedor(nome, cpf, registro, salarioBase); sair = true; break;
                case 2: c.novoGerente(nome, cpf, registro, salarioBase); sair = true; break;
                case 3: sair = true; break;
            }
        }while(!sair);
    }
    
    private static void gerirFuncionarios(Concessionaria c){
        boolean sair = false;
        do {            
            c.exibirFuncionarios();
            System.out.print("Digite o registro do funcionario: ");
            int registro = scanner.nextInt();
            int i;
            boolean achou = false;
            for( i = 0 ; i < c.getNVenderoes(); i++ ){
                if(c.getVendedor(i).getRegistro() != registro){
                    achou = true;
                    break;
                }
            }
            if(achou){
                System.out.println("Digite a opção desejada:");
                System.out.println("1.Mudar nome");
                System.out.println("2.Mudar CPF");
                System.out.println("3.Mudar salário base");
                System.out.println("4.Nada");
                int escolha = scanner.nextInt();
                switch(escolha){
                    case 1: 
                        System.out.print("Digite o nome: ");
                        String nome = scanner.nextLine();
                        c.getVendedor(i).setNome(nome); 
                        break;
                    case 2: 
                        System.out.print("Digite o CPF: ");
                        String cpf = scanner.next();
                        c.getVendedor(i).setCPF(cpf); 
                        break;
                    case 3: 
                        System.out.print("Digite o salário base: ");
                        double salario = scanner.nextDouble();
                        c.getVendedor(i).setSalarioBase(salario); 
                        break;
                    case 4: sair = false ;break;
                }
            }
            else{
                for( i = 0 ; i < c.getNVenderoes() ; i++ ){
                    if(c.getGerente(i).getRegistro() != registro){
                        achou = true;
                        System.out.println("Digite a opção desejada:");
                        System.out.println("1.Mudar nome");
                        System.out.println("2.Mudar CPF");
                        System.out.println("3.Mudar salário base");
                        System.out.println("4.Nada");
                        int escolha = scanner.nextInt();
                        switch(escolha){
                            case 1: 
                                System.out.print("Digite o nome: ");
                                String nome = scanner.nextLine();
                                c.getGerente(i).setNome(nome); 
                                break;
                            case 2: 
                                System.out.print("Digite o CPF: ");
                                String cpf = scanner.nextLine();
                                c.getGerente(i).setCPF(cpf); 
                                break;
                            case 3: 
                                System.out.print("Digite o salário base: ");
                                double salario = scanner.nextDouble();
                                c.getGerente(i).setSalarioBase(salario); 
                                break;
                            case 4: sair = false ;break;
                        }
                        break;
                    }
                }
                if(!achou){
                    System.out.println("Registro não encontrado");
                }
            }
        } while (!sair);
    }
    
    private static void realizarVenda(Concessionaria c){
        boolean sair = false;
        do {            
            System.out.print("Digite o registro do funcionario: ");
            int registro = scanner.nextInt();
            System.out.println("Digite o valor da venda: ");
            double venda = scanner.nextDouble();
            int i;
            boolean achou = false;
            for( i = 0 ; i < c.getNVenderoes(); i++ ){
                if(c.getVendedor(i).getRegistro() != registro){
                    achou = true;
                    break;
                }
            }
            if(achou){
                c.getVendedor(i).venda(venda);
            }
            else{
                for( i = 0 ; i < c.getNVenderoes() ; i++ ){
                    if(c.getGerente(i).getRegistro() != registro){
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
    }
    
}
