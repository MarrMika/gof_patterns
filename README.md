# gof-patterns
##### RESOURCES:
   * https://www.baeldung.com/
   * https://www.geeksforgeeks.org/
   * https://www.tutorialspoint.com/

## Behavioural
### Chain of Responsibility
######(Use the Chain of Responsibility Pattern when you want to give more than one object a chance to handle a request)
##### WHEN TO USE:
   1. When you want to decouple a request’s sender and receiver
   2. Multiple objects, determined at runtime, are candidates to handle a request
   3. When you don’t want to specify handlers explicitly in your code
   4. When you want to issue a request to one of several objects without specifying the receiver explicitly.
##### USAGE:
   1. Commonly used in Windows systems to handle events like mouse clicks and keyboard events.
##### ADVANTAGES:
   1. Decouples the sender of the request and its receivers.
   2. Simplifies your object as it doesn’t have to know about the chain structure and keep direct references to its members.
   3. Allows you to add or remove responsibilities dynamically by changing the members or order of the chain.
##### DRAWBACKS:
   1. Mostly, it can get broken easily:
        * if a processor fails to call the next processor, the command gets dropped
        * if a processor calls the wrong processor, it can lead to a cycle
   2. It can create deep stack traces, which can affect performance
   3. It can lead to duplicate code across processors, increasing maintenance
   4. Execution of the request isn’t guaranteed; it may fall off the end of the
   chain if no object handles it (this can be an advantage or a disadvantage),
   5. Can be hard to observe the runtime characteristics and debug.
   * `Note: there is not much discussion about the disadvantage of COR. Whenever we can use it, use it.`