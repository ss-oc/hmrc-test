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
  }
}
