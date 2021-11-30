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


Mobile.tap(findTestObject('Object Repository/Mobile Andro/Page Login/Onboarding/splash_dot_index_3'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile Andro/Page Login/Onboarding/splash_dot_index_4'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile Andro/Page Login/Onboarding/splash_button_lanjut'), 0)

Mobile.delay(3)

String inputNoPhone = Mobile.getText(findTestObject('Object Repository/Mobile Andro/Page Login/Onboarding/input_phone_login_form'), 0)

if (Mobile.verifyEqual(inputNoPhone, 'No Handphone')) {
	
	Mobile.comment('Success to page form login')
}else {
	Mobile.comment('Failed')
}