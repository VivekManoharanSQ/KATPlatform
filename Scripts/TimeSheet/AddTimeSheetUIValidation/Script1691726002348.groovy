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

WebUI.click(findTestObject('Page_Add Timesheet/span_Timesheet'))

WebUI.click(findTestObject('Page_Add Timesheet/a_Add Timesheet'))

'Assigning the field name, to be used in the java script executor\r\n'
field = 'Employee'

WebUI.verifyElementPresent(findTestObject('Page_Add Timesheet/label_Employee'), 0)

lbl_value = WebUI.getText(findTestObject('Page_Add Timesheet/label_Employee'), FailureHandling.STOP_ON_FAILURE)

script = (('return window.getComputedStyle(document.querySelector("label[title=\'' + field) + '\']"),\':before\').getPropertyValue(\'content\')')

String asterisk = WebUI.executeJavaScript(script, [])

String actualLabel = (asterisk.replace('"', '') + ' '+lbl_value)

WebUI.verifyEqual('* Employee', actualLabel)

