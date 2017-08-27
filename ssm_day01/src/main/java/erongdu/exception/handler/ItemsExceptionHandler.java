package erongdu.exception.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import erongdu.exception.ItemsException;

/**
 * Gloable execpetion Handler
 * 
 * @author yuangh
 * 
 * @company erongdu
 *
 * @data 2017年8月27日
 */
public class ItemsExceptionHandler implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		ItemsException itemsException;
		if (ex instanceof ItemsException) {
			itemsException = (ItemsException) ex;
		} else {
			itemsException = new ItemsException("未知错误");
		}

		String message = itemsException.getMessage();

		ModelAndView mv = new ModelAndView();
		mv.addObject("message", message);
		mv.setViewName("error");
		return mv;
	}

}
