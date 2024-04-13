package Demo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project1 {

	public static void main(String[] args) {
		System.setProperty("webDriver.Firefox.driver","C:\\Users\\Admin\\Desktop\\selenium\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%2F%3F_encoding%3DUTF8%26_encoding%3DUTF8%26bbn%3D86460269031%26content-id%3Damzn1.sym.ae298cdb-b46d-4ed6-8ce3-442fff76b0d9%26pd_rd_r%3D4284554c-81a0-4f63-a5d5-3f44112db9b6%26pd_rd_w%3DyHvpH%26pd_rd_wg%3DH6R7G%26pf_rd_p%3Dae298cdb-b46d-4ed6-8ce3-442fff76b0d9%26pf_rd_r%3D3RWWJMWA91YYP4V9JCFD%26rh%3Dn%253A86460269031%252Cp_36%253A3444810031%26ref_%3Dnav_em_hd_re_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&ref_%3Dnav_em_hd_clc_signin_0_1_1_39");
		driver.findElement(By.id("ap_email")).sendKeys("harshada0095@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("1234567");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tedday bear");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/span/div/div/div[2]/span/a/div/img")).click();
		
	}

}
