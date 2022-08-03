package pe.idat.edu.AlumnoPruebaIIE.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.edu.AlumnoPruebaIIE.model.Aula;
import pe.idat.edu.AlumnoPruebaIIE.repository.AulaRepository;
@Service
public class AulaServiceImpl implements AulaService {

	@Autowired
	private AulaRepository repository;
	
	@Override
	public List<Aula> listarAula() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Aula obtenerAulaId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardarAula(Aula aula) {
		// TODO Auto-generated method stub
		repository.save(aula);

	}

	@Override
	public void eliminarAula(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public void actualizarAula(Aula aula) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(aula);

	}

}
