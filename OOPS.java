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

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {
        System.out.println("Constructor called");   
    }
    
    Student(String name, int age) {
        this.name = name;  
        //this.age is obj ki age and = age is the one passed as paramater
        this.age = age;
        System.out.println("Parameterized Constructor called");
    }
}

public class OOPS {
    public static void main (String[] args) {
        //new keyword, memory heap create a space where object will be stored
        //Student is a constructor, it will create a new object of Student class
       Student s1 = new Student("Gouri",23);
    //    s1.name = "Gouri Biswas";
    //    s1.age = 23;
       s1.printInfo();
    }
}