package lab06.exercise1p3;

public class Point3D extends Point2D {
    // private variables
    private float z;

    // constructors
    public Point3D() {
        super();
        z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    // Getters and Setters
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[] {super.getX(), super.getY(), z};
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public String toString() {
        return String.format("(%s, %s, %s)", super.getX(), super.getY(), z);
    }
}
