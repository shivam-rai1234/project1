package com.kpi.project.ProjectVrishali;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author VrishaliMore
 *
 */
@Entity
@Table(name="BoilerPlate")
public class BoilerPlateEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column
	private Integer id;
	
	@Column
	private String appliction_name;
	
	@Column
	private String BoilerPlate_code;
	
	@Column
	private String Reduced_Code;
	
	@Column
	private String Reduce_Method;

	//Getter and Setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAppliction_name() {
		return appliction_name;
	}

	public void setAppliction_name(String appliction_name) {
		this.appliction_name = appliction_name;
	}

	public String getBoilerPlate_code() {
		return BoilerPlate_code;
	}

	public void setBoilerPlate_code(String boilerPlate_code) {
		BoilerPlate_code = boilerPlate_code;
	}


	public String getReduced_Code() {
		return Reduced_Code;
	}

	public void setReduced_Code(String reduced_Code) {
		Reduced_Code = reduced_Code;
	}

	public String getReduce_Method() {
		return Reduce_Method;
	}

	public void setReduce_Method(String reduce_Method) {
		Reduce_Method = reduce_Method;
	}	

}
