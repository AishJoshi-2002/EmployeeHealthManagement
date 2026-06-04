package com.rites.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "EmpData")
//@NamedQuery(name="EmpData.findAll" , query="select i from EmpData i")
public class EmpData {
	
	@Id
	@Column(name="[Employee No#]")
	private String empNo;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Desgination")
	private String designation;
	
	@Column(name="[Current Discipline]")
	private String curDiscipline;
	
	@Column(name="[Old Discipline]")
	private String oldDiscipline;
	
	@Column(name="D#O#B")
	private Date dob;
	
	@Column(name="D#O#J")
	private Date doj;
	
	@Column(name="Pay scale Date")
	private Date payScaleDate;
	
	@Column(name="SBU")
	private String sbu;
	
	@Column(name="Vertical")
	private String vertical;
	
	@Column(name="Vertical Head")
	private String verticalHead;
	
	@Column(name="Director")
	private String director;
	
	@Column(name="SBU Head")
	private String sbuHead;
	
	@Column(name="Place of Posting")
	private String placeOfPosting;
	
	@Column(name="[Employee Type]")
	private String empType;
	
	@Column(name="S# No#")
	private String sno;
	
	@Column(name="Category")
	private String category;
	
	@Column(name="Qualification")
	private String qualification;
	
	@Column(name="Phone No#")
	private String phoneNo;
	
	@Column(name="Email ID")
	private String email;
	
	@Column(name="Cluster")
	private String cluster;
	
	@Column(name="Region")
	private String region;
	
	@Column(name="Sector")
	private String sector;
	
	@Column(name="Personnel Area")
	private String personnelArea;
	
	@Column(name="Business Area")
	private String businessArea;
	
	@Column(name="Male/Female")
	private String maleFemale;
	
	@Column(name="Disable(Yes/No)")
	private String disable;
	
	@Column(name="Percentage Of Disability")
	private String percentageOfDisability;
	
	@Column(name="Category Of Disability")
	private String categoryOfDisability;
	
	@Column(name="Blood Group")
	private String bloodGroup;
	
	@Column(name="Father Name")
	private String fatherName;
	
	@Column(name="Spouse Name")
	private String spouseName;
	
	@Column(name="Pay Scale Type")
	private String payScaleType;
	
	@Column(name="Pay scale")
	private String payScale;
	
	@Column(name="Basic Pay")
	private String basicPay;
	
	@Column(name="Permanent Address")
	private String permanentAddress;
	
	@Column(name="Correspondence Address")
	private String correspondenceAddress;
	
	@Column(name="Gratuity Date")
	private String gratuityDate;
	
	@Column(name="Ex-Service Man(Yes/No)")
	private String exServiceMan;
	
	@Column(name="Functional Of Classification")
	private String functionalOfClassification;
	
	@Column(name="Ex-Service Man Remark")
	private String exServiceManRemark;
	
	@Column(name="[Pay Scale Grade]")
	private String payScaleGrade;
	
	@Column(name="Sanction Status")
	private String sanctionStatus;
	
	@Column(name="Religon")
	private String religon;
	
	@Column(name="Additional Qualification")
	private String additionalQualification;
	
	@Column(name="Date of Retirement")
	private String dateofRetirement;
	
	@Column(name="Mode of Induction")
	private String modeofInduction;
	
	@Column(name="PAN No")
	private String pan;

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCurDiscipline() {
		return curDiscipline;
	}

	public void setCurDiscipline(String curDiscipline) {
		this.curDiscipline = curDiscipline;
	}

	public String getOldDiscipline() {
		return oldDiscipline;
	}

