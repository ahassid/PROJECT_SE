package Elements;

import Primitives.Point3D;
import Primitives.Ray;
import Primitives.Vector;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

public class CameraTest {

    @Test
    void constructRayThroughPixel() {
        final int WIDTH  = 3;
        final int HEIGHT = 3;
        Point3D[][] screen = new Point3D [HEIGHT][WIDTH];
        Camera camera = new Camera(new Point3D(0.0 ,0.0 ,0.0), new Vector(0.0, 1.0, 0.0), new Vector (0.0, 0.0, -1.0));

        System.out.println("Camera:\n" + camera);

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                Ray ray = camera.constructRayThroughPixel(WIDTH, HEIGHT, j, i, 1, 3 * WIDTH, 3 * HEIGHT);
                screen[i][j] = ray.get_POO();

                System.out.print(screen[i][j]);
                System.out.println(ray.get_direction());

                // Checking z-coordinate
                 assertTrue(Double.compare(screen[i][j].getZ().get_coordinate(), -1.0) == 0);

                 // Checking all options
                double x = screen[i][j].getX().get_coordinate();
                double y = screen[i][j].getX().get_coordinate();

                if (Double.compare(x, 3) == 0 || Double.compare(x, 0) == 0 || Double.compare(x, -3) == 0){
                    if (Double.compare(y, 3) == 0 || Double.compare(y, 0) == 0 || Double.compare(y, -3) == 0){
                        assertTrue(true);
                    }
                    else
                        fail("Wrong y coordinate");
                }
                else
                    fail("Wrong x coordinate");
            }

            System.out.println("---");
        }
    }
}