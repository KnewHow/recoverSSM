package erongdu.controller.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class ItemsConverter implements Converter<String, Date>{

	@Override
	public Date convert(String arg) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return dateFormat.parse(arg);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
