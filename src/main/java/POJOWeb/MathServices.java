package POJOWeb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class MathServices {
	private static URL url;

	public static String square(String num) throws MalformedURLException {
		url = new URL("https://y2napl4bz1.execute-api.us-east-1.amazonaws.com/Beta?value=" + num);
		String rtaString = null;
		try (BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream()))) {
			rtaString = bf.readLine();
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println(e);
		}
		return rtaString;
	}
}