package ua.j.service;

import java.util.List;

import ua.j.entity.Session;

public interface SessionService {
	
	void saveSession(Session session);
	
	List<Session> findAllSessions();
	
	Session findSessionById(int id);
	
	void deleteSessionById (int id);
}
