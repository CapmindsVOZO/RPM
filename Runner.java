package com.rpm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.rpm.PageObjectManager;

public class Runner extends Base_Class {

	public static WebDriver driver = getbrowser("edge");

	public static PageObjectManager pom = new PageObjectManager(driver);

//	public void main(String[] args) throws InterruptedException {

	@Test(priority = 0)
	public void Login() throws InterruptedException {

		// Driver Maximise and Url Launch
		geturl("https://mumbairpm.vozo.xyz/");

		System.out.println("Browser Launched Successfully");

		driver.manage().window().maximize();

		// test.pass("Browser Launched Successfully");

		// Enter UserName
		sendkeys(pom.getPage().getUsername(), "admin");

		// Enter Password
		sendkeys(pom.getPage().getPassword(), "Capminds@03");

		// Click SignIn Button '
		Clickonelement(pom.getPage().getSigninbtn());

		System.out.println(" Signed In Successfully");
	}

/////////////////////////////////////////////////////// ADD PATIENT ///////////////////////////////////////////////////////////////////////////	

	@Test(priority = 1)
	public void AddPatient() throws InterruptedException {

		// CLICK on PATINET MENU
		Clickonelement(pom.getPage().getClickPatient());

		// CLICK on ADD PATINET
		Clickonelement(pom.getPage().getClickAddPatient());

		// Enter The First Name
		sendkeys(pom.getPage().getenterfirstname(), "ZANA");

		// Enter The Middle Name
		sendkeys(pom.getPage().getenterMiddlename(), "Z");

		// Enter The Last Name
		sendkeys(pom.getPage().getenterLastname(), "RAJ");

		// Click the gender
		Clickonelement(pom.getPage().getClicktGender());

		// Select FEMALE in Gender field
		Clickonelement(pom.getPage().getSelectFEMALE());

		// Enter SSN Number
		sendkeys(pom.getPage().getEnteSSNNumber(), "898989489");

		// Enter Email ID
		sendkeys(pom.getPage().getEnterTheEmailID(), "abc31203@gmail.com");

		// Enter phone Number
		sendkeys(pom.getPage().getEntePhoneNumber(), "89898948989");

		// Select Race
		Clickonelement(pom.getPage().getClickBloodGroup());

		// Select Race Asian
		Clickonelement(pom.getPage().getSelectBloodGroup());

		// Select Race
		Clickonelement(pom.getPage().getSelectRace());

		// Select Race Asian
		Clickonelement(pom.getPage().getSelectRaceAsian());

		// Select Ethnicity
		Clickonelement(pom.getPage().getClickEthnicity());

		// Select EthnicityHispanicorLatino
		Clickonelement(pom.getPage().getSelectEthnicityHispanicorLatino());

		// Select preferred Language
		Clickonelement(pom.getPage().getClickPreferedLanguage());

		// Select Language English
		Clickonelement(pom.getPage().getSelectLanguageEnglish());

		// Enter Street Address
		sendkeys(pom.getPage().getEnterStreetAddress(), "Northstreet");

		// Enter City
		sendkeys(pom.getPage().getEnterCity(), "Erode");

		// Enter State
		sendkeys(pom.getPage().getEnterState(), "TN");

		// Enter ZIP Code
		sendkeys(pom.getPage().getEnterZIPCode(), "638007");

		// Next Button
		Clickonelement(pom.getPage().getClickNextbutton());

		// Next Button
		Clickonelement(pom.getPage().getClickNextbutton1());

		// Skip verification Button
		Clickonelement(pom.getPage().getClickSkipVerificationbutton1());

		// check the Radio button 1
		Clickonelement(pom.getPage().getcheckradiobutton1());

		// check the Radio button 2
		Clickonelement(pom.getPage().getcheckradiobutton2());

		// Next Button
		Clickonelement(pom.getPage().getClickNextbutton1());

		// Done Button
		Clickonelement(pom.getPage().getClickDonebutton());
	}

/////////////////////////////////////////////////////// Top Chat Box Testing  ///////////////////////////////////////////////////////////////////////////	

