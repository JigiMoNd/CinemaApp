package ua.j.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import ua.j.entity.Hall;

@Component
public class HallFormatter implements Formatter<Hall>{

	@Override
	public String print(Hall hall, Locale arg1) {
		return String.valueOf(hall.getId());
	}

	@Override
	public Hall parse(String objId, Locale arg1) throws ParseException {
		Hall hall = new Hall();
		hall.setId(Integer.valueOf(objId));
		return hall;
	}

}
