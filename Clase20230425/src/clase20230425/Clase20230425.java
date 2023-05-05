package clase20230425;

import clase20230425.newpackage.Carro;
import clase20230425.newpackage.Motor;
import clase20230425.newpackage.Rueda;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
//Clase 2023 04 26*
public class Clase20230425 {
   
    public static void main(String[] args) {
        
        Carro c = new Carro();
        c.setMarca("Toyota");
        c.setModelo("Corolla");
        c.setColor(Color.red);
        c.setMotor(new Motor());
        c.getMotor().setCilindraje(8);
        c.getRuedas().add(new Rueda());
        c.getRuedas().add(new Rueda());
        c.getRuedas().add(new Rueda());
        c.getRuedas().add(new Rueda());
        c.getRuedas().get(0).setNumero(14);
        c.getRuedas().get(0).setFecha(new Date());
        c.getRuedas().get(0).getFecha().setYear(2010);
        
        
        ArrayList cosas = new ArrayList();
        int opcion = 0;
        while (opcion != 8) {
            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog("1- Agregar un numero a las cosas\n"
                            + "2- Agregar una palabra a las cosas\n"
                            + "3- Agregar un carro a las cosas\n"
                            + "4- Listar solamente los carros de las cosas\n"
                            + "5- Modificar el color de algun carro que este en las cosas\n"
                            + "6- Eliminar una cosa\n"
                            + "7- Eliminar una cosa que sea carro\n"
                            + "9- Agregar un accesorio a un carro\n"
                            + "10- Listar los accesorios de un carro\n"
                            + "11- modificar un accesorio de un carro\n"
                            + "12- Eliminar un accesorio de un carro\n"
                            + "13- Agregarle un motor a algun carro\n" 
                            + "14- Modificar las propiedades del motor de un carro\n"
                            + "15- Agregar ruedas a algun carro\n"
                            + "16- Modificar las propiedades de alguna rueda de algun carro\n"
                            + "17- Eliminar una rueda de un carro\n"
                            + "18- Imprimir el carro con mayor cilindraje\n"
                            + "19- Imprimir los carros con llantas nuevas(fecha >= 2023)\n"
                            
                            + "8- Salir")
            );
            if (opcion == 1) {
                cosas.add(
                        Integer.parseInt(
                                JOptionPane.showInputDialog("Ingrese Numero")
                        )
                );
            }
            if (opcion == 2) {
                cosas.add(
                        JOptionPane.showInputDialog("Una Palabra")
                );
            }

            if (opcion == 3) {
                Carro x = new Carro(
                        JOptionPane.showInputDialog("Ingrese serie"),
                        JOptionPane.showInputDialog("Marca")
                );
                cosas.add(x);
            }

            if (opcion == 4) {
                String salida = "";
                for (Object t : cosas) {
                    if (t instanceof Carro) {
                        salida += cosas.indexOf(t) + " - " + t + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, salida);
            }

            if (opcion == 5) {
                int pos = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Posicion del carro a mofificar")
                );
                if (pos >= 0 && pos < cosas.size()) {
                    if (cosas.get(pos) instanceof Carro) {

                        ((Carro) cosas.get(pos)).setColor(
                                JColorChooser.showDialog(null,
                                        "Seleccione un color", Color.yellow)
                        );
                    } else {
                        JOptionPane.showMessageDialog(null,
                                 "La Posicion no es un carro");
                    }

                } else {
                    JOptionPane.showMessageDialog(null,
                             "Posicion Incorecta");
                }

            }

            if (opcion == 6) {
                int pos = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Posicion de la cosa a eliminar")
                );
                if (pos >= 0 && pos < cosas.size()) {
                    int conf = JOptionPane.showConfirmDialog(
                            null, "Desea eliminar?");
                    if (conf == 0) {
                        cosas.remove(pos);
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                             "Posicion Incorrecta");
                }
            }

