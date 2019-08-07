package example.jsonDesserialize;

import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class FearGreedBot {
	private static final String USER_AGENT = "User-Agent";
	private static final String HEADER = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36";

	private static CloseableHttpClient clbHttpClient;
	private static CloseableHttpResponse response;

	public static JSONObject load() throws Exception {
		// FearGreed feerGreed = new FearGreed();
		JSONObject json;
		try {

			clbHttpClient = HttpClients.createDefault();
			HttpGet httpGet = new HttpGet("https://api.alternative.me/fng/");
			httpGet.setHeader(USER_AGENT, HEADER);

			response = clbHttpClient.execute(httpGet);

			StatusLine sl = response.getStatusLine();

			if (sl.getStatusCode() == HttpStatus.SC_OK) {

				json = new JSONObject(EntityUtils.toString(response.getEntity(), "ISO8859_1"));

			} else {

				throw new Exception("Erro na captura do Fear And Greed Index");
			}
		} finally {
			clbHttpClient.close();
		}
		return json;
	}

	/*
	 * private static FearGreed desserialize(HttpEntity entity) throws
	 * JSONException, IOException {
	 * 
	 * JSONObject object = new JSONObject(EntityUtils.toString(entity,
	 * "ISO8859_1"));
	 * 
	 * FearGreed feerGreed = new FearGreed();
	 * 
	 * feerGreed.setName(object.getString("name"));
	 * 
	 * JSONObject data = object.getJSONArray("data").getJSONObject(0);
	 * 
	 * feerGreed.setValue(data.getLong("value"));
	 * feerGreed.setValueClassification(data.getString("value_classification"));
	 * feerGreed.setTimestamp(data.getLong("timestamp"));
	 * feerGreed.setTimeUntilUpdate(data.getLong("time_until_update"));
	 * 
	 * return feerGreed; }
	 */
}
