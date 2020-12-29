package sp.brother.onetomany.userorderrelation.model;

import java.util.List;

import sp.brother.onetomany.userorderrelation.entity.ProductEntity;



public class User {
	
	private int userId;
	private String userName;
	private String email;
	private String mobile;
	private List<ProductEntity> products;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public List<ProductEntity> getProducts() {
		return products;
	}
	public void setProducts(List<ProductEntity> product) {
		this.products = product;
	}
	
	
}
