package com.mkyong.client;

import com.mkyong.ws.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

/**
 ** {@link http://www.mkyong.com/webservices/jax-ws/deploy-jax-ws-web-services-on-tomcat/}
 * {@link https://spring.io/guides/gs/producing-web-service/}
 * ******************************
 * пример soap web сервис servlet
 */
public class HelloWorldClient {
	
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:8080/HelloWorld/hello?wsdl");
        QName qname = new QName("http://ws.mkyong.com/", "HelloWorldImplService");

        Service service = Service.create(url, qname);

        HelloWorld hello = service.getPort(HelloWorld.class);

        System.out.println(hello.getHelloWorldAsString());
    }

}
