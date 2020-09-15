package com.company;

public class FryingPan extends Dish {

    public FryingPan(float weight, String form, String color, String material){
        setWeight(weight);
        setForm(form);
        setColor(color);
        setMaterial(material);
    }

    @Override
    public void tell() {
        System.out.println("Я Сковородка!\nЯ вешу " + getWeight() +
                "\nЯ имею форму " + getForm() +
                "\nМой цвет " + getColor() +
                "\nЯ сделана из " + getMaterial());
        System.out.println(getPure()?"Я чистая сковородочка!":"Я грязная, помой меня, иначе потом тебе же будет хуже!");
    }

    @Override
    public void wish() {
        setPure(true);
        System.out.println("Сковородка помыта!");
    }

    @Override
    public void eat() {
        setPure(false);
        System.out.println("Вы пожарили яичницу и запачкали сковородку!");
    }
}
