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

WebUI.callTestCase(findTestCase('TC_Manual/TC_Login/Login_Toggle-Menu'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Spy Manual/Login/Login_toggle-menu-Login'))

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Login/Login_h2-login'), 15)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Login/Login_h2-login'), 15)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Login/Login_p-login'), 15)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Login/Login_p-login'), 15)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Login/Login_input-username'), 15)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Login/Login_input-username'), 15)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Login/Login_input-password'), 15)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Login/Login_input-password'), 15)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Login/Login_button-login'), 15)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Login/Login_button-login'), 15)

