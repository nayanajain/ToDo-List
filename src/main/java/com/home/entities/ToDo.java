package com.home.entities;

import java.util.Date;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;



@Entity
public class ToDo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;

	private String title;
	private String TodoContent;
	private Date todoDate;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTodoContent() {
		return TodoContent;
	}

	public void setTodoContent(String todoContent) {
		TodoContent = todoContent;
	}

	public Date getTodoDate() {
		return todoDate;
	}

	public void setTodoDate(Date todoDate) {
		this.todoDate = todoDate;
	}

	public ToDo(String title, String todoContent, Date todoDate) {
		super();
		this.title = title;
		TodoContent = todoContent;
		this.todoDate = todoDate;
	}

	public ToDo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ToDo [title=" + title + ", ToDoContent=" + TodoContent + ", todoDate=" + todoDate + "]";
	}

}
