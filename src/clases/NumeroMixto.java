/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author hp 14
 */
public class NumeroMixto {
    private int Parte_Entera;
    private int Numerador;
    private int Denominador;
    
    public NumeroMixto(int parte_entera,int numerador,int denominador){
        this.Parte_Entera=parte_entera;
        this.Numerador=numerador;
        this.Denominador=denominador;
    }

    public int getParte_Entera() {
        return Parte_Entera;
    }

    public void setParte_Entera(int Parte_Entera) {
        this.Parte_Entera = Parte_Entera;
    }

    public int getNumerador() {
        return Numerador;
    }

    public void setNumerador(int Numerador) {
        this.Numerador = Numerador;
    }

    public int getDenominador() {
        return Denominador;
    }

    public void setDenominador(int Denominador) {
        this.Denominador = Denominador;
    }
    
    public NumeroMixto Sumar (NumeroMixto mx2){
        NumeroMixto mx;
        int parte_entera,num,dem;
        parte_entera= this.Parte_Entera + mx2.Parte_Entera;
        num= this.Numerador * mx2.Denominador + this.Denominador * mx2.Numerador;
        dem= this.Denominador * mx2.Denominador;
        mx=new  NumeroMixto(parte_entera, num, dem);
        return mx;
    } 
    
}
