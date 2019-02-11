/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author yashtalegaonkar
 */

    import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
 
public class sendSMS {
	public String sendSms() {
		try {
			// Construct data
                       
                        
			String apiKey = "apikey=" + "R5yHvvxD/Mw-BuBrrWQrlQeNoG8W0lP3YLSMSEm2hY";
			String message = "&message=" + "Hello";
			String sender = "&sender=" + "TXTLCL";
			String numbers = "&numbers=" + "918411813257";
			
			// Send data
			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conn.getOutputStream().write(data.getBytes("UTF-8"));
			final StringBuffer stringBuffer;
                    try (BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                        stringBuffer = new StringBuffer();
                        String line;
                        while ((line = rd.readLine()) != null) {
                            stringBuffer.append(line);
                        }
                    }
			
			return stringBuffer.toString();
		} catch (IOException e) {
			System.out.println("Error SMS "+e);
			return "Error "+e;
		}
	}
}

