import java.util.Vector;
import static java.lang.Math.sqrt;
public class Vector2D {

    public double x;
    public double y;

    public Vector2D ()
    {
        x=0;
        y=0;

    }
    public Vector2D(double x_in,double y_in)
    {
         x = x_in;
         y = y_in;
    }
    public Vector2D addVectors(Vector2D vector)
    {
       Vector2D temp0 = new Vector2D(this.x+vector.x, this.y+vector.x);
;        return temp0;
    }
    public Vector2D subVectors(Vector2D vector)
    {
        Vector2D temp1 = new Vector2D(this.x-vector.x, this.y-vector.x);
           return temp1;
    }
    public Vector2D mulVector(double input)
    {
        Vector2D temp2 = new Vector2D(this.x*input , this.y*input);
        return temp2;
    }
    public double length()
    {
        double temp3 = this.x;
        double temp4 = this.y;
        double temp5 = sqrt(temp3*temp3+temp4*temp4);
        return temp5;
    }
    public Vector2D normalVector()
    {
        double temp6 = this.length();
        Vector2D temp_vector = new Vector2D(this.x/temp6, this.y/temp6);
        return temp_vector;
    }


}
