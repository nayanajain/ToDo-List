package com.home.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.home.entities.ToDo;

@Component
public class TodoDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int save(ToDo t)
	{
		Integer i=(Integer)this.hibernateTemplate.save(t);
		return i;
		
	}
	
	
	public List<ToDo> getAll()
	{
		List<ToDo> todos=this.hibernateTemplate.loadAll(ToDo.class);
		return todos;
		
	}

}
