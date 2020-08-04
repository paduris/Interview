Spring: 
* The spring framework provides multiple features that make the development of applications easier and faster.
* Dependency Injection & Inversion of Control 
    *  DI, the responsibility of creating objects is shifted from our application code to the Spring container
    * QUICK EXAMPLE:Inversion of Control is about getting freedom, more flexibility, and less dependency. 
    When you are using a desktop computer, you are slaved (or say, controlled).
    You have to sit before a screen and look at it. Using keyboard to type and using mouse to navigate.
    And a bad written software can slave you even more. If you replaced your desktop with a laptop, 
    then you somewhat inverted control. 
    You can easily take it and move around. So now you can control where you are with your computer, 
    instead of computer controlling it.
    
    
*Component scan
        When working with Spring, we can annotate our classes in order to make them into Spring beans. But, besides that, 
        we can tell Spring where to search for these annotated classes as not all of them must become beans in this particular run.
   * @ComponentScan without arguments tells Spring to scan the current package and all of its sub-packages.