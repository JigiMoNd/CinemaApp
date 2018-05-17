package ua.j.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "sesion")
@NoArgsConstructor
@Getter @Setter
public class Sesion extends BaseEntity {

	@Column(name = "date_and_time")
	private Date dateAndTime;
	
	@OneToOne(cascade = { 
			CascadeType.DETACH, 
			CascadeType.MERGE,
			CascadeType.PERSIST,
			CascadeType.REFRESH},
			fetch = FetchType.LAZY)
	@JoinColumn(name = "movie_id")
	private Movie movie;

	@ManyToOne
	@JoinColumn(name = "hall_id")
	private Hall hall;
	
	@OneToMany(mappedBy = "sesion")
	private List<Ticket> ticket = new ArrayList<Ticket>(); 

}
