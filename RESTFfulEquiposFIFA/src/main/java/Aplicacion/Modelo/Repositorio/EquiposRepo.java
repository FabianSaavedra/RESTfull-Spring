package Aplicacion.Modelo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Aplicacion.Modelo.Equipos;

@Repository
public interface EquiposRepo extends JpaRepository<Equipos, String> {

}
