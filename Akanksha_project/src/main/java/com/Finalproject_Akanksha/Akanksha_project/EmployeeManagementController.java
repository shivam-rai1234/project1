package com.Finalproject_Akanksha.Akanksha_project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeManagementController {

	@Autowired
	private EmployeeManagementRepo er;

	// it will list all the HR department Employee name
	@GetMapping("/HrList")
	public ArrayList<String> getSample1() {
		ArrayList<String> obj = new ArrayList<String>();
		for (EmployeeManagementEntity emt : er.findAll()) {
			if (emt.getDepartment().equals("Finanace")) {
				obj.add(emt.getEmp_name());

			}

		}

		return obj;

	}

	// it will list all the Finance department Employee name
	@GetMapping("/FinanceList")
	public ArrayList<String> getSample2() {
		ArrayList<String> obj = new ArrayList<String>();
		for (EmployeeManagementEntity emt : er.findAll()) {
			if (emt.getDepartment().equals("Finanace")) {
				obj.add(emt.getEmp_name());

			}

		}

		return obj;

	}

	// it will list all the IT department Employee name
	@GetMapping("/ItList")
	public ArrayList<String> getSample3() {
		ArrayList<String> obj = new ArrayList<String>();
		for (EmployeeManagementEntity emt : er.findAll()) {
			if (emt.getDepartment().equals("IT")) {
				obj.add(emt.getEmp_name());

			}

		}

		return obj;

	}

	// it will give all details of HR department employee
	@GetMapping("/HR")
	public List<EmployeeManagementEntity> joinhr() {

		return er.gethr(1);
	}

	// it will give all details of Finance department employee
	@GetMapping("/Finance")
	public List<EmployeeManagementEntity> joinfin() {

		return er.getFinance(1);
	}

	// it will give all details of IT department employee
	@GetMapping("/IT")
	public List<EmployeeManagementEntity> joinit() {

		return er.getit(1);
	}

	// it will give details of any specific row according to our requirement
	@GetMapping("/zero")
	public List<EmployeeManagementEntity> joinzero() {

		return er.getindividual(100);
	}

	@GetMapping("/one")
	public List<EmployeeManagementEntity> joinone() {

		return er.getindividual(101);
	}

	@GetMapping("/two")
	public List<EmployeeManagementEntity> jointwo() {

		return er.getindividual(102);
	}

	@GetMapping("/three")
	public List<EmployeeManagementEntity> jointhree() {

		return er.getindividual(103);
	}

	@GetMapping("/four")
	public List<EmployeeManagementEntity> joinfour() {

		return er.getindividual(104);
	}

	@GetMapping("/five")
	public List<EmployeeManagementEntity> joinfive() {

		return er.getindividual(105);
	}

}
