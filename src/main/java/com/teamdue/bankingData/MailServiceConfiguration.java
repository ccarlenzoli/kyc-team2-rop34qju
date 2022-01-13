package com.teamdue.bankingData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import com.teamdue.bankingData.mail.MailServiceImpl;
import com.teamdue.bankingData.mail.SendMail;

@Configuration
public class MailServiceConfiguration {

	@Autowired
	private MailServiceImpl senderService;

	@EventListener(ApplicationReadyEvent.class)
	public void sendMail() {
		SendMail mail = new SendMail();
		mail.setMailFrom("ccarlenzoli@gmail.com");
		mail.setMailTo("ccarlenzoli@gmail.com");
		mail.setMailSubject("Prova");
		mail.setMailContent("Ciao a tutti");
		senderService.sendEmail(mail);
	}

}
