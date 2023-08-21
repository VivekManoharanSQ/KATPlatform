import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Reusables/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Login-/Menu_Employee'))

WebUI.click(findTestObject('Object Repository/Page_Login-/Submenu_Employees'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Employees/HeaderLbl_Employees'), 'Employees')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Employees/label_Department'), 'Department')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Employees/label_Designation'), 'Designation')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Employees/label_Status'), 'Status')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Employees/dropdown_Department'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Employees/dropdown_Designation'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Employees/dropdown_Status'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Employees/button_Reset'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Employees/button_Search'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Employees/link_Expand'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Employees/input_Expand_ant-input css-e8tju'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Employees/button_Export as Excel'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Employees/button_refresh'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Employees/button_Density'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Employees/button_Settings'), 0)

WebUI.closeBrowser()

