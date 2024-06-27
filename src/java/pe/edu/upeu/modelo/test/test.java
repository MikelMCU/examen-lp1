package pe.edu.upeu.modelo.test;

import com.google.gson.Gson;
import pe.edu.upeu.modelo.config.Conexion;
import pe.edu.upeu.modelo.dao.UsuarioDao;
import pe.edu.upeu.modelo.daoImpl.UsuarioDaoImpl;

/**
 *
 * @author Mikel
 */
public class test {
    static UsuarioDao udao = new UsuarioDaoImpl();
    static Gson g = new Gson();
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (Conexion.getConnection()!=null) {
            System.out.println("Conectado");
        }else{
            System.out.println("Error");
        }
        System.out.println(g.toJson(udao.login("mikelm", "123")));
    }
}
