/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaDinamica;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author remix
 */
public class EjemploPilaDinamica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        int Opcion, num;
        PilaVector pila = new PilaVector();
        do {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. ingresar\n"+ "2. quitar\n"+ "3. cima\n"+ "4. vacia\n"+ "5. lmpiar\n"+ "6. Mostrar\n"+"7. Salir \n"));

            switch (Opcion) {
                case 1:
                    num = Integer.parseInt(JOptionPane.showInputDialog(null, " ingrasa el numero a agragar"));
                    pila.insertar(num);
                    break;
                case 2:
                    pila.quitar();
                    break;
                case 3:
                    pila.cimaPila();
                    break;
                case 4:
                    pila.pilaVacia();
                    break;
                case 5:
                    pila.limpiarPila();
                    break;
                case 6:
                    pila.mostrarPila();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "INGRESE UNA OPCION VALIDA \n", "ERROR OPCION", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (true);
        } 
        
    }
    

