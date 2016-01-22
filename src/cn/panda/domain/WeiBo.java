package cn.panda.domain;

import java.util.Date;
import java.util.Set;

/**
 * 
 * @author panda
 *	创建微博时间
 *	文本内容
 *	所属用户
 *	评论
 */
public class WeiBo {
	private Long id;
	private Date weiBoDate;
	private String text;
	private User user;
	private Set<Comment> comments;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getWeiBoDate() {
		return weiBoDate;
	}
	public void setWeiBoDate(Date weiBoDate) {
		this.weiBoDate = weiBoDate;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Set<Comment> getComments() {
		return comments;
	}
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
	
}
