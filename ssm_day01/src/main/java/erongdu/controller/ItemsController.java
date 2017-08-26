package erongdu.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import erongdu.pojo.Items;
import erongdu.service.ItemsService;

@Controller
@RequestMapping("/items")
public class ItemsController {

	@Autowired
	private ItemsService itemsService;

	@RequestMapping("/queryItems")
	public ModelAndView findAllItems() {
		List<Items> itemsList = this.itemsService.findAllItems();

		ModelAndView mv = new ModelAndView();
		mv.addObject("itemsList", itemsList);
		mv.setViewName("items/itemsList");

		return mv;
	}

	@RequestMapping(value = "/queryItemsById", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView queryItemsById(
			@RequestParam(value = "id", required = true, defaultValue = "1") Integer itemId) {
		Items items = this.itemsService.findItemsById(itemId);
		ModelAndView mv = new ModelAndView();
		mv.addObject("items", items);
		mv.setViewName("items/editItems");
		return mv;
	}

	@RequestMapping(value = "/updateItems", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView updateItems(Items items) {
		this.itemsService.updateItems(items);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("success");
		return mv;
	}

	/**
	 * The follow handler just for testing
	 */

	/**
	 * If you want to model,you can define in parameter
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/testString")
	public String testString(Model model) {

		Items itmes = new Items();
		itmes.setDetail("袁国浩");
		model.addAttribute("items", itmes);
		/**
		 * Return string stand for view path
		 */
		return "items/editItems";
	}

	/**
	 * Test SpringMVC redirect function
	 * 
	 * @return
	 */
	@RequestMapping(value = "/testRedirect")
	public String testRedirect() {
		return "redirect:queryItems.action";
	}

	/**
	 * Test SpringMVC forward
	 * 
	 * @return
	 */
	@RequestMapping(value = "/testForward")
	public String testForward() {
		return "forward:queryItems.action";
	}

	/**
	 * Test SpringMVC void method
	 */
	@RequestMapping(value = "/testVoid")
	public void testVoid(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.sendRedirect("queryItems.action");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Test SpringMVC void method
	 */
	@RequestMapping(value = "/testVoid2")
	public void testVoid2(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.getRequestDispatcher("queryItems.action").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
