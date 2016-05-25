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

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.DynamicRobotEntity;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.Position;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.ResettableAreaObjectEntity;

public class VisualizationUtil {
	public static void sendStatus(String parameter) {
		executePost("http://localhost:3000/data", parameter);
	}
	
	public static void sendEvent(String name, DynamicRobotEntity robot, Position position) {
		sendEvent(name, robot, position, null);
	}
	
	public static void sendEvent(String name, DynamicRobotEntity robot, ResettableAreaObjectEntity object) {
		sendEvent(name, robot, null, object);
	}
	
	public static void sendEvent(String name, DynamicRobotEntity robot, Position position, ResettableAreaObjectEntity object) {
		ObjectNode message = JsonNodeFactory.instance.objectNode();
		message.put("type", "event");
		message.put("name", name);
		if (robot != null)
			message.put("robot", robot.getSimpleName());
		if (position != null) {
			message.put("lat", position.getLatitude());
			message.put("long", position.getLongitude());
		}
		if (object != null) {
			message.put("target", object.getSimpleName());
		}
		sendStatus(message.toString());
	}
	
	public static void sendPosition(DynamicRobotEntity robot) {
		ObjectNode message = JsonNodeFactory.instance.objectNode();
		message.put("type", "robotPosition");
		message.put("name", robot.getSimpleName());
		message.put("lat", robot.getPosition().getLatitude());
		message.put("long", robot.getPosition().getLongitude());
		sendStatus(message.toString());
	}
	
	public static void sendPosition(ResettableAreaObjectEntity object) {
		ObjectNode message = JsonNodeFactory.instance.objectNode();
		message.put("type", "objectPosition");
		message.put("name", object.getSimpleName());
		message.put("lat", object.getPosition().getLatitude());
		message.put("long", object.getPosition().getLongitude());
		sendStatus(message.toString());
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
		connection.setConnectTimeout(20);
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");

		connection.setRequestProperty("Content-Length", "" + Integer.toString(urlParameters.getBytes().length));

		connection.setUseCaches(false);
		connection.setDoInput(true);
		connection.setDoOutput(true);
		return connection;
	}
}
