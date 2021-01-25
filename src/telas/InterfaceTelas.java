/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import classes.Quarto;
import java.util.ArrayList;

public interface InterfaceTelas {
    void imprimeTabela(int i, ArrayList<Quarto> q, javax.swing.JTable p);
    void dadosTabela(ArrayList<Quarto> q);
    ArrayList<Quarto> TypeQuarto(boolean n);
    void verificaBox();
}
