package PageObjects;

import org.openqa.selenium.By;

import Utilities.BaseClass;

public class TreePage extends BaseClass {

	By getstarted = By.xpath("//a[@href='tree']");
	By overview = By.linkText("Overview of Trees");
	By terminology = By.linkText("Terminologies");
	By typesoftress = By.linkText("Types of Trees");
	By treetraversal = By.linkText("Tree Traversals");
	By traverseill = By.linkText("Traversals-Illustration");
	By binarytree = By.linkText("Binary Trees");
	By typesofbinary = By.linkText("Types of Binary Trees");
	By implepython = By.linkText("Implementation in Python");
	By binarytraversal = By.linkText("Binary Tree Traversals");
	By implebinary = By.linkText("Implementation of Binary Trees");
	By appbinary = By.linkText("Applications of Binary trees");
	By binarysearch = By.linkText("Binary Search Trees");
	By implebst = By.linkText("Implementation Of BST");	
	
	public void clickgetstartontree() throws InterruptedException {
		driver.findElement(getstarted).click();
		Thread.sleep(2000);
	}
	
	public void clickoverview() throws InterruptedException {
		driver.findElement(overview).click();
		Thread.sleep(2000);
	}

	public void clickterm() throws InterruptedException {
		driver.findElement(terminology).click();
		Thread.sleep(2000);
	}

	public void clicktree() throws InterruptedException {
		driver.findElement(typesoftress).click();
		Thread.sleep(2000);
	}
	public void clickttraverse() throws InterruptedException {
		driver.findElement(treetraversal).click();
		Thread.sleep(2000);
	}
	public void clicktraverse() throws InterruptedException {
		driver.findElement(traverseill).click();
		Thread.sleep(2000);
	}
	public void clickbinary() throws InterruptedException {
		driver.findElement(binarytree).click();
		Thread.sleep(2000);
	}
	public void clickbinarytypes() throws InterruptedException {
		driver.findElement(typesofbinary).click();
		Thread.sleep(2000);
	}
	
	public void clickpyhon() throws InterruptedException {
		driver.findElement(implepython).click();
		Thread.sleep(2000);
	}
	public void clickbinarytraverse() throws InterruptedException {
		driver.findElement(binarytraversal).click();
		Thread.sleep(2000);
	}
	public void clickimpbinary() throws InterruptedException {
		driver.findElement(implebinary).click();
		Thread.sleep(2000);
	}
	public void clickappbinary() throws InterruptedException {
		driver.findElement(appbinary).click();
		Thread.sleep(2000);
	}
	public void clickbinarysearch() throws InterruptedException {
		driver.findElement(binarysearch).click();
		Thread.sleep(2000);
	}
	public void clickbst() throws InterruptedException {
		driver.findElement(implebst).click();
		Thread.sleep(2000);
	}

}
