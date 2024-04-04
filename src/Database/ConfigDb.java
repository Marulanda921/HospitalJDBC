package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigDb {

    static Connection objectConnection = null;

    public static Connection openConnection(){
        try {
            //Poner los parametros de sql
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://ubhcqw12knpisxrm:yuCPPcow388x77AuUDSR@bl94q8x0enxf0nko5eio-mysql.services.clever-cloud.com:3306/bl94q8x0enxf0nko5eio";
            String user = "ubhcqw12knpisxrm";
            String password = "yuCPPcow388x77AuUDSR";

            //Verificar la conexion
            objectConnection = (Connection) DriverManager.getConnection(url,user,password);
            System.out.println("Haz entrado exitosamente");


        } catch (SQLException e) {
            System.out.println("El problema es: " + e.getMessage());
        }
        return objectConnection ;
    }

    public static void closeConnection(){
        try {
            objectConnection.close();
        } catch (SQLException e) {
            System.out.println("El problema es: " + e.getMessage());
        }
    }
}
