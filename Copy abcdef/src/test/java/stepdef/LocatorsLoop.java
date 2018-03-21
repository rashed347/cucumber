package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsLoop {
	WebDriver driver;
	
	public LocatorsLoop(WebDriver driver){
		this.driver =driver;
	}
	
	public void loop(){
	
		
		
		 WebElement Myname = driver.findElement(By.id("name"));
		 
		 
		String NameBox = Myname.getAttribute("value");
		WebElement nameAlert = driver.findElement(By.id("nameAlert"));
		String error1= nameAlert.getText();
		
		WebElement email = driver.findElement(By.id("email"));
		String emailBox = email.getAttribute("value");
		WebElement emailAlert = driver.findElement(By.id("emailAlert"));
		String error2= emailAlert.getText();
		
//		WebElement subject = driver.findElement(By.xpath(".//*[@id='subject']"));
//		String subjectBox = subject.getAttribute("value");
//		WebElement subjectAlert = driver.findElement(By.xpath(".//*[@id='nameAlert']"));
//		String error3= subjectAlert.getText();
		
		WebElement message = driver.findElement(By.id("message"));
		String messageBox = message.getAttribute("value");
		WebElement messageAlert = driver.findElement(By.id("messageAlert"));
		String error4= messageAlert.getText();
		
		
		WebElement success_message= driver.findElement(By.id("success-message"));
		String sm= success_message.getText();
		
		
		WebElement error_message= driver.findElement(By.id("error-message"));
		String em= error_message.getText();
		
		
		

		
		
		for (int i=0; i<1; i++) {
			if (NameBox.isEmpty()) {
				System.out.println(error1+"1");
			}  if (emailBox.isEmpty()) {
				System.out.println(error2 + "3");
			}  if (messageBox.isEmpty()) {
				System.out.println(error4 + "5");
			} else {
				System.out.println(sm + "7");
			} 
		}
			
			
		
		
	}}
		
			
//	 if (emailBox.isEmpty())
//		{System.out.println(error2+"3");
//		System.out.println(em+"4");}
//		else if (messageBox.isEmpty()){
//		System.out.println(error4+"5");
//		System.out.println(em+"6");
//		}
//		System.out.println(error1+"1");
//		System.out.println(em+"2");	
//	}
//		else{		
//			System.out.println(sm+"7");}
//			
//			
//		
//		
//	}}
		
	
//		else if (messageBox.isEmpty()){
//				System.out.println(error4+"5");
//				System.out.println(em+"6");
//				}
//			else {
//				System.out.println(sm+"7");
//			}
//	
//			
//			}
//	
//
//}System.out.println(error1+"1");
//			System.out.println(em+"2");}
//		
////		
////		if(NameBox.isEmpty())
////		 if (emailBox.isEmpty())
//		{System.out.println(error2+"3");
//		System.out.println(em+"4");}
//		else if (messageBox.isEmpty()){
//		System.out.println(error4+"5");
//		System.out.println(em+"6");
//		}
//		System.out.println(error1+"1");
//		System.out.println(em+"2");	
//	}
//		else{		
//			System.out.println(sm+"7");}
//			
	
//		
//		
//			System.out.println(error4+"5");
//			System.out.println(em+"6");
//		}
//			
//			
//			System.out.println(error2+"3");
//			System.out.println(em+"4");
//		}
//
//			System.out.println(error1+"1");
//		System.out.println(em+"2");	
//		}else{		
//			System.out.println(sm+"7");
//			
//		}
			
			
			
			
//			
//			 if(emailBox.isEmpty())
//				{
//				 if(messageBox.isEmpty())
//				 { System.out.println(error4+"5");
//					System.out.println(em+"6");
//				 }else{
//					 System.out.println(error2+"3");
//						System.out.println(em+"4");
//				 }}else{
//					 System.out.println(error1+"1");
//						System.out.println(em+"2");
//				 }}else{		
//						System.out.println(sm+"7");
//						
//					}
//				 
//				 
				 
		
//		
//		if(NameBox.isEmpty())
//		{		
//		 if(emailBox.isEmpty())
//		{	
//			 if(messageBox.isEmpty())
//			 {System.out.println(error4+"5");
//				System.out.println(em+"6");
//			 }
//			 else
//			System.out.println(error2+"3");
//			System.out.println(em+"4");
//		}else{
//			System.out.println(error1+"1");
//			System.out.println(em+"2");
//			}}
			
//			if(messageBox.isEmpty())
//		{		
//			System.out.println(error4+"5");
//			System.out.println(em+"6");
//				
//		}
//		else{		
//			System.out.println(sm+"7");
//				
//		}
		
		 
		

