package org.iesch.ad.pruebah2.repositorio;


import org.iesch.ad.pruebah2.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Long> {


}