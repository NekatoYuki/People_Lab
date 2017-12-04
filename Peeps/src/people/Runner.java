package people;

public class Runner 
{
	public static void main(String[] args) 
	{
		String students [] = new String[10];
		Person Teacher = new Teacher();
		
		Classroom newclassroom = new Classroom(String students [], teacher);
		
		System.out.println(students);
		System.out.println(newclassroom.());
		System.out.println(newclassroom.classAverage());
	}


	static String [] firstNames = {"Cleo" + "Etta" + "Kora" + "Remi" + "Mila" + "Anya" + "Bay" + "June" + "Juno" + "Uma" 
									+ "Nora" + "Vera" + "Zadie"};
	static String [] familyNames = {"Caverly" + "Danvers" + "Degray" + "Delgado" + "Devlin" + "Falkov" + "Glen" + "Haze" + "ldine"
									+ "Husher" + "Jensen" + "Lowell"+ "Mayfair" + "Mercier" + "Moreau" + "Ramirez" + "Rye" + "Voge"
									+ "Willoughby"};	
	static String [] title = {"Mr." + "Mrs." + "Dr." + "Miss"};
	static String [] major = {"LAS" + "BioSci" + "Chem" + "Electrical" + "Mechanical" + "Industrial" + "Media" + "College Prep" + ""}; 

public String randomStudent() 
	{
	return Student.class.getName() + Student.getGPA();	
	}

}
