package com.rpm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {

	@FindBy(xpath = "//input[@id='normal_login_username']")

	private WebElement username;

	public WebDriver driver;

	public Page(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "//input[@placeholder='Enter your username']")

	private WebElement Username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(xpath = "//input[@placeholder='Enter password']")

	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "//button[normalize-space()='Login']")

	private WebElement signinbtn;

	public WebElement getSigninbtn() {
		return signinbtn;
	}
/////////////////////////////////////////////////////// ADD PATIENT ///////////////////////////////////////////////////////////////////////////	

	@FindBy(xpath = "//span[@class='sc-dmRaPn eYLvzO']")

	private WebElement ClickPatient;

	public WebElement getClickPatient() {
		return ClickPatient;
	}

	@FindBy(xpath = "//button[contains(text(),'Add Patient')]")

	private WebElement ClickAddPatient;

	public WebElement getClickAddPatient() {
		return ClickAddPatient;
	}

	@FindBy(xpath = "//input[@name='firstName']")

	private WebElement enterfirstname;

	public WebElement getenterfirstname() {
		return enterfirstname;
	}

	@FindBy(xpath = "//input[@name='middleName']")

	private WebElement getenterMiddlename;

	public WebElement getenterMiddlename() {
		return getenterMiddlename;
	}

	@FindBy(xpath = "//input[@name='lastName']")

	private WebElement getenterLastname;

	public WebElement getenterLastname() {
		return getenterLastname;
	}

	@FindBy(xpath = "//div[contains(text(),'Select Gender')]")

	private WebElement ClicktGender;

	public WebElement getClicktGender() {
		return ClicktGender;
	}

	@FindBy(xpath = "//li[@value='Female']")

	private WebElement SelectFEMALE;

	public WebElement getSelectFEMALE() {
		return SelectFEMALE;
	}

	@FindBy(xpath = "//input[@name='ssnNum']")

	private WebElement EnteSSNNumber;

	public WebElement getEnteSSNNumber() {
		return EnteSSNNumber;
	}

	@FindBy(xpath = "//input[@name='email']")

	private WebElement EnterTheEmailID;

	public WebElement getEnterTheEmailID() {
		return EnterTheEmailID;
	}

	@FindBy(xpath = "//input[@name='phone']")

	private WebElement EntePhoneNumber;

	public WebElement getEntePhoneNumber() {
		return EntePhoneNumber;
	}

	@FindBy(xpath = "//div[contains(text(),'Select Blood Group')]")

	private WebElement ClickBloodGroup;

	public WebElement getClickBloodGroup() {
		return ClickBloodGroup;
	}

	@FindBy(xpath = "//li[@value='O possitive']")

	private WebElement SelectBloodGroup;

	public WebElement getSelectBloodGroup() {
		return SelectBloodGroup;
	}

	@FindBy(xpath = "//div[3]//div[2]//div[1]//h4[1]//div[1]")

	private WebElement SelectRace;

	public WebElement getSelectRace() {
		return SelectRace;
	}

	@FindBy(xpath = "//li[@value='American Indian']")

	private WebElement SelectRaceAsian;

	public WebElement getSelectRaceAsian() {
		return SelectRaceAsian;
	}

	@FindBy(xpath = "//div[normalize-space()='Select Ethnicity']")

	private WebElement ClickEthnicity;

	public WebElement getClickEthnicity() {
		return ClickEthnicity;
	}

	@FindBy(xpath = "//li[@value='Not Hispanic or Latino']")

	private WebElement SelectEthnicityHispanicorLatino;

	public WebElement getSelectEthnicityHispanicorLatino() {
		return SelectEthnicityHispanicorLatino;
	}

	@FindBy(xpath = "//div[contains(text(),'Select Language')]")

	private WebElement ClickPreferedLanguage;

	public WebElement getClickPreferedLanguage() {
		return ClickPreferedLanguage;
	}

	@FindBy(xpath = "//li[@value='Akan']")

	private WebElement SelectLanguageEnglish;

	public WebElement getSelectLanguageEnglish() {
		return SelectLanguageEnglish;
	}

	@FindBy(xpath = "//input[@name='address']")

	private WebElement EnterStreetAddress;

	public WebElement getEnterStreetAddress() {
		return EnterStreetAddress;
	}

	@FindBy(xpath = "//input[@name='city']")

	private WebElement EnterCity;

	public WebElement getEnterCity() {
		return EnterCity;
	}

	@FindBy(xpath = "//input[@name='state']")

	private WebElement EnterState;

	public WebElement getEnterState() {
		return EnterState;
	}

	@FindBy(xpath = "//input[@name='zip']")

	private WebElement EnterZIPCode;

	public WebElement getEnterZIPCode() {
		return EnterZIPCode;
	}

	@FindBy(xpath = "//button[normalize-space()='Next']")

	private WebElement ClickNextbutton;

	public WebElement getClickNextbutton() {
		return ClickNextbutton;
	}

	@FindBy(xpath = "//button[normalize-space()='Next']")

	private WebElement ClickNextbutton1;

	public WebElement getClickNextbutton1() {
		return ClickNextbutton1;
	}

	@FindBy(xpath = "//button[normalize-space()='Skip Verification']")

	private WebElement ClickSkipVerificationbutton1;

	public WebElement getClickSkipVerificationbutton1() {
		return ClickSkipVerificationbutton1;
	}

	@FindBy(xpath = "//input[@class='sc-fjqEFS dTZueT']")

	private WebElement checkradiobutton1;

	public WebElement getcheckradiobutton1() {
		return checkradiobutton1;
	}

	@FindBy(xpath = "//input[@class='sc-fjqEFS dWbmMU']")

	private WebElement checkradiobutton2;

	public WebElement getcheckradiobutton2() {
		return checkradiobutton2;
	}

	@FindBy(xpath = "//button[normalize-space()='Done']")

	private WebElement ClickDonebutton;

	public WebElement getClickDonebutton() {
		return ClickDonebutton;
	}

