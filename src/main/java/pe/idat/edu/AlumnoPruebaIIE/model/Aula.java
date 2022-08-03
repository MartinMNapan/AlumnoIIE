package pe.idat.edu.AlumnoPruebaIIE.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "aula")
public class Aula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAula;
	private String aula;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "detalle_aula", joinColumns = @JoinColumn(
			name = "id_aula",
			nullable = false,
			unique = true,
			foreignKey = @ForeignKey(foreignKeyDefinition = 
			"foreign key(id_aula) references aula(id_aula)")
			),
	inverseJoinColumns = @JoinColumn(
			name = "id_alumno",
			nullable = false,
			unique = true,
			foreignKey = @ForeignKey(foreignKeyDefinition =
			"foreign key(id_alumno) references alumno(id_alumno)")))
	private List<Alumno> alumno = new ArrayList<>();

}
