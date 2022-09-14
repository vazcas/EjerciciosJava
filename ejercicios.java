import java.util.Scanner;
import utils.Ejercicio5;

public class ejercicios{
    public static void main(String[] args) {
        
        // ejercicio 1
        String nombre = "Manuel";
        int edad = 20;
        System.out.println("Los datos del empleado son: "+nombre+" "+edad);

        // ejerciccio 2
        Scanner sc = new Scanner(System.in);
        int edad2 = sc.nextInt();
        if(edad2>=18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }

        // ejercicio 3
        System.out.println("Nombre de usuario:");
        String nombre2 = sc.nextLine();
        System.out.println("Email de usuario:");
        String email = sc.nextLine();

        System.out.println("Los datos del usuario son: "+nombre2+" "+email);

        // ejercicio 4

        int numero = sc.nextInt();
        while(numero != 5)
            numero = sc.nextInt();
        System.out.println("Fin del programa");

        // ejercicio 5

        int numero2 = sc.nextInt();

        do{
            if(numero2 >=1 && numero2 <=50){
                Ejercicio5.compararPar(numero2);
                break;
            }else{
                System.out.println("El número no es válido");
            }
        }while(numero2 >=1 && numero2 <=50);

        // ejercicio 6
        String[] nombres= {"Manu","Lucas","Andres","Nacho","Juan"};

        for(int i=0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }

        // ejercicio 7 
        for(String n : nombres){
            System.out.println(n);
        }

        sc.close();
    }
}
