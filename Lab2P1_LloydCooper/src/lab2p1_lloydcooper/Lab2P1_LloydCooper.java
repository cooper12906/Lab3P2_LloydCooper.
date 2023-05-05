package lab2p1_lloydcooper;
import java.util.Scanner;

public class Lab2P1_LloydCooper {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int opcion = 0;
    
    while (opcion != 4) {
        System.out.println("Menu");
        System.out.println("1. Numero perfecto");
        System.out.println("2. Sumatoria");
        System.out.println("3. Serie ");
        System.out.println("4. Salir");
        
        opcion = leer.nextInt();
        
        switch(opcion) {
            case 1:
                System.out.println("Ingrese un numero entero positivo");
                int num = leer.nextInt();
                boolean isPrime = true;
                boolean isPerfect = false;
                int sum = 0;

                for (int i = 2; i <= num / 2; i++){
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println("es primo y no se puede calcular si es perfecto. "+ num);
                }else{
                    for (int i = 1 ; i <=num/2;i++) {
                        if (num % i == 0) {
                            sum+=i;

                        }
                    }

                    if (sum == num) {
                        isPerfect= true;
                        System.out.println("Es un numero perfecto y sus divisores son: ");
                        for (int i = 1; i <= num/2; i++) {
                            if  (num % i == 0) {
                                System.out.println(" "+i);

                            }
                        }
                    } else {
                        System.out.println("No es un numero perfecto" +num);
                    }

                }
                break;
            case 2:
                System.out.println("Sumatoria");   

                double k;
                double n=1;
                double y=0;
                double base=0;

                System.out.println(" ");
                System.out.print("Ingrese limite de sumatoria: ");
                k=leer.nextInt();

                while (k < 0 || k == 0){
                    System.out.println("El numero ingresado no es valido");
                    System.out.print("Ingrese un numero positivo:  "); 
                    k = leer.nextInt();
                    System.out.println(" ");
                }

                while (n<=k){         
                    base=n/(n+1);
                    y=Math.pow(base,n)+y;
                    n++;
                } 
                System.out.println("Output: "+ y);
                break;
            case 3:
                System.out.println("Ingrese limite");
                int lim = leer.nextInt();
                int cont = 0, acum = 2, otro;
                while (cont < lim){
                    if (cont % 2 == 0) {
                        otro = acum * 1;
                    } else {
                         otro = acum * -1;       
                     }
                     System.out.println(otro);
                     acum += 2;
                     cont++;
                 }
                 break;
            case 4:
                System.out.println("La opcion ingresada no es valida.");
            }
        }           
    }               
}    


        