package ua.j.entity;

import java.util.List;

import javax.persistence.Entity;
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
	
	private int sits;
	
	
}
