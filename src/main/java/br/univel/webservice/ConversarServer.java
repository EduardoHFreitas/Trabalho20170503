package br.univel.webservice;

import javax.xml.ws.Endpoint;

public class ConversarServer {
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:9876/calc", new ConversarImpl());
	}
}