	@Test(priority = 2)
	public void TopChatBoxTesting() throws InterruptedException {

		// click message icon
		Clickonelement(pom.getPage().getClickMessageIcon());

		// click Enter Search Option patient name
		sendkeys(pom.getPage().getEnterSearchOption(), "ca");

		// select patient name
		Clickonelement(pom.getPage().getSelectPatientName());

		// click patient name
		Clickonelement(pom.getPage().getclickPatientName());

		// click patient name
		Clickonelement(pom.getPage().getclickPatientName());

		// Enter the message
		sendkeys(pom.getPage().getEnterTheMeesage(), "Hi all ");

		// click send option
		Clickonelement(pom.getPage().getclickPatientName());
	}

///////////////////////////////////////////////////////     Prolems    ////////////////////////////////////////////////////////////////

	@Test(priority = 3)
	public void Prolems() throws InterruptedException {

		// Click Problems Button
		Clickonelement(pom.getPage().getclickproblems());

		// Add Problems Button
		Clickonelement(pom.getPage().getclickaddproblems());

		// slect ICD9
		Selectone(pom.getPage().getselectIcd9(), "ICD9");

		// Enter ICD Code
		sendkeys(pom.getPage().getsendcode(), "1234");

		// select status
		Selectone(pom.getPage().getselectstatus(), "ACTIVE");

		// Click Start Date Diagnosis*
		Clickonelement(pom.getPage().getClickstartdate());

		// Click Start Date Diagnosis*
		Clickonelement(pom.getPage().getselectstartdate());

		// Click ok
		Clickonelement(pom.getPage().getclickok());

		// Click end Date Diagnosis*
		Clickonelement(pom.getPage().getClickEnddate());

		// Click end Date Diagnosis*
		Clickonelement(pom.getPage().getselectEnddate());

		// Click ok
		Clickonelement(pom.getPage().getclickok1());

		// Enter SNOMED CT code*
		sendkeys(pom.getPage().getsendsnoozecode(), "1234");

		// Enter Comments
		sendkeys(pom.getPage().getsendcomment(), "Hello 123");

		// click Save Button
		Clickonelement(pom.getPage().getsaveprob());

		// clcik close
		Clickonelement(pom.getPage().getclickclose1());
	}
///////////////////////////////////////////////////////     Allergy    ////////////////////////////////////////////////////////////////	

	@Test(priority = 4)
	public void Allergy() throws InterruptedException {

		// Click Allergy Button
		Clickonelement(pom.getPage().getclickAllergy());

		// Click Add Allergy Button
		Clickonelement(pom.getPage().getclickAddAllergy());

		// click allergy type
		Clickonelement(pom.getPage().getclickAllergyType());

		// Select allergy type
		Clickonelement(pom.getPage().getSelcetAllergyType());

		// Enter Specific Drug
		sendkeys(pom.getPage().getspecificdrug(), "Hello 123");

		// select Reaction
		Selectone(pom.getPage().getSelectReaction(), "Anaphylaxis");

		// select Fatal
		Selectone(pom.getPage().getSelectReaction(), "Fatal");

		// select status
		Selectone(pom.getPage().getSelectActive(), "ACTIVE");

		// Enter Notes
		sendkeys(pom.getPage().getspecificdrug(), "Hello 123");

		// click Save Button
		Clickonelement(pom.getPage().getsaveprob());

		// clcik close
		Clickonelement(pom.getPage().getclickclose1());
	}
///////////////////////////////////////////////////////     MEDICATION    ////////////////////////////////////////////////////////////////	

