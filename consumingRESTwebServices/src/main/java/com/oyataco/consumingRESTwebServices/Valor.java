package com.oyataco.consumingRESTwebServices;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Valor {

    private Long id;
    private String cotizacion;


    //Constructor
    public Valor(){
    }

    //Get&Set

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(String cotizacion) {
        this.cotizacion = cotizacion;
    }


    @Override
    public String toString() {
        return "Valor{"+
                "id="+id+
               ",cotizacion='"+cotizacion+"'}";
    }
}
