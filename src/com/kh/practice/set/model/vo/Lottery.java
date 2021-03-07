package com.kh.practice.set.model.vo;

import java.util.Objects;

public class Lottery {
	
	private String name;
	private String phone;
	public Lottery() {
		// TODO Auto-generated constructor stub
	}
	public Lottery(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Lottery [name=" + name + ", phone=" + phone + "]";
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(name,phone);
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Lottery ) {
			Lottery l=(Lottery)o;
			  if (this.name.equals(l.name)&&
			      this.phone.equals(l.phone)) {
				  return true;
			  }
			
		}
		return false;
		
	}
	
	
	
	
	
	

}
