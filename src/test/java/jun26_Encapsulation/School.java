package jun26_Encapsulation;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student obj = new Student();
		
		obj.setName("Teja");
		obj.setClassName("10th");
		obj.setRank(1);
		obj.setRollNo(10);
		obj.setSchoolName("Digital Cutlet");
		
		System.out.println("Name of the school is " + obj.getSchoolName());
		System.out.println("Name of the student is " + obj.getName());
		
		
	}

}
