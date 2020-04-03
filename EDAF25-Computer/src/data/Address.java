package data;

public class Address implements Data {

	private Integer index;

	public Address(Integer index) {
		this.index = index;
		
	}

	@Override
	public Integer getData() {
		
		return index;
	}

}
