package com.company;

public class Plate extends Dish {

    public Plate(float weight, String form, String color, String material){
        setWeight(weight);
        setForm(form);
        setColor(color);
        setMaterial(material);
    }

    @Override
    public void tell() {
        System.out.println("Я тарелочка!\nЯ вешу " + getWeight() +
                "\nЯ имею форму " + getForm() +
                "\nМой цвет " + getColor() +
                "\nЯ сделана из " + getMaterial());
        System.out.println(getPure()?"Я чистая!":"Я грязная, помой меня!");
    }

    @Override
    public void wish() {
        setPure(true);
        System.out.println("Тарелка помыта!");
    }

    @Override
    public void eat() {
        setPure(false);
        System.out.println("Вы поели и запачкали тарелку!");
    }
}
