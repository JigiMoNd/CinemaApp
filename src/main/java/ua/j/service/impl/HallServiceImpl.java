package ua.j.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.j.entity.Hall;
import ua.j.repository.HallRepository;
import ua.j.service.HallService;

@Service
public class HallServiceImpl implements HallService {

	@Autowired
	private HallRepository hallRepository;
	
	@Override
	public void saveHall(Hall hall) {
		hallRepository.save(hall);
	}

	@Override
	public List<Hall> findAllHalls() {
		return hallRepository.findAll();
	}

	@Override
	public Hall findHallById(int id) {
		return hallRepository.getOne(id);
	}

}
