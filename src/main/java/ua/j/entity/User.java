package ua.j.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.j.entity.enums.UserGender;
import ua.j.entity.enums.UserRole;

@Entity
@Table(name = "user")
@NoArgsConstructor
@Getter @Setter
public class User extends BaseEntity{

	@Column(name = "email", nullable = false, unique = true)
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "role")
	@Enumerated(EnumType.ORDINAL)
	private UserRole role;
	
	@Column(name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt = new Date();
	
	@Column(name = "first_name")
	private String firstName; 

	@Column(name = "last_name")
	private String lastName; 

	@Column(name = "age")
	private int age;

	@Column(name = "gender")
	@Enumerated(EnumType.STRING)
	private UserGender gender; 
	 
	
	
	
	
	
	
	
}
