package com.personal.project.generatemenu.model;

public enum CulinaryMeasureEnum {

    COLHER_DE_CAFE("Colher de Café"),
    COLHER_DE_CHA("Colher de Chá"),
    COLHER_DE_SOPA("Colher de Sopa"),
    XICARA("Xícara"),
    ML("Ml"),
    GRAMA("Grama");

    private String medida;

    CulinaryMeasureEnum(String medida){
        this.medida = medida;
    }

    public String getMedida() {
        return medida;
    }
}
