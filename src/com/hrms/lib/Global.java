package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	WebDriver driver;
	//Test Data 
	public String url="http://183.82.103.245/nareshit/index.php";
	public String un="nareshit";
	public String pw="nareshit";
	public String jbt="softwere tester";
	public String jd="manual tesitng";
	public String ent_frame="rightMenu";
	
	//objects
	public String txt_loginname="txtUserName";
	public String txt_password="txtPassword";
	public String btn_login="Submit";
	public String link_logout="Logout";
	public String txt_jobtitlename="txtJobTitleName";
	public String txt_jobtitledescription="txtJobTitleDesc";
	public String btn_add="//input[@value='Add']";
	public String btn_save="//input[@value='Save'][@type='button']";
	public String btn_reset="//input[@value='Reset'][@type='button']";
	
	
	
	
	

}
