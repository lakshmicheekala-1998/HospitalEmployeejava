class Doctor extends HospitalEmployee{
	String speciality;
	public Doctor(String name, int number,String speciality) {
		super(name, number);
		this.speciality=speciality;
		}
	public String toString() {
		StringBuffer buf=new StringBuffer(100);
		buf.append(name);
		buf.append(number);
		buf.append(speciality);
		return name+" "+number+" "+speciality;
	}
	public void work() {
		System.out.println(name +  " works for the hospital."  +name +  " is a(n)  " +this.speciality+ " doctor.");
	}
}


