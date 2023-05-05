package clase20230418;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JColorChooser;

public class Clase20230418 {

    public static void main(String[] args) throws ParseException {
        //Agenda
        //1. Manejo de fechas:
        
        //Declaracion
            Date fecha;
            Date []ArrayDate = new Date[10];
            Date [][] ArrayM = new Date [2][3];
            
        // Asignacion
        //a) momento actual
            fecha = new Date();
            ArrayDate[7] = new Date();
            ArrayM[0][1] = new Date();
            
        //b) Un punto en el tiempo
            fecha = new Date(82,0,6);
            fecha.setHours(15);
            fecha.setMinutes(20);
            fecha.setSeconds(57);
            
            ArrayM[0][0] = new Date(104,2,30);
            
            Calendar c = new GregorianCalendar(2003, 0, 19);        
            fecha = c.getTime();
            
            SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy");
            fecha = parser.parse("17/09/2004");
            
        // Salida
            System.out.println("Salida vulgar: "+ fecha);
            
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
            System.out.println("Salida elegante: " + formato.format(fecha));
        
        // 2. Manejo de color
        // Declaracion
            Color color;
            
        // Asignacion
            color = Color.BLUE;
            color = JColorChooser.showDialog(null,"Seleccione un color: ", Color.BLUE);
            
        // Salida
            System.out.println(color);
        
        //3. Manejo de tokens
            String cadena = "12211056; Lloyd Cooper; Futbol, Playstation; Ing. Sistemas";
            String []tokens = cadena.split(";");
            System.out.println(tokens[2]);
            String []token2 = tokens[2].split(",");
            System.out.println(token2[0]);
            
            StringTokenizer st = new StringTokenizer(cadena, ";");
            while (st.hasMoreElements()) {
                Object nextElement = st.nextElement();
                System.out.println(nextElement);
            }
            
            Scanner sc = new Scanner(cadena);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                String next = sc.next();
                System.out.println(sc.next());
            }
        
        //4. JavaDoc
        
        //Tarea #1:
        
        // Deseamos crear un programa que administre el inventario de Elon Musk
        // se sabe que para cada bien de la empresa existe un codigo, una descripcion,
        // una marca, un color, una fecha de compra, un costo, un valor en libros, una fecha 
        // de expiracion, una ubicacion fisica y un responsable de ese bien. Creemos que Elon podria tener
        // aproximadamente 15,000 bienes.
        
        // Se desea un menu amigable tipo asi:
        
        // 1. Agregar un bien al inventario.
        // 2. Listar todo el inventario.
        // 3. Buscar un bien en el inventario.
        // 4. Modificar a fecha de expiracion de un bien o el color de un bien.
        // 5. Eliminar un bien.
        // 6. Salir.
        
        // Parte 2:
        // Asignar JavaDoc a la tarea y generar el portal web con la documentacion JavaDoc.
    }
    
}
