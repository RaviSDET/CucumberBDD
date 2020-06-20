Feature: Add new Customer 
 #Background: Log  In 
	#Given i open the chrome broswer 
	#Then  enter the url as "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F" 
	
	
Scenario Outline: Adding new customer 
	Given i open the chrome broswer 
	Then  enter the url as "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F" 
	Then enter the username as "<username>" and password as "<password>" 
	Then Click on login button 
	And   Click on customers button 
	And   Click on add new button 
	And   Enter the customer details as "<email>"  and "<password>" and "<firstname>" and "<lastname>" 
	And   select the gender 
	And   Click on save button 
	And   Close the browser 
	
	Examples: 
		|username | password | email| password | firstname| lastname|
		| admin@yourstore.com | admin | ravi456@gmail.com |ravi|iooit|