/////////////////////////////////////////////////////// Top Chat Box Testing  ///////////////////////////////////////////////////////////////////////////	

	@FindBy(xpath = "//button[@class='sc-jSMfEi fCbjfa']//*[name()='svg']")

	private WebElement ClickMessageIcon;

	public WebElement getClickMessageIcon() {
		return ClickMessageIcon;
	}

	@FindBy(xpath = "//input[@placeholder='Search Patient']")

	private WebElement EnterSearchOption;

	public WebElement getEnterSearchOption() {
		return EnterSearchOption;
	}

	@FindBy(xpath = "//div[@class='sc-dFdIVH sc-jGprRt hUTrMd IrhOn']")

	private WebElement SelectPatientName;

	public WebElement getSelectPatientName() {
		return SelectPatientName;
	}

	@FindBy(xpath = "//div[@class='sc-dFdIVH sc-brCFrO iIuviK bhzxiZ']")

	private WebElement clickPatientName;

	public WebElement getclickPatientName() {
		return clickPatientName;
	}

	@FindBy(xpath = "//div[@class='sc-dFdIVH sc-brCFrO gZnBxe dCJuAT']")

	private WebElement EnterTheMeesage;

	public WebElement getEnterTheMeesage() {
		return EnterTheMeesage;
	}

	@FindBy(xpath = "//button[@class='sc-jSMfEi sc-bPyhqo jDvQyl iaZGco']")

	private WebElement clicksentMessage;

	public WebElement getclicksentMessage() {
		return clicksentMessage;
	}

