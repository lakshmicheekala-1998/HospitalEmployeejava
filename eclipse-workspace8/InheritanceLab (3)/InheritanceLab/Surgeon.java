class Surgeon extends Doctor{
	boolean operates;
	public Surgeon(String name, int number, String speciality,boolean operates) {
		super(name, number, speciality);
		this.operates=operates;
}
	public String toString() {
		StringBuffer buf=new StringBuffer(100);
		buf.append(name);
		buf.append(number);
		buf.append(speciality);
		buf.append(operates);
		return super.toString()+" Operating:"+this.operates ;
	}
	public void work() {
		System.out.println(name +  " works for the hospital."  +name +  " is operating now.");
	}
	
}