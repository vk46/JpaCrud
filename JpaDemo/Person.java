package com.vk.JpaDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Simple Person POJO!
 *
 */
@Entity
public class Person {
	
	@Id
	private int pid;
	
	private String pname;
	
	private String tech;
	
	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}

	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}

	/**
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}

	/**
	 * @param pname the pname to set
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}

	/**
	 * @return the tech
	 */
	public String getTech() {
		return tech;
	}

	/**
	 * @param tech the tech to set
	 */
	public void setTech(String tech) {
		this.tech = tech;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
//	@Override
//	public String toString() {
//		return "Person [pid=" + pid + ", pname=" + pname + ", tech=" + tech + "]";
//	}

}
