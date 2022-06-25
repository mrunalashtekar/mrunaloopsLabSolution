package com.gl.oopslabsolution25june22;

	import java.util.Random;

	public class CredentialService {

			
			char[] generatePassword(int len) {
				
				// Cap_chars,lower_chars,numeric value and symbols.
				// using all of them to generate password
				
				String capitalLetters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
				String smallletters="abcdefghijklmnopqrstuvwxyz" ;
				String numbers="0123456789" ;
				String specialCharacters="!@#$%^&*_=+/.?<>";
				String values = capitalLetters + smallletters + numbers + specialCharacters;
				
				// using random method
				Random rndm_method = new Random();
				char[] password = new char[len];
				
				for (int i=0;i<8;i++) {
					//use of charAt() method : to get character value
					//use of next() as it is scanning the value as Int
					password[i]= values.charAt(rndm_method.nextInt(values.length()));
					
					
				}
				
				return password ;
			}
			
		//Method to generate EmailAddress
			 String generateEmailAddress(String firstname,  String lastname, String Domainaddress){
				String generatedEmailAddress = (firstname.toLowerCase()+ lastname.toLowerCase() + Domainaddress).
			    generatedEmailAddress;
			
			 }
			public void showCredentials(String firstname,String password,String EmailAddress) {
			
			     System.out.println("Dear" + firstname + " your generated credentials are as follows");
			     System.out.println("email     ----> " + EmailAddress);
			     System.out.println("Password  ---->"  + password);
		}

	}

