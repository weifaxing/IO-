package hxzy.IO.duix.project02;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	private String name;
	private Date date;
	private String content;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
