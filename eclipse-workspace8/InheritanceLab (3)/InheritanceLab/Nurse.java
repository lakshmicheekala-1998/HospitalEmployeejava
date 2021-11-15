class Nurse extends HospitalEmployee{
	int numberOfPatients;
	public Nurse(String name, int number,int numberOfPatients) {
		super(name, number);
		this.numberOfPatients=numberOfPatients;
		}
	public String toString() {
		StringBuffer buf=new StringBuffer(100);
		buf.append(name);
		buf.append(number);
		buf.append(numberOfPatients);
		return this.getName()+" "+this.getNumber()+" has "+numberOfPatients+" patients";
	}
	public void work() {
		System.out.println(name +  " works for the hospital."  +name +  " is a nurse with " +numberOfPatients+ " patients.");
	}
}
