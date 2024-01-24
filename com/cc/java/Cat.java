package com.cc.java;

public class Cat {

        private String name;
        private String furcolor;
        private Integer age;

public void setName(String name) {
    this.name = name;
}            

public String getName() {
    return this.name;
}            

public void setFurColor(String furcolor) {
    this.furcolor = furcolor;
}            

public String getFurColor() {
    return this.furcolor;
}            

public void setAge(int age) {
    this.age = age;
}            

public Integer getAge() {
    return this.age;
}            

String tellYourName() {
    return (this.name);
}

String tellYourFurColor() {
    return (this.furcolor);
}
    
Integer tellYourAge() {
    return (this.age);
}


String[] tellField() {
    String[] field = new String[3];
    field[0] = tellYourName();
    field[1] = tellYourFurColor();
    field[2] = Integer.toString(tellYourAge());
    return field;
}

}
