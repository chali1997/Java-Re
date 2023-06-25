package Class5;

public class Pro01 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        int area = r.getArea();
        int perimeter = r.getPerimeter();
        System.out.println("矩形面积为: " + area);
        System.out.println("矩形周长为: " + perimeter);
    }
}
