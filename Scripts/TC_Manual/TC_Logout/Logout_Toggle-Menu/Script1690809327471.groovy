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

WebUI.callTestCase(findTestCase('TC_Manual/TC_Login/Login_Verify-Correct-Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Home/Home_h1-header-title'), 15)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Home/Home_h1-header-title'), 15)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Home/Home_h3-header-title'), 15)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Home/Home_h3-header-title'), 15)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Home/Home_button-Make Appointment'), 15)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Home/Home_button-Make Appointment'), 15)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Home/Home_footer-title'), 15)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Home/Home_footer-title'), 15)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Home/Home_footer-info'), 15)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Home/Home_footer-info'), 15)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Home/menu-toggle_CURA Healthcare'), 15)

WebUI.click(findTestObject('Object Spy Manual/Home/menu-toggle_CURA Healthcare'))

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Home/Home_toggle-menu-Home'), 15)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Appontment is Booked/AisB_toggle-menu-History'), 15)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Login/Login_toogle-menu-Profile'), 15)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Logout/Logout_toggle-menu-Logout'), 15)

