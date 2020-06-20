Feature: Login into nopcommerce application 


Scenario Outline: Do login 
	Given i open the chrome broswer 
	When enter the url as "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F" 
	Then enter the username as "<username>" and password as "<password>" 
	And  Click on login button 
	And  Click on logout button and close the browser 
	
	Examples: 
		|username | password | 
		| admin@yourstore.com | admin |
		
		
		
		
		
		
		
