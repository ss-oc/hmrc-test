package uk.gov.hmrc.cli

import uk.gov.hmrc.cart.{Offers, BasicShoppingCart}
import uk.gov.hmrc.stocks.{SimpleStockManager, ProductNotFoundException}

/**
 * User: rgallet
 *
 * Inspired from https://github.com/grumlimited/timeline
 */
object Launcher {
  def main(args: Array[String]) = {
    val c = System.console()
    if (c == null) {
      println("No console.")
      System.exit(1)
    }

    val cart = new BasicShoppingCart
    val promotionalCart = new BasicShoppingCart with Offers
    val parser = new CommandLineParser(new SimpleStockManager)

    val commandLine = c.readLine("Enter comma-delimited list of products > ")

    try {
      val products = parser.parse(commandLine)
      products foreach { p =>
        cart.addProduct(p)
        promotionalCart.addProduct(p)
      }

      println(s"Total for cart is £${cart.calculateTotal}")
      println(s"Total for promotional cart is £${promotionalCart.calculateTotal}")
      println(commandLine)

    } catch {
      case e: ProductNotFoundException => println(s"Product $commandLine not found. Try again...")
      case e: Exception => println(e.getMessage())
    }
  }
}
