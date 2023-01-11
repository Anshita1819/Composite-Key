package com.key.CompositeKey.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@IdClass(StudentComposite.class)
public class Student {
	
	//@Id
	//private int id;
	//@Id
	//private int course_id;
	@EmbeddedId
	private StudentComposite embeddedID;
	private String name;
	private String number;
	

}
