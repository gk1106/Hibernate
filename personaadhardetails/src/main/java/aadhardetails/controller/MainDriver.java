package aadhardetails.controller;



import aadhardetails.dao.AadharDetailsDao;
import aadhardetails.dao.PersonDetailsDao;
import aadhardetails.dto.Aadhardetails;
import aadhardetails.dto.Persondetails;

public class MainDriver {

	public static void main(String[] args)
	{
		AadharDetailsDao aadhardao = new AadharDetailsDao();
		PersonDetailsDao persondao =new PersonDetailsDao();
		
		
//		     Insert AadharDetails
		
//		Aadhardetails aadhardet = new Aadhardetails();
//		aadhardet.setNumber(896456342332l);
//		aadhardet.setAddress("Dindigul");
//		aadhardet.setDob("11/07/1999");
//		aadhardet.setGender('M');
////		
//		Aadhardetails saveaadhar = aadhardao.SaveAadharDetails(aadhardet);
//		
//		System.out.println(saveaadhar);

//  		 Insert PersonDetails
		
		
		Persondetails persondet = new Persondetails();
		persondet.setName("krishnakumar");
		persondet.setEmail("krishkumarfromtheni@hotmail.com");
		persondet.setPhno(9878762350l);
		//persondet.setAadhar(saveaadhar);
//	
//		
	Persondetails saveperson =persondao.SavePersonDetails(persondet);
//		
	//	System.out.println(saveperson);
		
		
		
//          Update Aaadhar Details
		
//		Aadhardetails update = new Aadhardetails();
//		update.setDob("levan-july-1999");
//		Aadhardetails updated =aadhardao.UpdateAadharDetails(update, 2);
//		
//		System.out.println(updated);
//	
		//update personDetails
		
//		Persondetails updateperson =new Persondetails();
//    	updateperson.setName("kumaran");
//		updateperson.setEmail("kumarkkp01@gmail.com");
//		updateperson.setPhno(9785324345l);
//		updateperson.setAadhar(updated);
//	Persondetails updatedperson = persondao.updatePersonDetails(updateperson, 2);
//		
//		System.out.println(updatedperson);
//		
		// Find Aadhar details
		
		
	//	Aadhardetails findaadhar = aadhardao.FindAadharDetails(2);
	//	System.out.println(findaadhar);
		
		// Find PersonDetails
		
//		Persondetails personfind =persondao.FindPersonDetails(3);
//		System.out.println(personfind);
		
		
		// Remove AadharDetails 
		
		
	//	Aadhardetails removeaadhar =aadhardao.RemoveAadhardetails(2);
//		System.out.println("this data now deleted...."+removeaadhar);
		
	//	Remove PersonDetails
		
	//	 Persondetails removeperson =persondao.RemovePersonDetails(2);
//      System.out.println("this data now deleted...."+removeperson);
	
	
	
	}

}
