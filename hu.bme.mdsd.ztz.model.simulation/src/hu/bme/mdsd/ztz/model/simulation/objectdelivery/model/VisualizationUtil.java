package hu.bme.mdsd.ztz.model.simulation.objectdelivery.model;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class VisualizationUtil {
	public static void sendStatus(String parameter) {
		executePost("http://localhost:3000/data", parameter);
	}

	private static void executePost(String targetURL, String urlParameters) {
		HttpURLConnection connection = null;
		try {
			connection = createConnection(targetURL, urlParameters);
			sendData(urlParameters, connection);
			receiveData(connection);

		} catch (Exception e) {
		} finally {

			if (connection != null) {
				connection.disconnect();
			}
		}
	}

	private static void receiveData(HttpURLConnection connection) throws IOException {
		InputStream is = connection.getInputStream();
		BufferedReader rd = new BufferedReader(new InputStreamReader(is));
		rd.close();
	}

	private static void sendData(String urlParameters, HttpURLConnection connection) throws IOException {
		DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();
	}

	private static HttpURLConnection createConnection(String targetURL, String urlParameters)
			throws MalformedURLException, IOException, ProtocolException {
		HttpURLConnection connection;
		URL url = new URL(targetURL);
		connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");

		connection.setRequestProperty("Content-Length", "" + Integer.toString(urlParameters.getBytes().length));

		connection.setUseCaches(false);
		connection.setDoInput(true);
		connection.setDoOutput(true);
		return connection;
	}
}
