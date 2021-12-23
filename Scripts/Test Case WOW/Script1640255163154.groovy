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

WebUI.navigateToUrl('https://fr.wowhead.com/')

WebUI.click(findTestObject('Object Repository/WOW/Page_Wowhead  La seule chose sur laquelle l_610dae/button_Jaccepte'))

WebUI.click(findTestObject('Object Repository/WOW/Page_Wowhead  La seule chose sur laquelle l_610dae/button_Refuser'))

WebUI.setText(findTestObject('Object Repository/WOW/Page_Wowhead  La seule chose sur laquelle l_610dae/input_Live_q'), 'Lardeur')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Object Repository/WOW/Page_Wowhead  La seule chose sur laquelle l_610dae/a_Live_header-search-button fa fa-search'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Object Repository/WOW/Page_Lardeur - Recherche Wowhead/a_Humanode_top-results-result-cover'))

WebUI.waitForElementVisible(findTestObject('WOW/Page_Lardeur - PNJ - World of Warcraft/a_Chahuteurs de cadavre'), 0)

WebUI.click(findTestObject('Object Repository/WOW/Page_Lardeur - PNJ - World of Warcraft/a_Chahuteurs de cadavre'))

WebUI.closeBrowser()

