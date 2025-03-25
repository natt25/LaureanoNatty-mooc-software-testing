package tudelft.numfinder;

public class NumFinderMain {

    // El codigo convierte numeros romanos a enteros y encuentra
    // el numero mas pequeño y mas grande en un arreglo de enteros.
    // La clase NumFinder usa el método find para actualizar smallest y largest.
    // En NumFinderMain, una llamada a find falla debido a un error
    // en la logica del método find, donde 'else if' debería ser 'if'.

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
        // nf.find(new int[] {4, 25, 7, 9});

        // this crashes
        nf.find(new int[] {4, 3, 2, 1});

        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());
    }
}

