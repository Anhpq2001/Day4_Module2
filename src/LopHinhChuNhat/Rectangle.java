package LopHinhChuNhat;

public class Rectangle {
    private double width;
    private double height;
    public Rectangle(){

    }
    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }

    public void display(){
        System.out.println("Dien tich: " + getArea());
        System.out.println("Chu vi: " + getPerimeter());
    }
}
