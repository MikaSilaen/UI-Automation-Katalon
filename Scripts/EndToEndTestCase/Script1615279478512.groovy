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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://gist.github.com/discover')

WebUI.click(findTestObject('GistRepository/Page_Discover gists  GitHub/a_Signin'))

WebUI.setText(findTestObject('GistRepository/Page_Sign in to GitHub  GitHub/input_Username or email address_login'), 
    'MikaSilaen')

WebUI.setEncryptedText(findTestObject('GistRepository/Page_Sign in to GitHub  GitHub/input_Password_password'), 'H2i1t69c3VIovRZmBRA9vA==')

WebUI.click(findTestObject('GistRepository/Page_Sign in to GitHub  GitHub/input_Password_commit'))

WebUI.click(findTestObject('GistRepository/Page_Discover gists/svg_Sign out_octicon octicon-plus d-none d-_8b831b'))

WebUI.setText(findTestObject('GistRepository/Page_Create a new Gist/input_View your gists_gistcontentsname'), 'test')

WebUI.click(findTestObject('GistRepository/Page_Create a new Gist/div_1'))

WebUI.setText(findTestObject('GistRepository/Page_Create a new Gist/div_1test 123'), '<div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -53px;" contenteditable="false"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">1</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation">test 123</span></pre></div>')

WebUI.click(findTestObject('GistRepository/Page_Create a new Gist/button_Create secret gist'))

WebUI.click(findTestObject('GistRepository/Page_test/a_Edit'))

WebUI.click(findTestObject('GistRepository/Page_Editing test/span_test 123'))

WebUI.setText(findTestObject('GistRepository/Page_Editing test/div_1edit test 123'), '<div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -53px;" contenteditable="false"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">1</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="">edit test 123</span></pre></div>')

WebUI.click(findTestObject('GistRepository/Page_Editing test/button_Update secret gist'))

WebUI.click(findTestObject('GistRepository/Page_test/img_Sign out_avatar avatar-user'))

WebUI.click(findTestObject('GistRepository/Page_test/button_Sign out'))

WebUI.click(findTestObject('GistRepository/Page_Sign out/input_Are you sure you want to sign out_btn_960785'))

WebUI.closeBrowser()

