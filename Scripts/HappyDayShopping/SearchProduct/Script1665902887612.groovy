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

Mobile.startApplication(GlobalVariable.G_HappyDayShopping, true)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('HappyDayShopping/button_search'), 0)

Mobile.tap(findTestObject('HappyDayShopping/search_field'), 0)

Mobile.setText(findTestObject('HappyDayShopping/search_field'), 'Promo' + '\\n', 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('HappyDayShopping/promo_product'), 0)

Mobile.checkElement(findTestObject('HappyDayShopping/tittle_product'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('HappyDayShopping/Set_Qty'), 0)

Mobile.setText(findTestObject('HappyDayShopping/Set_Qty'), '' + '2', 0)

Mobile.pressBack()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('HappyDayShopping/AnythingTap'), 0)

Mobile.tap(findTestObject('HappyDayShopping/Add to Bag'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('HappyDayShopping/Catalog'), 0)

Mobile.tap(findTestObject('HappyDayShopping/ProductChicken'), 0)

Mobile.checkElement(findTestObject('HappyDayShopping/android.widget.TextView - Promo Lucky Me Chicken  Magic Flakes'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('HappyDayShopping/Add to Bag'), 0)

Mobile.tap(findTestObject('HappyDayShopping/YourBag'), 0)

Mobile.tap(findTestObject('HappyDayShopping/NextDetail'), 0)

Mobile.tap(findTestObject('HappyDayShopping/ClearHappy'), 0)

Mobile.tap(findTestObject('HappyDayShopping/android.widget.Button - YES'), 0)

Mobile.verifyElementVisible(findTestObject('HappyDayShopping/android.widget.TextView - Your shopping bag is waiting for its firstproduct'), 
    0)

Mobile.closeApplication()

