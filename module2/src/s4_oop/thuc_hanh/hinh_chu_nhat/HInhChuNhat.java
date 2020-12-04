package s4_oop.thuc_hanh.hinh_chu_nhat;

public class HInhChuNhat {
    public double height;
    public double width;

    public HInhChuNhat() {
    }

    public HInhChuNhat(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public double getArea(double height,double width){
       return height*width;
    }
    public double getPerimeter(double height,double width){
        return (height+width)*2;
    }
    public String disPlay(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
