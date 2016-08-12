package com.revature.beans;

import javax.persistence.*;

@Entity
@Table(name="IMS_STATE_ABBRV")
public class StateAbbrv {

	@Id
	@Column(name="ABBRV_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="a")
	@SequenceGenerator(name="b", sequenceName="STATE_ABBRV_SEQ",initialValue=1, allocationSize=1)
	private int abbrvId;
	@Column(name="STATE_NAME")
	private String stateName;
	@Column(name="STATE_ABBRV")
	private String stateAbbrv;
}
