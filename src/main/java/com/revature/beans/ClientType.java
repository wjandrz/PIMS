package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="IMS_CLIENT_TYPE")
public class ClientType {

	@Id
	@Column(name="CLIENT_TYPE_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="clientTypeSeq")
	@SequenceGenerator(name="clientTypeSeq", sequenceName="CLIENT_TYPE_SEQ",initialValue=1, allocationSize=1)
	private int clientTypeId;
	@Column(name="CLIENT_TYPE")
	private String clientType;
}
