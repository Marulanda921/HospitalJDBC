package Model;

import Database.CRUD;
import Database.ConfigDb;
import Entity.Paciente;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class HospitalModel implements CRUD  {


    @Override
    public void create(Object object) {
        //Abrir la conexion
        Connection objConnection = ConfigDb.openConnection();

        //Castear el Objeto
        Paciente objPaciente = (Paciente) object;

        try {
            //Crear la consulta
            String sql = "INSERT INTO Paciente (nombre, apellido, date, documentoIdentidad) VALUES (?,?,?,?)";

            //Preparar el statement
            PreparedStatement objPreparedStatement = (PreparedStatement) objConnection.prepareStatement(sql);

            //setear los valores
            objPreparedStatement.setString(1, objPaciente.getNombre());
            objPreparedStatement.setString(2, objPaciente.getApellido());
            objPreparedStatement.setDate(3, java.sql.Date.valueOf(objPaciente.getDate()));
            objPreparedStatement.setString(4, objPaciente.getDocumentoIdentidad());

            //Ejecutar la consulta
            objPreparedStatement.execute();


        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        //Cerrar la conexion
        ConfigDb.closeConnection();


    }

    @Override
    public void read(Object object) {
        //Abrir la conexion
        Connection objConnection = ConfigDb.openConnection();

        //Castear el Objeto
        Paciente objPaciente = (Paciente) object;

        try {
           //Crear consulta
            String sql = "SELECT * FROM Paciente WHERE idPaciente =?";

            //Preparar el statement
            PreparedStatement objPreparedStatement = (PreparedStatement) objConnection.prepareStatement(sql);

            //setear los valores
            objPreparedStatement.setInt(1, objPaciente.getIdPaciente());

            //Ejecutar la consulta
            objPreparedStatement.executeQuery();



        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        //Cerrar la conexion
        ConfigDb.closeConnection();

    }

    @Override
    public void update(Object object) {

    }

    @Override
    public void delete(Object object) {

    }
}
