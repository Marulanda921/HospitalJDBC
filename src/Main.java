import Controller.HospitalController;

import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HospitalController objHospitalController = new HospitalController();
        Scanner data = new Scanner(System.in);
        boolean salir = false;

       while (!salir) {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                 1. Crear Datos
                 2. Actualizar datos
                 3. Eliminar datos
                 4. Mostrar datos
                 0. Salir
                
                Ingrese una opcion:"""));
        switch (opcion) {
            case 1:
                objHospitalController.insert();
                break;
            case 2:
                System.out.println("Datos actualizados");
                break;
            case 3:
                System.out.println("Datos eliminados");
                break;
            case 4:
                System.out.println("Datos mostrados");
                objHospitalController.getAll();
                break;
            case 0:
                salir = true;
                break;
            default:
        }
       }

    }
}