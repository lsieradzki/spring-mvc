package boundary;

import javax.jws.WebService;

import org.springframework.stereotype.Service;


@WebService(endpointInterface = "boundary.HelloWorldPort", targetNamespace = "lukasz-services")
@Service
public class HelloWorldService implements HelloWorldPort {

	public HelloDTO hello() {
		HelloDTO h = new HelloDTO();
		h.setGreeting("Hello there!");
		return h;
	}

}