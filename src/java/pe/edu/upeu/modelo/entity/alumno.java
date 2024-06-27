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
public class alumno {
    private int idalumno;
    private String nombres;
    private String apellidos;
    private String correo;
    private int telefono;
    private int idescuela;
}
