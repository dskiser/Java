// A simple class hierarchy.

// A class for two-dimensional objects.
abstract class TwoDShape {
	private double width;
	private double height;
    private String name;

	// A default constructor.
	TwoDShape() {
		height = width = 0.0;
        name = "none";
	}

	// Parametized constructor.
	TwoDShape(double w, double h, String n) {
		width = w;
		height = h;
        name = n;
	}

	// Construct object with equal width and height.
	TwoDShape(double x, String n) {
		width = height = x;
        name = n;
	}

    // Construct an object from an object.
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

	// Accessor methods for width and height.
	double getWidth() { return width; }
	double getHeight() { return height; }
	void setWidth(double w) { width = w; }
	void setHeight(double h) { height = h; }

    String getName() { return name; }

	void showDim() {
		System.out.println("Width and height are " +
				width + " and " + height);
	}

    abstract double area();
}

// A subclass for circles
class Circle extends TwoDShape {
    private String style;

    // One argument constructor.
    Circle(double x) {
        super(x, "circle");

        style = "filled";
    }

    double area() {
        return 3.14 * getWidth() * getWidth();
    }
}

// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
	private String style;

	// A default constructor.
	Triangle() {
		super();
		style = "none";
	}

	// Constructor
	Triangle(String s, double w, double h) {
		super(w, h, "triangle");

		style = s;
	}

	// One argument constructor.
	Triangle(double x) {
		super(x, "triangle");

		style = "filled";
	}

    // Construct an object from an object.
    Triangle(Triangle ob) {
        super(ob);

        style = ob.style;
    }


	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Triangle is " + style);

	}
}

// A subclass of TwoDShape for rectangles.
class Rectangle extends TwoDShape {
    // A default constructor.
    Rectangle() {
        super();
    }

    // Constructor for Rectangle.
    Rectangle(double w, double h) {
        super(w, h, "rectangle");
    }

    // Construct a Square.
    Rectangle(double x) {
        super(x, "rectangle");
    }

    // Construct an object from an object.
    Rectangle(Rectangle ob) {
        super(ob);
    }

    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }

    // Override area() for Rectangle.
    double area() {
        return getWidth() * getHeight();
    }
}

// Extend Triangle
class ColorTriangle extends Triangle {
        private String color;

        ColorTriangle(String c, String s, double w, double h) {
            super(s, w, h);
            
            color = c;
        }

        ColorTriangle(ColorTriangle ob) {
            super(ob);

            color = ob.color;
        }

        String getColor() { return color; }

        void showColor() {
            System.out.println("Color is " + color);
        }

        void setColor(String c) {
            color = c;
        }
}


class Shapes { 
	public static void main(String args[]) {
		ColorTriangle t1 = new ColorTriangle("red", "filled", 4.0, 4.0);
		ColorTriangle t2 = new ColorTriangle(t1);

		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
        t1.showColor();
		System.out.println("Area is " + t1.area());

        System.out.println();
        
        t2.setColor("blue");

		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
        t2.showColor();
		System.out.println("Area is " + t2.area());

        TwoDShape shapes[] = new TwoDShape[4];

        shapes[0] = new Triangle("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Circle(7.0);

        for(int i=0; i < shapes.length; i++) {
            System.out.println("object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}
