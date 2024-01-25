package com.cc.java;

public class Cat {

Props cat_Props;
Cat(String name, furColors furColor, int age) {
    cat_Props = new Props();
    cat_Props.setName(name);
    cat_Props.setFurColor(furColor);
    cat_Props.setAge(age);
    System.out.println("Erstellt");
}

String tellYourName() {
    return (this.cat_Props.name);
}

furColors tellYourFurColor() {
    return (this.cat_Props.furcolor);
}

Integer tellYourAge() {
    return (this.cat_Props.age);
}

String[] tellField() {
    String[] field = new String[3];
    field[0] = tellYourName();
    field[1] = tellYourFurColor().name();
    field[2] = Integer.toString(tellYourAge());
    return field;
}

}
