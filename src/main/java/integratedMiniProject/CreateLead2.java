package integratedMiniProject;

import java.io.IOException;

import org.junit.Test;

import Opentaps.opentaps.WrapperMethods;



public class CreateLead2 extends WrapperMethods{
	@Test
	public void tesRun() throws IOException{

		launchBrowser("http://demo1.opentaps.org/","firefox");
		login("LoginOpenTaps.xlsx");
		clickButtonByXpath("//*[@id='button']/a");
		clickByLinkText("Create Lead");
		String createLead[][]=readInput("CreateLead.xls");
		//System.out.println(createLead[1][0]);
		enterTextById(createLead[0][0],"createLeadForm_companyName");
		enterTextById(createLead[0][1],"createLeadForm_firstName");
		enterTextById(createLead[0][2],"createLeadForm_lastName");
		String indexSource=createLead[0][3];
		selectValueByIndexUsingID(Integer.parseInt(indexSource),"createLeadForm_dataSourceId");
		String indexMarketing=createLead[0][4];
		selectValueByIndexUsingID(Integer.parseInt(indexMarketing),"createLeadForm_marketingCampaignId");
		clickButtonByClassname("smallSubmit");
		String value = getTextById("viewLead_companyName_sp");
		System.out.println(value);
		//getValueByXpath("//*[@id='viewLead_companyName_sp']");
		System.out.println(value.substring(5,10));



	}



}
