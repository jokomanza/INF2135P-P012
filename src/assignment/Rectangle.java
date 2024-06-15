// File: Rectangle.java
package assignment;

public class Rectangle {
    private Double length;
    private Double width;

    public boolean isLengthValid() {
        return length != null && length > 0 && (width == null || length > width);
    }

    public boolean isWidthValid() {
        return width != null && width > 0 && (length == null || width < length);
    }

    public void setLength(double length) throws IllegalArgumentException {
        if (length < 0) {
            throw new IllegalArgumentException("Length must be greater than 0.");
        }

        if (width != null) {
            if (length < width) {
                throw new IllegalArgumentException("Length must be greater than width.");
            }
        }

        this.length = length;
    }

    public void setWidth(double width) throws IllegalArgumentException {
        if (width < 0) {
            throw new IllegalArgumentException("Width must be greater than 0.");
        }

        if (length != null) {
            if (width > length) {
                throw new IllegalArgumentException("Width must be less than length.");
            }
        }

        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }
}
