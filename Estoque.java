import java.util.ArrayList;
import java.util.List;

public class Estoque{

    private List<Sapato> lista_sapatos;

    public Estoque(){
        this.lista_sapatos = new ArrayList<>();
    }

    public void adicionaSapato(Sapato sapato){
        this.lista_sapatos.add(sapato);
        System.out.println("O sapato do modelo: " + sapato.getModelo() + " foi adicionado no estoque. ");
    }

    public void removeSapato(Sapato sapato){
        for (int i = 0; i < lista_sapatos.size(); i++){
            Sapato sapato_lista = lista_sapatos.get(i);
            if (
                sapato_lista.getModelo().equalsIgnoreCase(sapato.getModelo()) &&
                sapato_lista.getMarca().equalsIgnoreCase(sapato.getMarca()) &&
                sapato_lista.getCor().equalsIgnoreCase(sapato.getCor()) &&
                sapato_lista.getTamanho() == sapato.getTamanho() &&
                sapato_lista.getPreco() == sapato.getPreco()                    
            ){
                this.lista_sapatos.remove(i);
                System.out.println("\nO sapato do modelo: " + sapato.getModelo() + " foi removido do estoque. \n");
            }
        }
    }

    public void exibirEstoque(){
        System.out.println("\n ------ sapatos no estoque ------");
        if (lista_sapatos.isEmpty()) {
            System.out.println("O estoque esta vazio.");
        }else{
            for (int i = 0 ; i < this.lista_sapatos.size(); i++){
                Sapato sapato = this.lista_sapatos.get(i);
                sapato.exibir();
            }
        }
        System.out.println("-----------------------\n");
    }

    public int getTotalEstoque(){
        return this.lista_sapatos.size();
    }

    public Sapato buscaSapato(String modelo){

        for (int i = 0; i < this.lista_sapatos.size() ; i++){
            Sapato sapato = this.lista_sapatos.get(i);
            if (sapato.getModelo().equalsIgnoreCase(modelo)){
                return sapato;
            }
        }
        return null;
    }

    public Boolean contem(Sapato sapato){
        for (int i = 0; i < this.lista_sapatos.size(); i++){
            Sapato sapato_lista = this.lista_sapatos.get(i);
            if (
                sapato_lista.getModelo().equalsIgnoreCase(sapato.getModelo()) &&
                sapato_lista.getMarca().equalsIgnoreCase(sapato.getMarca()) &&
                sapato_lista.getCor().equalsIgnoreCase(sapato.getCor()) &&
                sapato_lista.getTamanho() == sapato.getTamanho() &&
                sapato_lista.getPreco() == sapato.getPreco()){
                return true;

            }
        }
        return false;
        
    }



    
}