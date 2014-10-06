package uk.gov.hmrc.cli

import org.scalatest.{Matchers, GivenWhenThen, FeatureSpec}
import uk.gov.hmrc.stocks.SimpleStockManager

/**
 * User: rgallet
 * Date: 06/10/14 21:52
 */
class CommandLineParserSpec extends FeatureSpec with GivenWhenThen with Matchers {
  feature("CLI parsing") {
    scenario("Comma-separated list of products") {

      Given("A CSV")
      val line = "Apple, Apple, Orange, Apple"

      And("A parser")
      val manager = new SimpleStockManager
      val parser = new CommandLineParser(manager)

      Then("It should parse")
      val list = parser.parse(line)
      list.size should be(4)
      list.filter {
        _.name == "orange"
      }.size should be(1)
      list.filter {
        _.name == "apple"
      }.size should be(3)
    }
  }
}
