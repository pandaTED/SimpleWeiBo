package cn.panda.domain;

import java.util.Date;
import java.util.Set;
/**
 * 
 * @author panda
 *	用户名 密码 电子邮箱 签名 注册时间 关注 粉丝 微博 评论 私信
 */
public class User {
	private Long id;
	private String username;
	private String slogan;
	private Date registerDate;
	private String password;
	private String email;
	private Fans fans;
	private Set<WeiBo> weibos;
	private Set<Comment> comments;
	private Set<Message> messages;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSlogan() {
		return slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Fans getFans() {
		return fans;
	}
	public void setFans(Fans fans) {
		this.fans = fans;
	}
	public Set<WeiBo> getWeibos() {
		return weibos;
	}
	public void setWeibos(Set<WeiBo> weibos) {
		this.weibos = weibos;
	}
	public Set<Comment> getComments() {
		return comments;
	}
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
	public Set<Message> getMessages() {
		return messages;
	}
	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}
	
}
