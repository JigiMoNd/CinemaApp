package ua.j.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.j.entity.Sesion;

@Repository
public interface SesionRepository extends JpaRepository<Sesion, Integer>{

}
