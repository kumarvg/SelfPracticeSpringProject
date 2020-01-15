package com.Vishal.FirstSpringProject;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:FirstProjectBean.xml")
public class FirstSpringProjectApplication {

	/*
	 * // user authentication static {
	 * 
	 * Scanner sc = new Scanner(System.in); String [] strArray=new String[]
	 * {"Vishal","Ruby"}; int Flag=0; String userInput=sc.nextLine(); for (int i =
	 * 0; i < strArray.length; i++) { if (strArray[i] == "Vishal" || strArray[i] ==
	 * "Ruby") { Flag=1; System.out.println("Welcome in digital world"); break; } }
	 * if(Flag==0) { String str1="User not found"; String
	 * str2="Thanks for Visiting"; String meassage=str1+"\n"+str2;
	 * System.out.println(meassage); int wrong=1/0; } }
	 */
	
	public static void main(String[] args) {
		

		ConfigurableApplicationContext ctx = SpringApplication.run(FirstSpringProjectApplication.class, args);

		/*
		 * Bulb obj1 =(Bulb) ctx.getBean("suryaObj"); // this will give the object of
		 * surya bulb Bulb obj2 =(Bulb) ctx.getBean("anchorObj"); //this will give the
		 * object of anchor bulb FactoryBulp Fp = new FactoryBulp(); Fp.verify();
		 * obj1.getBulb(); obj2.getBulb();
		 */

		
		
		  FactoryBulp factoryObject = (FactoryBulp) ctx.getBean("factoryObj");
		/*
		 * FactoryBulp factoryObject2 = (FactoryBulp) ctx.getBean("factoryObj2");
		 * factoryObject.verify(); factoryObject.tubeLightService();
		 */
		  
		  factoryObject.verify();
		  factoryObject.tubeLightService();
		 
		 
		
		
		
		
	}

}
