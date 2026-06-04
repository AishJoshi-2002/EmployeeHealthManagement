package com.rites.medical.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "HOSPITAL_MASTER")
//@IdClass(HospitalMasterId.class)
//@SequenceGenerator(name="[HOSPITAL_ID_SEQ]",sequenceName="[HOSPITAL_ID_SEQ]",allocationSize=1)
public class HospitalMaster {

	
	@Column(name = "ID", insertable = false, updatable = false)
	public Integer id;
	
	@Id
	@Column(name="[HOSPITAL_ID]")
	public Integer hospitalId;

	@Column(name="[NAME]")
	private String hospitalName;

	@Column(name="[ADDRESS1]")
	private String address1;

	@Column(name="[ADDRESS2]")
	private String address2;

	@Column(name="[CITY_ID]")
	private Integer cityCd;

	@Column(name="[PINCODE]")
	private String pincode;

	@Column(name="[STATE]")
	private Integer state;

	@Column(name="[CONTACT_PERSON]")
	private String contactPerson;

	@Column(name="[CONTACT_PERSON_DESIG]")
	private String contactPersonDes;

	@Column(name="[CONTACT_PERSON_EMAIL]")
	private String contactPersonEmail;

	@Column(name="[ALT_CONTACT_PERSON]")
	private String alternateContactPerson;

	@Column(name="[ALT_CONTACT_PERSON_DESIG]")
	private String alternateContactPersonDes;

	@Column(name="[ALT_CONTACT_PERSON_EMAIL]")
	private String alternateContactPersonEmail;

	@Column(name="[CONTACT_NO_M]")
	private String contactNoMobile;

	@Column(name="[ALT_CONTACT_NO_M]")
	private String alternateContactNoMobile;

	@Column(name="[CONTACT_NO_LL]")
	private String contactNoLandline;

	@Column(name="[GST]")
	private String gst;
	
	@Column(name="[AGREEMENT_FILE]")
	private String agreementFilePath;
	
	@Column(name="[CANCEL_CHEQUE_FILE]")
	private String cancelChequeFilePath;
	
	@Column(name="[TDS_EXEMPTED]")
	private String tdsExempted;
	
	@Column(name="[TDS_FILE]")
	private String tdsFilePath;

	@Column(name="[IFSC]")
	private String ifsc;

	@Column(name="[ACCOUNT_NO]")
	private String accountNo;

	@Column(name="[BANK_NAME]")
	private String bankName;

	@Column(name="[STATUS]")
	private String statusValue;

	@Column(name="[CREATED_BY]")
	private Integer createdBy;

	@Column(name="[CREATED_ON]")
	private LocalDateTime createdOn;

	@Column(name="[UPDATED_BY]")
	private Integer updatedBy;

	@Column(name="[UPDATED_ON]")
	private LocalDateTime updatedOn;
	
	@Transient
	public MultipartFile tdsFile;
	
	@Transient
	public MultipartFile cancelChequeFile;
	
	@Transient
	public MultipartFile agreementFile;
	
	@Transient
	private String cityName;
	
	@Transient
	private String stateName;
	
