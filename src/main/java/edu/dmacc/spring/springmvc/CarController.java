package edu.dmacc.spring.springmvc;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {
	@Autowired CarDao dao;
	private String[] makes = { "Toyota", "Ford", "BMW", "Nissan", "Honda", "Audi","VolksWagen", "Kia"};
	
	@RequestMapping(value = "/form")
	public ModelAndView car() {
		Arrays.sort(makes);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("carForm");
		modelAndView.addObject("car", new Car());
		modelAndView.addObject("makes", makes);

		return modelAndView;
	}

	@RequestMapping(value = "/result")
	public ModelAndView processUser(Car car) {
		ModelAndView modelAndView = new ModelAndView();
		dao.insert(car);
		modelAndView.setViewName("carResult");
		modelAndView.addObject("c", car);

		return modelAndView;
	}

	@RequestMapping(value = "/viewAll")
	public ModelAndView viewAll() {
		ModelAndView modelAndView = new ModelAndView();
		List<Car> allCars = dao.getAll();
		modelAndView.setViewName("viewAllCars");
		modelAndView.addObject("all", allCars);
		
		return modelAndView;
	}
	
	@Bean
	public CarDao dao() {
		CarDao bean = new CarDao();
		return bean;
	}
}
