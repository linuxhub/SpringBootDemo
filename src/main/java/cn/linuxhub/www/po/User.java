package cn.linuxhub.www.po;

// 创建实体类 User

public class User{
	private Integer id;
	private String username;
	private String address;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User() {
		super();
	}

	public User(Integer id, String username, String address){
		super();
		this.id = id;
		this.username = username;
		this.address = address;
	}
}