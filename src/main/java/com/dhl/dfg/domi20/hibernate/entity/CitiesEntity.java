package com.dhl.dfg.domi20.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dbo.cities")
public class CitiesEntity {

	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;

	@Column(name = "CityCode")
	public String cityCode;

	@Column(name = "CityDescription")
	public String cityDescription;

	@Column(name = "StateId")
	public String stateId;

	public CitiesEntity() {
	}

	public CitiesEntity(int id, String cityCode, String cityDescription, String stateId) {
		super();
		this.id = id;
		this.cityCode = cityCode;
		this.cityDescription = cityDescription;
		this.stateId = stateId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityDescription() {
		return cityDescription;
	}

	public void setCityDescription(String cityDescription) {
		this.cityDescription = cityDescription;
	}

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	@Override
	public String toString() {
		return "CitiesEntity [id=" + id + ", cityCode=" + cityCode + ", cityDescription=" + cityDescription
				+ ", stateId=" + stateId + "]";
	}

}
