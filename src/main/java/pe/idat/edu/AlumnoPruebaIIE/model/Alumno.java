package pe.idat.edu.AlumnoPruebaIIE.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "alumno")
public class Alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAlumno;
	private String apellido;
	private String nombre;
	
	@ManyToMany(mappedBy = "alumno", cascade = {
			CascadeType.PERSIST, CascadeType.MERGE})
	private List<Aula> aula = new ArrayList<>();
}
