package uk.gov.hmrc.cart

import org.scalatest.{FeatureSpec, GivenWhenThen, Matchers}
import uk.gov.hmrc.products.{Apple, Orange}

/**
 * User: rgallet
 * Date: 06/10/14 21:43
 */
class BasicShoppingCartSpec extends FeatureSpec with GivenWhenThen with Matchers {
  feature("Simple shopping cart") {
    scenario("Testing adding a product") {

      Given("A shopping cart")
      val cart = new BasicShoppingCart

      When("Adding some products")
      cart.addProduct(new Orange)
      cart.addProduct(new Apple)

      Then("it should have found an apple product")
      cart.countProducts should be(2)
      cart.countProducts("apple") should be(1)
      cart.countProducts("orange") should be(1)
    }

    scenario("Testing value of basket") {

      Given("A shopping cart")
      val cart = new BasicShoppingCart

      When("Adding some products")
      cart.addProduct(new Orange)
      cart.addProduct(new Apple)
      cart.addProduct(new Apple)
      cart.addProduct(new Apple)

      Then("Price should be 2.05")
      cart.calculateTotal should be (BigDecimal(2.05))
    }

    scenario("Testing enpty cart") {

      Given("A shopping cart")
      val cart = new BasicShoppingCart

      Then("Should discard 0")
      cart.calculateTotal should be (BigDecimal(0))
    }
  }
}
