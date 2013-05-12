package boundary;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HelloDTO {
	private String greeting;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
}
