package pe.idat.edu.AlumnoPruebaIIE.service;

import java.util.List;

import pe.idat.edu.AlumnoPruebaIIE.model.Aula;

public interface AulaService {

	List<Aula> listarAula();
	Aula obtenerAulaId(Integer id);
	void guardarAula(Aula aula);
	void eliminarAula(Integer id);
	void actualizarAula(Aula aula);

}
