package com.xoriant.models;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;

public class User {
	
	@NotBlank(message = "This Can't be Null")
	String fname;
	@NotBlank(message = "This Can't be Null")
	String lname;
	@NotBlank(message = "This Can't be Null")
	String mail;
	String desg;
	@NotBlank(message = "This Can't be Null")
	String soc;
	@NotBlank(message = "This Can't be Null")
	String eoc;
	String posnum;
	String fn;
	@NotBlank(message="This Can't be Null")
	String mname;
	@NotBlank(message="This Can't be Null")
	String ponum;
	String vname="XORIANT";
	@NotBlank(message="This Can't be Null")
	String paddr;
	@NotBlank(message="This Can't be Null")
	String num;
	@NotBlank(message="This Can't be Null")
	String crrloc;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getSoc() {
		return soc;
	}
	public void setSoc(String soc) {
		this.soc = soc;
	}
	public String getEoc() {
		return eoc;
	}
	public void setEoc(String eoc) {
		this.eoc = eoc;
	}
	public String getPosnum() {
		return posnum;
	}
	public void setPosnum(String posnum) {
		this.posnum = posnum;
	}
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getPonum() {
		return ponum;
	}
	public void setPonum(String ponum) {
		this.ponum = ponum;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getPaddr() {
		return paddr;
	}
	public void setPaddr(String paddr) {
		this.paddr = paddr;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getCrrloc() {
		return crrloc;
	}
	public void setCrrloc(String crrloc) {
		this.crrloc = crrloc;
	}
		

}
