class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing something with a " + color + " " + type + " pen.");
    }

    public void printColor() {
        //this.color refers to the color property of the current object
        //this.color is used to access the color property of the current object
        //this is a java keyword that refers to the current object
        //this will say that which object is calling this method and will print the color of that object
        System.out.println(this.color);
    }
}

//This is also an example of compile time polymorphism , where if there is any error it will give error in code
//As in is Polymorphism implemented properly
class Student {
    String name;
    int age;

    //Function Overloading

    public void printInfo(String name) {
        System.out.println(this.name);
    }

    public void printInfo(int age) {
         System.out.println(this.age);
    }

    public void printInfo(String name , int age) {
        System.out.println(name + " " + age);
    }

}

public class OOPS {
    public static void main (String[] args) {

        Student s1 = new Student();
        s1.name = "gouri";
        s1.age = 23;

        s1.printInfo(s1.name , s1.age);
    }
}