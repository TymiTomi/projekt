import javax.swing.JApplet;

import java.util.Vector;

import static java.lang.Math.sqrt;

public class SpringApplet extends JApplet {

                public static void main(String []args)
                {
                        Vector2D temp00 = new Vector2D(100,10);
                        Vector2D temp01 = new Vector2D (10,100);
                        Vector2D temp02 = temp00.addVectors(temp01);
                        Vector2D temp03 = temp00.subVectors(temp01);
                        Vector2D temp00z = temp00.normalVector();
                        Vector2D temp01z = temp01.normalVector();
                        Vector2D temp02z = temp02.normalVector();
                        Vector2D temp03z = temp03.normalVector();
                        double length00 = temp00.length();
                        double length01 = temp01.length();
                        double length02 = temp02.length();
                        double length03 = temp03.length();
                        double length00z = temp00z.length();
                        double length01z = temp01z.length();
                        double length02z = temp02z.length();
                        double length03z = temp03z.length();
                        Vector2D temp04 = temp00.mulVector(2);
                        System.out.print("\nx : "+temp00.x+" y"+temp00.y);
                        System.out.print("\nx : "+temp01.x+" y"+temp01.y);
                        System.out.print("\nx : "+temp02.x+" y"+temp02.y);
                        System.out.print("\nx : "+temp03.x+" y"+temp03.y);
                        System.out.print("\nx : "+temp00z.x+" y"+temp00z.y);
                        System.out.print("\nx : "+temp01z.x+" y"+temp01z.y);
                        System.out.print("\nx : "+temp02z.x+" y"+temp02z.y);
                        System.out.print("\nx : "+temp03z.x+" y"+temp03z.y);
                        System.out.print("\nlength "+ length00);
                        System.out.print("\nlength "+ length01);
                        System.out.print("\nlength "+ length02);
                        System.out.print("\nlength "+ length03);
                        System.out.print("\nlength "+ length00z);
                        System.out.print("\nlength "+ length01z);
                        System.out.print("\nlength "+ length02z);
                        System.out.print("\nlength "+ length03z);
                        System.out.print("\nx : "+temp04.x+" y"+temp04.y);
                }



        public void init()
        {

        }
        public void paint()
        {

        }




}
