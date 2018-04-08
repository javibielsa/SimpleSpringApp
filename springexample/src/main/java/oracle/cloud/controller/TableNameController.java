package oracle.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import oracle.cloud.model.TableName;
import oracle.cloud.repository.TableNameRepository;
import oracle.cloud.service.TableNameService;


@Controller
public class TableNameController {
	
	@Autowired
	private TableNameService service;
	
	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("index", "command", new TableName());
		return modelAndView;
	}
	
	@PostMapping("redirect1")
	public ModelAndView redirect1() {
		ModelAndView modelAndView = new ModelAndView("Insert", "command", new TableName());
		return modelAndView;
	}
	
	@PostMapping("redirect2")
	public ModelAndView redirect2() {
		ModelAndView modelAndView = new ModelAndView("List", "command", new TableName());
		modelAndView.addObject("listAllElements", service.listAll());
		return modelAndView;
	}
	
	@PostMapping("insert")
	public ModelAndView companyInsert(@ModelAttribute TableName tablename) {
		service.insert(tablename);
		ModelAndView modelAndView = new ModelAndView("Insert", "command", new TableName());
		return modelAndView;
	}
	
	//Este metodo será usado cuando cuando accedemos al jsp Insert a traves de la URL
	@GetMapping("/Insert")
	public ModelAndView insert() {
		ModelAndView modelAndView = new ModelAndView("Insert", "command", new TableName());
		return modelAndView;
	}
	
	//Este metodo será usado cuando cuando accedemos al jsp List a traves de la URL
	@GetMapping("/List")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("List", "command", new TableName());
		modelAndView.addObject("listAllElements", service.listAll());
		return modelAndView;
	}
	
	

}
