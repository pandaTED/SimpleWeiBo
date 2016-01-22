package cn.panda.domain;

import java.util.Date;

/** 
 * @author panda
 *	私信功能
 */
public class Message {
	
	private User user;
	private User toUser;
	private Date messageDate;
	private String text;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public User getToUser() {
		return toUser;
	}
	public void setToUser(User toUser) {
		this.toUser = toUser;
	}
	public Date getMessageDate() {
		return messageDate;
	}
	public void setMessageDate(Date messageDate) {
		this.messageDate = messageDate;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
