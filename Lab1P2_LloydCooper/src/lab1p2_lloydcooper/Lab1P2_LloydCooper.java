package lab1p2_lloydcooper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Lab1P2_LloydCooper {

    static Scanner scanner = new Scanner (System.in);
    
    public static void main(String[] args) throws ParseException {
        int opcion = 0;
     
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Calcular diferencia de fechas");
            System.out.println("2. Numeros palindromos ");
            System.out.println("3. Salir ");
            System.out.print("Ingrese su opción: ");
                    opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            calcularDiferenciaFechas();
                            break;
                        case 2:
                            Scanner scanner = new Scanner(System.in);

                            int numDigits = 0; // Asignar un valor predeterminado
                            boolean isValid = false;

                            // Validar si el número ingresado es par y solicitar nueva entrada si es necesario
                            while (!isValid) {
                                System.out.print("Ingrese la cantidad de dígitos en el número (solo números impares): ");
                                numDigits = scanner.nextInt();

                                if (numDigits % 2 == 0) {
                                    System.out.println("El número ingresado es par. Por favor ingrese un número impar.");
                                } else {
                                    isValid = true;
                                }
                            }
                            
                            // Crear un arreglo para almacenar los dígitos del número
                            int[] arr = new int[numDigits];

                            // Solicitar los dígitos del número uno por uno
                            System.out.println("Ingrese los dígitos del número uno por uno:");
                            for (int i = 0; i < numDigits; i++) {
                                System.out.print("Dígito " + (i + 1) + ": ");
                                arr[i] = scanner.nextInt();
                            }

                            // Verificar si el número es palíndromo
                            boolean isPalin = isPalindrome(arr, 0, numDigits - 1);

                            // Mostrar el número ingresado de manera estética
                            System.out.print("El número ingresado es: ");
                            for (int i = 0; i < numDigits; i++) {
                                System.out.print(arr[i]);
                                if (i < numDigits - 1) {
                                    System.out.print(" - ");
                                }
                            }

                            // Mostrar el resultado del ejercicio
                            if (isPalin) {
                                System.out.println("\nEl número ingresado es un palíndromo.");
                            } else {
                                System.out.println("\nEl número ingresado NO es un palíndromo.");
                            }
                            break;
                        case 3:
                            System.out.println("Hasta luego! ");
                            break;
                        default:
                            break;
            }
        } while (opcion != 3);

    }

    public static void calcularDiferenciaFechas() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Obtener fecha actual del sistema
        Calendar calendar = Calendar.getInstance();
        Date fechaActual = calendar.getTime();

        System.out.println("Fecha actual: " + sdf.format(fechaActual));
        System.out.print("Ingrese fecha (en formato dd/MM/yyyy): ");
        String fechaIngresadaStr = scanner.nextLine();

        try {
            Date fechaIngresada = sdf.parse(fechaIngresadaStr);

            // Verificar si la fecha ingresada es una fecha en el pasado

            // Calcular la diferencia en milisegundos
            long diferenciaMilisegundos = fechaIngresada.getTime() - fechaActual.getTime();

            // Convertir la diferencia a dias
            long diferenciaDias = diferenciaMilisegundos / (24 * 60 * 60 * 1000);

            // Calcular la diferencia en años, meses y dias
            int años = (int) (diferenciaDias / 365);
            int meses = (int) ((diferenciaDias % 365) / 30);
            int dias = (int) ((diferenciaDias % 365) % 30);

            System.out.println("Fecha ingresada: " + sdf.format(fechaIngresada));
            System.out.println("Diferencia en años: " + "(" + Math.abs(años) + ")");
            System.out.println("Diferencia en meses: " + "(" + Math.abs(meses) + ")");
            System.out.println("Diferencia en días: " + "(" + Math.abs(dias) + ")");

        } catch (ParseException e) {
            System.out.println("Error al parsear las fechas ingresadas. Por favor, ingrese fechas válidas.");
        }
    }   
    
    // Metodo para verificar si un numero es palindromo de manera recursiva
    public static boolean isPalindrome(int[] arr, int start, int end) {
        // Caso base: si solo queda un dígito o ninguno, es palíndromo
        if (start >= end) {
            return true;
        }
        // Compara los digitos en los extremos del arreglo
        if (arr[start] == arr[end]) {
            // Llamada recursiva para verificar los digitos internos
            return isPalindrome(arr, start + 1, end - 1);
        } else {
            // Si los digitos no son iguales, no es palindromo
            return false;
        }
    }
}

