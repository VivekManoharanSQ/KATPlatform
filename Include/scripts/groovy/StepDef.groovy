import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When




public class StepDef {


	@Given("User is in login page")
	public void user_is_in_login_page() {
		WebUI.openBrowser('')
		
		WebUI.maximizeWindow()
		
		WebUI.navigateToUrl('https://test-sqms.skill-quotient.com/')
	}

	@When("User enters (.*) and (.*)")
	public void user_enters_username_and_password(String username,String password) {
		WebUI.setText(findTestObject('Object Repository/Page_Login-/input_Account Login_emailOrPhone'), username)
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login-/input_Account Login_password'), password)
	}

	@When("click on login")
	public void click_on_login() {
		WebUI.click(findTestObject('Object Repository/Page_Login-/button_Login'))
	}

	@Then("User navigated to home page")
	public void user_navigated_to_home_page() {
		WebUI.click(findTestObject('Object Repository/Page_Login-/span_Skill quotient'))
	}
	

	
	
	
	
	
	
}
