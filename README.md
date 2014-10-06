HMRC Test
=========


Compile
----

  - Install SBT
  - sbt clean
  - sbt test
  - sbt run


Expected output
--------------

```sh
[info] Set current project to hmrc-test (in build file: ~/workspace/hmrc-test-git/)
[info] Compiling 11 Scala sources to ~/workspace/hmrc-test-git/target/scala-2.11/classes...
[info] Running uk.gov.hmrc.cli.Launcher 
Enter comma-delimited list of products > Apple, Apple, Orange, Apple
Total for cart is £2.05
You should buy one more apple to enjoy a free one
You should buy two more oranges to enjoy a free one
Total for promotional cart is £1.45
[success] Total time: 56 s, completed 07-Oct-2014 00:28:30
```

