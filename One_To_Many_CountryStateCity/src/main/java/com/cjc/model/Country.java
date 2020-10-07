package com.cjc.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int c_id;
	private String c_name;
	private String c_code;
	@OneToMany(cascade = CascadeType.ALL)
	private List<State> sc1=new ArrayList<>();
	
	
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	
	public String getC_code() {
		return c_code;
	}
	public void setC_code(String c_code) {
		this.c_code = c_code;
	}
	public List<State> getSc1() {
		return sc1;
	}
	public void setSc1(List<State> sc1) {
		this.sc1 = sc1;
	}
	
	
	
	
	
	
	
}
