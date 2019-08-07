**JAVA Topics**
 * **JDK** - Java Development Kit
 * **JRE** - Java Runtime environment
 * **JIT** - Just in time compiler

**Java Memory Management**
   * Young Generation
   * finalize method: called only once per object.
     * -Xmsvalue  - min
     * -Xmxvalue = max - default 256
     * XX:PermSize - > 64 MB
     * XX:MaxPermSize - > 64 MB
    
**Access Modifiers:**
 * **default** : same package
 * **protected**: same package + parent
 * **private** :
 * **public** : accessible to all    
 
 
**Interface : ** It is a contract - what a class can do with out saying anything about how the class will do it.

**Encapsulation:**  
   * Flexibility & Maintainability -> The ability to make changes in your implementation code without breaking the
     code of others who use your code is a key benefit of encapsulation. You want to hide implementation details 
     behind a public programming interface.