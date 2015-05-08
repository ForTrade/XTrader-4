package org.xtrader.core.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Broker")
public class Broker {
	
	@Id
    @GeneratedValue
	private Long id;
	
	@Column(name="broker_name")
	private String name;
	
	
	
}
