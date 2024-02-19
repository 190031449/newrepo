package com.springbc.first;

public class LoanResponse {

	int approvedLoanAmt;
	int status;
	public LoanResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoanResponse(int approvedLoanAmt, int status) {
		super();
		this.approvedLoanAmt = approvedLoanAmt;
		this.status = status;
	}
	public int getApprovedLoanAmt() {
		return approvedLoanAmt;
	}
	public void setApprovedLoanAmt(int approvedLoanAmt) {
		this.approvedLoanAmt = approvedLoanAmt;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
