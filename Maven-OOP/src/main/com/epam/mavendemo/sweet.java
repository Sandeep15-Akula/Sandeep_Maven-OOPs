package main.com.epam.mavendemo;

public class sweet {
	private String sname;
	private double sprice;
	private double squan;
	
	public sweet(String name, double sprice, double squan) {
		setSname(sname);
		setSprice(sprice);
		setSquan(squan);
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getSprice() {
		return sprice;
	}

	public void setSprice(double sprice) {
		this.sprice = sprice;
	}

	public double getSquan() {
		return squan;
	}

	public void setSquan(double squan) {
		this.squan = squan;
	}
	
}