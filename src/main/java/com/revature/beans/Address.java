package com.revature.beans;

import javax.persistence.*;

@Entity
@Table(name="IMS_ADDRESS")
public class Address {

	@Id
	@Column(name="IMS_ADDRESS_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="c")
	@SequenceGenerator(name="c", sequenceName="ADDRESS_SEQ",initialValue=1, allocationSize=1)
	private int addressId;
	@Column(name="STREET_ADDRESS_1")
	private String streetAddress1;
	@Column(name="STREET_ADDRESS_2")
	private String streetAddress2;
	@Column(name="ADDRESS_CITY")
	private String addressCity;
	@Column(name="STATE_ID")
	private StateAbbrv stateId;
	@Column(name="ADDRESS_ZIP")
	private String addressZip;
}
