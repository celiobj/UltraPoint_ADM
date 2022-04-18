/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celiobj.ultrapoint_adm.Persistencia;


import com.celiobj.ultrapoint_adm.Classes.Horario;
import javax.swing.JTable;

/**
 *
 * @author celio
 */
public interface RepositorioHorarioInterface {
    
    public void adicionar(Horario hor);
    public JTable consultatodos();
    
}
