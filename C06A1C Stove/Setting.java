// Authors: Ethan Perry and Shania Jo RunningRabbit

public enum Setting {
	OFF("---"), LOW("--+"), MEDIUM("-++"), HIGH("+++");
	private String value;
	
	Setting (String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}

}
