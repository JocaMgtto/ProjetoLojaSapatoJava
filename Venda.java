import java.time.LocalDate;

public class Venda {
    
    private Sapato sapatoVendido;
    private double precoVenda;
    private LocalDate dataDaVenda;

    public Venda(Sapato sapatoVendido, double precoVenda){

        this.sapatoVendido = sapatoVendido;
        this.precoVenda = precoVenda;
        this.dataDaVenda = LocalDate.now();
    }

    public Sapato getSapatoVendido(){
        return sapatoVendido;
    }

    public double getPrecoVenda(){
        return precoVenda;
    }

    public LocalDate getDataVenda(){
        return dataDaVenda;
    }
    
}
