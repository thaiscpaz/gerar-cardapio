package com.personal.project.generatemenu.model;

public enum RecipeTypeEnum {

    DESSERT("Dessert"),
    MAIN_DISH("Main Dish"),
    SIDE_DISH("Side Dish"),
    APPETIZER("Appetizer"),
    SOUP("Soup"),
    SALAD("Salad"),
    BREAKFAST("Breakfast"),
    PASTA("Pasta"),
    SANDWICH("Sandwich"),
    JUICE("Juice"),
    SMOOTHIE("Smoothie");

    public String type;

    RecipeTypeEnum(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
