package java.lang;

public class John {
	String name="John";
	String Project_name;
	String skill;
	public void projcap(String name,String project_name,String skill) {
		this.name=name;
		this.project_name=project_name;
		this.skill=skill;
	System.out.println(name+"\n"+project_name+"\n"+skill);
	}
	public void projcap(String name,String project_name,String skill) {
		this.name=name;
		this.Project_name=project_name;
		this.skill=skill;
	System.out.println(name+"\n"+project_name+"\n"+skill);
	}
	public static void main(String[] args) {
	John john=new John();
	john.projcap("John","Astellas","Java");
	john.projcap("John","Astellas","Java & Python");
	}
}
