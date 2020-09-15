package com.company;

public class Cup extends Dish {

    public Cup(float weight, String form, String color, String material){
        setWeight(weight);
        setForm(form);
        setColor(color);
        setMaterial(material);
    }

    @Override
    public void tell() {
        System.out.println("Я Кружка!\nЯ вешу " + getWeight() +
                "\nЯ имею форму " + getForm() +
                "\nМой цвет " + getColor() +
                "\nЯ сделана из " + getMaterial());
        System.out.println(getPure()?"Я чистая кружечка!":"Я грязная, помой меня!");
    }

    @Override
    public void wish() {
        setPure(true);
        System.out.println("Кружка помыта!");
    }

    @Override
    public void eat() {
        setPure(false);
        System.out.println("Вы выпили чай и запачкали кружку!");
    }
}

