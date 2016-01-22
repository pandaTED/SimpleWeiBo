package cn.panda.domain;

import java.util.Date;


/** 
 * @author panda
 * 		Long id	
 *	变量：1，评论时间
 *		2，文本内容	
 *		3，所属用户
 *		4，所属微博
 */
public class Comment {
		private Long id;
		private User user;
		private WeiBo weibo;
		private Date commentDate;
		private String text;
		
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public WeiBo getWeibo() {
			return weibo;
		}
		public void setWeibo(WeiBo weibo) {
			this.weibo = weibo;
		}
		public Date getCommentDate() {
			return commentDate;
		}
		public void setCommentDate(Date commentDate) {
			this.commentDate = commentDate;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		
		
}
