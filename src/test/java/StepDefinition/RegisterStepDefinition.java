package StepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterStepDefinition {
WebDriver driver;

    @Given("^User able to open the browser$")
    public void user_able_to_open_the_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @And("^Enter the URL$")
    public void enter_the_URL() {
        driver.get("https://demo.nopcommerce.com/");
        System.out.println("Open the Browser");
    }


    @Then("^User Click on Register link$")
    public void user_Click_on_Register_link(){
   driver.findElement(By.className("ico-register")).click();
    }

    @When("^User Enter first name and last name$")
    public void user_Enter_first_name_and_last_name()  {
    driver.findElement(By.id("FirstName")).sendKeys("Tester");
    driver.findElement(By.id("LastName")).sendKeys("Tester123");
    }

    @When("^User Enter the date of birth$")
    public void user_Enter_the_date_of_birth() {
    driver.findElement(By.name("DateOfBirthDay")).sendKeys("4");
    driver.findElement(By.name("DateOfBirthMonth")).sendKeys("March");
    driver.findElement(By.name("DateOfBirthYear")).sendKeys("2000");
    }


    @When("^User Enter the email$")
    public void user_Enter_the_email()  {
    driver.findElement(By.id("Email")).sendKeys("Tester1@gmail.com");

    }


    @When("^User enter the password$")
    public void user_enter_the_password()  {
    driver.findElement(By.id("Password")).sendKeys("Password1");
    }

    @When("^User Enter the Confirm password$")
    public void user_Enter_the_Confirm_password()  {
   driver.findElement(By.id("ConfirmPassword")).sendKeys("Password1");
    }

    @When("^Click on Register$")
    public void click_on_Register() {
    driver.findElement(By.id("register-button")).click();

    }

    }

