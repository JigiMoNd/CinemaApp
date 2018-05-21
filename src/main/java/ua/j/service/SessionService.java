package ua.j.service;

import java.util.List;

import ua.j.entity.Session;

public interface SessionService {
	
	void saveSesion(Session session);
	
	List<Session> findAllSesions();
	
	Session findSesionById(int id);
	
	void deleteSesionById (int id);
}
