//Inheritance
//base class -> child class


/*

Types of inheritance
 single
 multilevel  box -> box_wt -> box_price
 multiple inheritance not allowed in JAVA instead use interfaces
 hierarchical inheritance  a -> b,c,d (multiple classes extend one class)
 hybrid inheritance not allowed in java (interfaces)

Polymorphism (many ways to represent)
     compile time or static
         method overloading or operator overloading(not in JAVA)
             same name diff signature
     run time or dynamic
        method overriding
         @Override this annotation
         parent obj = new child()
         here obj.method() if exists in both parent and child which one called is dependent on object type(child in this case)
         this dependence on object type and not reference variable type is called as upcasting

         How determines which function to call using dynamic method dispatch -> late binding
         final keyword can be used to prevent override to optimise compilation  -> early binding
        static methods can be inherited but cannot be overridden as they don't deal with object

encapsulation (wrapping code and protecting it) implementation level

abstraction hiding extra details and only showing important info ( abstract data type) design level

Access Modifiers
                   class    package     subclass(same pkg)    subclass(diff pkg)    world
    public           x         x                x                   x                 x
    protected        x         x                x                   x
    no modifier      x         x                x
    private          x

protected members can only be accesses by the members of subclass in the other packages


packages - user defined , inbuilt
-----------------
Inbuilt Packages
-----------------
lang - Object class root of inheritance of all classes
io
util
applet
awt
net

 */


public class Inheritance {

}

