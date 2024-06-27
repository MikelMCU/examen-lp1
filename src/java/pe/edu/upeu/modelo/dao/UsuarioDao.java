/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.modelo.dao;

import java.util.List;
import pe.edu.upeu.modelo.dto.LoginDTO;

/**
 *
 * @author Mikel
 */
public interface UsuarioDao {
    public List<LoginDTO> login(String username, String pass);

    public Object login(String string);
}
