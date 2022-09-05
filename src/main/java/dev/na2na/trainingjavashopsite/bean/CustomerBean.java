package dev.na2na.trainingjavashopsite.bean;

public class CustomerBean implements java.io.Serializable {
	private int id;
	private String login;
	private String password;

	public CustomerBean() {
	}

	public CustomerBean(int id, String login, String password) {
		this.setId(id);
		this.setLogin(login);
		this.setPassword(password);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
