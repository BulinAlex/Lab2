import java.lang.*;
public class Dog {
    private String name;
    private int age;
    private String color;      // Цвет

    public Dog(String n, int a, double t, String c){
        name = n;
        age = a;
        color = c;
    }
    public Dog(String n, int a){
        name = n;
        age = a;
        color = "brown";
    }
    public Dog(String n){
        name = n;
        age = 3;
        color = "brown";
    }
    public Dog(){
        name = "Doggo";
        age = 3;
        color = "brown";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName(String name){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }


    public String toString(){
        return this.name + ", age " + this.age + ", color " + this.color;
    }

    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
}