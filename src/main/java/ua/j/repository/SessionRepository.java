package ua.j.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.j.entity.Session;

@Repository
public interface SessionRepository extends JpaRepository<Session, Integer>{

}
