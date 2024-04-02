package Model;

import Database.CRUD;
import Database.ConfigDb;
import Entity.Paciente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HospitalModel implements CRUD  {


    @Override
    public Object create(Object object) {
        //Abrir la conexion
        Connection objConnection = ConfigDb.openConnection();

        //Castear el Objeto
        Paciente objPaciente = (Paciente) object;

        try {
            //Crear la consulta
            String sql = "INSERT INTO Paciente(nombre, apellidos, fecha_nacimiento, documento_identidad) values (?,?,?,?);";

            //Preparar el statement
            PreparedStatement objPreparedStatement = (PreparedStatement) objConnection.prepareStatement(sql);

            //setear los valores
            objPreparedStatement.setString(1, objPaciente.getNombre());
            objPreparedStatement.setString(2, objPaciente.getApellido());
            objPreparedStatement.setDate(3, java.sql.Date.valueOf(objPaciente.getDate()));
            objPreparedStatement.setString(4, objPaciente.getDocumentoIdentidad());

            //Ejecutar la consulta
            objPreparedStatement.execute();
            System.out.println("Datos creados exitosamente");


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        //Cerrar la conexion
        ConfigDb.closeConnection();
        return objPaciente;

    }

    @Override
    public List<Object> read() {
        //Abrir la conexion
        Connection objConnection = ConfigDb.openConnection();

        //2. inicializar la lista donde se guardaran los registros
        List<Object> objPaciente = new ArrayList<>();

        try {
           //Crear consulta
            String sql = "SELECT * FROM Paciente ORDER BY Paciente.id_paciente ASC;";

            //Preparar el statement
            PreparedStatement objPreparedStatement = (PreparedStatement) objConnection.prepareStatement(sql);

            //ejecutar el prepare o el query
            ResultSet objResultSet = (ResultSet) objPreparedStatement.executeQuery();

            //6. Obtenet los resultados
            while(objResultSet.next()){

                //Crear un nuevo objeto Paciente
                Paciente objPas = new Paciente();

                //llenamos nuestro objeto con lo que devuelve la BD (resultset)
                objPas.setIdPaciente(objResultSet.getInt("id_paciente"));
                objPas.setNombre(objResultSet.getString("nombre"));
                objPas.setApellido(objResultSet.getString("apellidos"));
                objPas.setDate(objResultSet.getDate("fecha_nacimiento").toLocalDate());
                objPas.setDocumentoIdentidad(objResultSet.getString("documento_identidad"));
                objPaciente.add(objPas);


            }

        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        //Cerrar la conexion
        ConfigDb.closeConnection();

        return objPaciente;
    }



    @Override
    public void update(Object object) {
        //Abrir la concexion
        Connection objConnection = ConfigDb.openConnection();

        //Castear el Objeto
        Paciente objPaciente = (Paciente) object;

        //SQL
        String sql = "UPDATE Paciente SET nombre =?, apellido =?, date =?, documentoIdentidad =? WHERE id_paciente =?";

        try {
            //Preparar el statement
            PreparedStatement objPreparedStatement = (PreparedStatement) objConnection.prepareStatement(sql);

            //setear los valores
            objPreparedStatement.setString(1, objPaciente.getNombre());
            objPreparedStatement.setString(2, objPaciente.getApellido());
            objPreparedStatement.setDate(3, java.sql.Date.valueOf(objPaciente.getDate()));
            objPreparedStatement.setString(4, objPaciente.getDocumentoIdentidad());
            objPreparedStatement.setInt(5, objPaciente.getIdPaciente());

            //Ejecutar la consulta
            objPreparedStatement.execute();


        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        //Cerrar la conexion
        ConfigDb.closeConnection();


    }

    @Override
    public void delete(Object object) {
        //Abrir la coneexion
        Connection objConnection = ConfigDb.openConnection();

        //Castear el Objeto
        Paciente objPaciente = (Paciente) object;





    }

}
