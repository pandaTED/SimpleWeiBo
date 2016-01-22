package cn.panda.domain;

import java.util.Set;

/**
 * @author panda
 *	用户之间一对多
 */
public class Fans {
	private User user;
	private Set<User> fans;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Set<User> getFans() {
		return fans;
	}
	public void setFans(Set<User> fans) {
		this.fans = fans;
	}
	
}
