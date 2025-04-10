package org.api.trackweatherapi;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class TrackWeatherApiApplicationTests {

	@Test
	void contextLoads() {

	}

	@Test
    void testGetWeatherData() throws IOException, InterruptedException, JSONException {
        // Test case for getting weather data
		String trackToTest = "Edinburg+Motorsports+Park";

		HttpClient httpClient = HttpClient.newHttpClient();

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("http://localhost:8080/weather?trackName=" + trackToTest))
				.GET()
				.header("Accept", "application/json")
				.build();

		HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());

		assertEquals(200, response.statusCode());

		JSONObject jsonResponse = new JSONObject(response.body());

		assertTrue(jsonResponse.has("temperature"));
		assertTrue(jsonResponse.has("relativeHumidity"));
		assertTrue(jsonResponse.has("correctedBarometer"));
		assertTrue(jsonResponse.has("windSpeed"));
		assertTrue(jsonResponse.has("windDirection"));
		assertTrue(jsonResponse.has("dewPoint"));
		assertTrue(jsonResponse.has("saturationPressure"));
		assertTrue(jsonResponse.has("dewPoint"));
		assertTrue(jsonResponse.has("vaporPressure"));
		assertTrue(jsonResponse.has("grains"));
		assertTrue(jsonResponse.has("airDensityNoWaterVapor"));
		assertTrue(jsonResponse.has("airDensityWithWaterVapor"));
		assertTrue(jsonResponse.has("densityAltitude"));
    }

}