///////////////////////////////////////////////////////   Prolems   ///////////////////////////////////////////////////////////////////////////	

	@FindBy(xpath = "//div[@class='sc-hLaujc eeXEfC']")
	private WebElement clickproblems;

	public WebElement getclickproblems() {

		return clickproblems;

	}

	@FindBy(xpath = "//p[text()='Add Problem']")
	private WebElement clickaddproblems;

	public WebElement getclickaddproblems() {

		return clickaddproblems;

	}

	@FindBy(xpath = "//select[@id='adPro_opt-icdVers']")
	private WebElement clickICD10;

	public WebElement getclickICD10() {

		return clickICD10;

	}

	@FindBy(xpath = "//label[contains(text(),'ICD9')]")
	private WebElement SelectICD10;

	public WebElement getselectIcd9() {

		return SelectICD10;

	}

	@FindBy(xpath = "//label[contains(text(),'Active')]")
	private WebElement selectstatus;

	public WebElement getselectstatus() {

		return selectstatus;

	}

	@FindBy(xpath = "//div[@class='sc-gsnTZi eufQXB']//input[@id='date']")
	private WebElement Clickstartdate;

	public WebElement getClickstartdate() {

		return Clickstartdate;

	}

	@FindBy(xpath = "//body/div[@id='vozo_rpm']/div[@class='sc-ftvSup dDRSlF']/div[@class='sc-gsnTZi jctScP responsive-right']/div[@class='sc-gsnTZi gmzyox']/div[@class='sc-gsnTZi cLvUhJ']/div[@class='sc-gsnTZi fDxIVN']/div[@class='sc-hbyLVd dwKKn']/div[@class='sc-gsnTZi eJddtb']/div[@class='sc-gsnTZi cJPTKH']/div[@class='sc-bZkfAO ekjeeG']/div[@class='sc-kLLXSd jmUORl']/div[@class='sc-gUAEMC exgPlk']/div[@class='sc-himrzO ezvEVN']/div[@class='sc-gsnTZi kWKied']/div[@class='sc-gsnTZi eEnWPr']/div[@class='sc-gsnTZi eufQXB']/div[@id='customisedDatePicker']/div[@id='CustomDatePicker']/div[@id='CustomDatePicker']/div[@id='CustomDatePicker']/div[@id='CustomDatePicker']/div[2]/button[1]")
	private WebElement selectstartdate;

	public WebElement getselectstartdate() {

		return selectstartdate;

	}

	@FindBy(xpath = "//button[contains(text(),'Ok')]")
	private WebElement clickok;

	public WebElement getclickok() {

		return clickok;

	}

	@FindBy(xpath = "//div[@class='sc-gsnTZi eufQXB']//input[@id='date']")
	private WebElement ClickEnddate;

	public WebElement getClickEnddate() {

		return ClickEnddate;

	}

	@FindBy(xpath = "//body/div[@id='vozo_rpm']/div[@class='sc-ftvSup dDRSlF']/div[@class='sc-gsnTZi jctScP responsive-right']/div[@class='sc-gsnTZi gmzyox']/div[@class='sc-gsnTZi cLvUhJ']/div[@class='sc-gsnTZi fDxIVN']/div[@class='sc-hbyLVd dwKKn']/div[@class='sc-gsnTZi eJddtb']/div[@class='sc-gsnTZi cJPTKH']/div[@class='sc-bZkfAO ekjeeG']/div[@class='sc-kLLXSd jmUORl']/div[@class='sc-gUAEMC exgPlk']/div[@class='sc-himrzO ezvEVN']/div[@class='sc-gsnTZi kWKied']/div[@class='sc-gsnTZi eEnWPr']/div[@class='sc-gsnTZi eufQXB']/div[@id='customisedDatePicker']/div[@id='CustomDatePicker']/div[@id='CustomDatePicker']/div[@id='CustomDatePicker']/div[@id='CustomDatePicker']/div[2]/button[1]")
	private WebElement selectEnddate;

	public WebElement getselectEnddate() {

		return selectEnddate;

	}

	@FindBy(xpath = "//button[contains(text(),'Ok')]")
	private WebElement clickok1;

	public WebElement getclickok1() {

		return clickok1;

	}

	@FindBy(xpath = "//div[contains(@class,'sc-hxWoir dmXern')]//div[1]")
	private WebElement sendcode;

	public WebElement getsendcode() {

		return sendcode;

	}

	@FindBy(xpath = "//input[@class='sc-ksZaOG UHtiQ']")
	private WebElement sendsnoozecode;

	public WebElement getsendsnoozecode() {

		return sendsnoozecode;

	}

	@FindBy(xpath = "//textarea[@id='adPro_inp-cmnt']")
	private WebElement sendcomment;

	public WebElement getsendcomment() {

		return sendcomment;

	}

	@FindBy(xpath = "//p[text()='Save']")
	private WebElement saveprob;

	public WebElement getsaveprob() {

		return saveprob;

	}

	@FindBy(xpath = "//p[contains(text(),'Close')]")
	private WebElement clickclose1;

	public WebElement getclickclose1() {

		return clickclose1;

	}
