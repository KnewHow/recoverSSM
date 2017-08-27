package erongdu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import erongdu.pojo.Items2;

/**
 * Just test Controller
 * 
 * @author yuangh
 * 
 * @company erongdu
 *
 * @data 2017年8月27日
 */
@Controller
@RequestMapping("/json")
public class JsonController {

	/**
	 * Receive Json object then transfer them into Java object,then response Java
	 * object into Json object
	 * 
	 * @param items
	 * @return
	 */
	@RequestMapping("/requestJson")
	public @ResponseBody Items2 requestJson(@RequestBody Items2 items) {
		return items;
	}
	@RequestMapping("/responseJson")
	public @ResponseBody Items2 responseJson(Items2 items) {
		return items;
	}
}
