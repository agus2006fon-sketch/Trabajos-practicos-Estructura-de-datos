package TP2.ej1.ej2;
import java.util.LinkedList;
import java.util.Queue;

public class colaNumeros {
    public Queue<Integer> ColaImpares(Queue<Integer> a){
        Queue<Integer>cola=new LinkedList<>();
        while(!a.isEmpty()){
            int elem=a.poll();
            if(elem %2!=0)
                cola.add(elem);
        }
        return cola;
    }
}
