package testScript;

public class BrowserCommands extends Base {

	public void browserCommands(){
		driver.getTitle();// to get the title
		String title = driver.getTitle();
		System.out.println(title);
		
		String Url = driver.getCurrentUrl();//to get current Url
		System.out.println(Url);
		
		String page = driver.getPageSource();//to get current page html code
		System.out.println(page);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browsercommands = new BrowserCommands();
		browsercommands.initializebrowser();
		browsercommands.browserCommands();
		//browsercommands.DriverQuitClose();
		
	}

}
