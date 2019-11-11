import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KidTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void StringTest() {
		Kid john = new Kid("John", "16 cars", false);
		String expected = "John has been bad this year and wants 16 cars for Christmas.";
		String actual = john.toString();
		assertEquals(expected,actual);
		
		Kid jorp = new Kid("Jorp", "an eagle", true);
		expected = "Jorp has been good this year and wants an eagle for Christmas.";
		actual = jorp.toString();
		assertEquals(expected,actual);
		
		Kid nobody = new Kid();
		expected = "null has been bad this year and wants null for Christmas.";
		actual = nobody.toString();
		assertEquals(expected,actual);
	}

}
