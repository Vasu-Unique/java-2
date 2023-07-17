 class Rectangle {
    public int width, height;
    
    public Rectangle(int width, int height) {
    
    this.width = width;
    this.height = height;
    }
    
    public String display(int width, int height) {
    return (width + " " + height);
    }
    
    }
    
    class RectangleArea extends Rectangle {
    private int area;
    
    public RectangleArea(int width, int height) {
    super(width, height);
    this.area = area;
    }
    
    int getarea() {
    area = width * height;
    return area;
    }
    }
    public class code5 {
    public static void main(String args[]) {
    RectangleArea a = new RectangleArea(12, 9);
    a.getarea();
    }
    }