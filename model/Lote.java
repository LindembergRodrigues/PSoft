package repository;

public class Lote {
    private String id;
    private Produto produto;

    Lote(String id, Produto produto){
        this.id = id;
        this.produto = produto;
    }

    public String getId(){
        return id;
    }

    public Produto getProduto(){
        return produto;
    }

    public String toString(){
        return  String.format("O lote de ID nº %d é referente ao produto %s", id, produto);
    }
}
