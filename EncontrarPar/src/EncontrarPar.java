import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EncontrarPar {

    public static void encontrarPar(List<Integer> lista, int k){
        Collections.sort(lista);
        int maior = lista.get(lista.size()-1);
        for(int numero: lista){
            int outraParte = k-numero;
            if(numero > k/2 || numero == maior){
                System.out.println("Nao possui pares.");
                break;
            }
            if(outraParte > maior){
                ;
            }
            //Pensei nisso, para nao precisar ter que ver no contains, se a outra parte fosse maior
            // que o maior elemento da lista, logo nao faria sentido passar pelo contains.
            else{
                if(lista.contains(outraParte)){
                    System.out.printf("%d, %d\n",numero,outraParte);
                    break;
                }
            }
        }
    }

    //Teste pra ver se funcionava
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(5);
        lista.add(-10);
        lista.add(56);
        lista.add(44);
        lista.add(12);
        lista.add(18);

        encontrarPar(lista,34);
    }

}
