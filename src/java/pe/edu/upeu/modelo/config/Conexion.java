package pe.edu.upeu.modelo.config;

/**
 *
 * @author Mikel
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private static Connection cx;

    public static Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            if(cx==null){
                cx = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "academico", "123456");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Conexion: " + e);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cx;
    }
}
