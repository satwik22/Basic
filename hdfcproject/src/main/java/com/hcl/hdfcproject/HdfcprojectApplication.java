
package com.hcl.hdfcproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.hdfcproject.model.Cards;

@SpringBootApplication
public class HdfcprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdfcprojectApplication.class, args);

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring/spring-config.xml"); // Object
		/*
		 * obj=applicationContext.getBean("creditcard"); //CreditCard ccObj=(CreditCard)
		 * obj;
		 * //System.out.println(ccObj.getCardNumber()+"\t"+ccObj.getCardHolderName()+
		 * "\t"+ccObj.getCvv()+"\t"+ccObj.getExpiryDate());
		 * 
		 * //Object obj1=applicationContext.getBean("creditcard1"); //CreditCard
		 * ccObj1=(CreditCard) obj1;
		 * //System.out.println(ccObj1.getCardNumber()+"\t"+ccObj1.getCardHolderName()+
		 * "\t"+ccObj1.getCvv()+"\t"+ccObj1.getExpiryDate());
		 */

		Object obj2 = applicationContext.getBean("cardObj");
		Cards ccObj2 = (Cards) obj2;
		System.out.println("CustomerId " + ccObj2.getCustomerId());
		System.out.println("Creditcard holder name " + ccObj2.getCreditcard().getCardNumber());
		System.out.println("Creditcard holder number " + ccObj2.getCreditcard().getCardHolderName());
		System.out.println("Creditcard cvv code " + ccObj2.getCreditcard().getCvv());
		System.out.println("Creditcard expirydate " + ccObj2.getCreditcard().getExpiryDate());

	}

}
