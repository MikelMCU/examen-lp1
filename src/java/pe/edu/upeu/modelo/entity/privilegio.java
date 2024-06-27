/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.modelo.entity;

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
public class privilegio {
    private int idprivilegio;
    private String nombre;
    private String url;
    private String icono;
}
