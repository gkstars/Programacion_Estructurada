public class CuadradoDeUnEntero {
    public static void main(String[] args) {
        // Array de numeros enteros
        int numeros[] = {1, 2, 3, 4, 5, 6 ,7, 8, 9};

        // Iteramos sobre el array de numeros
        for (int i = 0; i < numeros.length; i++) {
            // Mostramos el cuadrado de cada numero
            System.out.println("El cuadrado de " + numeros[i] + " es " + Math.pow(numeros[i], 2));
        }
    }
}