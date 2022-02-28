package org.inlighting.security.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CustomUser {
    @Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;

	@Column(name="Password")
	private String password;

    @Column(name="Grants")
	private String grants;   

}
