/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.DaoEscola;
import javax.swing.JOptionPane;
import modelo.Escola;
import tela.manutencao.ManutencaoEscola;
import tela.manutencao.ManutencaoEscola;

/**
 *
 * @author Administrador
 */
public class ControladorEscola {

    public static void inserir(ManutencaoEscola man){
        Escola objeto = new Escola();
        objeto.setAlunos(Integer.parseInt(man.jtfAlunos.getText()));
        objeto.setProfessores(Integer.parseInt(man.jtfProfessores.getText()));
        objeto.setSalas(Integer.parseInt(man.jtfSalas.getText()));
        
        boolean resultado = DaoEscola.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}
}
