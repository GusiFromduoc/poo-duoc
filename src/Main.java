import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    for (int contador = 0; contador < 3; contador++) {
        System.out.println("Procesando registro " + contador);
    }

    System.out.print("Ingrese nombre: ");
    String nombre = scanner.nextLine();

    System.out.print("Ingrese carrera: ");
    String carrera = scanner.nextLine();

    System.out.print("Ingrese edad: ");
    int edad = scanner.nextInt();

    Estudiante estudiante = new Estudiante(nombre, carrera, edad);

    if (edad < 18) {
        System.out.println("Estudiante menor de edad.");
    } else if (edad < 25) {
        System.out.println("Estudiante joven.");
    } else {
        System.out.println("Estudiante adulto.");
    }

    estudiante.mostrarInformacion();

    }
}