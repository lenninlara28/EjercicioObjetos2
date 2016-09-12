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
    
    public NumeroMixto(int parte_entera,int numerador,int denominador)throws DenominadorCeroException{
        this.Parte_Entera=parte_entera;
        this.Numerador=numerador;
        this.Denominador=denominador;
        if (denominador==0){
            throw new DenominadorCeroException();
        }
    }
    public NumeroMixto(int numerador,int denominador)throws DenominadorCeroException{
        this.Numerador=numerador;
        this.Denominador=denominador;
        if (denominador==0){
            throw new DenominadorCeroException();
        }
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
    
    public NumeroMixto Sumar (NumeroMixto mx2) throws DenominadorCeroException{
        NumeroMixto mx;
        int parte_entera,num,den;
        parte_entera= this.Parte_Entera + mx2.Parte_Entera;
        num= this.Numerador * mx2.Denominador + this.Denominador * mx2.Numerador;
        den= this.Denominador * mx2.Denominador;
        mx=new  NumeroMixto(parte_entera, num, den);
        return mx;
    }
    public NumeroMixto Restar (NumeroMixto mx2) throws DenominadorCeroException{
        NumeroMixto mx;
        int parte_entera,num,den;
        parte_entera= this.Parte_Entera - mx2.Parte_Entera;
        num= this.Numerador * mx2.Denominador - this.Denominador * mx2.Numerador;
        den= this.Denominador * mx2.Denominador;
        mx=new  NumeroMixto(parte_entera, num, den);
        return mx;
    } 
    public NumeroMixto Multiplicar(NumeroMixto mx2) throws DenominadorCeroException{
        //Convertimos  A Fraccionario Multiplicamos y convertimos a mixto
        NumeroMixto mx;
        int num_fraccion1,den_fraccion1,num_franccion2,den_fraccion2,num_fraccion_Resul,den_fraccion_resul,parte_entera,num,den;
        num_fraccion1=this.Parte_Entera * this.Denominador + this.Numerador;
        den_fraccion1=this.Denominador;
        num_franccion2=mx2.Parte_Entera * mx2.Denominador + mx2.Numerador;
        den_fraccion2=mx2.Denominador;
        num_fraccion_Resul= num_fraccion1 * num_franccion2;
        den_fraccion_resul= den_fraccion1 * den_fraccion2;
        parte_entera= num_fraccion_Resul / den_fraccion_resul;
        num= num_fraccion_Resul % den_fraccion_resul;
        den=den_fraccion_resul;
        mx= new NumeroMixto(parte_entera, num, den);
        return mx;
    }
    public NumeroMixto Dividir(NumeroMixto mx2) throws DenominadorCeroException{
        //Convertimos  A Fraccionario Dividimos y convertimos a mixto
        NumeroMixto mx;
        int num_fraccion1,den_fraccion1,num_franccion2,den_fraccion2,num_fraccion_Resul,den_fraccion_resul,parte_entera,num,den;
        num_fraccion1=this.Parte_Entera * this.Denominador + this.Numerador;
        den_fraccion1=this.Denominador;
        num_franccion2=mx2.Parte_Entera * mx2.Denominador + mx2.Numerador;
        den_fraccion2=mx2.Denominador;
        num_fraccion_Resul= num_fraccion1 * den_fraccion2;
        den_fraccion_resul= den_fraccion1 * num_franccion2;
        parte_entera= num_fraccion_Resul / den_fraccion_resul;
        num= num_fraccion_Resul % den_fraccion_resul;
        den=den_fraccion_resul;
        mx= new NumeroMixto(parte_entera, num, den);
        return mx;
    }
    public NumeroMixto Convertir(NumeroMixto mx1)throws DenominadorCeroException{
        NumeroMixto mx;
        int num,den;
        num= this.Parte_Entera * this.Denominador + this.Numerador;
        den=this.Denominador;
        mx = new NumeroMixto(num,den);
        return mx;
    }
}
