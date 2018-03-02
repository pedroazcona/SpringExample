package com.naturalprogrammer.spring5tutorial.controllers;

//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naturalprogrammer.spring5tutorial.mail.MailSender;
//import com.naturalprogrammer.spring5tutorial.mail.MockMailSender;

//import javax.annotation.Resource;

@RestController
public class MailController {

	private MailSender mailSender;// = new MockMailSender();
	
//	public MailController(MailSender MailSender) {
//		this.mailSender = MailSender;//Ambiguedad en la inyección resuelta con @Primary en MockMailSender
//	public MailController(MailSender smtpMailSender) {//Para evitar la ambiguedad lo nombramos como clase pero la primera con minúsculas
// 		this.mailSender = smtpMailSender; //El nombre de la variable tb tiene que cambiar de MailSender a smtpMailSender 
//    public MailController(MailSender smtp) {//Ahora hemos cambiado @Component por @Component("smtp")
// 	 		this.mailSender = smtp; //cambiamos lógicamente tb la variable 
//	public MailController(@Qualifier("smtpMailSender") MailSender smtp) { 
		public MailController(MailSender smtp) { 
		 		this.mailSender = smtp; 
		 	} 

	@RequestMapping("/mail")
	public String mail() {

		mailSender.send("poaa@gft.com", "A test mail", "Body of the test mail");

		return "Mail sent";
	}
}