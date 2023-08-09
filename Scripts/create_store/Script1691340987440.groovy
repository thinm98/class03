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

WebUI.navigateToUrl('https://accounts.shopify.com/lookup?rid=f57c4b6d-4fd0-42f7-9f7a-ee0686c6f139')

WebUI.setText(findTestObject('Object Repository/Page_Log in  Partners/input_Email_accountemail'), 'developer1@fireapps.vn')

WebUI.click(findTestObject('Object Repository/Page_Log in  Partners/div_Continue with email'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Log in  Partners/div_Continue with email'))

WebUI.click(findTestObject('Object Repository/Page_Log in  Partners/div_Continue with email'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Log in  Partners/div_Continue with email'))

WebUI.click(findTestObject('Object Repository/Page_Log in  Partners/div_Continue with email'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Log in  Partners/div_Continue with email'))

WebUI.click(findTestObject('Object Repository/Page_Log in  Partners/button_Continue with email'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Shopify/input_Password_accountpassword'), 'p6ZEinT8tnNFQE0HzfnEZA==')

WebUI.click(findTestObject('Object Repository/Page_Shopify/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Shopify Partners/span_earn commissions_Polaris-RadioButton___2c55b4'))

WebUI.setText(findTestObject('Object Repository/Page_Shopify Partners/input_Store Name_PolarisTextField3'), 'thi-test-auto')

WebUI.click(findTestObject('Object Repository/Page_Shopify Partners/div_LoadingCreate development store'))