            if (opcion == 7) {
                int pos = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Posicion de la cosa a eliminar")
                );
                if (pos >= 0 && pos < cosas.size()) {
                    if (cosas.get(pos) instanceof Carro) {
                        int conf = JOptionPane.showConfirmDialog(
                                null, "Desea eliminar");
                        if (conf == 0) {
                            cosas.remove(pos);
                        }
                    }else {
                        JOptionPane.showMessageDialog(null,
                                 "La posicion no es un carro");
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                             "Posicion Incorrrecta");
                }

            }
            
            if (opcion == 9) {
                int pos = Integer.parseInt(
                        JOptionPane.showInputDialog(
                             "Posicion del carro a agregar accesorio")
                );
                if (pos >= 0 && pos < cosas.size()) {
                    if (cosas.get(pos) instanceof Carro) {
                        String acc=JOptionPane.showInputDialog(
                                "Ingrese el accesorio");
                        
                        //((Carro)cosas.get(pos)).setAccesorio(acc); tenemos 4 mutadores
                        ((Carro)cosas.get(pos)).getAccesorios().add(acc);
                    }else {
                        JOptionPane.showMessageDialog(null,
                                 "La posicion no es un carro");
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                             "Posicion Incorrecta");
                }
                
            }
            
            
            if (opcion == 10) {
                int pos = Integer.parseInt(
                        JOptionPane.showInputDialog(
                             "Posicion del carro a lista accesorios")
                );
                if (pos >= 0 && pos < cosas.size()) {
                    if (cosas.get(pos) instanceof Carro) {
                        String salida="";
                        salida+=cosas.get(pos)+"\n\nAccesorios:\n";
                        for (String t :
                                ( (Carro)cosas.get(pos)).getAccesorios() ) {
                            salida+=t+"\n";                            
                        }
                        JOptionPane.showMessageDialog(null, salida);
                    
                    
                    }else {
                        JOptionPane.showMessageDialog(null,
                                 "La posicion no es un carro");
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                             "Posicion Incorrecta");
                }
                
            }
            
            
            if (opcion == 11) {
                int pos = Integer.parseInt(
                        JOptionPane.showInputDialog(
                             "Posicion del carro a lista accesorios")
                );
                if (pos >= 0 && pos < cosas.size()) {
                    if (cosas.get(pos) instanceof Carro) {
                       int posacc = Integer.parseInt(
                        JOptionPane.showInputDialog(
                         "Posicion del accesorio en "+cosas.get(pos))
                       ); 
                       ArrayList<String>temp=
                           ( (Carro)cosas.get(pos)).getAccesorios();
                        if (posacc>=0  &&  posacc<temp.size()) {
                            String nuevoacc=
                                JOptionPane.showInputDialog("Nuevo accesorio");
                            temp.set(posacc, nuevoacc);
                            JOptionPane.showMessageDialog(null, "Exitoso");
                        }
                    
                    }else {
                        JOptionPane.showMessageDialog(null,
                                 "La posicion no es un carro");
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                             "Posicion Incorrecta");
                }
                
            }
            
            if (opcion == 13) {
                int pos = Integer.parseInt(JOptionPane.showInputDialog("Posicion del carro a agregar motor: "));
                if (pos >= 0 && pos < cosas.size()) {
                    if (cosas.get(pos) instanceof Carro) {
                        String serieMotor = JOptionPane.showInputDialog("Ingrese serie del motor: ");
                        int cilindrajeMotor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cilindraje del motor: "));
                        int torqueMotor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese torque del motor: "));
                        Motor nuevoMotor = new Motor(serieMotor, cilindrajeMotor, torqueMotor);
                        ((Carro)cosas.get(pos)).setMotor(nuevoMotor);
                    } else {
                        JOptionPane.showMessageDialog(null, "La posicion no es un carro");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Posicion Incorrecta");
                }
            }
            
            if (opcion == 14) {
                int pos = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Posicion del carro a modificar")
                );
                if (pos >= 0 && pos < cosas.size()) {
                    if (cosas.get(pos) instanceof Carro) {

                        ((Carro) cosas.get(pos)).setColor(
                                JColorChooser.showDialog(null,
                                        "Seleccione un color", Color.yellow)
                        );
                    } else {
                        JOptionPane.showMessageDialog(null,
                                 "La Posicion no es un carro");
                    }

                } else {
                    JOptionPane.showMessageDialog(null,
                             "Posicion Incorecta");
                }

            }
            
            if (opcion == 15) {
                
            }
            
            if (opcion == 16) {
                
            }
            
            if (opcion == 17) {
                
            }
            
            if (opcion == 18) {
                
            }
            
            if (opcion == 19) {
                
            }
        }//FIN WHILE
    }    
}
