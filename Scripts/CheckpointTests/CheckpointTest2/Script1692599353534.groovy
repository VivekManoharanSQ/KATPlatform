import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.util.regex.Pattern as Pattern
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

WebUI.click(findTestObject('Page_Login-/Menu_Employee'))

WebUI.click(findTestObject('Page_Login-/Submenu_Employees'))

actualPaginationText = WebUI.getText(findTestObject('Page_Employees/lbl_showing total items'))

//Pattern p = Pattern.compile('showing 1-[1-9][0-9] of \\d{1,5} total items')
WebUI.verifyMatch(actualPaginationText, 'showing 1-10 of \\d{1,5} total items', true)

WebUI.takeFullPageScreenshotAsCheckpoint('Initial Record Count')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Employees/PageNo_1'), '1')

WebUI.click(findTestObject('Object Repository/Page_Employees/dd_RecordPerPage'))

WebUI.click(findTestObject('Object Repository/Page_Employees/div_20  page'))

actualPaginationText = WebUI.getText(findTestObject('Page_Employees/lbl_showing total items'))

WebUI.verifyMatch(actualPaginationText, 'showing 1-20 of \\d{1,5} total items', true)

WebUI.takeAreaScreenshotAsCheckpoint('Pagination', findTestObject('Page_Employees/lbl_showing total items'))

