
REST is really an architectural style used when designing an API on a server. HttpServlets can be a method of implementing a RESTful web service.
REST describes a style where HTTP verbs like GET/POST/DELETE/etc. are used in a predictable way to interact with resources on a server.


Resources are physical things
Representation of resources 
whole web is a bunch of resources 
uniform resource locator 

Representational State:
Request: verb + URL
Response: representation of resource 
we don't get HTML as a response





My 5 cents here :) As for me - Servlets are just an abstraction over HTTP protocol. It supports GET/PUT and so on because the Http Protocol defines these methods.

Restful web service on the other hand is an abstract notion that talks about the ideology of operation the resource, rather than particular implementation. 
Its true that its very convenient to think about rest functionality in a context of HTTP protocol, but try to think about them as they're entirely different beasts. 
Restful web service is not something Java specific.

Technically if you're talking about Java, restful web service can be implemented with vanilla servlets, 
or one can use tools like Apache Wink or Jersey that define a convenient way of implementing rest services, but these are after all just tools. 
BTW, Jersey (as I know, I don't know about others) is implemented on top of servlets.