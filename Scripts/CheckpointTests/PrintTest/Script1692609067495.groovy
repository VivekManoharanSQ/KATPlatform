import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Reusables/Login'), [:], FailureHandling.STOP_ON_FAILURE)

println 'welcome'

WebUI.click(findTestObject('Page_Login-/Menu_Employee'))

WebUI.click(findTestObject('Page_Login-/Submenu_Employees'))

WebUI.click(findTestObject('Page_Employees/dropdown_Department'))

List<WebElement> ddValues = DriverFactory.getWebDriver().findElements(By.xpath('//div[@class="rc-virtual-list"]//div[@class="rc-virtual-list-holder-inner"]/div'))

println 'size of the value is' + ddValues.size()

for(def values:ddValues ) {
	println 'the title is ' + values.getAttribute('title')
}

WebUI.closeBrowser()

