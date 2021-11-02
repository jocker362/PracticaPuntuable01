import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {
        // <>=
        boolean fuerte = false;
        int numero;
        int numeros[] = new int[10];
        int fuertes[] = new int[10];
        int counter = 0;
        Scanner teclado = new Scanner(System.in);

        //Añadimos los valores al Array de numeros
        for (int i = 0; i < 10; i++) {
            numero = teclado.nextInt();
            numeros[i] = numero;
        }
        //COMPROBAR SI HAY NUMERO FUERTE
        for (int k = 0; k < numeros.length; k++){
            for(int l = 1; l < numeros.length; l++){
                if (numeros[k] > numeros[l]){
                    fuerte = true;
                }else{
                    fuerte = false;
                }
            }
            //Almacena los numeros fuertes en el array de numeros fuertes
            if (fuerte == true){
                fuertes[counter] = numeros[k];
                counter++;
            }
        }
        fuertes[counter] = numeros[numeros.length-1];


        //Imprime el array de los numeros fuertes
        for (int j = 0; j < fuertes.length; j++) {
            System.out.println(fuertes[j]);
        }
    }
}
