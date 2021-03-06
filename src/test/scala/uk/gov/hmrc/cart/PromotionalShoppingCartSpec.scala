package uk.gov.hmrc.cart

import org.scalatest.{FeatureSpec, GivenWhenThen, Matchers}
import uk.gov.hmrc.products.{Apple, Orange}

/**
 * User: rgallet
 * Date: 06/10/14 21:43
 */
class PromotionalShoppingCartSpec extends FeatureSpec with GivenWhenThen with Matchers {
  feature("Promotional shopping cart - apples") {
    scenario("Testing promotional offers with 0 apple") {

      Given("A shopping cart")
      val cart = new BasicShoppingCart with Offers

      Then("Should discard 0")
      cart.calculateApplesToDiscard should be(0)
    }

    scenario("Testing promotional offers with 3 apples") {

      Given("A shopping cart")
      val cart = new BasicShoppingCart with Offers

      When("Adding some products")
      cart.addProduct(new Apple)
      cart.addProduct(new Apple)
      cart.addProduct(new Apple)

      Then("Should discard 1")
      cart.calculateApplesToDiscard should be(1)
    }

    scenario("Testing promotional offers with 4 apples") {

      Given("A shopping cart")
      val cart = new BasicShoppingCart with Offers

      When("Adding some products")
      cart.addProduct(new Apple)
      cart.addProduct(new Apple)
      cart.addProduct(new Apple)
      cart.addProduct(new Apple)

      Then("Should discard 2")
      cart.calculateApplesToDiscard should be(2)
    }
  }

  feature("Promotional shopping cart - oranges") {
    scenario("Testing promotional offers with 0 oranges") {

      Given("A shopping cart")
      val cart = new BasicShoppingCart with Offers

      Then("Should discard 0")
      cart.calculateOrangesToDiscard should be (0)
    }

    scenario("Testing promotional offers with 1 orange") {

      Given("A shopping cart")
      val cart = new BasicShoppingCart with Offers

      When("Adding some products")
      cart.addProduct(new Orange)

      Then("Should discard 0")
      cart.calculateOrangesToDiscard should be (0)
    }

    scenario("Testing promotional offers with 2 oranges") {

      Given("A shopping cart")
      val cart = new BasicShoppingCart with Offers

      When("Adding some products")
      cart.addProduct(new Orange)
      cart.addProduct(new Orange)

      Then("Should discard 0")
      cart.calculateOrangesToDiscard should be (0)
    }

    scenario("Testing promotional offers with 3 oranges") {

      Given("A shopping cart")
      val cart = new BasicShoppingCart with Offers

      When("Adding some products")
      cart.addProduct(new Orange)
      cart.addProduct(new Orange)
      cart.addProduct(new Orange)

      Then("Should discard 01")
      cart.calculateOrangesToDiscard should be (1)
    }

    scenario("Testing promotional offers with 4 oranges") {

      Given("A shopping cart")
      val cart = new BasicShoppingCart with Offers

      When("Adding some products")
      cart.addProduct(new Orange)
      cart.addProduct(new Orange)
      cart.addProduct(new Orange)
      cart.addProduct(new Orange)

      Then("Should discard 1")
      cart.calculateOrangesToDiscard should be (1)
    }

    scenario("Testing promotional offers with 5 oranges") {

      Given("A shopping cart")
      val cart = new BasicShoppingCart with Offers

      When("Adding some products")
      cart.addProduct(new Orange)
      cart.addProduct(new Orange)
      cart.addProduct(new Orange)
      cart.addProduct(new Orange)
      cart.addProduct(new Orange)

      Then("Should discard 1")
      cart.calculateOrangesToDiscard should be (1)
    }

    scenario("Testing promotional offers with 6 oranges") {

      Given("A shopping cart")
      val cart = new BasicShoppingCart with Offers

      When("Adding some products")
      cart.addProduct(new Orange)
      cart.addProduct(new Orange)
      cart.addProduct(new Orange)
      cart.addProduct(new Orange)
      cart.addProduct(new Orange)
      cart.addProduct(new Orange)

      Then("Should discard 1")
      cart.calculateOrangesToDiscard should be (2)
    }
  }

  feature("Calculating value of promotional shopping cart") {
    Given("A shopping cart")
    val cart = new BasicShoppingCart with Offers

    When("Adding some products")
    cart.addProduct(new Orange)
    cart.addProduct(new Orange)
    cart.addProduct(new Orange)
    cart.addProduct(new Orange)
    cart.addProduct(new Orange)
    cart.addProduct(new Orange)

    cart.addProduct(new Apple)
    cart.addProduct(new Apple)
    cart.addProduct(new Apple)
    cart.addProduct(new Apple)

    Then("Should discard 1")
    cart.calculateTotal should be (BigDecimal(2.20))

  }
}
