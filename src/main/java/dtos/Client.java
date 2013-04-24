package dtos;

import javax.validation.constraints.Size;

public class Client {
	
	@Size(min = 3, max = 32)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
