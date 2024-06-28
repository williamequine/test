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

WebUI.callTestCase(findTestCase('Login Web'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('checkout - normal/click tombol add to chart'), 0)

WebUI.click(findTestObject('checkout - normal/click tombol add to chart'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('checkout - normal/keranjang'))

WebUI.verifyElementPresent(findTestObject('checkout - normal/verifikasi masuk keranjang'), 0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('checkout - normal/button remove'))

WebUI.verifyElementNotPresent(findTestObject('checkout - normal/item name'), 0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('checkout - normal/button checkout'))

WebUI.verifyElementPresent(findTestObject('checkout - normal/first name'), 0)

WebUI.setText(findTestObject('checkout - normal/first name'), 'Standard')

WebUI.setText(findTestObject('checkout - normal/last name'), 'Users')

WebUI.setText(findTestObject('checkout - normal/zip code'), '16360')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('checkout - normal/button continue'))

WebUI.verifyElementPresent(findTestObject('checkout - normal/verifikasi masuk halaman pembayaran'), 0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('checkout - normal/keranjang'))

WebUI.verifyElementNotPresent(findTestObject('checkout - normal/item name'), 0)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

