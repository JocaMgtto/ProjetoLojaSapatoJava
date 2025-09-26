public class Sapato {

    private String modelo;
    private String marca;
    private String cor;
    private int tamanho;
    private float preco;

    public Sapato(String modelo, String marca, String cor, int tamanho, float preco){
        this.modelo = modelo.toLowerCase();
        this.marca = marca.toLowerCase();
        this.cor = cor.toLowerCase();
        setTamanho(tamanho);
        setPreco(preco);
        
    }


    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public int getTamanho(){
        return tamanho;
    }

    public void setTamanho(int tamanho){
        if (tamanho > 0){
            this.tamanho = tamanho;
        }else{
            System.out.println("Erro: tamanho invalido.");
        }
            
    }

    public float getPreco(){
        return preco;
    }

    public void setPreco(float preco){
        if (preco >= 0){
            this.preco = preco;
        } else{
            System.out.println("Erro: Preço invalido.");
        }
        
    }

    void exibir(){
        System.out.println();
        System.out.printf("O sapato é do modelo: %s;\nmarca: %s;\ncor: %s;\ntamanho: %d;\npreço de: %.2f \n \n  ", this.modelo, this.marca, this.cor, this.tamanho, this.preco );
    }
    
}
