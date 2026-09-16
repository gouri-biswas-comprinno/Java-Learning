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

public class OOPS {
    public static void main (String[] args) {
        //type will be class name and pen1 will be object name
        //Pen() is constructor
        // creating an object of Pen class
        Pen pen1 = new Pen();
        // setting values to the properties of pen1 object using a dot
        pen1.color = "blue";
        pen1.type = "ballpoint";
        // calling the write method of pen1 object
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "gel";

        pen1.printColor();
        pen2.printColor();
    }
}