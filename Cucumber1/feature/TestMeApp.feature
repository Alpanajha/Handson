Feature: Login Functionality 
@data-driven
Scenario:  Login to TestMeApp
			Given user open TestMeApp 
			When user click signin
			And user enter credentials as 
				|lalitha|
				|Password123| 
				Then click on login