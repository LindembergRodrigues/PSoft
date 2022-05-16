package repository;
import java.util.Calendar;

public class Produto {
    String id;
    String nome;
    Calendar fabricacao; 
    double preco;


    public String toString(){
        return nome;
    }
}
