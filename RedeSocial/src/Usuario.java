import java.util.ArrayList;
import java.util.List;

public class Usuario implements Comparable<Usuario> {

    private int id;

    private List<Usuario> amigos;

    private CalculadorIntersecao calculadorIntersecao;

    public Usuario(int id, CalculadorIntersecao calculador) {
        this.id = id;
        this.calculadorIntersecao = calculador;
    }

    public int getId() {
        return id;
    }

    public List<Usuario> getAmigos() {
        return this.amigos;
    }

    public void setAmigos(List<Usuario> listaDeAmigos){
        this.amigos = listaDeAmigos;
    }

    /**
     * Retorna a quantidade de amigos em comum entre este Usuario e o
     * outro Usuario informado.
     *
     * @param outro outro Usuario da rede social
     * @return o tamanho da interseção dos conjuntos de amigos
     */
    public int obterQuantidadeDeAmigosEmComum(Usuario outro) {
        return calculadorIntersecao.obterIntersecao(amigos, outro.getAmigos()).size();
    }

    public void gerarListaDeAmigosN(int n, int passo){
        List<Usuario> listaFinal = new ArrayList<>();
        Usuario usuariox;
        for(int x=this.id +1; x<= n; x+= passo){
            usuariox =  new Usuario(x,new CalculadorIntersecaoViaBuscaBinaria());
            listaFinal.add(usuariox);
        }
        this.amigos = listaFinal;
    }

    @Override
    public int compareTo(Usuario o) {
        return this.id - o.id;
    }


}
