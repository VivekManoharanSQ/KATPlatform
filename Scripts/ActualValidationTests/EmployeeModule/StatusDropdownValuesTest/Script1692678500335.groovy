import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.util.stream.Collectors

import org.openqa.selenium.By
import org.testng.Assert
import org.testng.asserts.SoftAssert

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Reusables/Login'), [:], FailureHandling.STOP_ON_FAILURE)

println('welcome')

WebUI.click(findTestObject('Page_Login-/Menu_Employee'))

WebUI.click(findTestObject('Page_Login-/Submenu_Employees'))

WebUI.click(findTestObject('Object Repository/Page_Employees/dropdown_Status'))

List ddValues = DriverFactory.getWebDriver().findElements(By.xpath('//div[@id="filter.employeeStatus_list"]/following-sibling::div[@class="rc-virtual-list"]//div[@class="rc-virtual-list-holder-inner"]/div'))

println('size of the value is' + ddValues.size())

List titles = ddValues.stream().map({ def v ->
        v.getAttribute('title')
    }).collect(Collectors.toList())

//WebUI.verifyMatch(titles, expectedDepartments, false)
	
SoftAssert softAssert = new  SoftAssert()
//titles.remove(0)
softAssert.assertEquals(titles,expectedStatusValues)

//Assert.assertEquals(titles,expectedStatusValues)


//for(def values:ddValues ) {
//	println 'the title is ' + values.getAttribute('title')
//}
WebUI.closeBrowser()

softAssert.assertAll()

