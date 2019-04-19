import java.util.Scanner;
public class Email{
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultpasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "swwcompany.com";
    
    //set the condtructor to receive the first and last name
    
    public Email(String firstName, String  lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        
    // call a method asking the department- return the department
    
        this.department = setDepartment();
        System.out.println("department is:  " + this.department);
        
    //Call a method that returns a random password
        this.password = randomPassword(defaultpasswordLength);
   
    
    //Combine elements to generate email
    email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "."  + companySuffix;
    
    
        
    
    } 
    // Ask for the department
    
    private String setDepartment(){
        System.out.print("New worker: " + firstName + ".DEPARTMENT CODE\n1 for sales\n2 for development\n3 for accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
         int departChoice = in.nextInt();
       
       if(departChoice == 1){
           return "sales";
       }
        else if(departChoice == 2){
           return "dev";
       }
        else if(departChoice == 3){
           return "accounting";
       }
        else {
           return "";
       }
    }


    //Generate a random password
    
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
        char[] password = new char[length];
        for(int i=0;i<length;i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }
    
    
    // Set the mailbox capacity
    
    public void setMailboxCapacity (int capacity){
        this.mailboxCapacity = capacity;
    }
    
    
    //set the alternate email
    
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    
    
    //change the password
    public void setChangePassword(String password){
        this.password = password;
    }
    
    public String getAlternateEmail() { return alternateEmail ;}
    
    public int getMailboxCapacity()  { return mailboxCapacity;}
    
    public String getPassword() { return password ;}
    
    public String showInfo() {
         { return "DISPLAY NAME: " + firstName + " " + lastName +
                 "\nCOMPANY EMAIL: " + email +
                 "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}

}