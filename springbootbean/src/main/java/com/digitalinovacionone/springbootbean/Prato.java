package com.digitalinovacionone.springbootbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;


public class Prato {
    private String marca;
    private String material;
    private float peso;
    @Autowired
    private FormatoCopo formato;

    public Prato() {
    }

    public void exibirFormato(){
        System.out.println("Formato: "+this.formato.getFormatoBase());
    }

    public FormatoCopo getFormato() {
        return formato;
    }

    public void setFormato(FormatoCopo formato) {
        this.formato = formato;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Prato{" +
                "marca='" + marca + '\'' +
                ", material='" + material + '\'' +
                ", peso=" + peso +
                ", formato=" + formato +
                '}';
    }
}
