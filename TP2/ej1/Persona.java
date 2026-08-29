package TP2.ej1;
import java.util.Stack;

public class Persona {
    protected String nombre;
    protected int edad;
    protected int peso;
//constructor
public Persona(String nom,int edad,int peso){
    nombre=nom;
    this.edad=edad;
    this.peso=peso;
}
//getters
public String getNombre(){
    return nombre;
}
public int getPeso(){
    return peso;
}
public int getEdad(){
    return edad;
}
//setters
public void setNombre(String nom){
    nombre=nom;
}
public void setDni(int edad){
    this.edad=edad;
}
public void setPeso(int peso){
    this.peso=peso;
}
public static void invertirA(Persona[] a){
    Stack<Persona> pila=new Stack<>();
    for(int i=0;i<a.length;i++){
        pila.push(a[i]);
    }
    for(int i=0;i<a.length;i++){
        a[i]=pila.pop();
    }
}    
}
