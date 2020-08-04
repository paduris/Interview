* Serialization example using java
* Pass by value vs pass by reference
    * When you pass an object variable into a method, you must keep in mind that you're
      passing the object reference, and not the actual object itself. Remember that a
      reference variable holds bits that represent (to the underlying VM) a way to get to a
      specific object in memory (on the heap). More importantly, you must remember that
      you aren't even passing the actual reference variable, but rather a copy of the
      reference variable. A copy of a variable means you get a copy of the bits in that
      variable, so when you pass a reference variable, you're passing a copy of the bits
      representing how to get to a specific object. In other words, both the caller and the
      called method will now have identical copies of the reference; thus, both will refer
      to the same exact (not a copy) object on the heap.
* Reason of using static ( variables or methods)
    * Variables and methods marked static belong to the class, rather
      than to any particular instance.
* Volatile variables
* Encapsulation : helps hide implementation behind an interface 
    * encapsulated code has two features
        * Instance variables are kept protected
        * Getter and Setter methods provide access to instance variables
        
        
* enum -> Enumerations serve the purpose of representing a group of named constants 
* inheritance - is a relationship
* interface - has a relationship
* Polymorphism : means many forms  
* Override  
  * object type decides - Object type (in other words, the type of the actual instance on the
                                 heap) determines which method
                                 is selected. Happens at runtime.
                                 
  * overload  
   * reference type decides - Reference type determines which overloaded version  (based on declared argument types) is selected. 
     Happens at compile time. The actual method that's invoked is still a virtual method invocation that happens at runtime, 
     but the compiler will already know the signature of the method to be invoked. So at runtime, the argument match will
     already have been nailed down, just not the class in which the method lives. 
     
**String**
* An immutable object is an object whose internal state remains constant after it has been entirely created. 
  This means that once the object has been assigned to a variable, we can neither update the reference nor 
  mutate the internal state by any means.
* One of the key goals of any good programming language is to make efficient use of
  memory. As an application grows, it's very common for string literals to occupy large
  amounts of a program's memory, and there is often a lot of redundancy within the
  universe of String literals for a program. To make Java more memory efficient, the
  JVM sets aside a special area of memory called the String constant pool.
  
* The key benefits of keeping this class as immutable are caching, security, synchronization, and performance.


A Monitor is an object designed to be accessed from multiple threads. 
The member functions or methods of a monitor object will enforce mutual exclusion, so only one thread may be performing any action on the object at a given time.
If one thread is currently executing a member function of the object then any other thread that tries to call a member function of that object will have to wait until the first has finished.

A Semaphore is a lower-level object. You might well use a semaphore to implement a monitor. A semaphore essentially is just a counter.
When the counter is positive, if a thread tries to acquire the semaphore then it is allowed, and the counter is decremented. 
When a thread is done then it releases the semaphore, and increments the counter.
If the counter is already zero when a thread tries to acquire the semaphore then it has to wait until another thread releases the semaphore. 
If multiple threads are waiting when a thread releases a semaphore then one of them gets it. The thread that releases a semaphore need not be the same thread that acquired it.

A monitor is like a public toilet. Only one person can enter at a time. They lock the door to prevent anyone else coming in, do their stuff, and then unlock it when they leave.
A semaphore is like a bike hire place. They have a certain number of bikes. 
If you try and hire a bike and they have one free then you can take it, otherwise you must wait. When someone returns their bike then someone else can take it. 
If you have a bike then you can give it to someone else to return --- the bike hire place doesn't care who returns it, as long as they get their bike back.