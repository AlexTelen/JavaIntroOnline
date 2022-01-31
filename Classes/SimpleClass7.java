/**
 * 7. Описать класс, представляющий треугольник.
 * Предусмотреть методы для создания объектов,
 * вычисления площади, периметра и точки
 * пересечения медиан.
 */
class Triangle {
    int ax;
    int ay;
    int bx;
    int by;
    int cx;
    int cy;
    double ab, bc, ac;

    public Triangle(int ax, int ay, int bx, int by, int cx, int cy) {
        this.ax = ax;
        this.ay = ay;
        this.bx = bx;
        this.by = by;
        this.cx = cx;
        this.cy = cy;
        this.ab = Math.sqrt(Math.pow((bx - ax), 2) + Math.pow((by - ay), 2));
        this.bc = Math.sqrt(Math.pow((bx - cx), 2) + Math.pow((by - cy), 2));
        this.ac = Math.sqrt(Math.pow((ax - cx), 2) + Math.pow((ay - cy), 2));
    }

    double square() {
        return ac * Math.abs(by - ay) / 2;
    }

    double perimeter() {
        return ab + bc + ac;
    }

    void centroid() {
        double centroidX = (double) (ax + bx + cx) / 3;
        double centroidY = (double) (ay + by + cy) / 3;
        System.out.println("Centroid: " + centroidX + " " + centroidY);
    }
}

public class SimpleClass7 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 0, 2, 2, 3, -1);
        System.out.println(triangle.square());
        System.out.println(triangle.perimeter());
        triangle.centroid();
    }
}
