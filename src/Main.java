
public class Main {

    public static void main(String[] args) {

        int[] arreglo = new int[]{9, 8, 7, 1, 2, 9, 0, 3, 4, 5, 6};
        System.out.println("Arreglo viejo: ");
        imprimirLista(arreglo);
        int[] arreglo2 = quickSort(arreglo, 0, arreglo.length-1);
        System.out.println("Arreglo nuevo: ");
        imprimirLista(arreglo2);

    }
    
    public static void imprimirLista(int[] arreglo){
        for (int b : arreglo) {
            System.out.print(b + ", ");
        }
        System.out.println("");
    }

    
    /*
    Necesita un arreglo sera modificado, tambien necesita el rango en posiciones
    para que sea ordenado.
    */
    public static int[] quickSort(int[] arreglo, int primero, int ultimo) {
        int i = primero;
        int j = ultimo;
        //Obtendremos el pivote que esta en medio entre las 2 posiciones
        int pivote = arreglo[(primero + ultimo) / 2];
        //Este ciclo se dejara de ejecutar cuando ambas posiciones (i Y j) se crucen
        do {
            //Estos ciclos determinara desde que posicion se realizara el intercambio
            while (arreglo[i] < pivote) {i++;}
            while (arreglo[j] > pivote) {j--;}
            //Esta condicion determina si no se han cruzado las posiciones
            //asi para poder realizar el intercambio
            if (i <= j) {
                intercambio(arreglo, i, j);
                i++;
                j--;
            }
        } while (i <= j);
        //Como el arreglo ya esta separado entre menores y mayores (del pivote)
        //se empezara a ordenar ambas mitades
        if (primero < j) {quickSort(arreglo, primero, j);}
        if (ultimo > i) {quickSort(arreglo, i, ultimo);}
        return arreglo;
    }

    public static void intercambio(int[] arreglo, int i, int j) {
        int temporal;
        temporal = arreglo[j];
        arreglo[j] = arreglo[i];
        arreglo[i] = temporal;
    }

}
