package loc_val;

public class SignInSignup {

	// all the locators --- xpath, id, css, name, custom xapth ect
	
	public String signInLinkLoc 		= "//*[@id='current_account']"; // xpath
	public String emailLoc 				= "#username"; // css selector
	public String nextButtonLoc			= "//*[@id='root']/div/div[2]/div/div[1]/div[2]/div/div/div/form/div[3]/button";
	public String passwordLoc			= "//*[@id='password']";
	public String signInButtonLoc		= "//*[@id='root']/div/div[2]/div/div[1]/div[2]/div/div/div/form/button";
	public String myActualFullNameLoc	= "//*[@id='profile-menu-trigger--content']";
    public String inlinelocator         ="//*[@id=\"password-error\"]";
	
    // all the values -- test data, name, email, password
	public String emailValue 			= "taltekc@gmail.com";
	public String passValue				= "Te$t1234";
    public String wrongpass             ="test123";

}
