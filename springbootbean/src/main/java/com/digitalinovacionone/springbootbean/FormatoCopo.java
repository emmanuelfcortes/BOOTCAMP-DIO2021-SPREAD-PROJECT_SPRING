package com.digitalinovacionone.springbootbean;


import org.springframework.stereotype.Component;

@Component
public class FormatoCopo {

    public enum Formato{
        CIRCULAR,
        QUADRADO,
        OVAL,
        HEXAGONAL
    }
    private Formato formatoBase;
    private Formato formatoCorpo;

    public FormatoCopo() {
    }
    public void exibir(){
        System.out.println("formato Base: "+ formatoBase + " ::formato Corpo"+ formatoCorpo);
    }

    public Formato getFormatoBase() {
        return formatoBase;
    }

    public void setFormatoBase(Formato formatoBase) {
        this.formatoBase = formatoBase;
    }

    public Formato getFormatoCorpo() {
        return formatoCorpo;
    }

    public void setFormatoCorpo(Formato formatoCorpo) {
        this.formatoCorpo = formatoCorpo;
    }

    @Override
    public String toString() {
        return "FormatoCopo{" +
                "formatoBase=" + formatoBase +
                ", formatoCorpo=" + formatoCorpo +
                '}';
    }
}



