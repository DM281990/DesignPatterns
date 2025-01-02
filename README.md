The design pattern is a reusable solution to a common problem that occurs in software design.

There are many different types of design patterns, each addressing a specific problem or set of problems.

As shown in the image below, some common types of design patterns include creational patterns, which deal with object creation; structural patterns, which focus on object composition and organization; and behavioral patterns, which deal with the communication between objects and classes.


In the article, code examples related to the creational design patterns commonly used in Java will also be shared.

Creational Design Patterns

Creational design patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.

Their main function is to provide a very specific solution in the best possible manner. They can be further divided into the below categories.

Singleton
Singleton is a creational design pattern that lets you ensure that a class has only one instance while providing a global access point to this instance.


https://refactoring.guru/design-patterns/singleton
Singleton works on the concept of one and only one instance of the object, which results in the global control of a resource. In simple words, the Singleton design pattern ensures that only one instance of the class will be created and that instance will have global access within the application.

public class SingletonClass {

    private static SingletonClass instance;

    private SingletonClass() {
        // private constructor to prevent instantiation from outside
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}
As you can see below controller class and when we send a request via Postman result will be one and the same instance.

@RestController
@RequestMapping("/api")
public class SingletonController  {

    private SingletonClass singletonClass;

    public SingletonController(SingletonClass singletonClass) {
        this.singletonClass = singletonClass;
    }

    @GetMapping("/singleton")
    public String getSingleton() {
        return "This is a singleton instance: " + singletonClass.toString();
    }

}

When you want to ensure that only one instance of a class exists, for example, a single database object shared by different parts of the program, you should use the Singleton design pattern.

2. Factory

The Factory Method is a creational design pattern that provides a solution to create product objects without the need to specify their concrete classes during the creation process.


https://refactoring.guru/design-patterns/factory-method
Here is the code sample in Java,

PaymentProcessor is an interface that defines the contract for processing payments.

public interface PaymentProcessor {

    void processPayment();
}
CreditCardPaymentProcessor and PaypalPaymentProcessor are concrete classes that implement the PaymentProcessor interface. These classes provide an implementation for the processPayment() method specific to CreditCard and PayPal payments.

@Service
public class CreditCardPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment() {
        // Credit card payment transactions
    }
}

@Service
public class PaypalPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment() {
        // Paypal card payment transactions
    }
}
PaymentProcessorFactory is a factory class that implements the Factory Design Pattern. The class is responsible for creating instances of different PaymentProcessor implementations based on the given payment method.

@Component
public class PaymentProcessorFactory {

    private final CreditCardPaymentProcessor creditCardPaymentProcessor;
    private final PaypalPaymentProcessor paypalPaymentProcessor;


    public PaymentProcessorFactory(CreditCardPaymentProcessor creditCardPaymentProcessor,
                                   PaypalPaymentProcessor paypalPaymentProcessor) {
        this.creditCardPaymentProcessor = creditCardPaymentProcessor;
        this.paypalPaymentProcessor = paypalPaymentProcessor;
    }

    public PaymentProcessor createPaymentProcessor(String paymentMethod) {
        if (paymentMethod.equalsIgnoreCase("creditcard")) {
           return creditCardPaymentProcessor;
        } else if (paymentMethod.equalsIgnoreCase("paypal")) {
            return paypalPaymentProcessor;
        }
        throw new IllegalArgumentException("Invalid payment method: " + paymentMethod);
    }
}
The entry point handles requests to /processPayment/{paymentMethod} and uses PaymentProcessorFactory to create the appropriate payment processor based on the provided paymentMethod. This simplifies the code and enables easy addition of new payment processors.


The Factory Method is used to conserve system resources by reusing existing objects instead of reconstructing them repeatedly.

3. Abstract Factory

Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.


https://refactoring.guru/design-patterns/abstract-factory
Here is the code sample in Java,

//Factory Classes
public interface ProductFactory {
    Product createProduct();
}

public class ProductAFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}

public class ProductBFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
//Product Classes
public interface Product {

    String getName();
}

public class ProductA implements Product {

    @Override
    public String getName() {
        return "Product A";
    }
}

public class ProductB implements Product {

    @Override
    public String getName() {
        return "Product B";
    }
}

// Create Product A using ProductAFactory
ProductFactory productAFactory = new ProductAFactory();
Product productA = productAFactory.createProduct();
System.out.println("Product A: " + productA.getName());

