My first Spring boot Project
learned a lot about 
Spring framework ,Spring boot

POJO classes
Dependency injection
JPA
creation of 
- model(using Entity)
- Controller(request,response,get,post,put,request parameters,..etc)
- service(@Service)
- Repository(extends JpaRepository)

how to connect to sql databases and perform CRUD operations using service

Learned about
Spring container and
how it creates instances for classes

learned about how Auto-configuration of dependencies how it takes place.
by using @Autowired and @Component usages
How this helps in making the code look good and easier for maintanable
and easy for testing individual components.

@Component - makes the class as singleton class 
@Scope("prototype") - makes the class prototype this way we can create multiple instances of class.

We can get instance of class by using beans(loose coupling) by using (ApplicationContext context);
instead of using tight coupling by using new keyword for get instance

example:
@Autowired
private ApplicationContext context;

public void someMethod() {
    MyClass myClassBean = context.getBean(MyClass.class);
}




