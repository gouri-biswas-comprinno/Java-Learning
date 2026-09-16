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

    //Copy Constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student() {
       
    }

}

public class OOPS {
    public static void main (String[] args) {

        Student s1 = new Student();
        s1.name = "gouri";
        s1.age = 23;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}