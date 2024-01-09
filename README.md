# Builder Pattern 

## Goal 
1) Constructing complex objects by separating construction process from actual implementation.
2) Utilize a single "build" function within the "build" object, which takes care of returning the representation<br> 
 object or product class. 

## Characteristics: 
1) **Director:** Orchestrating and delegating the construction steps to a separate builder object.
2) **Builder:** Can have an interface or abstract class that defines steps for building an object, but main purpose is 
 to assemble the product.
3) **Product** Represents the complex object we want to construct. 

![](./src/main/resources/images/Builder_design_burger.png)

## Useful when: 
1) A domain object or object has a large number of parameters, and we want to provide a readable way to construct it.
2) Has potential when working with Views where a MOAO ( Mother Of All Objects) is served from backend server.
3) If you are working with Java, this design pattern is not too uncommon.  

## Drawbacks: 
1) Not really a good design pattern for Kotlin, as the language provides named parameters which can be used in a 
  constructor to the same effect. See code example and TVT out the door.


_Note to self: Don't include routing dependency_
