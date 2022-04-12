package main.java.HelloWorld;

import java.util.Scanner;

/**
 * Un programa capaz de leer datos por teclado y combinarlos en una frase de bienvenida.
 *
 * @author Jose David Echavarria Ruiz.
 */

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Este programa le da una bienvenida como usuario." + "\n");

        Scanner user = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nameUser = user.nextLine();

        System.out.println("Ingrese su número de celular: ");
        String phoneUser = user.nextLine();

        System.out.println("Ingrese su edad: ");
        String ageUser = user.nextLine();
        System.out.println();

        String string = "Bienvenido señor/señora " + nameUser + ", es un placer para nosotros contar con una persona de "
                + ageUser + " años. " + "\n" + "Próximamente nos comunicaremos con usted al número " + phoneUser
                + "." + "\n" + "Feliz Día.";

        System.out.println(string);

    }
}
