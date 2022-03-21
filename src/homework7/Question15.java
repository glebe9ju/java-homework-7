package homework7;

public class Question15 {

    double width; // declare variables double height
    double height;

    public Question15() {

    }

    public Question15(double width, double height) {// constructor with width and height
        this.width = width;
        this.height = height;
        if (width < 0) ;
        this.width = 0;
        if (height < 0) ;
        this.height = 0;

    }

    public double getWidth() {//getWidth without any parameters
        return width;

    }

    public double getHeight() {//getHeight without any parameters
        return height;
    }

    public void setWidth(double width) {//setWidth with one parameter of type double
        if (width < 0)
        this.width = 0;

    }

    public void setHeight(double height) {//setHeight with one parameter of type double
        if (height < 0)
        this.height = 0;
     else
         this.height = height;

    }

    public double getArea() {//getArea without any parameters,
        return (width * height);
    }

    public static void main(String[] args) {//main method
        Question15 wall = new Question15(5,4);
        System.out.println("area = " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());


    }
}
