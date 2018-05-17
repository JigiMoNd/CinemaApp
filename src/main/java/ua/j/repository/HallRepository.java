package ua.j.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.j.entity.Hall;

@Repository
public interface HallRepository extends JpaRepository<Hall, Integer>{

}
