package com.lokos.model;

import java.util.Date;

public class MemberDTO {
	
	private int memberNo;
	private String memberEmail;
	private String memberPW;
	private String memberName;
	private String memberTel;
	private Date memberRegDate;
	
	private AgreementStatus memberPolicyAgreement;
	private AgreementStatus memberTermsAgreement;
	

    // 동의 상태 Enum
    public enum AgreementStatus {
        YES,
        NO
    }
	
    // 기본 생성자
    public MemberDTO() {}
    
    // 인자 생성자
	public MemberDTO(int memberNo, String memberEmail, String memberPW, String memberName, String memberTel,
			Date memberRegDate, AgreementStatus memberPolicyAgreement, AgreementStatus memberTermsAgreement) {
		super();
		this.memberNo = memberNo;
		this.memberEmail = memberEmail;
		this.memberPW = memberPW;
		this.memberName = memberName;
		this.memberTel = memberTel;
		this.memberRegDate = memberRegDate;
		this.memberPolicyAgreement = memberPolicyAgreement;
		this.memberTermsAgreement = memberTermsAgreement;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPW() {
		return memberPW;
	}

	public void setMemberPW(String memberPW) {
		this.memberPW = memberPW;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberTel() {
		return memberTel;
	}

	public void setMemberTel(String memberTel) {
		this.memberTel = memberTel;
	}

	public Date getMemberRegDate() {
		return memberRegDate;
	}

	public void setMemberRegDate(Date memberRegDate) {
		this.memberRegDate = memberRegDate;
	}

	public AgreementStatus getMemberPolicyAgreement() {
		return memberPolicyAgreement;
	}

	public void setMemberPolicyAgreement(AgreementStatus memberPolicyAgreement) {
		this.memberPolicyAgreement = memberPolicyAgreement;
	}

	public AgreementStatus getMemberTermsAgreement() {
		return memberTermsAgreement;
	}

	public void setMemberTermsAgreement(AgreementStatus memberTermsAgreement) {
		this.memberTermsAgreement = memberTermsAgreement;
	}

	@Override
	public String toString() {
		return "MemberDTO [memberNo=" + memberNo + ", memberEmail=" + memberEmail + ", memberPW=" + memberPW
				+ ", memberName=" + memberName + ", memberTel=" + memberTel + ", memberRegDate=" + memberRegDate
				+ ", memberPolicyAgreement=" + memberPolicyAgreement + ", memberTermsAgreement=" + memberTermsAgreement
				+ "]";
	};
	
	
	
	
	
    
    
    
    
	
	
}
