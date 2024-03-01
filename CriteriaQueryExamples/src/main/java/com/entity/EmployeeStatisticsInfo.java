package com.entity;

public class EmployeeStatisticsInfo { // POJO(plain old java object) class/Entity class

	private Long totalNoOfEmployees;
	private Long totalNoOfDistictEmployees;
	private Double averageSalaryOfEmployees;
	private Long sumOfSalaryOfEmployees;
	private Integer maxSalaryOfEmployees;

	public EmployeeStatisticsInfo() {
		super();
	}

	public EmployeeStatisticsInfo(Long totalNoOfEmployees, Long totalNoOfDistictEmployees,
			Double averageSalaryOfEmployees, Long sumOfSalaryOfEmployees, Integer maxSalaryOfEmployees) {
		super();
		this.totalNoOfEmployees = totalNoOfEmployees;
		this.totalNoOfDistictEmployees = totalNoOfDistictEmployees;
		this.averageSalaryOfEmployees = averageSalaryOfEmployees;
		this.sumOfSalaryOfEmployees = sumOfSalaryOfEmployees;
		this.maxSalaryOfEmployees = maxSalaryOfEmployees;
	}

	public Long getTotalNoOfEmployees() {
		return totalNoOfEmployees;
	}

	public Integer getMaxSalaryOfEmployees() {
		return maxSalaryOfEmployees;
	}

	public Double getAverageSalaryOfEmployees() {
		return averageSalaryOfEmployees;
	}

	public Long getSumOfSalaryOfEmployees() {
		return sumOfSalaryOfEmployees;
	}

	public Long getTotalNoOfDistictEmployees() {
		return totalNoOfDistictEmployees;
	}

	@Override
	public String toString() {
		return "EmployeeStatisticsInfo [totalNoOfEmployees=" + totalNoOfEmployees + ", totalNoOfDistictEmployees="
				+ totalNoOfDistictEmployees + ", averageSalaryOfEmployees=" + averageSalaryOfEmployees
				+ ", sumOfSalaryOfEmployees=" + sumOfSalaryOfEmployees + ", maxSalaryOfEmployees="
				+ maxSalaryOfEmployees + "]";
	}

}
