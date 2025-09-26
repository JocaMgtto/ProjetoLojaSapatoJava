import java.util.ArrayList;
import java.util.List;

public class Receita {

    private List <Venda> lista_vendas;

    public Receita(){
        this.lista_vendas = new ArrayList<>();
    }

    public void registrarVenda(Venda novaVenda, Estoque estoque){
        
        Boolean sapato = estoque.contem(novaVenda.getSapatoVendido());
        if(sapato == true){
            estoque.removeSapato(novaVenda.getSapatoVendido()); 
            this.lista_vendas.add(novaVenda);
            System.out.println("Venda registrada com o valor de: RS" + novaVenda.getPrecoVenda() + "\n\n");   

        }else{
            System.out.println("Erro: O sapato nao esta no estoque.");
        }
    }

    public double lucroTotal(){
        double total = 0;
        for(int i = 0; i <  this.lista_vendas.size(); i++){
            Venda lucro = this.lista_vendas.get(i);
            total += lucro.getPrecoVenda();
        }
        return total;
    }

    public double mediaVenda(){
        if (lista_vendas.isEmpty()){
            return 0.0;
        }
        int num_vendas = this.lista_vendas.size();
        double media = lucroTotal() / num_vendas;
        return media;
    }

    public void exibirRelatorio(){
        System.out.println("\n ------ Relatorio Financeiro ------");
        System.out.println("Total de vendas realizada: " + lista_vendas.size());
        System.out.printf("Lucro total: %.2f\n", lucroTotal() );
        System.out.printf("Media por vendas: %.2f%n", mediaVenda());
        System.out.println("------ Final do Relatorio ------\n");
        
    }


}

