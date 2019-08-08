/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Escola;
/**
 *
 * @author Administrador
 */
public class DaoEscola {
     public static boolean inserir(Escola objeto) {
        String sql = "INSERT INTO escola (alunos, professores, salas, diretor) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getAlunos());
            ps.setInt(2, objeto.getProfessores());
            ps.setInt(3, objeto.getSalas());
            ps.setString(4, objeto.getDiretor());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
      public static void main(String[] args) {
        Escola objeto = new Escola();
        objeto.setAlunos(5);
        objeto.setProfessores(100);
        objeto.setSalas(100);
        objeto.setDiretor("jesus");
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
    
}
