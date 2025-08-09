```
PaymentType.java
The enum of supported methods (CREDIT_CARD, PAYPAL, BANK_TRANSFER).
Role: a stable key for selecting the right strategy.

PaymentMethod.java
Interface with pay(long amountInCents).
Role: the contract every payment strategy must implement.

CreditCardPayment.java / PaypalPayment.java / BankTransferPayment.java
One class per payment method; each implements PaymentMethod.
Role: the concrete strategies holding the actual payment logic.

PaymentRequest.java
Immutable input: holds amountInCents and PaymentType.
Role: a simple data carrier from the caller to the processor.

PaymentProcessor.java
Takes a Map<PaymentType, PaymentMethod> registry and routes the request to the right strategy.
Role: orchestrator/dispatcher; closed for modification—no changes when you add new methods.

Main.java
Wires everything: builds the registry, creates PaymentProcessor, and runs a few example payments.
Role: composition root / demo entry point.

Add a new method? Create ApplePayPayment implements PaymentMethod, add APPLE_PAY to PaymentType, register it in Main. No edits to PaymentProcessor or existing classes.
```