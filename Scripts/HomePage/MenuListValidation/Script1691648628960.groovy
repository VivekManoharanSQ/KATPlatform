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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://test-sqms.skill-quotient.com/')

WebUI.setText(findTestObject('Object Repository/Page_Login-/input_Account Login_emailOrPhone'), 'skill@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login-/input_Account Login_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page_Login-/button_Login'))

WebUI.verifyElementVisible(findTestObject('HomePage/span_Dashboard'))

WebUI.verifyElementVisible(findTestObject('HomePage/span_Timesheet'))

WebUI.verifyElementVisible(findTestObject('HomePage/span_Work Order'))

WebUI.verifyElementVisible(findTestObject('HomePage/span_Asset'))

WebUI.verifyElementVisible(findTestObject('HomePage/span_Employee'))

WebUI.verifyElementVisible(findTestObject('HomePage/span_User'))

WebUI.verifyElementVisible(findTestObject('HomePage/span_Workflow'))

WebUI.verifyElementVisible(findTestObject('HomePage/span_SQMS'))

WebUI.verifyElementVisible(findTestObject('HomePage/span_Reports'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

