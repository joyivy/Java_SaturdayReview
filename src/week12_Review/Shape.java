package week12_Review;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calc_area();

    public abstract double calc_perimeter();

    @Override
    public String toString() {
        return name +"{" +
                "area='" + calc_area() + '\'' +
                ", perimeter='" + calc_perimeter() + '\'' +
                '}';
    }

}

/*
Shape Task:
    1. Create a class named Shape:
            Variables:
                name (final)
            Encapsulate all the fields
            Methods:
                calc_area();
                calc_perimeter()
                toString(): include the area & perimeter of the shape
 */





