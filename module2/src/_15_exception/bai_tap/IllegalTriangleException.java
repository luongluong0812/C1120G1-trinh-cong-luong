package _15_exception.bai_tap;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException(double side) {
        super(side + " Lỗi tổng 2 cạnh bé hơn cạnh còn lại");
    }
    public IllegalTriangleException(){
        super("Cạnh bé hơn 0");
    }
}
