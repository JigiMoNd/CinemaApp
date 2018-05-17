package ua.j.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "movie")
@NoArgsConstructor
@Getter @Setter
public class Movie extends BaseEntity {

	private String name;
	
	private String description;
	
	private int length;
	
	@OneToMany(mappedBy = "movie")
	private List<Sesion> sesion = new ArrayList<Sesion>();
	
}
