package ua.j.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.j.entity.enums.SitStatus;

@Entity
@Table(name = "ticket")
@NoArgsConstructor
@Getter @Setter
public class Ticket extends BaseEntity {
	
	@ManyToOne
	@JoinColumn(name = "sesion_id")
	private Sesion sesion;

	@ManyToOne
	@JoinColumn(name = "hall_id")
	private Hall hall;
	
	@Enumerated(EnumType.ORDINAL)
	private SitStatus status; 

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
	
	@Column(name = "price", columnDefinition = "DECIMAL(5,2)")
	private BigDecimal price;

}