	@Transient
	private HospitalCurrency hospitalCurrency;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(Integer hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public Integer getCityCd() {
		return cityCd;
	}

	public void setCityCd(Integer cityCd) {
		this.cityCd = cityCd;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getContactNoMobile() {
		return contactNoMobile;
	}

	public void setContactNoMobile(String contactNoMobile) {
		this.contactNoMobile = contactNoMobile;
	}

	public String getContactNoLandline() {
		return contactNoLandline;
	}

	public void setContactNoLandline(String contactNoLandline) {
		this.contactNoLandline = contactNoLandline;
	}

	public String getStatusValue() {
		return statusValue;
	}

	public void setStatusValue(String statusValue) {
		this.statusValue = statusValue;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getContactPersonDes() {
		return contactPersonDes;
	}

	public void setContactPersonDes(String contactPersonDes) {
		this.contactPersonDes = contactPersonDes;
	}

	public String getContactPersonEmail() {
		return contactPersonEmail;
	}

	public void setContactPersonEmail(String contactPersonEmail) {
		this.contactPersonEmail = contactPersonEmail;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public String getAlternateContactPerson() {
		return alternateContactPerson;
	}

	public void setAlternateContactPerson(String alternateContactPerson) {
		this.alternateContactPerson = alternateContactPerson;
	}

	public String getAlternateContactPersonDes() {
		return alternateContactPersonDes;
	}

	public void setAlternateContactPersonDes(String alternateContactPersonDes) {
		this.alternateContactPersonDes = alternateContactPersonDes;
	}

	public String getAlternateContactPersonEmail() {
		return alternateContactPersonEmail;
	}

	public void setAlternateContactPersonEmail(String alternateContactPersonEmail) {
		this.alternateContactPersonEmail = alternateContactPersonEmail;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public HospitalCurrency getHospitalCurrency() {
		return hospitalCurrency;
	}

	public void setHospitalCurrency(HospitalCurrency hospitalCurrency) {
		this.hospitalCurrency = hospitalCurrency;
	}

	public String getAlternateContactNoMobile() {
		return alternateContactNoMobile;
	}

	public void setAlternateContactNoMobile(String alternateContactNoMobile) {
		this.alternateContactNoMobile = alternateContactNoMobile;
	}

	public String getGst() {
		return gst;
	}

	public void setGst(String gst) {
		this.gst = gst;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAgreementFilePath() {
		return agreementFilePath;
	}

	public void setAgreementFilePath(String agreementFilePath) {
		this.agreementFilePath = agreementFilePath;
	}

	public String getCancelChequeFilePath() {
		return cancelChequeFilePath;
	}

	public void setCancelChequeFilePath(String cancelChequeFilePath) {
		this.cancelChequeFilePath = cancelChequeFilePath;
	}

	public String getTdsExempted() {
		return tdsExempted;
	}

	public void setTdsExempted(String tdsExempted) {
		this.tdsExempted = tdsExempted;
	}

	public String getTdsFilePath() {
		return tdsFilePath;
	}

	public void setTdsFilePath(String tdsFilePath) {
		this.tdsFilePath = tdsFilePath;
	}

	public MultipartFile getTdsFile() {
		return tdsFile;
	}

	public void setTdsFile(MultipartFile tdsFile) {
		this.tdsFile = tdsFile;
	}

	public MultipartFile getCancelChequeFile() {
		return cancelChequeFile;
	}

	public void setCancelChequeFile(MultipartFile cancelChequeFile) {
		this.cancelChequeFile = cancelChequeFile;
	}

	public MultipartFile getAgreementFile() {
		return agreementFile;
	}

	public void setAgreementFile(MultipartFile agreementFile) {
		this.agreementFile = agreementFile;
	}

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Override
	public String toString() {
		return "HospitalMaster [id=" + id + ", hospitalId=" + hospitalId + ", hospitalName=" + hospitalName
				+ ", address1=" + address1 + ", address2=" + address2 + ", cityCd=" + cityCd + ", pincode=" + pincode
				+ ", state=" + state + ", contactPerson=" + contactPerson + ", contactPersonDes=" + contactPersonDes
				+ ", contactPersonEmail=" + contactPersonEmail + ", alternateContactPerson=" + alternateContactPerson
				+ ", alternateContactPersonDes=" + alternateContactPersonDes + ", alternateContactPersonEmail="
				+ alternateContactPersonEmail + ", contactNoMobile=" + contactNoMobile + ", alternateContactNoMobile="
				+ alternateContactNoMobile + ", contactNoLandline=" + contactNoLandline + ", gst=" + gst
				+ ", agreementFilePath=" + agreementFilePath + ", cancelChequeFilePath=" + cancelChequeFilePath
				+ ", tdsExempted=" + tdsExempted + ", tdsFilePath=" + tdsFilePath + ", ifsc=" + ifsc + ", accountNo="
				+ accountNo + ", bankName=" + bankName + ", statusValue=" + statusValue + ", createdBy=" + createdBy
				+ ", createdOn=" + createdOn + ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn + ", tdsFile="
				+ tdsFile + ", cancelChequeFile=" + cancelChequeFile + ", agreementFile=" + agreementFile
				+ ", cityName=" + cityName + ", stateName=" + stateName + ", hospitalCurrency=" + hospitalCurrency
				+ "]";
	}
	
	
	
	
}