///////////////////////////////////////////////////////     Allergy    ////////////////////////////////////////////////////////////////	

	@FindBy(xpath = "//div[@class='sc-hLaujc eEVwXX']")
	private WebElement clickAllergy;

	public WebElement getclickAllergy() {

		return clickAllergy;

	}

	@FindBy(xpath = "//p[@class='sc-kDDrLX evObQK']")
	private WebElement clickAddAllergy;

	public WebElement getclickAddAllergy() {

		return clickAddAllergy;

	}

	@FindBy(xpath = "//div[@placeholder=\"'Select the Allergy Type'\"]")
	private WebElement clickAllergyType;

	public WebElement getclickAllergyType() {

		return clickAllergyType;

	}

	@FindBy(xpath = "//label[contains(text(),'Specific Drug allergy')]")
	private WebElement SelcetAllergyType;

	public WebElement getSelcetAllergyType() {

		return SelcetAllergyType;

	}

	@FindBy(xpath = "//label[contains(text(),'Specific Drug allergy')]")
	private WebElement specificdrug;

	public WebElement getspecificdrug() {

		return specificdrug;

	}

	@FindBy(xpath = "//label[contains(text(),'Anaphylaxis')]")
	private WebElement SelectReaction;

	public WebElement getSelectReaction() {

		return SelectReaction;

	}

	@FindBy(xpath = "//label[contains(text(),'Fatal')]")
	private WebElement SelectFatal;

	public WebElement getSelectFatal() {

		return SelectFatal;

	}

	@FindBy(xpath = "//label[contains(text(),'Active')]")
	private WebElement SelectActive;

	public WebElement getSelectActive() {

		return SelectActive;

	}

	@FindBy(xpath = "//textarea[@class='sc-ezWXYA bDXMhS']")
	private WebElement EnterNotes;

	public WebElement getEnterNotes() {

		return EnterNotes;

	}

