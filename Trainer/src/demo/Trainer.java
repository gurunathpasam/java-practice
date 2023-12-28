package demo;

public class Trainer{
	int organisationid;
	String organisationname;
	int sizeoforganisation;
	
	void acquire() {
		System.out.println("acquire the freshers");
	}
	void raisefund() {
		System.out.println("taken the attendance");
	}
	Trainer(int organisationid, String organisationname, int sizeoforganisation) {
		this.organisationid = organisationid;
		this.organisationname = organisationname;
		this.sizeoforganisation = sizeoforganisation;
	}
	
}
	