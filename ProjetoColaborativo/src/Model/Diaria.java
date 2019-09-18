/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aluno
 */
public class Diaria extends AbsAluguelAuto{
    Pessoa p = new Pessoa();
    Automovel aut = new Automovel();

    public Pessoa getP() {
        return p;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }

    public Automovel getAut() {
        return aut;
    }

    public void setAut(Automovel aut) {
        this.aut = aut;
    }
    
}
