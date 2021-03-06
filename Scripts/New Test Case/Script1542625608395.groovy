import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.rentalhomes.com/')

WebUI.setText(findTestObject('Object Repository/test1-or/Page_Holiday Homes  Vacation Rental/input_At one of our 10 million'), 
    'Dhaka, Bangladesh')

Thread.sleep(2000)

WebUI.rightClick(findTestObject('Object Repository/test1-or/Page_Holiday Homes  Vacation Rental/input_Close X_home-page-search'))

Thread.sleep(2000)

WebUI.click(findTestObject('Object Repository/test1-or/Page_Holiday Homes  Vacation Rental/input_Close X_home-page-search'))

Thread.sleep(2000)

WebUI.click(findTestObject('Object Repository/test1-or/Page_Holiday Homes  Vacation Rental/input_Close X_home-page-search'))

Thread.sleep(2000)

WebUI.closeBrowser()

