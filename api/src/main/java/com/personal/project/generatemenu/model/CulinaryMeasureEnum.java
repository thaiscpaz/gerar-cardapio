package com.personal.project.generatemenu.model;

public enum CulinaryMeasureEnum {

    TEASPOON("tsp"),
    TABLESPOON("tbsp"),
    CUP("cup"),
    ML("ml"),
    GRAMA("g"),
    L("l");

    private String medida;

    CulinaryMeasureEnum(String medida){
        this.medida = medida;
    }

    public String getMedida() {
        return medida;
    }
}
