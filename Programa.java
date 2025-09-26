import java.util.Scanner;
import java.util.InputMismatchException;

public class Programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Receita receita = new Receita();
        Estoque estoque = new Estoque();
        

        String opcao = " ";
        
        while (!opcao.equals("")) {
            
            System.out.println("Digite as opçoes ou <ENTER> para sair ");
            System.out.println("(1) Cadastrar uma venda; ");
            System.out.println("(2) Exibir relatorio de vendas; ");
            System.out.println("(3) Cadastrar um sapato no estoque; ");  
            System.out.println("(4) Exibir estoque; "); 
            
            opcao = entrada.nextLine();
                     
            
            switch (opcao) {
                case "1":
                    
                    System.out.println("------ Tela de venda ------");
                    Sapato sapatovendid = telaCadastro(entrada);
                    if (sapatovendid != null){

                        float precovenda = sapatovendid.getPreco();
                        Venda venda = new Venda(sapatovendid,precovenda);
                        receita.registrarVenda(venda, estoque);
                        
                    }
                    break;
                    

                case "2":

                    receita.exibirRelatorio();
                    break;

                case "3":

                    System.out.println("------ Tela de cadastro ------");
                    Sapato sapato = telaCadastro(entrada);

                    if (sapato != null && sapato.getTamanho() != 0 && sapato.getPreco() != 0){
                        estoque.adicionaSapato(sapato);    
                    }else{
                        System.out.println("Sapato com dados invalidos, nao foi adicionado ao estoque. ");
                    }
                    break;
    
                case "4":
                    estoque.exibirEstoque();
                    break;
            
                default:
                    System.out.println("Opcao invalida! ");
                    break;
            }
            
        }

        

        entrada.close();


    }


    public static Sapato telaCadastro(Scanner entrada){

        try{

            
            System.out.println("Digite o modelo: ");
            String modelo = entrada.nextLine();
            System.out.println("Digite a marca: ");
            String marca = entrada.nextLine();
            System.out.println("Digite a cor: ");
            String cor = entrada.nextLine();
            System.out.println("Digite o tamanho: ");
            int tamanho = entrada.nextInt();
            System.out.println("Digite o Preço: ");
            float preco = entrada.nextFloat();
            entrada.nextLine();
            
            System.out.println("--------------------");

            return new Sapato(modelo, marca, cor, tamanho, preco);

        } catch(InputMismatchException e){
            System.out.println("Erro: tamanho ou preço invalido. Cadastro cancelado.");
            entrada.nextLine();

            return null;
        }
    }
}
