package com.dw.model;

/**
 * ѧ��ʵ����
 * 
 * @author DY1101shaoyuxian
 * 
 */
public class Student {

	private int stId;// ѧ��
	private String stName;// ����
	private String stSex;// �Ա�
	private String stAge;// ����
	private long stTel;// �绰
	private String stDept;// ϵ��
	private String stAddress;// ��ַ

	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getStSex() {
		return stSex;
	}

	public void setStSex(String stSex) {
		this.stSex = stSex;
	}

	public String getStAge() {
		return stAge;
	}

	public void setStAge(String stAge) {
		this.stAge = stAge;
	}

	public long getStTel() {
		return stTel;
	}

	public void setStTel(long stTel) {
		this.stTel = stTel;
	}

	public String getStDept() {
		return stDept;
	}

	public void setStDept(String stDept) {
		this.stDept = stDept;
	}

	public String getStAddress() {
		return stAddress;
	}

	public void setStAddress(String stAddress) {
		this.stAddress = stAddress;
	}

	public Student(int stId, String stName, String stSex, String stAge,
			long stTel, String stDept, String stAddress) {
		this.stId = stId;
		this.stName = stName;
		this.stSex = stSex;
		this.stAge = stAge;
		this.stTel = stTel;
		this.stDept = stDept;
		this.stAddress = stAddress;
	}

	public Student(String stName, String stSex, String stAge, long stTel,
			String stDept, String stAddress) {
		this.stName = stName;
		this.stSex = stSex;
		this.stAge = stAge;
		this.stTel = stTel;
		this.stDept = stDept;
		this.stAddress = stAddress;
	}

	public Student() {
	}
   
}
