package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "Partner")
public class Partner { // POJO(plain old java object) class/Entity class

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "partnerid_pk")
	private int id;

	@Column(name = "name")
	private String name;

	@Version
	@Column(name = "version")
	private int version;

	public Partner() {
		super();
	}

	public Partner(String name, int version) {
		super();
		this.name = name;
		this.version = version;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Partner [id=" + id + ", name=" + name + ", version=" + version + "]";
	}

}
