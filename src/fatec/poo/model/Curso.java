/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author georgejunior
 */
public class Curso {
    private String Sigla;
    private String Nome;
    private int CargaHorista;
    private double Valor;
    private String DataVigencia;
    private double ValorHoraInstrutor;
    private String Programa;

    public Curso(String Sigla, String Nome) {
        this.Sigla = Sigla;
        this.Nome = Nome;
    }

    public void setCargaHorista(int CargaHorista) {
        this.CargaHorista = CargaHorista;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public void setDataVigencia(String DataVigencia) {
        this.DataVigencia = DataVigencia;
    }

    public void setValorHoraInstrutor(double ValorHoraInstrutor) {
        this.ValorHoraInstrutor = ValorHoraInstrutor;
    }

    public void setPrograma(String Programa) {
        this.Programa = Programa;
    }
    
    
    
}
