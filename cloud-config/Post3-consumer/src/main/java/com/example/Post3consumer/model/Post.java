package com.example.Post3consumer.model;

import org.springframework.stereotype.Component;

@Component
public class Post {
	private String data;

	public Post() {
	}

	@Override
	public String toString() {
		return "Post{" +
				"data='" + data + '\'' +
				'}';
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Post(String data) {
		this.data = data;
	}
}