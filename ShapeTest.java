
class AreaShape {
    double area() {
        return 0;
    }
}

class AreaCircle extends AreaShape {
    double radius;

    AreaCircle(double r) {
        radius = r;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

class AreaRectangle extends AreaShape {
    double length, breadth;

    AreaRectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }
}

class AreaTriangle extends AreaShape {
    double base, height;

    AreaTriangle(double b, double h) {
        base = b;
        height = h;
    }

    double area() {
        return 0.5 * base * height;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        AreaShape[] s = new AreaShape[3];

        s[0] = new AreaCircle(5);
        s[1] = new AreaRectangle(10, 5);
        s[2] = new AreaTriangle(8, 6);

        for (int i = 0; i < 3; i++) {
            System.out.println("Area: " + s[i].area());
        }
    }
}