	public void setOldDiscipline(String oldDiscipline) {
		this.oldDiscipline = oldDiscipline;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Date getPayScaleDate() {
		return payScaleDate;
	}

	public void setPayScaleDate(Date payScaleDate) {
		this.payScaleDate = payScaleDate;
	}

	public String getSbu() {
		return sbu;
	}

	public void setSbu(String sbu) {
		this.sbu = sbu;
	}

	public String getVertical() {
		return vertical;
	}

	public void setVertical(String vertical) {
		this.vertical = vertical;
	}

	public String getVerticalHead() {
		return verticalHead;
	}

	public void setVerticalHead(String verticalHead) {
		this.verticalHead = verticalHead;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getSbuHead() {
		return sbuHead;
	}

	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}

	public String getPlaceOfPosting() {
		return placeOfPosting;
	}

	public void setPlaceOfPosting(String placeOfPosting) {
		this.placeOfPosting = placeOfPosting;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCluster() {
		return cluster;
	}

	public void setCluster(String cluster) {
		this.cluster = cluster;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getPersonnelArea() {
		return personnelArea;
	}

	public void setPersonnelArea(String personnelArea) {
		this.personnelArea = personnelArea;
	}

	public String getBusinessArea() {
		return businessArea;
	}

	public void setBusinessArea(String businessArea) {
		this.businessArea = businessArea;
	}

	public String getMaleFemale() {
		return maleFemale;
	}

	public void setMaleFemale(String maleFemale) {
		this.maleFemale = maleFemale;
	}

	public String getDisable() {
		return disable;
	}

	public void setDisable(String disable) {
		this.disable = disable;
	}

	public String getPercentageOfDisability() {
		return percentageOfDisability;
	}

	public void setPercentageOfDisability(String percentageOfDisability) {
		this.percentageOfDisability = percentageOfDisability;
	}

	public String getCategoryOfDisability() {
		return categoryOfDisability;
	}

	public void setCategoryOfDisability(String categoryOfDisability) {
		this.categoryOfDisability = categoryOfDisability;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getPayScaleType() {
		return payScaleType;
	}

	public void setPayScaleType(String payScaleType) {
		this.payScaleType = payScaleType;
	}

	public String getPayScale() {
		return payScale;
	}

	public void setPayScale(String payScale) {
		this.payScale = payScale;
	}

	public String getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(String basicPay) {
		this.basicPay = basicPay;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getCorrespondenceAddress() {
		return correspondenceAddress;
	}

	public void setCorrespondenceAddress(String correspondenceAddress) {
		this.correspondenceAddress = correspondenceAddress;
	}

	public String getGratuityDate() {
		return gratuityDate;
	}

	public void setGratuityDate(String gratuityDate) {
		this.gratuityDate = gratuityDate;
	}

	public String getExServiceMan() {
		return exServiceMan;
	}

	public void setExServiceMan(String exServiceMan) {
		this.exServiceMan = exServiceMan;
	}

	public String getFunctionalOfClassification() {
		return functionalOfClassification;
	}

	public void setFunctionalOfClassification(String functionalOfClassification) {
		this.functionalOfClassification = functionalOfClassification;
	}

	public String getExServiceManRemark() {
		return exServiceManRemark;
	}

	public void setExServiceManRemark(String exServiceManRemark) {
		this.exServiceManRemark = exServiceManRemark;
	}

	public String getPayScaleGrade() {
		return payScaleGrade;
	}

	public void setPayScaleGrade(String payScaleGrade) {
		this.payScaleGrade = payScaleGrade;
	}

	public String getSanctionStatus() {
		return sanctionStatus;
	}

	public void setSanctionStatus(String sanctionStatus) {
		this.sanctionStatus = sanctionStatus;
	}

	public String getReligon() {
		return religon;
	}

	public void setReligon(String religon) {
		this.religon = religon;
	}

	public String getAdditionalQualification() {
		return additionalQualification;
	}

	public void setAdditionalQualification(String additionalQualification) {
		this.additionalQualification = additionalQualification;
	}

	public String getDateofRetirement() {
		return dateofRetirement;
	}

	public void setDateofRetirement(String dateofRetirement) {
		this.dateofRetirement = dateofRetirement;
	}

	public String getModeofInduction() {
		return modeofInduction;
	}

	public void setModeofInduction(String modeofInduction) {
		this.modeofInduction = modeofInduction;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	@Override
	public String toString() {
		return "EmpData [empNo=" + empNo + ", name=" + name + ", designation=" + designation + ", curDiscipline="
				+ curDiscipline + ", oldDiscipline=" + oldDiscipline + ", dob=" + dob + ", doj=" + doj
				+ ", payScaleDate=" + payScaleDate + ", sbu=" + sbu + ", vertical=" + vertical + ", verticalHead="
				+ verticalHead + ", director=" + director + ", sbuHead=" + sbuHead + ", placeOfPosting="
				+ placeOfPosting + ", empType=" + empType + ", sno=" + sno + ", category=" + category
				+ ", qualification=" + qualification + ", phoneNo=" + phoneNo + ", email=" + email + ", cluster="
				+ cluster + ", region=" + region + ", sector=" + sector + ", personnelArea=" + personnelArea
				+ ", businessArea=" + businessArea + ", maleFemale=" + maleFemale + ", disable=" + disable
				+ ", percentageOfDisability=" + percentageOfDisability + ", categoryOfDisability="
				+ categoryOfDisability + ", bloodGroup=" + bloodGroup + ", fatherName=" + fatherName + ", spouseName="
				+ spouseName + ", payScaleType=" + payScaleType + ", payScale=" + payScale + ", basicPay=" + basicPay
				+ ", permanentAddress=" + permanentAddress + ", correspondenceAddress=" + correspondenceAddress
				+ ", gratuityDate=" + gratuityDate + ", exServiceMan=" + exServiceMan + ", functionalOfClassification="
				+ functionalOfClassification + ", exServiceManRemark=" + exServiceManRemark + ", payScaleGrade="
				+ payScaleGrade + ", sanctionStatus=" + sanctionStatus + ", religon=" + religon
				+ ", additionalQualification=" + additionalQualification + ", dateofRetirement=" + dateofRetirement
				+ ", modeofInduction=" + modeofInduction + ", pan=" + pan + "]";
	}
	
	
	
	

}
