import java.util.ArrayList;
import java.util.List;

public class CalculadorIntersecaoIngenuo implements CalculadorIntersecao {
    //1
    @Override
    public List<Usuario> obterIntersecao(List<Usuario> lista1, List<Usuario> lista2) {

        // para cada elemento da primeira lista, percorra a segunda lista até encontrá-lo (ou não)
        List<Usuario> compartilhados = new ArrayList<>();
        for(Usuario usuarioPrimeiraLista: lista1){
            for(Usuario usuarioSegundaLista: lista2){
                if(usuarioPrimeiraLista.compareTo(usuarioSegundaLista) == 0){
                    compartilhados.add(usuarioPrimeiraLista);
                }
            }
        }

        return compartilhados;
    }
}
