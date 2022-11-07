package com.student.interviewpreprationmicroservices;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="interview")
public class QuestionsEntity {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer s_no;
	private String tool;
	private String Ques1;
	private String Ques2;
	private String Ques3;
	private String Ques4;
	private String Ques5;
	
	public Integer getS_no() {
		return s_no;
	}
	public void setS_no(Integer s_no) {
		this.s_no = s_no;
	}
	public String getTool() {
		return tool;
	}
	public void setTool(String tool) {
		this.tool = tool;
	}
	public String getQues1() {
		return Ques1;
	}
	public void setQues1(String ques1) {
		Ques1 = ques1;
	}
	public String getQues2() {
		return Ques2;
	}
	public void setQues2(String ques2) {
		Ques2 = ques2;
	}
	public String getQues3() {
		return Ques3;
	}
	public void setQues3(String ques3) {
		Ques3 = ques3;
	}
	public String getQues4() {
		return Ques4;
	}
	public void setQues4(String ques4) {
		Ques4 = ques4;
	}
	public String getQues5() {
		return Ques5;
	}
	public void setQues5(String ques5) {
		Ques5 = ques5;
	}
	
	
	
}
