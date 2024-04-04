package Controller;

import Entity.Paciente;
import Model.HospitalModel;

import javax.swing.*;
import java.time.LocalDate;
import java.util.List;

public class HospitalController {

    HospitalModel objHospital;

    public HospitalController() {
        //creamos una instancia del modelo
        objHospital = new HospitalModel();
    }


    public void insert (){
        Paciente objPaciente = new Paciente();
        String nombre = JOptionPane.showInputDialog("Dame tu nombre: ");
        String apellido = JOptionPane.showInputDialog("Dame tu apellido: ");
        LocalDate date = LocalDate.parse(JOptionPane.showInputDialog("Dame tu fecha de nacimiento: "));
        String documentoIdentidad = JOptionPane.showInputDialog("Dame tu documento de identidad: ");

        objPaciente.setNombre(nombre);
        objPaciente.setApellido(apellido);
        objPaciente.setDate(date);
        objPaciente.setDocumentoIdentidad(documentoIdentidad);

        objPaciente = (Paciente) this.objHospital.create(objPaciente);


    }

    public void getAll(){

        String list = this.getAll(this.objHospital.read());
        //mostramos toda la lista
        JOptionPane.showMessageDialog(null,list);
    }



    public String getAll(List<Object> listObject){
        String list = " Lista Pacientes\n";
        //iteramos sobre la lista que devuelve el método find All
        for (Object obj : listObject){
            //convertimos o casteamos el objeto tipo objeto a un coder
            Paciente objPaciente = (Paciente) obj;
            //concatenamos la información
            list+=objPaciente.toString()+ "\n";
        }
        return list;
    }


    public void Update(Object object){


    }


}
