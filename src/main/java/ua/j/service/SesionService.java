package ua.j.service;

import java.util.List;

import ua.j.entity.Sesion;

public interface SesionService {
	
	void saveSesion(Sesion sesion);
	
	List<Sesion> findAllSesions();
	
	Sesion findSesionById(int id);
	
	void deleteSesionById (int id);
}