// Create Product B using ProductBFactory
ProductFactory productBFactory = new ProductBFactory();
Product productB = productBFactory.createProduct();
System.out.println("Product B: " + productB.getName());
The Abstract Factory pattern is helpful when your code needs to deal with different groups of related items, but you want to avoid depending on the specific types of those items. These types might not be known in advance or you might want to keep room for adding more types in the future.

4. Builder

Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.


https://refactoring.guru/design-patterns/builder
Here is the code sample in Java,

@Builder
@Getter
@Setter
public class Beer {

    //required
    private String name;
    private double drinkSize;
    private double alcoholPercentage;
    private double price;

    // Other attributes
    private String brewery;            // The brewery that produces the beer.
    private String countryOfOrigin;    // The country where the beer is originally from.
    private String description;        // A brief description of the beer's characteristics.
    private String packaging;          // The packaging type (bottle, can, draft, etc.).
    private String servingTemperature; // The recommended serving temperature.
    private String foodPairing;        // Foods that pair well with this beer.

}
@RestController
@RequestMapping("/api/beers")
public class BeerController {

    @GetMapping("/basic")
    public String createStandardBeer() {
        Beer beer = Beer.builder()
                .name("Standard Beer")
                .drinkSize(500)
                .alcoholPercentage(5.0)
                .price(5.99)
                .build();

        return "Created beer: " + beer.getName() + 
                ", Drink Size: " + beer.getDrinkSize() +
                ", Alcohol Percentage: " + beer.getAlcoholPercentage() +
                ", Price: " + beer.getPrice();
    }

    @GetMapping("/premium")
    public String createPremiumBeer() {
        Beer beer = Beer.builder()
                .name("Sample Beer")
                .drinkSize(330)
                .alcoholPercentage(5.0)
                .price(10.99)
                .brewery("Crafty Brews")
                .countryOfOrigin("United States")
                .description("A refreshing lager with a smooth taste.")
                .packaging("Bottle")
                .servingTemperature("4-6°C")
                .foodPairing("Pairs well with grilled chicken and salads.")
                .build();

        return "Created beer: " + beer.getName() + 
                ", Drink Size: " + beer.getDrinkSize() +
                ", Alcohol Percentage: " + beer.getAlcoholPercentage() +
                ", Price: " + beer.getPrice() +
                ", Brewery: " + beer.getBrewery() +
                ", Country of Origin: " + beer.getCountryOfOrigin() +
                ", Description: " + beer.getDescription() +
                ", Packaging: " + beer.getPackaging() +
                ", Serving Temperature: " + beer.getServingTemperature() +
                ", Food Pairing: " + beer.getFoodPairing();
    }

}


Advantages

Reduces the number of parameters in the constructor and provides readable method calls.
Allows object instantiation in a complete state.
Simplifies the building process of immutable objects.
Disadvantages

It increases the number of lines of code but offers design flexibility and improved code readability.
Requires creating separate ConcreteBuilder classes for each product type.
5. Prototype

Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.


https://refactoring.guru/design-patterns/prototype
Here is the code sample in Java,

designpatterns
└── creational
    └── prototype
        ├── controller
        │   └── TreeController.java
        ├── model
        │   ├── Tree.java
        │   ├── PlasticTree.java
        │   └── PineTree.java
        └── PrototypeDemoApplication.java
//Abstract Class
@Getter
@Setter
public abstract class Tree implements Cloneable {
    private String type;

    public abstract void copy();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

//Concrete Class-1 Pine Tree
public class PineTree extends Tree {

    public PineTree() {
        setType("Pine Tree");
    }

    @Override
    public void copy() {
        //implementation
    }
}

//Concrete Class-2 Plastic Tree
  public PlasticTree() {
        setType("Plastic Tree");
    }

    @Override
    public void copy() {
        //implementation
    }
@RestController
@RequestMapping("/api/trees")
public class TreeController {

    @GetMapping("/plastic")
    public String createPlasticTree() {
        Tree plasticTree = new PlasticTree();
        return "Created: " + plasticTree.getType();
    }

    @GetMapping("/pine")
    public String createPineTree() {
        Tree pineTree = new PineTree();
        return "Created: " + pineTree.getType();
    }
}


The Prototype pattern can be useful when the new object we need to create exhibits only minor differences from an existing one. So, instead of making completely new objects each time, we can set up examples with the right settings in advance, and then copy them when we need more.

