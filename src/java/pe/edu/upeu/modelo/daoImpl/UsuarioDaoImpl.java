
package pe.edu.upeu.modelo.daoImpl;

import java.util.List;
import pe.edu.upeu.modelo.dao.UsuarioDao;
import pe.edu.upeu.modelo.dto.LoginDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import pe.edu.upeu.modelo.config.Conexion;


/**
 *
 * @author Mikel
 */

public class UsuarioDaoImpl implements UsuarioDao {
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;

    @Override
    public List<LoginDTO> login(String username, String pass) {
        List<LoginDTO> lista = new ArrayList<>();
        String SQL = "SELECT u.idusuario, u.username, e.sexo, r.nombre as rol, p.nombre as menu, p.url, p.icono FROM usuario u " +
                     "inner join empleado e on u.idempleado = e.idempleado " +
                     "inner join rol r on u.idrol=r.idrol " +
                     "inner join rol_privilegios rp on r.idrol = rp.idrol " +
                     "inner join privilegios p on rp.idprivilegio = p.idprivilegio " +
                     "where u.username= ? and u.clave= ? and estado=1";
        try {
            cx = Conexion.getConnection();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, username);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while(rs.next()){
                LoginDTO login = new LoginDTO();
                login.setIdusuario(rs.getInt("idusuario"));
                login.setUsername(rs.getString("username"));
                login.setRol(rs.getString("rol"));
                login.setSexo(rs.getString("sexo"));
                login.setUrl(rs.getString("url"));
                login.setIcon(rs.getString("icono"));
                lista.add(login);
            }
        } catch (SQLException e) {
            System.out.println("Login: " +e);
        }
        return lista;
    }

    @Override
    public Object login(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
