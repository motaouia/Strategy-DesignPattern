##########@@@@@@@@@============Strategy Design Pattern in Java============@@@@@@@@@##########


"journaldev.com/1754/strategy-design-pattern-in-java-example-tutorial"


==>Strategy design pattern :  is one of the --Behavioral design pattern--. Strategy pattern is used:  when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime.

(We define multiple algorithms and let client application pass the algorithm to be used as a parameter.)

==>Our Example :  we will try to implement a simple "Shopping Cart" where we have __two payment strategies__ – using *Credit Card or using *PayPal.

===>Payment method in an e-commerce app: 


In this example, the Strategy pattern is used to implement the various payment methods in an e-commerce application. After selecting a product to purchase, a customer picks a payment method: either Paypal or credit card.

Concrete strategies not only perform the actual payment but also alter the behavior of the checkout form, providing appropriate fields to record payment details.

I--Create the interface for our strategy pattern :  PaymentStrategy.java

====================================>Second Exmaple : <====================================

"https://howtodoinjava.com/design-patterns/behavioral/strategy-design-pattern/"



**Strategy design pattern:  is --behavioral design pattern-- where we choose a specific implementation of algorithm or task in run time – out of multiple other implementations for same task.

**Driven by Open/closed Principle
This pattern is based on Open/closed principle. We don’t need to modify the context [closed for modification], but can choose and add any implementation [open for extension].



For example, in Collections.sort() – we don’t need to change the sort method to achieve different sorting results. We can just supply different comparators in runtime.


===>Problem Statement:


Let’s solve a design problem to understand strategy pattern in more detail.



I want to design a social media application which allows me to connect to my friends on all four social platforms i.e. Facebook, Google Plus, Twitter and Orkut (for example sake). Now I want that client should be able to tell the name of friend and desired platform – then my application should connect to him transparently.



More importantly, if I want to add more social platforms into application then application code should accommodate it without breaking the design.



===>Solution with strategy design pattern



In above problem, we have an operation which can be done in multiple ways (connect to friend) and user can choose desired way on runtime. So it’s good candidate for strategy design pattern.



To implement the solution, let’s design one participant one at a time.



--ISocialMediaStrategy – The interface which abstract the operation.

--SocialMediaContext – The context which determines the implementation.

--Implementations – Various implementations of ISocialMediaStrategy. E.g. FacebookStrategy, GooglePlusStrategy, TwitterStrategy and OrkutStrategy.





