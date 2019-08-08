/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Escola {
    private Integer Alunos;
    private Integer Professores ;
    private Integer Salas;
    private String Diretor;
    private Integer codigo;

    @Override
    public String toString() {
        return Diretor;
    }

    public Integer getAlunos() {
        return Alunos;
    }

    public void setAlunos(Integer Alunos) {
        this.Alunos = Alunos;
    }

    public Integer getProfessores() {
        return Professores;
    }

    public void setProfessores(Integer Professores) {
        this.Professores = Professores;
    }

    public Integer getSalas() {
        return Salas;
    }

    public void setSalas(Integer Salas) {
        this.Salas = Salas;
    }

    public String getDiretor() {
        return Diretor;
    }

    public void setDiretor(String Diretor) {
        this.Diretor = Diretor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

   
}
