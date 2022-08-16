package pe.idat.edu.AlumnoPruebaIIE.service;

import java.util.List;

import pe.idat.edu.AlumnoPruebaIIE.model.Alumno;

public interface AlumnoService {
	
	List<Alumno> listar();
	Alumno obtenerId(Integer id);
	void guardar(Alumno alumno);
	void eliminar(Integer id);
	void actualizar(Alumno alumno);

}
