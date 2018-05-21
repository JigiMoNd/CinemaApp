package ua.j.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.j.entity.Session;
import ua.j.repository.SessionRepository;
import ua.j.service.SessionService;

@Service
public class SessionServiceImpl implements SessionService {

	@Autowired
	private SessionRepository sessionRepository;
	
	@Override
	public void saveSesion(Session session) {
		sessionRepository.save(session);
	}

	@Override
	public List<Session> findAllSesions() {
		return sessionRepository.findAll();
	}

	@Override
	public Session findSesionById(int id) {
		return sessionRepository.getOne(id);
	}

	@Override
	public void deleteSesionById(int id) {
		sessionRepository.deleteById(id);
	}

}
