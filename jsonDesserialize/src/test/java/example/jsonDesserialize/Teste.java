package example.jsonDesserialize;

import java.io.IOException;

import org.apache.http.ParseException;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Teste {
	/* http://www.jsonschema2pojo.org/ */

	@Test
	public void teste2() throws JSONException, ParseException, IOException, Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		FearGreedBot.load();
		JSONObject json = FearGreedBot.load();

		System.out.println(json);

		Example e = objectMapper.readValue(json.toString(), Example.class);
		System.out.println(e.getName());
		System.out.println(e.getData().get(0).getTimeUntilUpdate());
		System.out.println(e.getData().get(0).getValueClassification());
		System.out.println(e.getMetadata().getError());
	}

}
