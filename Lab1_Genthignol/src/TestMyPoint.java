import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyPoint {

	
	@Test
	public void testDefaultConstructor() {
		// Creation of the point
		MyPoint p = new MyPoint();
		// Test XY values with the getters
		assertEquals(0d, p.getX(), 0.001);
		assertEquals(0d, p.getY(), 0.001);
	}
	
	@Test
	public void testParamateredConstructor() {
		// Creation of the point
		MyPoint p = new MyPoint(6d, 9d);
		// Test XY values with the getters
		assertEquals(6d, p.getX(), 0.001);
		assertEquals(9d, p.getY(), 0.001);
	}
	
	@Test
	public void testSetGetX() {
		// Creation of the point
		MyPoint p = new MyPoint();
		// Setting X value
		p.setX(4d);
		assertEquals(4d, p.getX(), 0.001);		
	}
	
	@Test
	public void testSetGetY() {
		// Creation of the point
		MyPoint p = new MyPoint();
		// Setting Y value
		p.setY(4d);
		assertEquals(4d, p.getY(), 0.001);		
	}
	
}
