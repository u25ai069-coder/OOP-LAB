package LAB_6;

class point3D {
    int x, y, z;

    void input(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void output() {
        System.out.println("( " + x + ", " + y + ", " + z + " )");
    }

    float distance(point3D p) {

        int x_sq = Math.powExact(this.x - p.x, 2);
        int y_sq = Math.powExact(this.y - p.y, 2);
        int z_sq = Math.powExact(this.z - p.z, 2);

        float dis = (float)Math.sqrt(x_sq  +y_sq + z_sq);

        return dis;
    }
}

public class PointModel {
    public static void main(String[] args) {

        point3D origin = new point3D();
        point3D a = new point3D();
        point3D b = new point3D();

        origin.input(0, 0, 0);
        a.input(5, 5, 5);
        b.input(6, 7, 8);

        System.out.print("point a : ");
        a.output();

        System.out.print("point b : ");
        b.output();

        System.out.println("distance between a and origin : " + a.distance(origin));
        System.out.println("distance between b and origin : " + b.distance(origin));
        System.out.println("distance between a and b : " + a.distance(b));
    }
}
