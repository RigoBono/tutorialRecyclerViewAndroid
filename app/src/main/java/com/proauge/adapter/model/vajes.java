package com.proauge.adapter.model;

/**
 * Created by rigobono on 25/11/16.
 */

public class vajes {
    private String nombre;
    private String ubicacion;
    private String algo;

    public vajes() {
    }

    public vajes(String nombre, String ubicacion, String algo) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.algo = algo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getAlgo() {
        return algo;
    }

    public void setAlgo(String algo) {
        this.algo = algo;
    }
}
