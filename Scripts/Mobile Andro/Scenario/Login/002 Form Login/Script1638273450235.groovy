import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.util.concurrent.ConcurrentHashMap.KeySetView

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


Mobile.tap(findTestObject('Object Repository/Mobile Andro/Page Login/Form Login/button_form_masuk'), 0)

if (Mobile.verifyEqual(pop_up_phone_empty, 'Nomor Handphone Kosong')) {
	
	Mobile.comment('Pop up empty phone success')
	
	Mobile.setText(findTestObject('Object Repository/Mobile Andro/Page Login/Onboarding/input_phone_login_form'), '08999', 0)
	
	Mobile.tap(findTestObject('Object Repository/Mobile Andro/Page Login/Form Login/button_form_masuk'), 0)
	
	if (Mobile.verifyEqual(pop_up_phone_less_caracter, 'Nomor Handphone Harus lebih dari 8 karakter')) {
		
		Mobile.comment('Pop up phone less 8 caracter success')
		
		Mobile.clearText(findTestObject('Object Repository/Mobile Andro/Page Login/Onboarding/input_phone_login_form'), 0)
					
		Mobile.setText(findTestObject('Object Repository/Mobile Andro/Page Login/Onboarding/input_phone_login_form'), '08343265564', 0)
		
		Mobile.tap(findTestObject('Object Repository/Mobile Andro/Page Login/Form Login/button_form_masuk'), 0)
		
		Mobile.delay(5)
		
		if (Mobile.verifyEqual(pop_up_phone_unregistered, 'Nomor handphone belum terdaftar')) {
			
			Mobile.comment('Pop up unregistered success')
			
			Mobile.tap(findTestObject('Object Repository/Mobile Andro/Page Login/Onboarding/input_phone_login_form'), 0)
			
			Mobile.clearText(findTestObject('Object Repository/Mobile Andro/Page Login/Onboarding/input_phone_login_form'), 30)
			
			Mobile.setText(findTestObject('Object Repository/Mobile Andro/Page Login/Onboarding/input_phone_login_form'), '08999777912', 0)
			
			Mobile.tap(findTestObject('Object Repository/Mobile Andro/Page Login/Form Login/button_form_masuk'), 0)
			
			Mobile.delay(5)
			
			if (Mobile.verifyEqual(titleOtp, 'Verifikasi Nomor HP')) {
				
				Mobile.comment('Success to otp page')
			}else {
				
			}
		}else {
			Mobile.comment('Failed to verify no phone unregistered')
		}
	}else {
		Mobile.comment('Failed to verify no phone less 8 karakter')
	}	
}else {
	Mobile.comment('Failed to verify no phone empty')
}

