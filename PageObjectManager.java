package com.rpm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PageObjectManager {

	public static RemoteWebDriver driver;

	private Page pg;


	public PageObjectManager(WebDriver driver2) {

		this.driver = (RemoteWebDriver) driver2;

	}

//	public Calender getCalender() {
//
//		if (cp == null) {
//
//			cp = new Calender(driver);
//
//		}
//		return cp;
//	}

	public Page getPage() {

		if (pg == null) {

			pg = new Page(driver);

		}
		return pg;
	}

//	public Reports getReports() {
//
//		if (rp == null) {
//
//			rp = new Reports(driver);
//
//		}
//		return rp;
//	}

//	public New_Appointment getnewappointment() {
//
//		if (na == null) {
//
//			na = new New_Appointment(driver);
//
//		}
//		return na;
//
//	}

//	public Payment getPayment() {
//
//		if (py == null) {
//
//			py = new Payment(driver);
//
//		}
//		return py;
//	}
//
//	public Billing getBilling() {
//
//		if (BL == null) {
//
//			BL = new Billing(driver);
//
//		}
//		return BL;
//	}
//
//	public PageTask getPageTask() {
//
//		if (TK == null) {
//
//			TK = new PageTask(driver);
//
//		}
//		return TK;
//	}
//
//	public ERXPage getERXPage() {
//
//		if (ERX == null) {
//
//			ERX = new ERXPage(driver);
//
//		}
//		return ERX;
//	}
//
//	public PatientModuleNegativeCases getNegativeTestCase() {
//
//		if (PANE == null) {
//
//			PANE = new PatientModuleNegativeCases(driver);
//
//		}
//		return PANE;
//	}
//
//	public BillingNergativeCases getBillingNergativeCases() {
//
//		if (BLNC == null) {
//
//			BLNC = new BillingNergativeCases(driver);
//
//		}
//		return BLNC;
//	}
//
//	public SettingsNegativeCases getSettingsNegativeCases() {
//
//		if (STNC == null) {
//
//			STNC = new SettingsNegativeCases(driver);
//
//		}
//		return STNC;
//	}
//
//	public TaskNegativeCases getTaskNegativeCases() {
//
//		if (TKNC == null) {
//
//			TKNC = new TaskNegativeCases(driver);
//
//		}
//		return TKNC;
//	}
//
//	public PaymentNegativeCases getPaymentNegativeCases() {
//
//		if (PANC == null) {
//
//			PANC = new PaymentNegativeCases(driver);
//
//		}
//		return PANC;
//	}
//
//	public ScheduleNegativeCases getScheduleNegativeCases() {
//
//		if (SCNC == null) {
//
//			SCNC = new ScheduleNegativeCases(driver);
//
//		}
//		return SCNC;
//	}
//
//	public Security getSecurity() {
//
//		if (SECNC == null) {
//
//			SECNC = new Security(driver);
//
//		}
//		return SECNC;
//	}
//
//	public PatientSearch getPatientSearch() {
//
//		if (PASEar == null) {
//
//			PASEar = new PatientSearch(driver);
//
//		}
//		return PASEar;
//	}
//
//	public ChangePassword getChangePassword() {
//
//		if (CHNGPASS == null) {
//
//			CHNGPASS = new ChangePassword(driver);
//
//		}
//		return CHNGPASS;
//	}
//
//	public PatientPortalSetting getPatientPortalSetting() {
//
//		if (PPS == null) {
//
//			PPS = new PatientPortalSetting(driver);
//
//		}
//		return PPS;
//	}
//
//	public Patient getPatient() {
//
//		if (Pp == null) {
//
//			Pp = new Patient(driver);
//
//		}
//		return Pp;
//	}

}