package com.rites.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="files2")
@NamedQuery(name="FileDb.findAll" , query="select i from FileDb i")
@SequenceGenerator(name="test",sequenceName="test",allocationSize=1)
public class FileDb {
	
	@Id
	@Column(name="id")   
	@GeneratedValue(generator = "uuid")
	  @GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id; 
	
	private String name;
	
	private String type;
	
	@Lob
	private byte[] data;
	
	public FileDb() {
	  }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public FileDb( String name, String type, byte[] data) {
		this.name = name;
		this.type = type;
		this.data = data;
	}

	@Override
	public String toString() {
		return "FileDb [id=" + id + ", name=" + name + ", type=" + type + ", data=" + Arrays.toString(data) + "]";
	}

	
}
