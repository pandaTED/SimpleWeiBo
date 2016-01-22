package cn.panda.domain;

import java.util.Set;

/**
 * 
 * @author panda
 *	用户之间一对多
 */
public class Follows {
	private User user;
	private Set<User> follows;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Set<User> getFollows() {
		return follows;
	}
	public void setFollows(Set<User> follows) {
		this.follows = follows;
	}

}
