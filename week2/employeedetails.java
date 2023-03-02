package week2;

public class employeedetails {
     public void empName(String empName , int empid) {
      System.out.println("employeeName="+empName);
      System.out.println("employeeid="+empid);
     }
    	public void empaddress(String empAddress) {
    		System.out.println("empAddress="+ empAddress);
    	}
  public void empSalary(double empSalary) {
	  System.out.println("empSalary="+empSalary);
   }
   public void empNumber(long empNumber) {
	System.out.println("empNumber="+empNumber);
   }
   public static void main(String[] args) {
	employeedetails empDetails=new employeedetails();
	empDetails.empName("nirmal", 0001);
	empDetails.empaddress("trichy");
	empDetails.empNumber(9994399067l);
	empDetails.empSalary(25500);
	
   }
   }
