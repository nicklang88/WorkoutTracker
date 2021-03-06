package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Address {

	@Id
	private int id;

	@OneToMany(mappedBy = "address", fetch=FetchType.EAGER)
	private List<User> users;

	@NotNull
	private String address;
	private String address2;
	
	@NotNull
	private String city;
	
	@NotNull
	private String state;
	
	@NotNull
	private String zip;
	
	@NotNull
	private String phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void addUser(User user) {
		if (users == null) {
			users = new ArrayList<>();
		}
		if (!users.contains(user)) {
			users.add(user);
			if (user.getAddress() != null){
				user.getAddress().getUsers().remove(user);
			}
			user.setAddress(this);
		}
	}

	public void removeUser(User user) {
		user.setAddress(null);
		if (users != null) {
			users.remove(user);
		}
	}


}
