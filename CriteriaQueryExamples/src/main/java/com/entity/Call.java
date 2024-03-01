package com.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CallTable")
public class Call {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "callid_pk")
	private int id;

	@Column(name = "duration")
	private int duration;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "phoneid_fk", referencedColumnName = "phoneid_pk")
	private Phone phone;

	@Column(name = "timestamp")
	private Date timeStamp;

	public Call() {
		super();
	}

	public Call(int id, int duration, Phone phone, Date timeStamp) {
		super();
		this.id = id;
		this.duration = duration;
		this.phone = phone;
		this.timeStamp = timeStamp;
	}

	public Call(int duration, Phone phone, Date timeStamp) {
		super();
		this.duration = duration;
		this.phone = phone;
		this.timeStamp = timeStamp;
	}

	public int getDuration() {
		return duration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "Call [id=" + id + ", duration=" + duration + ", timeStamp=" + timeStamp + "]";
	}

}