///////////////////////////////////////////////////////     MEDICATION    ////////////////////////////////////////////////////////////////	

	@FindBy(xpath = "//div[contains(text(),'Medication')]")
	private WebElement clickMedication;

	public WebElement getclickMedication() {

		return clickMedication;
	}

	@FindBy(xpath = "//p[contains(text(),'Add Medication')]")
	private WebElement clickAddMedication;

	public WebElement getclickAddMedication() {

		return clickAddMedication;
	}

	@FindBy(xpath = "//input[@placeholder='Find Drug']")
	private WebElement EnterDrugName;

	public WebElement getEnterDrugName() {

		return EnterDrugName;
	}

	@FindBy(xpath = "//input[@class='sc-ksZaOG llCBUA']")
	private WebElement EnterSIGNote;

	public WebElement getEnterSIGNote() {

		return EnterSIGNote;
	}

	@FindBy(xpath = "//label[normalize-space()='Active']")
	private WebElement SelectStatus;

	public WebElement getSelectStatus() {

		return SelectStatus;
	}

	@FindBy(xpath = "//div[@class='sc-gsnTZi qVi']//input[@id='date']")
	private WebElement ClickDatePrescribed;

	public WebElement getClickDatePrescribed() {

		return ClickDatePrescribed;
	}

	@FindBy(xpath = "//button[normalize-space()='15']")
	private WebElement selectdateprescribed;

	public WebElement getselectdateprescribed() {

		return selectdateprescribed;
	}

	@FindBy(xpath = "(//input[@placeholder='yyyy-mm-dd'])[2]")
	private WebElement ClickStartingTaking;

	public WebElement getClickStartingTaking() {

		return ClickStartingTaking;
	}

	@FindBy(xpath = "(//button[normalize-space()='17'])[1]")
	private WebElement selectStartingTaking;

	public WebElement getselectStartingTaking() {

		return selectStartingTaking;
	}

	@FindBy(xpath = "(//input[@placeholder='yyyy-mm-dd'])[3]")
	private WebElement ClickStoppedTaking;

	public WebElement getClickStoppedTaking() {

		return ClickStoppedTaking;
	}

	@FindBy(xpath = "(//button[normalize-space()='18'])[1]")
	private WebElement selectStoppedTaking;

	public WebElement getselectStoppedTaking() {

		return selectStoppedTaking;
	}

	@FindBy(xpath = "//input[@class='sc-ksZaOG cccheT']")
	private WebElement EnterDispensequantity;

	public WebElement getEnterDispensequantity() {

		return EnterDispensequantity;
	}

	@FindBy(xpath = "//input[@class='sc-ksZaOG dEKWoo']")
	private WebElement EnterNumberRefills;

	public WebElement getEnterNumberRefills() {

		return EnterNumberRefills;
	}

	@FindBy(xpath = "//label[normalize-space()='Ordered']")
	private WebElement getclickOrderStatus;

	public WebElement getclickOrderStatus() {

		return getclickOrderStatus;
	}

	@FindBy(xpath = "//label[normalize-space()='Ordered']")
	private WebElement selectOrdered;

	public WebElement getselectOrdered() {

		return selectOrdered;
	}

	@FindBy(xpath = "//textarea[@class='sc-ekGZSs fEkwfN']")
	private WebElement EnterNotes1;

	public WebElement getEnterNotes1() {

		return EnterNotes1;
	}

	@FindBy(xpath = "//p[contains(text(),'Save')]")
	private WebElement saveMedi;

	public WebElement getsaveMedi() {

		return saveMedi;
	}

	@FindBy(xpath = "//p[contains(text(),'Close')]")
	private WebElement clickclose2;

	public WebElement getclickclose2() {

		return clickclose2;
	}

	@FindBy(xpath = "//div[@class='sc-knuRna fyMtXD']")
	private WebElement clickLabOrder;

	public WebElement getclickLabOrder() {

		return clickLabOrder;
	}

	@FindBy(xpath = "//div[@name='pro_order']")
	private WebElement clickAddLabOrder;

	public WebElement getclickAddLabOrder() {

		return clickAddLabOrder;
	}

	@FindBy(xpath = "//body/div[@id='vozo_rpm']/div[1]/div[2]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	private WebElement clickSavedProcedureOrder;

	public WebElement getclickSavedProcedureOrder() {

		return clickSavedProcedureOrder;
	}

	@FindBy(xpath = "//body/div[@id='vozo_rpm']/div[1]/div[2]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	private WebElement SelectSavedProcedureOrder;

	public WebElement getSelectSavedProcedureOrder() {

		return SelectSavedProcedureOrder;
	}

	@FindBy(xpath = "//div[@name='name_pro']")
	private WebElement ClickOderingprovider;

	public WebElement getClickOderingprovider() {

		return ClickOderingprovider;
	}

	@FindBy(xpath = "//label[contains(text(),'dasd')]")
	private WebElement SelectOderingprovider;

	public WebElement getSelectOderingprovider() {

		return SelectOderingprovider;
	}

	@FindBy(xpath = "//body/div[@id='vozo_rpm']/div[1]/div[2]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement ClickOrderDate;

	public WebElement getClickOrderDate() {

		return ClickOrderDate;
	}

	@FindBy(xpath = "//body/div[@id='vozo_rpm']/div[1]/div[2]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement SelectOrderDate;

	public WebElement getSelectOrderDate() {

		return SelectOrderDate;
	}

	@FindBy(xpath = "//button[contains(text(),'Ok')]")
	private WebElement ClickOk;

	public WebElement getClickOk() {

		return ClickOk;
	}

	@FindBy(xpath = "//div[@name='sending_to']")
	private WebElement ClickSentTo;

	public WebElement getClickSentTo() {

		return ClickSentTo;
	}

	@FindBy(xpath = "//body/div[@id='vozo_rpm']/div[1]/div[2]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/label[1]")
	private WebElement SelectSentTo;

	public WebElement getSelectSentTo() {

		return SelectSentTo;
	}

	@FindBy(xpath = "//body/div[@id='vozo_rpm']/div[1]/div[2]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement ClickInternalTimeCollected;

	public WebElement getClickInternalTimeCollected() {

		return ClickInternalTimeCollected;
	}

	@FindBy(xpath = "//button[normalize-space()='11']")
	private WebElement SelectInternalTimeCollected;

	public WebElement getSelectInternalTimeCollected() {

		return SelectInternalTimeCollected;
	}

	@FindBy(xpath = "//div[@name='Priority']")
	private WebElement clickPriority;

	public WebElement getclickPriority() {

		return clickPriority;
	}

	@FindBy(xpath = "//label[contains(text(),'Low')]")
	private WebElement SelectPriority;

	public WebElement getSelectPriority() {

		return SelectPriority;
	}

	@FindBy(xpath = "//div[@name='status']")
	private WebElement ClickStatus1;

	public WebElement getClickStatus1() {

		return ClickStatus1;
	}

	@FindBy(xpath = "//label[contains(text(),'Pending')]")
	private WebElement SelectStatus1;

	public WebElement getSelectStatus1() {

		return SelectStatus1;
	}

	@FindBy(xpath = "//div[@name='history_order']")
	private WebElement clickHistoryOrder;

	public WebElement getclickHistoryOrder() {

		return clickHistoryOrder;
	}

	@FindBy(xpath = "//label[contains(text(),'Yes')]")
	private WebElement SelectHistoryOrder;

	public WebElement getSelectHistoryOrder() {

		return SelectHistoryOrder;
	}

	@FindBy(xpath = "//input[@name='search']")
	private WebElement EnterProcedure;

	public WebElement getEnterProcedure() {

		return EnterProcedure;
	}

	@FindBy(xpath = "//div[contains(text(),'U.S. Adult Food Security Survey - 95353-9')]")
	private WebElement Selectprocedure;

	public WebElement getSelectprocedure() {

		return Selectprocedure;
	}

	@FindBy(xpath = "//div[@class='sc-gsnTZi fkBYmG']//*[name()='svg']")
	private WebElement ClickAddprocedure;

	public WebElement getClickAddprocedure() {

		return ClickAddprocedure;
	}

	@FindBy(xpath = "//div[@class='sc-gsnTZi iCndRa']//div[2]//*[name()='svg']//*[name()='path' and contains(@d,'M19 6v14a2')]")
	private WebElement ClickDeleteprocedure;

	public WebElement getClickDeleteprocedure() {

		return ClickDeleteprocedure;
	}

	@FindBy(xpath = "//p[normalize-space()='Save']")
	private WebElement ClickSaveprocedure;

	public WebElement getClickSaveprocedure() {

		return ClickSaveprocedure;
	}

	@FindBy(xpath = "//p[contains(text(),'Close')]")
	private WebElement clickclose3;

	public WebElement getclickclose3() {

		return clickclose3;
	}

	@FindBy(xpath = "//p[contains(text(),'Close')]")
	private WebElement clickSaveandTransmit;

	public WebElement getclickSaveandTransmit() {

		return clickSaveandTransmit;
	}

///////////////////////////////////////////////////////     BILL AND INSURANCE   ////////////////////////////////////////////////////////////////////////	
	@FindBy(xpath = "//a[contains(text(),'Bill & Insurance')]")

	private WebElement clickBillInsu;

	public WebElement getclickBillInsu() {
		return clickBillInsu;
	}

	@FindBy(xpath = "//label[contains(text(),'+ Add Card')]")

	private WebElement ClickAddCard;

	public WebElement getClickAddCard() {
		return ClickAddCard;
	}

	@FindBy(xpath = "//div[@class='sc-evZas ffTqkM']//input[@class='sc-bWXABl fquKts']")

	private WebElement EnterName;

	public WebElement getEnterName() {
		return EnterName;
	}

	@FindBy(xpath = "//input[@id='bil_adCrd-inp_num']")

	private WebElement EnterNameCardNo;

	public WebElement getEnterCardNum() {
		return EnterNameCardNo;
	}

	@FindBy(xpath = "//input[@id='bil_ad-inp_cvv']")

	private WebElement EnterCVV;

	public WebElement getEnterCardCVV() {
		return EnterCVV;
	}

	@FindBy(xpath = "//input[@id='bil_ad-inp_mmyy']")

	private WebElement EnterMMYY;

	public WebElement getEnterMMYY() {
		return EnterMMYY;
	}

	@FindBy(xpath = "//div[@class='sc-bZkfAO kMaqOF']//button[1]")

	private WebElement ClickAddcard;

	public WebElement getClickAddcard() {
		return ClickAddcard;
	}

	@FindBy(xpath = "//button[@class='sc-jSMfEi keWOBQ']")

	private WebElement ClickCancelc;

	public WebElement getclickcancel() {
		return ClickCancelc;
	}

//////////// Insurance	

	@FindBy(xpath = "//div[@placeholder=\"'Select Insurance Type'\"]")

	private WebElement ClickInsurance;

	public WebElement getClickInsurance() {
		return ClickInsurance;
	}

	@FindBy(xpath = "//div[contains(text(),'Primary Insurance')]")

	private WebElement ClickInsuranceType;

	public WebElement getClickInsuranceType() {
		return ClickInsuranceType;
	}

	@FindBy(xpath = "//div[@placeholder=\"'Select Primary Insured'\"]")

	private WebElement ClickPrimaryInsuranceType;

	public WebElement getClickPrimaryInsuranceType() {
		return ClickPrimaryInsuranceType;
	}

	@FindBy(xpath = "//label[normalize-space()='Client']")

	private WebElement Clickclient;

	public WebElement getClickclient() {
		return Clickclient;
	}

	@FindBy(xpath = "//div[@placeholder=\"'Select Payer'\"]")

	private WebElement ClickInsurancePayer;

	public WebElement getClickInsurancePayer() {
		return ClickInsurancePayer;
	}

	@FindBy(xpath = "")

	private WebElement SelectInsurancePayer;

	public WebElement getSelectInsurancePayer() {
		return SelectInsurancePayer;
	}

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[4]/div[1]/input[1]")

	private WebElement EnterMemberID;

	public WebElement getEnterMemberID() {
		return EnterMemberID;
	}

	@FindBy(xpath = "//body/div[@id='vozo_rpm']/div[1]/div[2]/div[3]/div[2]/div[4]/div[2]/input[1]")

	private WebElement EnterPlanID;

	public WebElement getEnterPlanID() {
		return EnterPlanID;
	}

	@FindBy(xpath = "//body/div[@id='vozo_rpm']/div[1]/div[2]/div[3]/div[2]/div[5]/div[1]/input[1]")

	private WebElement EnterPayerPhone;

	public WebElement getEnterPayerPhone() {
		return EnterPayerPhone;
	}

	@FindBy(xpath = "//body/div[@id='vozo_rpm']/div[1]/div[2]/div[3]/div[2]/div[5]/div[2]/input[1]")

	private WebElement EnterPayerFax;

	public WebElement getEnterPayerFax() {
		return EnterPayerFax;
	}

	@FindBy(xpath = "//button[contains(text(),'Save')]")

	private WebElement clickSave1;

	public WebElement getclickSave1() {
		return clickSave1;
	}

	//////// ////////////////Fees sheet

	@FindBy(xpath = "//a[contains(text(),'Fee Sheet')]")

	private WebElement ClickFeeSheet;

	public WebElement getClickFeeSheet() {
		return ClickFeeSheet;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[5]/div[1]//*[name()='svg']")

	private WebElement getClickDropdown;

	public WebElement getClickDropdown() {
		return getClickDropdown;
	}

	@FindBy(xpath = "//label[contains(text(),'View Details')]")

	private WebElement ClickViewdetails;

	public WebElement getClickViewdetails() {
		return ClickViewdetails;
	}

	@FindBy(xpath = "//div[@placeholder=\"'Select Activity'\"]")

	private WebElement ClickActivity;

	public WebElement getClickActivity() {
		return ClickActivity;
	}

	@FindBy(xpath = "//label[contains(text(),'Device Assigned')]")

	private WebElement SelectdvcAssign;

	public WebElement getSelectdvcAssign() {
		return SelectdvcAssign;
	}

	@FindBy(xpath = "//div[@placeholder=\"'Select Codes'\"]")

	private WebElement ClickCodes;

	public WebElement getClickCodes() {
		return ClickCodes;
	}

	@FindBy(xpath = "//label[contains(text(),'CPT4-99453')]")

	private WebElement selectCodses;

	public WebElement getselectCodses() {
		return selectCodses;
	}

	@FindBy(xpath = "//div[@class='sc-gsnTZi iAGhXy viewdatepicker']//input[@id='date']")

	private WebElement Clickfromdate;

	public WebElement getClickfromdate() {
		return Clickfromdate;
	}

	@FindBy(xpath = "//button[normalize-space()='5']")

	private WebElement selectfromdate;

	public WebElement getselectfromdate() {
		return selectfromdate;
	}

	@FindBy(xpath = "//button[contains(text(),'Ok')]")

	private WebElement ClickOkFromDate;

	public WebElement getClickOkFromDate() {
		return ClickOkFromDate;
	}

	@FindBy(xpath = "//div[@class='sc-gsnTZi cKwvTW viewdatepicker']//input[@id='date']")

	private WebElement ClickTodate;

	public WebElement getClickTodate() {
		return ClickTodate;
	}

	@FindBy(xpath = "//button[normalize-space()='28']")

	private WebElement selectTodate;

	public WebElement getselectTodate() {
		return selectTodate;
	}

	@FindBy(xpath = "//button[contains(text(),'Ok')]")

	private WebElement ClickOkToDate;

	public WebElement getClickOkToDate() {
		return ClickOkToDate;
	}

	@FindBy(xpath = "//button[contains(text(),'Update')]")

	private WebElement ClickTUpdate;

	public WebElement getClickTUpdate() {
		return ClickTUpdate;
	}

}
