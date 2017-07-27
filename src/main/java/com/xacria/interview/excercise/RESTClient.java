package com.xacria.interview.excercise;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class RESTClient {

	public static InputStreamReader executeGet(URI uri) {
		HttpClient httpclient = HttpClientBuilder.create().build();
		InputStreamReader stream = null;
		try {
			stream = new InputStreamReader(httpclient.execute(new HttpGet(uri)).getEntity().getContent(), "UTF-8"); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stream;
	}

}
