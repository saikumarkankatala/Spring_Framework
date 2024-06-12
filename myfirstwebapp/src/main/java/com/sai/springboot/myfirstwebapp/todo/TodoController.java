package com.sai.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;

@Controller
public class TodoController {
	
	
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	private TodoService todoService;
	
	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		String username = getLoggedInUsername(model);
		List<Todo> todos = todoService.findByUsername(username);
		model.put("todos", todos);
		return "listTodos";
	}

	private String getLoggedInUsername(ModelMap model) {
		Authentication authen = SecurityContextHolder.getContext().getAuthentication();
		
		return authen.getName();
//		return (String) model.get("name");
	}
	
	@RequestMapping(value= "add-todo", method = RequestMethod.GET)
	public String showNewTodoPage(ModelMap model ) {
		String username = getLoggedInUsername(model);
		Todo todo = new Todo(0, username, "", LocalDate.now().plusDays(30), false);
		model.put("todo", todo);
		return "todo";
	}
	
	@RequestMapping(value= "add-todo", method = RequestMethod.POST)
	public String addNewTodoPage(ModelMap model, @Valid Todo todo,
			BindingResult result) {
		if(result.hasErrors()) {
			return "todo";
		}
		String username = getLoggedInUsername(model);
		todoService.addTodo(username, todo.getDescription(), todo.getTargetDate(), false);
		return "redirect:list-todos";
	}
	
	
	@RequestMapping("delete-todo")
	public String deleteTodos(@RequestParam int id) {
		todoService.deleteById(id);
		return "redirect:list-todos";
	}
	
	
	@RequestMapping("update-todo")
	public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
		Todo todo = todoService.findById(id);
		model.addAttribute("todo", todo);
		return "todo";
	}
	
	@RequestMapping(value= "update-todo", method = RequestMethod.POST)
	public String updateTodoPage(ModelMap model, @Valid Todo todo,
			BindingResult result) {
		if(result.hasErrors()) {
			return "todo";
		}
		String username = getLoggedInUsername(model);
		todo.setUsername(username);
		todoService.updateTodo(todo);
		return "redirect:list-todos";
	}
	
	
	
	
}
