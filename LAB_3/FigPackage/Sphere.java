package LAB_3.FigPackage;

class Sphere extends Figure{

    Sphere(double r)
    {
        this.r = r;
    }

    public void calcArea()
    {
        a = 4 * pi * r * r; 
    }

    public void calcVolume()
    {
        v = (4 * pi * r * r * r) / 3;
    }
}
