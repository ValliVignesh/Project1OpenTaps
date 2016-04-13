package integratedMiniProject;

import java.io.IOException;


import org.junit.Test;

import Opentaps.opentaps.WrapperMethods;



public class DeleteLeads extends WrapperMethods{

	@Test
	public void deletelead() throws IOException, InterruptedException{
		
launchBrowser("http://demo1.opentaps.org/opentaps/control/main", "chrome");
login("LoginOpenTaps.xlsx");
clickByLinkText("CRM/SFA");
clickByLinkText("Leads");
clickByLinkText("Find Leads");
clickButtonByXpath("(//*[@class='x-tab-strip-text '])[2]");
String deletelead[][]=readInput("DeleteLead.xls");
enterByName("phoneNumber", deletelead[1][0]);		
clickButtonByXpath("//button[contains(text(),'Find Leads')]");
clickByLinkText(deletelead[1][1]); 
clickByLinkText("Delete");
clickByLinkText("Find Leads");				
enterByName("id", deletelead[1][1]);
clickButtonByXpath("//button[contains(text(),'Find Leads')]");
Thread.sleep(3000);
verifyText("//div[@class='x-panel-bbar']/div/div", "No records to display");
}
}
