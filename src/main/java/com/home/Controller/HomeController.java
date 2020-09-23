package com.home.Controller;

import java.util.Date;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.home.dao.TodoDao;
import com.home.entities.ToDo;

@Controller
public class HomeController {
	
		
	@Autowired
	TodoDao todoDao;
	
	@RequestMapping("/home")
	public String home(Model m)
	{
		String str="home";
		List<ToDo> l =this.todoDao.getAll();
		m.addAttribute("todos", l);
		m.addAttribute("myhome", str);
		return "home";
	}   
	
	
	@RequestMapping("/add")
	public String add(Model m)
	{
		ToDo t=new ToDo();
		m.addAttribute("todo", t);
		m.addAttribute("myhome", "add");
		return "home";
	}
	
	@RequestMapping("/save")
	public String save( @ModelAttribute("todo")ToDo t,  Model m)
	{
		
		System.out.println(t);
		t.setTodoDate(new Date());
		this.todoDao.save(t);
		m.addAttribute("msg", "added in list");
		return "home";
	}

	
	

}
