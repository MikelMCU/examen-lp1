/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Mikel
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDTO {
    private int idusuario;
    private String username;
    private String sexo;
    private String rol;
    private String menu;
    private String url;
    private String icon;
}
