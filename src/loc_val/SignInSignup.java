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
	public String register_link_loc     ="current_account_create";//id
    public String reg_email_loc         ="//*[@id=\"login_name_register\"]";
	public String get_started_loc       ="//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div/div/div/form/button";
	public String create_password_loc   ="//*[@id=\"password\"]";
	public String confirm_pass_loc      ="//*[@id=\"confirmed_password\"]";
	public String create_acc_loc        ="//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div/div/div/form/button/span";
	public String my_actual_loc         ="//*[@id=\"wl252-modal-name\"]/div/h1";
	// all the values -- test data, name, email, password
	public String emailValue 			= "taltekc@gmail.com";
	public String passValue				= "Te$t1234";
    public String wrongpass             ="test123";
    public String email_value           ="abdul.amayra03@gmail.com";
    public String pass_value            ="keya1234@";


}
