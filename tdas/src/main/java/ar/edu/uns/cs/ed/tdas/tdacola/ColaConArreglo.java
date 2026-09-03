package ar.edu.uns.cs.ed.tdas.tdacola;
import ar.edu.uns.cs.ed.tdas.excepciones.EmptyQueueException;
public class ColaConArreglo<E> implements Queue<E>{
    private E[] a;
    private int frente;
    private int fondo;
    private int cant;
    @SuppressWarnings("unchecked")
    public ColaConArreglo(int max){
        a=(E[]) new Object[10];
        frente=0;
        fondo=0;
        cant=0;
    }
    public int size(){
        return cant;
    }   
    public boolean isEmpty(){
        return cant==0;
    }
    public E front(){
        if(cant==0)
            throw new EmptyQueueException("no se puede consultar por una cola vacia");
        return a[frente];
    }
    public void enqueue(E elemento){
        if(cant==a.length){
            @SuppressWarnings("unchecked")
            E[]nuevo=(E[])new Object[a.length*2];
            for(int i=0;i<a.length;i++){
                nuevo[i]=a[i];
            }
            a=nuevo;
        }
        a[fondo]=elemento;
        cant++;
        fondo++;
    }
    public E dequeue(){
        if(cant==0)
            throw new EmptyQueueException("la cola no contiene elementos");
        E salida=a[0];
        a[0]=null;
        for(int i=0;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        a[fondo]=null;
        fondo--;
        cant--;
        return salida;
    }
    

}
