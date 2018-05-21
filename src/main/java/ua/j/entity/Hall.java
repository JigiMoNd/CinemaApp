package ua.j.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "hall")
@NoArgsConstructor
@Getter @Setter
public class Hall extends BaseEntity {

	private String name;
	
	@Column(name = "number_of_sits")
	private int numberOfSits;
//	
//	@OneToMany(mappedBy = "hall")
//	private List<Sits> sits = new ArrayList<Sits>();
	
	
}
