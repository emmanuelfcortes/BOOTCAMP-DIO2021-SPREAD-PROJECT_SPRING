package com.digitalinovacionone.springbootbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Copo {
    private String material;
    private float preco;
    @Autowired // O autowired vai instanciar a classe FormatoCopo automaticamente.
    private FormatoCopo formatoCopo;

    public Copo() {
    }


    public void exibirFormato(){
        formatoCopo.exibir();
    }

    public FormatoCopo getFormatoCopo() {
        return formatoCopo;
    }

    public void setFormatoCopo(FormatoCopo formatoCopo) {
        this.formatoCopo = formatoCopo;
    }


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Copo{" +
                "material='" + material + '\'' +
                ", preco=" + preco +
                '}';
    }
}
