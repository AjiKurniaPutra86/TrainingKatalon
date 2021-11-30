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

//Mobile.callTestCase(findTestCase('Mobile Andro/Page/01 Onboarding/001 check onboarding to form login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('App/RunApp'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Mobile Andro/Scenario/Login/001 Onboarding'), [:], FailureHandling.STOP_ON_FAILURE)

String pop_up_phone_empty = 'Nomor Handphone Kosong'
String pop_up_phone_unregistered = 'Nomor handphone belum terdaftar'
String pop_up_phone_less_caracter = 'Nomor Handphone Harus lebih dari 8 karakter'

Mobile.callTestCase(findTestCase('Mobile Andro/Scenario/Login/002 Form Login'), [
	'pop_up_phone_empty': pop_up_phone_empty,
	'pop_up_phone_unregistered' : pop_up_phone_unregistered,
	'pop_up_phone_less_caracter' : pop_up_phone_less_caracter,]
, FailureHandling.STOP_ON_FAILURE)







