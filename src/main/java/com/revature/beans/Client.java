package com.revature.beans;

import javax.persistence.*;

@Entity
@Table(name="IMS_CLIENT")
public class Client {

	@Id
	@Column(name="IMS_CLIENT_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="clientSeq")
	@SequenceGenerator(name="clientSeq", sequenceName="CLIENT_SEQ",initialValue=1, allocationSize=1)
	private int clientId;
	@Column(name="CLIENT_NAME")
	private String clientName;
	@Column(name="CLIENT_EMAIL")
	private String clientemail;
	@Column(name="POINT_OF_CONTACT_NAME")
	private String pointOfContactName;
	@Column(name="CLIENT_PHONE")
	private String clientPhone;
	@Column(name="CLIENT_FAX")
	private String clientFax;
	@Column(name="ADDRESS_ID")
	private Address addressId;
	@Column(name="CLIENT_TYPE_ID")
	private ClientType clientTypeId;
}
