package example.jsonDesserialize;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 * @throws Exception
	 * @throws IOException
	 * @throws UnsupportedOperationException
	 * @throws JsonMappingException
	 * @throws JsonParseException
	 */
	@Test
	public void test(String testName)
			throws JsonParseException, JsonMappingException, UnsupportedOperationException, IOException, Exception {
		ObjectMapper objectMapper = new ObjectMapper();

	}

}