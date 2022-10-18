package com.oyataco.consumingRESTwebServices;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)//Indica que cualquier propiedad que no esté enlazada en este tipo debe ignorarse
public class Cotizacion {

    private String tipo;
    private Valor valor;

    //Constructor
    public Cotizacion(){
    }


    //Get&Set


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }


    //Overrides

    @Override
    public String toString() {
        return "Cotizacion{"+
                "tipo='"+tipo+"'"+",valor="+valor+"}";
    }
}
