package com.example.Mesanger;

import com.africastalking.Callback;
import com.africastalking.SmsService;
import com.africastalking.sms.Message;
import com.africastalking.sms.Recipient;
import com.africastalking.AfricasTalking;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MesangerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MesangerApplication.class, args);
                SendMessage();
	}
        
        public static void SendMessage(){
            
            String USERNAME ="Abdulhamid";
            String API_KEY = "14098fe55d8a8aa572c1d4dafb37331feb24dd0ec7082339ddad958b62506a29";
            
           AfricasTalking.initialize(USERNAME,API_KEY);
           SmsService service = AfricasTalking.getService(AfricasTalking.SERVICE_SMS);
           
          String[] recipients = new String[]{
              "+2348109553707","+2348063538362"
            };
          
          String Message = "Alhamdullilah";
          String from = "Abdulhamid";
          try {
			List<Recipient> response = service.send(Message, from, recipients, true);
			for (Recipient recipient : response) {
				System.out.print(recipient.number);
				System.out.print(" : ");
				System.out.println(recipient.status);
			}
		} catch(Exception ex) {
System.out.println(ex.getMessage());
		}
        }
}
