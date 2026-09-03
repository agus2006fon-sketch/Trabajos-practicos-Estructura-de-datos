package ar.edu.uns.cs.ed.tdas.tdacola;
import java.util.Stack;
import ar.edu.uns.cs.ed.tdas.excepciones.EmptyQueueException;


public class ColaConPila<E> implements Queue<E> {
    private Stack<E> pila;
public ColaConPila(){
    pila=new Stack<>();
}
public int size(){
return pila.size();
}
public boolean isEmpty(){
return pila.isEmpty();
}
public void enqueue(E elemento){
    pila.push(elemento);
}
public E dequeue(){
    if(pila.isEmpty())
        throw new EmptyQueueException("la cola esta vacia");
    Stack<E> aux=new Stack<>();
    while(!pila.isEmpty()){  
        aux.push(pila.pop());
    }
    E ult=aux.pop();
    while(!aux.isEmpty()){
        pila.push(aux.pop());
    }
    return ult;
}
public E front(){
 if(pila.isEmpty())
        throw new EmptyQueueException("la cola esta vacia");
    Stack<E> aux=new Stack<>();
    while(!pila.isEmpty()){  
        aux.push(pila.pop());
    }
    E ult=aux.peek();
    while(!aux.isEmpty()){
        pila.push(aux.pop());
    }
    return ult;
}
}
