package test;

public class Test {
	
	String name;
	int size ;
	String addres;
	String company;
	
	public Test() {
		
	}
	
	public Test(String name) {
		this.name = name;
		System.out.println("this cake name is cotton candy");
	}
	public Test(int size) {
		this.size = size;
		System.out.println("the size of cake is small");
	}
	public Test(String name, String company){
		this.addres = "addres";
		this.company = "company";
		System.out.println("this company " + addres + "is located " + company);
	}

}
