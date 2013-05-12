package boundary;

import javax.jws.WebService;

@WebService
public interface HelloWorldPort {
	HelloDTO hello();
}
