import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(100, plane.getCapacity());
    }

    @Test
    public void anGetTotalWeight(){
        assertEquals(50, plane.getTotalWeight());
    }

}
