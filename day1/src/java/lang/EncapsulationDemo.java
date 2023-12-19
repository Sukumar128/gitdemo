package java.lang;

public class EncapsulationDemo {
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getOTP() {
		return OTP;
	}

	public void setOTP(Integer oTP) {
		OTP = oTP;
	}

	private String username;
	private String password;
	private Integer OTP;

	public static void main(String[] args) {
		EncapsulationDemo encap=EncapsulationDemo();
		encap.username
		

	}

}