	@Test(priority = 5)
	public void Medication() throws InterruptedException {

		// Click Medication Button
		Clickonelement(pom.getPage().getclickMedication());

		// Click Add Medication Button
		Clickonelement(pom.getPage().getclickAddMedication());

		// Enter Drug NAME
		sendkeys(pom.getPage().getEnterDrugName(), "123");

		// Enter SIG Note
		sendkeys(pom.getPage().getEnterSIGNote(), "Hi Heelo ");

		// Select Active status
		Selectone(pom.getPage().getSelectStatus(), "Active");

		// Click Date Prescribed
		Clickonelement(pom.getPage().getClickDatePrescribed());

		// selet Date Prescribed
		Clickonelement(pom.getPage().getselectdateprescribed());

		// Click ok
		Clickonelement(pom.getPage().getclickok());

		// Click Date Starting Taking*
		Clickonelement(pom.getPage().getClickStartingTaking());

		// select Date Starting Taking*
		Clickonelement(pom.getPage().getselectStartingTaking());

		// Click ok
		Clickonelement(pom.getPage().getclickok());

		// Click Date Stopped Taking*
		Clickonelement(pom.getPage().getClickStoppedTaking());

		// select Date Stopped Taking*
		Clickonelement(pom.getPage().getselectStoppedTaking());

		// Click ok
		Clickonelement(pom.getPage().getclickok1());

		// Enter Dispense quantity
		sendkeys(pom.getPage().getEnterDispensequantity(), "123");

		// Enter the Number Refills
		sendkeys(pom.getPage().getEnterNumberRefills(), "12");

		// click Order Status
		Clickonelement(pom.getPage().getclickOrderStatus());

		// Click ok
		Clickonelement(pom.getPage().getselectOrdered());

		// Enter Notes
		sendkeys(pom.getPage().getEnterNotes1(), "12");

		// click Save Button
		Clickonelement(pom.getPage().getsaveMedi());

		// clcik close
		Clickonelement(pom.getPage().getclickclose2());

	}

///////////////////////////////////////////////////////     LAB ORDER    ////////////////////////////////////////////////////////////////////////	

	@Test(priority = 6)
	public void LABORDER() throws InterruptedException {

		// Click LabOrder Button
		Clickonelement(pom.getPage().getclickLabOrder());

		// Click Add LabOrder Button
		Clickonelement(pom.getPage().getclickAddLabOrder());

		// Click Saved Procedure Order Button
		Clickonelement(pom.getPage().getclickSavedProcedureOrder());

		// select Saved Procedure Order Button
		Clickonelement(pom.getPage().getSelectSavedProcedureOrder());

		// Click Odering provider
		Clickonelement(pom.getPage().getClickOderingprovider());

		// select Odering provider
		Clickonelement(pom.getPage().getSelectOderingprovider());

		// Click Order Date
		Clickonelement(pom.getPage().getClickOrderDate());

		// Select Order Date
		Clickonelement(pom.getPage().getSelectOrderDate());

		// Select Order Date
		Clickonelement(pom.getPage().getSelectOrderDate());

		// click ok
		Clickonelement(pom.getPage().getClickOk());

		// click Sending To
		Clickonelement(pom.getPage().getClickSentTo());

		// Select Internal Time Collected
		Clickonelement(pom.getPage().getSelectSentTo());

		// Click Internal Time Collected
		Clickonelement(pom.getPage().getClickInternalTimeCollected());

		// Select Internal Time Collected
		Clickonelement(pom.getPage().getSelectInternalTimeCollected());

		// click ok
		Clickonelement(pom.getPage().getClickOk());

		// click Priority
		Clickonelement(pom.getPage().getclickPriority());

		// Select Priority
		Clickonelement(pom.getPage().getSelectPriority());

		// click Status
		Clickonelement(pom.getPage().getClickStatus1());

		// Select Status
		Clickonelement(pom.getPage().getSelectStatus1());

		// click History Order
		Clickonelement(pom.getPage().getclickHistoryOrder());

		// Enter procedure
		sendkeys(pom.getPage().getEnterProcedure(), "s");

		// select procedure
		Clickonelement(pom.getPage().getSelectprocedure());

		// Click Add procedure
		Clickonelement(pom.getPage().getClickAddprocedure());

		// Click Add procedure
		Clickonelement(pom.getPage().getClickDeleteprocedure());

		// click Save Button
		Clickonelement(pom.getPage().getClickSaveprocedure());

		// clcik close
		Clickonelement(pom.getPage().getclickclose3());

		// click save and transmit
		Clickonelement(pom.getPage().getclickSaveandTransmit());

	}
///////////////////////////////////////////////////////     BILL AND INSURANCE   ////////////////////////////////////////////////////////////////////////	

