package com.bharti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.bson.types.ObjectId;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
/**
 * This class indicates fields for student table.
 * @author Bharti
 *
 */
@Entity
@Table(name = "student")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonSerialize(using = ToStringSerializer.class)
	private ObjectId id;

	private String name;

	private String collageName;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
}
