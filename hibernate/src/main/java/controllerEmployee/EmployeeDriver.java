package controllerEmployee;



import com.hibernate.emp.dao.EmployeeDao;
import com.hibernate.emp.dto.Employee;

public class EmployeeDriver 
{
	public static void main(String[] args) 
	{

		                        //Insert Employee Details

   	                         EmployeeDao dao = new EmployeeDao();
//   	                     Employee e = new  Employee();
//				             e.setName("kani");
//                         	 e.setEmail("kani123@gmail.com");
//                         	 e.setSalary(58000);
//	                      	 e.setPhno(9879056788L);
//	 	                     Employee savedemp =  dao.SaveEmp(e);
//	                    	 System.out.println(savedemp);
	                    	 
   	                         
   	                            // Updated Employee Details
   	                         
   	                    //     Employee e2 =new Employee();
   	                      //   e2.setName("mani");
   	                       //  Employee e3=dao.updateEmp(e2, 1);
   	                        // System.out.println(e3);
   	                         
   	                         
   	                         
   	                         
   	                            // Fetched Employee Details
   	                         
	                    	 //Employee e4 = dao.FindEmp(1);
	                    	// System.out.println(e4);
   	                         
   	                         
   	                            // Delete Employee Details
   	                             
   	                           Employee e5 =dao.Remove(2);
   	                           System.out.println(e5);
   	                         
				
				
			
			
			
          			
		
	
	
	}
	
}
