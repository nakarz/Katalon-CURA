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

WebUI.callTestCase(findTestCase('TC_Manual/TC_Login/Login_Login-Button-Correct-Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Book Appointment/BA_h2-Make Appointment'), 15)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Book Appointment/BA_h2-Make Appointment'), 15)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Book Appointment/BA_select-Facility'), 15)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Book Appointment/BA_select-Facility'), 15)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Book Appointment/BA_check-box-Apply Hospital Readmission'), 
    15)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Book Appointment/BA_check-box-Apply Hospital Readmission'), 
    15)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Book Appointment/BA_label-Healthcare Medicare'), 15)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Book Appointment/BA_label-Healthcare Medicare'), 15)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Book Appointment/BA_label-Healthcare Medicaid'), 15)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Book Appointment/BA_label-Healthcare Medicaid'), 15)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Book Appointment/BA_label-Healthcare None'), 15)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Book Appointment/BA_label-Healthcare None'), 15)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Book Appointment/BA_input-date-Visit Date (Required)'), 15)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Book Appointment/BA_input-date-Visit Date (Required)'), 15)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Book Appointment/BA_textarea-Comment'), 15)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Book Appointment/BA_textarea-Comment'), 15)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Book Appointment/BA_button-Book Appointment'), 15)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Book Appointment/BA_button-Book Appointment'), 15)

