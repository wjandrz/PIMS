package com.revature.beans;

import javax.persistence.*;

@Entity
@Table(name="IMS_STATE_ABBRV")
public class stateAbbrv {

	@Id
	@Column(name="ABBRV_ID")
	private int abbrvId;
	@Column(name="COURSE_ID")
	private String stateName;
	@Column(name="COURSE_ID")
	private String stateAbbrv;
}
