package functions;

public class FunctionPoint implements Cloneable {
    private double x;
    private double y;

    public FunctionPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public FunctionPoint(FunctionPoint point) {
        this.x = point.x;
        this.y = point.y;
    }

    public FunctionPoint() {
        this(0, 0);
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    @Override
    public String toString() {
        return "(" + x + "; " + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FunctionPoint)) return false;
        FunctionPoint p = (FunctionPoint) o;
        return Double.compare(x, p.x) == 0 && Double.compare(y, p.y) == 0;
    }

    @Override
    public int hashCode() {
        long bitsX = Double.doubleToLongBits(x);
        long bitsY = Double.doubleToLongBits(y);
        int hashX = (int)(bitsX ^ (bitsX >>> 32));
        int hashY = (int)(bitsY ^ (bitsY >>> 32));
        return hashX ^ hashY;
    }

    @Override
    public Object clone() {
        return new FunctionPoint(this);
    }
}
