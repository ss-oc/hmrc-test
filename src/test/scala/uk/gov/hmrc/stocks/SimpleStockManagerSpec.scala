package uk.gov.hmrc.stocks

import org.scalatest.{Matchers, GivenWhenThen, FeatureSpec}

/**
 * User: rgallet
 * Date: 06/10/14 21:26
 */
class SimpleStockManagerSpec extends FeatureSpec with GivenWhenThen with Matchers {
  feature("Simple stock manager") {
    scenario("Testing apple is available") {

      Given("a simple stock manager")
      val manager = new SimpleStockManager

      When("testing for apple")
      val exists = manager.isProductAvailable("apple")

      Then("it should have found an apple product")
      exists shouldBe true
    }

    scenario("Testing AppLE is available") {

      Given("a simple stock manager")
      val manager = new SimpleStockManager

      When("testing for apple")
      val exists = manager.isProductAvailable("AppLE")

      Then("it should have found an apple product")
      exists shouldBe true
    }

    scenario("Testing OranGe is available") {

      Given("a simple stock manager")
      val manager = new SimpleStockManager

      When("testing for OranGe")
      val exists = manager.isProductAvailable("OranGe")

      Then("it should have found an orange product")
      exists shouldBe true
    }
  }

  scenario("Testing random product") {

    Given("a simple stock manager")
    val manager = new SimpleStockManager

    When("testing for random")
    val exists = manager.isProductAvailable("me here right now")

    Then("it should not have found any product")
    exists shouldBe false
  }

  scenario("Testing getting an apple product") {

    Given("a simple stock manager")
    val manager = new SimpleStockManager

    When("testing for apple")
    val apple = manager.getProduct("apple")

    Then("Should be apple")
    apple.name shouldBe "apple"
    apple.price should equal(0.6)
  }

  scenario("Testing getting an orange product") {

    Given("a simple stock manager")
    val manager = new SimpleStockManager

    When("testing for orange")
    val orange = manager.getProduct("orange")

    Then("Should be orange")
    orange.name shouldBe "orange"
    orange.price should equal(0.25)
  }

  scenario("Testing getting a non-existent product") {

    Given("a simple stock manager")
    val manager = new SimpleStockManager

    When("testing for random")
    val e = intercept[ProductNotFoundException] {
      manager.getProduct("does not exist")
    }

    Then("Name should be apple")
    e shouldBe an[ProductNotFoundException]
  }
}
