package pe.idat.edu.AlumnoPruebaIIE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.idat.edu.AlumnoPruebaIIE.model.Aula;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Integer>{

}
