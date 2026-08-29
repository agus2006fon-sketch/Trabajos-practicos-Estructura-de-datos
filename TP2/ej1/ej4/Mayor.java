package TP2.ej1.ej4;
import java.util.Queue;
import java.util.LinkedList;

public class Mayor {
    public int mayor(Queue<Integer> q){
        Queue<Integer>colaNueva=new LinkedList<Integer>();
        int m=0;
        int actual=0;
        while(!q.isEmpty()){
            actual=q.poll();
            if(m<actual){
                m=actual;
            }
            colaNueva.add(actual);
        }
        return m;
    }
}
