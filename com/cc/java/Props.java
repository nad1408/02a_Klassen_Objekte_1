package com.cc.java;
    
    public class Props
    
    {
        public String name;
        public furColors furcolor;
        public Integer age;
    
    public void setName(String name) {
        this.name = name;
    }            
    
    public String getName() {
        return this.name;
    }            
    
    public void setFurColor(furColors furcolor) {
        this.furcolor = furcolor;
    }            
    
    public furColors getFurColor() {
        return this.furcolor;
    }            
    
    public void setAge(int age) {
        this.age = age;
    }            
    
    public Integer getAge() {
        return this.age;
    }            
    
}

enum furColors{
black, white, yellow, green
};
