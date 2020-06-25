
package coleccionarraylist;

import java.util.ArrayList;
import java.util.Scanner;



public class ColeccionArrayList {

    public static String dat[]; //aqui creo el arreglo
    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        ArrayList listas = new ArrayList ();
        int limite; String buscar;int element;
        System.out.println("Ingrese la cantidad de elementos que desea almacenar : ->");
        //si nuestra variable es limite , y limite es igual a lo que tengo en dfatos
        limite=datos.nextInt();
        dat = new String[limite];
        //RElleno el array list
        almacenarElementos(dat,listas, datos);
        //muestro elementos del array list
        System.out.println("\n");
        System.out.println("Elementos del ArrayList");
        mostrarElementosArray(listas);
        System.out.println("\n");
        //busco elementos en el arraylist
        System.out.println("****Ingrese el elemento que desea buscar : ");
        buscar= datos.next();
        if(buscarElemento(listas,buscar)){
            System.out.println("Elemento encontrado!!! ");
        }else
        {
            System.out.println("El elemento no existe ");
        }
       //elimino elemento del array list
        System.out.println(" ");
        System.out.println("Ingrese el elemento que desea eliminar");
        element=datos.nextInt();
        eliminarElementoArray(listas,element);
        //Ahora actualizo elementos del arraylist
        System.out.println(" ");
        System.out.println(" Nuevos elementos ");
        mostrarElementosArray(listas);
       
}
    //creo un metodo 
    public static void almacenarElementos(String Array[],ArrayList List,Scanner sc){
        //Almaceno dentro del array
    for (int i=0;i<Array.length;i++){
        System.out.println(" Ingrese un nuevo elemento ["+i+"]-->");
        Array[i]= sc.next();
        //ahora almaceno dentro de la lista
        List.add(Array[i]);
                                    }
    }
    
    //Metodo para mostrar los elementos del arraylist
    public static void mostrarElementosArray(ArrayList list){
        
        list.forEach((lista)->{
            System.out.println(" * "+lista);
                });
   
    }
    //metodo para buscar un elemento en el arraylist
    public static boolean buscarElemento(ArrayList list, String midato){
        boolean bandera= false;
        if(list.contains(midato)){
            
            bandera=true;
        }
        return bandera;
    }
    //Metodo eliminar elementos del array list
    public static void eliminarElementoArray(ArrayList List, int elemento){
        
        List.remove(elemento);
    }
    
}    
