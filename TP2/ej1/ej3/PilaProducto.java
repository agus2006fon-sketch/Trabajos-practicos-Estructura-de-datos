package TP2.ej1.ej3;
import java.util.Stack;

public class PilaProducto<E> {
    public Stack<E> productoPila(Stack<E>p1,Stack<E>p2){
        Stack<E>nuevaPila=new Stack<>();
        while(!p1.isEmpty() && !p2.isEmpty()){
            nuevaPila.add(p1.pop());
            nuevaPila.add(p2.pop());
        }
        while(!p1.isEmpty()){
            nuevaPila.add(p1.pop());
        }
        while(!p2.isEmpty()){
            nuevaPila.add(p2.pop());
        }
    return nuevaPila;
    }
}
