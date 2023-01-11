package com.key.CompositeKey.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Embeddable
public class StudentComposite implements Serializable{
	
	private int id;
	private int course_id;

}
