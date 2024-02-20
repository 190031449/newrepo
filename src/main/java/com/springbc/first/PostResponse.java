package com.springbc.first;

import java.util.Objects;

public class PostResponse {

	String userID;
	String id;
	String title;
	String body;
	public PostResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PostResponse(String userID, String id, String title, String body) {
		super();
		this.userID = userID;
		this.id = id;
		this.title = title;
		this.body = body;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public int hashCode() {
		return Objects.hash(body, id, title, userID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PostResponse other = (PostResponse) obj;
		return Objects.equals(body, other.body) && Objects.equals(id, other.id) && Objects.equals(title, other.title)
				&& Objects.equals(userID, other.userID);
	}
	
}
