package StepDefinition;

import Utilities.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tree extends BaseClass {

	@When("User clicks Get Started button on Tree Module")
	public void user_clicks_get_started_button_on_tree_module() throws InterruptedException {
		
     tr.clickgetstartontree();
	}

	@Then("User redirects to Tree Page")
	public void user_redirects_to_tree_page() {

	}

	@Then("User clicks Overview of Trees link")
	public void user_clicks_overview_of_trees_link() throws InterruptedException {
      tr.clickoverview();
	}

	@Then("User redirects to Overview of Trees Page")
	public void user_redirects_to_overview_of_trees_page() {

	}
	@Then("User clicks Terminologies link")
	public void user_clicks_terminologies_link() throws InterruptedException {
      tr.clickterm();
	}

	@Then("User redirects to Terminologies Page")
	public void user_redirects_to_terminologies_page() {

	}	
	@Then("User clicks Types of tree link")
	public void user_clicks_types_of_tree_link() throws InterruptedException {
       tr.clicktree();
	}

	@Then("User redirects to Types of tree Page")
	public void user_redirects_to_types_of_tree_page() {

	}	
	
	@Then("User clicks Tree Traversals link")
	public void user_clicks_tree_traversals_link() throws InterruptedException {
       tr.clickttraverse();
	}

	@Then("User redirects to Tree Traversals Page")
	public void user_redirects_to_tree_traversals_page() {

	}

	@Then("User clicks Traversals-Illustration link")
	public void user_clicks_traversals_illustration_link() throws InterruptedException {
       tr.clicktraverse();
	}

	@Then("User redirects to Traversals-Illustration Page")
	public void user_redirects_to_traversals_illustration_page() {

	}

	@Then("User clicks Binary Trees link")
	public void user_clicks_binary_trees_link() throws InterruptedException {
       tr.clickbinary();
	}

	@Then("User redirects to Binary Trees Page")
	public void user_redirects_to_binary_trees_page() {

	}

	@Then("User clicks Types of Binary Trees link")
	public void user_clicks_types_of_binary_trees_link() throws InterruptedException {
       tr.clickbinarytypes();
	}

	@Then("User redirects to Types of Binary Trees Page")
	public void user_redirects_to_types_of_binary_trees_page() {

	}

	@Then("User clicks Implementation in Python link")
	public void user_clicks_implementation_in_python_link() throws InterruptedException {
        tr.clickpyhon();
	}

	@Then("User redirects to Implementation in Python Page")
	public void user_redirects_to_implementation_in_python_page() {

	}

	@Then("User clicks Binary Tree Traversals link")
	public void user_clicks_binary_tree_traversals_link() throws InterruptedException {
       tr.clickbinarytraverse();
	}

	@Then("User redirects to Binary Tree Traversals Page")
	public void user_redirects_to_binary_tree_traversals_page() {

	}

	@Then("User clicks Implementation of Binary Trees link")
	public void user_clicks_implementation_of_binary_trees_link() throws InterruptedException {
       tr.clickimpbinary();
	}

	@Then("User redirects to Implementation of Binary Trees Page")
	public void user_redirects_to_implementation_of_binary_trees_page() {

	}

	@Then("User clicks Applications of Binary trees link")
	public void user_clicks_applications_of_binary_trees_link() throws InterruptedException {
       tr.clickappbinary();
	}

	@Then("User redirects to Applications of Binary trees Page")
	public void user_redirects_to_applications_of_binary_trees_page() {

	}

	@Then("User clicks Binary Search Trees link")
	public void user_clicks_binary_search_trees_link() throws InterruptedException {
       tr.clickbinarysearch();
	}

	@Then("User redirects to Binary Search Trees Page")
	public void user_redirects_to_binary_search_trees_page() {

	}

	@Then("User clicks Implementation Of BST link")
	public void user_clicks_implementation_of_bst_link() throws InterruptedException {
       tr.clickbst();
	}

	@Then("User redirects to Implementation Of BST Page")
	public void user_redirects_to_implementation_of_bst_page() {

	}

	
}
