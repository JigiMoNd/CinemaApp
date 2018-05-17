package ua.j.service;

import java.util.List;

import ua.j.entity.Hall;

public interface HallService {

	void saveHall(Hall hall);
	
	List<Hall> findAllHalls();
	
	Hall findHallById(int id);
}
