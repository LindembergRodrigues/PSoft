package Services;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import repository.Lote;

public class RepLote {
     Map<String, Lote> repositorio = new HashMap<>();


    public List<Lote> listar(){
        return (List<Lote>) repositorio.values();
    }

    public void edita(Lote lote){
        repositorio.replace(lote.getId(),lote);
    }   

    public void recuperar(){

    }

    public void remover( String id){

    }

}