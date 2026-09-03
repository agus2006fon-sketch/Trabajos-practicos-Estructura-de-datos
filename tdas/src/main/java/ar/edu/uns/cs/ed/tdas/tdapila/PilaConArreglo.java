package ar.edu.uns.cs.ed.tdas.tdapila;
import ar.edu.uns.cs.ed.tdas.excepciones.*;

public class PilaConArreglo<E> implements Stack<E> {
    private int tope;
    private E[]a;
@SuppressWarnings("unchecked")

public PilaConArreglo(int max){
    tope=0;
    a=(E[]) new Object[10];
}
public int size(){
    return tope;
}
public boolean isEmpty(){
    return tope==0;
}
@SuppressWarnings("unchecked")

public void push(E elemento){
    if(tope==a.length){
        E[]nuevo=(E[])new Object[a.length*2];
        for(int i=0;i<a.length;i++){  
            nuevo[i]=a[i];
        }
        a=nuevo;
    }
    a[tope]=elemento;
    tope++;
}
public E pop(){
    if(a.length==0){
        throw new EmptyStackException("no se puede consultar el tope de una pila vacia");
    }
    E elem=top();
    a[tope]=null;
     tope--;
    return elem;
}
public E top(){             
    if(tope==0)
        throw new ar.edu.uns.cs.ed.tdas.excepciones.EmptyStackException("no se puede consultar el tope de una pila vacia");
    return a[tope-1];
}
}
