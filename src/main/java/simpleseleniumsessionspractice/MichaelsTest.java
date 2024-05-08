package simpleseleniumsessionspractice;

public class MichaelsTest {

	public static void main(String[] args) {
		
		String browserName = "chrome";
		
		UniBrowserUtil4 brUtil = new UniBrowserUtil4();
		brUtil.LaunchBrowser(browserName);
		
		brUtil.UniLaunchURL("https://www.michaels.com/");
		String actTitle=brUtil.getPageTitle();
		
		if(actTitle.contains("Michaels")) {
			System.out.println("title-passed");
		}else {
			System.out.println("title-failed");
		}
        brUtil.closeBrowser();
	}

}
