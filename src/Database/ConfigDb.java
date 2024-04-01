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
            String url = "jdbc:mysql://localhost:3306/Hospital";
            String user = "root";
            String password = "Rlwl2023.";

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
