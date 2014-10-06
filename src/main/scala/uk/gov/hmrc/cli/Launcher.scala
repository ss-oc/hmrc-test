package uk.gov.hmrc.cli

import uk.gov.hmrc.stocks.ProductNotFoundException

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

    val commandLine = c.readLine("Enter comma-delimited list of products > ")

    try {
      println(commandLine)

    } catch {
      case e: ProductNotFoundException => println(s"Product $commandLine not found. Try again...")
      case e: Exception => println(e.getMessage())
    }
  }
}
