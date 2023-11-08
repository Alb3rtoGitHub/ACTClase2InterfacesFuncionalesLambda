/*
TRANSFORMADOR
Implemente un método que reciba como parámetro una lista de strings y una interfaz
funcional que transforme cada String de la lista en mayúsculas. El método debe devolver un
nuevo listado de String transformados.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("hola", "mundo", "java");

        //Expresión Lambda
        List<String> listaTransformada = transformar(lista, string -> string.toUpperCase());
        System.out.println(listaTransformada);
    }

    public static List<String> transformar(List<String> lista, Transformador transformador) {
        List<String> listaTransformada = new ArrayList<>();
        for (String string : lista) {
            listaTransformada.add(transformador.mayusculas(string));
        }
        return listaTransformada;
    }
}