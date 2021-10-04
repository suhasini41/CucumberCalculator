package calculator;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Step_Defenition 
{
	int x, y,sum,diff,product,quotient;
	@Given("I have two numbers")
	public void i_have_two_numbers() {
	    x = 10;
	    y = 5;
	    
	}

	@When("I add them")
	public void i_add_them() {
		
		sum = x + y;
	}

	@Then("I should get their sum correct")
	public void i_should_get_their_sum_correct() {
		Assert.assertEquals(sum, 15);

	}

	@Then("display their sum")
	public void display_their_sum() {
	   System.out.println("The sum is :"+sum);
	}

	@When("I subtract them")
	public void i_subtract_them() {
	    diff = x - y;
	}

	@Then("I should get their diffrence correct")
	public void i_should_get_their_diffrence_correct() {
	    Assert.assertEquals(diff, 5);
	}

	@Then("display their differnce")
	public void display_their_differnce() {
	   System.out.println("The difference of the the two numbers is : "+diff);
	}

	@When("I multiply them")
	public void i_multiply_them() {
	    product = x * y;
	}

	@Then("I should get their product correct")
	public void i_should_get_their_product_correct() {
	   Assert.assertEquals(product, 50);
	}

	@Then("display their product")
	public void display_their_product() {
	    System.out.println("The product of two numbers is : "+product);
	}

	@When("I divide them")
	public void i_divide_them() {
	   quotient = x/y;
	}

	@Then("I should get the quotient correct")
	public void i_should_get_the_quotient_correct() {
	    Assert.assertEquals(quotient, 2);
	}

	@Then("display the quotient")
	public void display_the_quotient() {
	    System.out.println("The quotient when divided is : "+quotient);
	}



}
