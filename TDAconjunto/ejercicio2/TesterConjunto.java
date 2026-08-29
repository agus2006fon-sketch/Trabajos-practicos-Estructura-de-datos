package TDAconjunto.ejercicio2;

public class TesterConjunto {

    public static void main(String[] args) {
        testConjuntoStrings();
        testConjuntoEnteros();
        testInterseccion();
    }

    public static void testConjuntoStrings() {
        System.out.println("=== TEST CONJUNTO STRINGS ===");
        // Tipo estático: Interfaz Conjunto<E>, tipo dinámico: ConjuntoArreglo<E>
        Conjunto<String> conjuntoNombres = new ConjuntoArreglo<String>(5);

        System.out.println("¿Está vacío al inicio? " + conjuntoNombres.isEmpty()); // true

        conjuntoNombres.put("Alejandra");
        conjuntoNombres.put("Favio");
        conjuntoNombres.put("Alejandra"); // No debería agregarse (duplicado)

        System.out.println("Cantidad de elementos (debe ser 2): " + conjuntoNombres.size());
        System.out.println("Capacidad máxima: " + conjuntoNombres.capacity());
        System.out.println("¿Pertenece 'Favio'?: " + conjuntoNombres.pertenece("Favio")); // true
        System.out.println("¿Pertenece 'Carlos'?: " + conjuntoNombres.pertenece("Carlos")); // false
        System.out.println("Elemento en pos 0: " + conjuntoNombres.get(0));
        System.out.println();
    }

    public static void testConjuntoEnteros() {
        System.out.println("=== TEST CONJUNTO ENTEROS (Wrapper Integer) ===");
        Conjunto<Integer> conjuntoNumeros = new ConjuntoArreglo<Integer>(4);

        // Autoboxing: se pasan int elementales y Java los envuelve en Integer
        conjuntoNumeros.put(10);
        conjuntoNumeros.put(20);
        conjuntoNumeros.put(30);

        System.out.println("¿Está vacío?: " + conjuntoNumeros.isEmpty()); // false
        System.out.println("Cantidad: " + conjuntoNumeros.size()); // 3
        System.out.println("¿Pertenece 20?: " + conjuntoNumeros.pertenece(20)); // true
        System.out.println("¿Pertenece 99?: " + conjuntoNumeros.pertenece(99)); // false
        System.out.println();
    }

    public static void testInterseccion() {
        System.out.println("=== TEST INTERSECCIÓN ===");
        Conjunto<Integer> c1 = new ConjuntoArreglo<Integer>(5);
        c1.put(1);
        c1.put(2);
        c1.put(3);
        c1.put(4);

        Conjunto<Integer> c2 = new ConjuntoArreglo<Integer>(5);
        c2.put(3);
        c2.put(4);
        c2.put(5);

        Conjunto<Integer> resultado = c1.interseccion(c2);

        System.out.println("Tamaño de la intersección (debe ser 2 -> [3, 4]): " + resultado.size());
        System.out.println("¿Pertenece 3 en intersección?: " + resultado.pertenece(3)); // true
        System.out.println("¿Pertenece 1 en intersección?: " + resultado.pertenece(1)); // false
    }
}

