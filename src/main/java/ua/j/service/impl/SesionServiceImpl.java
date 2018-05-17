package ua.j.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.j.entity.Sesion;
import ua.j.repository.SesionRepository;
import ua.j.service.SesionService;

@Service
public class SesionServiceImpl implements SesionService {

	@Autowired
	private SesionRepository sesionRepository;
	
	@Override
	public void saveSesion(Sesion sesion) {
		sesionRepository.save(sesion);
	}

	@Override
	public List<Sesion> findAllSesions() {
		return sesionRepository.findAll();
	}

	@Override
	public Sesion findSesionById(int id) {
		return sesionRepository.getOne(id);
	}

	@Override
	public void deleteSesionById(int id) {
		sesionRepository.deleteById(id);
	}

}