	@Test(priority = 7)
	public void BILLANDINSU() throws InterruptedException {

		// Click BILL AND INSURANCE Button
		Clickonelement(pom.getPage().getclickBillInsu());

		// Click Add card Button
		Clickonelement(pom.getPage().getClickAddCard());

		// Enter Nmae
		sendkeys(pom.getPage().getEnterName(), "saheer");

		// Enter Card Number
		sendkeys(pom.getPage().getEnterCardNum(), "2222222222222222");

		// Enter cvv Number
		sendkeys(pom.getPage().getEnterCardCVV(), "1234");

		// Enter Expiration Number
		sendkeys(pom.getPage().getEnterMMYY(), "1235");

		// click add card
		Clickonelement(pom.getPage().getClickAddcard());

		// click cancel
		Clickonelement(pom.getPage().getclickcancel());

// Insurance	

		// Click INSURANCE Button
		Clickonelement(pom.getPage().getClickInsurance());

		// Click INSURANCE Type
		Clickonelement(pom.getPage().getClickInsuranceType());

		// Select Primary Insurance Type
		Clickonelement(pom.getPage().getClickPrimaryInsuranceType());

		// Click Who is the Primary Insured
		// Clickonelement(pom.getPage().getClickPrimaryInsuranced());

		// Select client
		Clickonelement(pom.getPage().getClickclient());

		// Click Insurance Payer
		Clickonelement(pom.getPage().getClickInsurancePayer());

		// select Insurance Payer
		Clickonelement(pom.getPage().getSelectInsurancePayer());

		// Enter Member ID
		sendkeys(pom.getPage().getEnterMemberID(), "12345");

		// Enter Plan ID
		sendkeys(pom.getPage().getEnterPlanID(), "12344545");

		// Enter Insurance Payer Phone
		sendkeys(pom.getPage().getEnterPayerPhone(), "5545");

		// Enter Insurance Payer Fax
		sendkeys(pom.getPage().getEnterPayerFax(), "904950");

		// click Save
		Clickonelement(pom.getPage().getclickSave1());

	}

	@Test(priority = 8)
	public void FeeSheet() throws InterruptedException {

		// Click FeeSheet Button
		Clickonelement(pom.getPage().getClickFeeSheet());

		// Click drop down Button
		Clickonelement(pom.getPage().getClickDropdown());

		// Click View details Button
		Clickonelement(pom.getPage().getClickViewdetails());

		// Click Activity
		Clickonelement(pom.getPage().getClickActivity());

		// Select Device Assigned
		Clickonelement(pom.getPage().getSelectdvcAssign());

		// Click Codes
		Clickonelement(pom.getPage().getClickCodes());

		// Select codes
		Clickonelement(pom.getPage().getselectCodses());

		// Click From Date
		Clickonelement(pom.getPage().getClickfromdate());

		// Select From Date
		Clickonelement(pom.getPage().getselectfromdate());

		// Click ok From Date
		Clickonelement(pom.getPage().getClickOkFromDate());

		// Click To Date
		Clickonelement(pom.getPage().getClickTodate());

		// Select To Date
		Clickonelement(pom.getPage().getselectTodate());

		// Click ok To Date
		Clickonelement(pom.getPage().getClickOkToDate());

		// Click Update Option
		Clickonelement(pom.getPage().getClickTUpdate());
		
		
		
		
		
		
		
		
		
		
		
		
	}
}