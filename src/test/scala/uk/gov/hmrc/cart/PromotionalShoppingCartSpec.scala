package uk.gov.hmrc.cart

import org.scalatest.{FeatureSpec, GivenWhenThen, Matchers}
import uk.gov.hmrc.products.{Apple, Orange}

/**
 * User: rgallet
 * Date: 06/10/14 21:43
 */
class PromotionalShoppingCartSpec extends FeatureSpec with GivenWhenThen with Matchers {
  feature("Promotional shopping cart") {
    scenario("Testing promotional offers with 3 apples") {

      Given("A shopping cart")
      val cart = new BasicShoppingCart with Offers

      When("Adding some products")
      cart.addProduct(new Apple)
      cart.addProduct(new Apple)
      cart.addProduct(new Apple)

      Then("Should discard 1")
      cart.calculateApplesToDiscard should be (1)
    }


  }
}
