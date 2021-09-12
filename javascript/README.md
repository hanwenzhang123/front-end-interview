---
title: JavaScript Questions
---

## Table of Contents
- [Please explain to me the JS mechanism (how to handle the sync and async code)?](#please-explain-to-me-the-JS-mechanism-how-to-handle-the-sync-and-async-code)
- [What is the difference between function declaration and function expression?](#what-is-the-difference-between-function-declaration-and-function-expression)
- [let vs const vs var](#let-vs-const-vs-var)
- [List ES6 features you know](#list-ES6-features-you-know)
- [What is the new keyword in the JS](#what-is-the-new-keyword-in-the-JS)
- [Function prototype methods, bind vs apply vs call?](#function-prototype-methods-bind-vs-apply-vs-call)
- [What are the different data types present in javascript?](#let-vs-const-vs-var)
- [Explain Hoisting in javascript](#let-vs-const-vs-var)
- [Difference between “==” and “===” operators](#let-vs-const-vs-var)
- [Explain Implicit Type Coercion in javascript](#let-vs-const-vs-var)
- [Is javascript a statically typed or a dynamically typed language?](#let-vs-const-vs-var)
- [What is NaN property in JavaScript?](#let-vs-const-vs-var)
- [Explain passed by value and passed by reference.](#let-vs-const-vs-var)
- [What is an Immediately Invoked Function in javascript?](#let-vs-const-vs-var)
- [Explain Higher Order Functions in javascript.](#let-vs-const-vs-var)
- [Explain “this” keyword.](#let-vs-const-vs-var)
- [Explain call(), apply() and, bind() methods.](#let-vs-const-vs-var)
- [What is Currying in javascript?](#let-vs-const-vs-var)
- [Explain Closures in JavaScript.](#let-vs-const-vs-var)
- [What are object prototypes?](#let-vs-const-vs-var)
- [What are callbacks?](#let-vs-const-vs-var)
- [What is memoization?](#let-vs-const-vs-var)
- [What is recursion in a programming language?](#let-vs-const-vs-var)
- [What is the use of a constructor function in javascript?](#let-vs-const-vs-var)
- [What is DOM?](#let-vs-const-vs-var)
- [What are arrow functions?](#let-vs-const-vs-var)
- [Differences between declaring variables using var, let and const.](#let-vs-const-vs-var)
- [What is the rest parameter and spread operator?](#let-vs-const-vs-var)
- [What is the use of promises in javascript?](#let-vs-const-vs-var)
- [What are classes in javascript?](#let-vs-const-vs-var)
- [What are generator functions?](#let-vs-const-vs-var)
- [Explain WeakSet in javascript.](#let-vs-const-vs-var)
- [Explain WeakMap in javascript.](#let-vs-const-vs-var)
- [What is Object Destructuring?](#let-vs-const-vs-var)
- [What is a Temporal Dead Zone?](#let-vs-const-vs-var)
- [Explain event delegation](#explain-event-delegation)
- [Explain how `this` works in JavaScript](#explain-how-this-works-in-javascript)
- [Explain how prototypal inheritance works](#explain-how-prototypal-inheritance-works)
- [What do you think of AMD vs CommonJS?](#what-do-you-think-of-amd-vs-commonjs)
- [Explain why the following doesn't work as an IIFE: `function foo(){ }();`. What needs to be changed to properly make it an IIFE?](#explain-why-the-following-doesnt-work-as-an-iife-function-foo--what-needs-to-be-changed-to-properly-make-it-an-iife)
- [What's the difference between a variable that is: `null`, `undefined` or undeclared? How would you go about checking for any of these states?](#whats-the-difference-between-a-variable-that-is-null-undefined-or-undeclared-how-would-you-go-about-checking-for-any-of-these-states)
- [What is a closure, and how/why would you use one?](#what-is-a-closure-and-howwhy-would-you-use-one)
- [Can you describe the main difference between a `.forEach` loop and a `.map()` loop and why you would pick one versus the other?](#can-you-describe-the-main-difference-between-a-foreach-loop-and-a-map-loop-and-why-you-would-pick-one-versus-the-other)
- [What's a typical use case for anonymous functions?](#whats-a-typical-use-case-for-anonymous-functions)
- [How do you organize your code? (module pattern, classical inheritance?)](#how-do-you-organize-your-code-module-pattern-classical-inheritance)
- [What's the difference between host objects and native objects?](#whats-the-difference-between-host-objects-and-native-objects)
- [Difference between: `function Person(){}`, `var person = Person()`, and `var person = new Person()`?](#difference-between-function-person-var-person--person-and-var-person--new-person)
- [What's the difference between `.call` and `.apply`?](#whats-the-difference-between-call-and-apply)
- [Explain `Function.prototype.bind`.](#explain-functionprototypebind)
- [When would you use `document.write()`?](#when-would-you-use-documentwrite)
- [What's the difference between feature detection, feature inference, and using the UA string?](#whats-the-difference-between-feature-detection-feature-inference-and-using-the-ua-string)
- [Explain Ajax in as much detail as possible.](#explain-ajax-in-as-much-detail-as-possible)
- [What are the advantages and disadvantages of using Ajax?](#what-are-the-advantages-and-disadvantages-of-using-ajax)
- [Explain how JSONP works (and how it's not really Ajax).](#explain-how-jsonp-works-and-how-its-not-really-ajax)
- [Have you ever used JavaScript templating? If so, what libraries have you used?](#have-you-ever-used-javascript-templating-if-so-what-libraries-have-you-used)
- [Explain "hoisting".](#explain-hoisting)
- [Describe event bubbling.](#describe-event-bubbling)
- [What's the difference between an "attribute" and a "property"?](#whats-the-difference-between-an-attribute-and-a-property)
- [Why is extending built-in JavaScript objects not a good idea?](#why-is-extending-built-in-javascript-objects-not-a-good-idea)
- [Difference between document `load` event and document `DOMContentLoaded` event?](#difference-between-document-load-event-and-document-domcontentloaded-event)
- [What is the difference between `==` and `===`?](#what-is-the-difference-between--and-)
- [Explain the same-origin policy with regards to JavaScript.](#explain-the-same-origin-policy-with-regards-to-javascript)
- [Make this work: `duplicate([1,2,3,4,5]); // [1,2,3,4,5,1,2,3,4,5]`](#make-this-work)
- [Why is it called a Ternary expression, what does the word "Ternary" indicate?](#why-is-it-called-a-ternary-expression-what-does-the-word-ternary-indicate)
- [What is "use strict";? what are the advantages and disadvantages to using it?](#what-is-use-strict-what-are-the-advantages-and-disadvantages-to-using-it)
- [Create a for loop that iterates up to 100 while outputting "fizz" at multiples of 3, "buzz" at multiples of 5 and "fizzbuzz" at multiples of 3 and 5](#create-a-for-loop-that-iterates-up-to-100-while-outputting-fizz-at-multiples-of-3-buzz-at-multiples-of-5-and-fizzbuzz-at-multiples-of-3-and-5)
- [Why is it, in general, a good idea to leave the global scope of a website as-is and never touch it?](#why-is-it-in-general-a-good-idea-to-leave-the-global-scope-of-a-website-as-is-and-never-touch-it)
- [Why would you use something like the `load` event? Does this event have disadvantages? Do you know any alternatives, and why would you use those?](#why-would-you-use-something-like-the-load-event-does-this-event-have-disadvantages-do-you-know-any-alternatives-and-why-would-you-use-those)
- [Explain what a single page app is and how to make one SEO-friendly.](#explain-what-a-single-page-app-is-and-how-to-make-one-seo-friendly)
- [What is the extent of your experience with Promises and/or their polyfills?](#what-is-the-extent-of-your-experience-with-promises-andor-their-polyfills)
- [What are the pros and cons of using Promises instead of callbacks?](#what-are-the-pros-and-cons-of-using-promises-instead-of-callbacks)
- [What are some of the advantages/disadvantages of writing JavaScript code in a language that compiles to JavaScript?](#what-are-some-of-the-advantagesdisadvantages-of-writing-javascript-code-in-a-language-that-compiles-to-javascript)
- [What tools and techniques do you use debugging JavaScript code?](#what-tools-and-techniques-do-you-use-for-debugging-javascript-code)
- [What language constructions do you use for iterating over object properties and array items?](#what-language-constructions-do-you-use-for-iterating-over-object-properties-and-array-items)
- [Explain the difference between mutable and immutable objects.](#explain-the-difference-between-mutable-and-immutable-objects)
- [Explain the difference between synchronous and asynchronous functions.](#explain-the-difference-between-synchronous-and-asynchronous-functions)
- [What is event loop? What is the difference between call stack and task queue?](#what-is-event-loop-what-is-the-difference-between-call-stack-and-task-queue)
- [Explain the differences on the usage of `foo` between `function foo() {}` and `var foo = function() {}`](#explain-the-differences-on-the-usage-of-foo-between-function-foo--and-var-foo--function-)
- [What are the differences between variables created using `let`, `var` or `const`?](#what-are-the-differences-between-variables-created-using-let-var-or-const)
- [What are the differences between ES6 class and ES5 function constructors?](#what-are-the-differences-between-es6-class-and-es5-function-constructors)
- [Can you offer a use case for the new arrow => function syntax? How does this new syntax differ from other functions?](#can-you-offer-a-use-case-for-the-new-arrow--function-syntax-how-does-this-new-syntax-differ-from-other-functions)
- [What advantage is there for using the arrow syntax for a method in a constructor?](#what-advantage-is-there-for-using-the-arrow-syntax-for-a-method-in-a-constructor)
- [What is the definition of a higher-order function?](#what-is-the-definition-of-a-higher-order-function)
- [Can you give an example for destructuring an object or an array?](#can-you-give-an-example-for-destructuring-an-object-or-an-array)
- [ES6 Template Literals offer a lot of flexibility in generating strings, can you give an example?](#es6-template-literals-offer-a-lot-of-flexibility-in-generating-strings-can-you-give-an-example)
- [Can you give an example of a curry function and why this syntax offers an advantage?](#can-you-give-an-example-of-a-curry-function-and-why-this-syntax-offers-an-advantage)
- [What are the benefits of using spread syntax and how is it different from rest syntax?](#what-are-the-benefits-of-using-spread-syntax-and-how-is-it-different-from-rest-syntax)
- [How can you share code between files?](#how-can-you-share-code-between-files)
- [Why you might want to create static class members?](#why-you-might-want-to-create-static-class-members)
- [What is the difference between while and do-while loops in JavaScript?](#what-is-the-difference-between-while-and-do-while-loops-in-JavaScript)
- [What is a promise? Where and how would you use promise?](#what-is-a-promise-where-and-how-would-you-use-promise)
- [main thread vs micro vs macro in promise](#main-thread-vs-micro-vs-macro-in-promise)

## Resources
https://www.interviewbit.com/javascript-interview-questions/#javscript-data-types

## JavaScript
### Please explain to me the JS mechanism (how to handle the sync and async code)?

The event loops behind the browser handles the sync and async JavaScript code, like when JS engine that built in the browser (for chrome is V8) runs JS code, because JS is a single threaded language, the code will be read line by line, and stores the memory in the heap, and push the function call to the call stack. If it is async function code, it will be then pushed to the web api instead to wait for the condition to be met while the call stack keeps running as first in last out and garbage collects the variables that are no longer in use. Once the async code in the web api is ready to run, it will then be pushed to the message queue. When there are no functions to run in the call stack, the Event Loop will take the first event from the queue and will push it to the Call Stack (as first in first out) to run. 

[[↑] Back to top](#table-of-contents)

### What is the difference between function declaration and function expression?

The way to write both functions are different. A declared function is “saved for later use”, and will be executed later, when it is invoked (called).

Function Declarations must begin with `function` like `function sayHello() { console.log(“hi”)};`, and when you need to run the function, you run it like `sayHello()` while the function expression saves the function to a variable like `const sayHello = function() {console.log(“hi”)};`, you would also declare this function like `sayHello()`

Function declarations load before any code is executed while Function expressions load only when the interpreter reaches that line of code. Similar to the var statement, function declarations are hoisted to the top of other code. Function expressions aren’t hoisted, which allows them to retain a copy of the local variables from the scope where they were defined.

Example: Function Expression
```javascript
alert(foo()); // ERROR! foo wasn't loaded yet
var foo = function() { return 5; }
```

Example: Function Declaration
```javascript
alert(foo()); // Alerts 5. Declarations are loaded before any code can run.
function foo() { return 5; }
```

Benefits of Function Expressions
- As closures
- As arguments to other functions
- As Immediately Invoked Function Expressions (IIFE)

[[↑] Back to top](#table-of-contents)

### Let vs const vs var

Three are for variable declaration. Let and const are the concepts being introduced in ES6. When you declare a variable that is final, not changeable, then you use const, when you declare a variable that you will change its value later on, then you use let. Var is an old syntax that was introduced before ES6 to declare variables, but you need to be careful of the hoisting issue. No matter where you put your var variable, it will exist in the JS code in it global object from the beginning, just not being defined for a value until the code being read, the variable itself just has no value until the var line being read,  whereas the variable will only exist when the code gets read when the variable declared by let and const.

[[↑] Back to top](#table-of-contents)

### List ES6 features you know

- Let and const - (let const - scope to the block) (var - value hoisting - put things on the top, scope to the function)
- Arrow function - (does not have "this" within it to be referred to the current object)
- Template literals - (`..${}..`)
- Rest operator - (...rest)
- Spread operator - (...)
- Destructuring
- Default parameters 
- Promise
- Class syntax

[[↑] Back to top](#table-of-contents)

### What is the new keyword in the JS?

- It creates a new object. The type of this object is simply object.
- It sets this new object its internal, inaccessible, prototype property to be the constructor function's external, accessible, prototype object (every function object automatically has a prototype property).
- It makes the this variable point to the newly created object.
- It executes the constructor function, using the newly created object whenever this is mentioned.
It returns the newly created object, unless the constructor function returns a non-null object reference. In this case, that object reference is returned instead.

The Java new keyword is used to create an instance of the class. In other words, it instantiates a class by allocating memory for a new object and returning a reference to that memory. Like when you use class syntax to make a blueprint, whenever you use this blueprint to build something, then this new instance will be created by declaring through this new keyword

[[↑] Back to top](#table-of-contents)

### Function prototype methods, bind vs apply vs call?

- Bind returns a new function, allowing you to pass in a this array and any number of arguments.
- Call invokes the function and allows you to pass in arguments one by one.
- Apply invokes the function and allows you to pass in arguments as an array.

Call/apply call the function immediately, whereas bind returns a function that, when later executed, will have the correct context set for calling the original function. 

apply/call attaches this into function and executes the function immediately
```javascript
var person1 = {firstName: 'Jon', lastName: 'Kuperman'};
var person2 = {firstName: 'Kelly', lastName: 'King'};

function say(greeting) {
    console.log(greeting + ' ' + this.firstName + ' ' + this.lastName);
}

say.call(person1, 'Hello'); // Hello Jon Kuperman
say.call(person2, 'Hello'); // Hello Kelly King
```
```javascript
var person1 = {firstName: 'Jon', lastName: 'Kuperman'};
var person2 = {firstName: 'Kelly', lastName: 'King'};

function say(greeting) {
    console.log(greeting + ' ' + this.firstName + ' ' + this.lastName);
}

say.apply(person1, ['Hello']); // Hello Jon Kuperman
say.apply(person2, ['Hello']); // Hello Kelly King
```

bind attaches this into function and it needs to be invoked separately
```javascript
var person = {  
  name: "James Smith",
  hello: function(thing) {
    console.log(this.name + " says hello " + thing);
  }
}

person.hello("world");  // output: "James Smith says hello world"
var helloFunc = person.hello.bind({ name: "Jim Smith" });
helloFunc("world");  // output: Jim Smith says hello world"
```
```javascript
var person1 = {firstName: 'Jon', lastName: 'Kuperman'};
var person2 = {firstName: 'Kelly', lastName: 'King'};

function say() {
    console.log('Hello ' + this.firstName + ' ' + this.lastName);
}

var sayHelloJon = say.bind(person1);
var sayHelloKelly = say.bind(person2);

sayHelloJon(); // Hello Jon Kuperman
sayHelloKelly(); // Hello Kelly King
```

bind() - referring to “this” object with a new function that is specifically made for “this”; however, it is not executing the function yet while apply() and call() will execute the function right away. Apply is for array in the arguments while call just with commas. 

[[↑] Back to top](#table-of-contents)

### What are the different data types present in javascript?

To know the type of a JavaScript variable, we can use the `typeof` operator.

Primitive data types can store only a single value. To store multiple and complex values, non-primitive data types are used.

##### Primitive types
String - It represents a series of characters and is written with quotes. A string can be represented using a single or a double quote.

Number - It represents a number and can be written with or without decimals.

Boolean - It represents a logical entity and can have only two values : true or false. Booleans are generally used for conditional testing.

Undefined - When a variable is declared but not assigned, it has the value of undefined and it’s type is also undefined.

Null - It represents a non-existent or a invalid value.

Symbol - It is a new data type introduced in the ES6 version of javascript. It is used to store an anonymous and unique value.

BigInt - This data type is used to store numbers which are above the limitation of the Number data type. It can store large integers and is represented by adding “n” to an integer literal.

```js
typeof "John Doe" // Returns "string"
typeof 3.14 // Returns "number"
typeof true // Returns "boolean"
typeof 234567890123456789012345678901234567890n // Returns bigint
typeof undefined // Returns "undefined"
typeof null // Returns "object" (kind of a bug in JavaScript)
typeof Symbol('symbol') // Returns Symbol
```

##### Non-primitive types

Object - Used to store collection of data.

*Note- It is important to remember that any data type that is not primitive data type, is of Object type in javascript.

```js
// Collection of data in key-value pairs

var obj1 = {
   x:  43,
   y:  "Hello world!",
   z: function(){
      return this.x;
   }
}
      
// Collection of data as an ordered list
      
var array1 = [5, "Hello", true, 4.1];   
```

[[↑] Back to top](#table-of-contents)

### Explain Hoisting in javascript.

Hoisting is a default behaviour of javascript where all the variable and function declarations are moved on top.

This means that irrespective of where the variables and functions are declared, they are moved on top of the scope. The scope can be both local and global.

```js
//var
hoistedVariable = 3;
console.log(hoistedVariable); // outputs 3 even when the variable is declared after it is initialized	
var hoistedVariable;

//regular function
hoistedFunction();  // Outputs " Hello world! " even when the function is declared after calling

function hoistedFunction(){ 
  console.log(" Hello world! ");
}

// Hoisting takes place in the local scope as well
function doSomething(){
  x = 33;
  console.log(x);
  var x;
}
```

*Note - Variable initializations are not hoisted, only variable declarations are hoisted:
```js
var x;
console.log(x); // Outputs "undefined" since the initialization of "x" is not hoisted
x = 23;
```

*Note - To avoid hoisting, you can run javascript in strict mode by using “use strict” on top of the code:
```js
"use strict";
x = 23; // Gives an error since 'x' is not declared
var x; 
```

[[↑] Back to top](#table-of-contents)

### Difference between “==” and “===” operators.

Both are comparison operators. The difference between both the operators is that,“==” is used to compare values whereas, “ === “ is used to compare both value and types.
```js
var x = 2;
var y = "2";
(x == y)  // Returns true since the value of both x and y is the same
(x === y) // Returns false since the typeof x is "number" and typeof y is "string"
```

[[↑] Back to top](#table-of-contents)

### Explain Implicit Type Coercion in javascript.

Implicit type coercion in javascript is automatic conversion of value from one data type to another. It takes place when the operands of an expression are of different data types.

##### String Coercion
String coercion takes place while using the ‘ + ‘ operator. When a number is added to a string, the number type is always converted to the string type.

```js
var x = 3;
var y = "3";
x + y // Returns "33" 

var x = 24;
var y = "Hello";
x + y   // Returns "24Hello";

var name = "Vivek";
var surname = " Bisht";
name + surname     // Returns "Vivek Bisht"
```

*Note - Type coercion also takes place when using the ‘ - ‘ operator, but the difference while using ‘ - ‘ operator is that, a string is converted to a number and then subtraction takes place.

```js
var x = 3;
Var y = "3";
x - y    //Returns 0 since the variable y (string type) is converted to a number type
```

##### Boolean Coercion
Boolean coercion takes place when using logical operators, ternary operators, if statements and loop checks. To understand boolean coercion in if statements and operators, we need to understand truthy and falsy values.

Truthy values are those which will be converted (coerced) to true . Falsy values are those which will be converted to false .

All values except 0, 0n, -0, “”, null, undefined and NaN are truthy values.

```js
var x = 0;
var y = 23;
        
if(x) { console.log(x) }   // The code inside this block will not run since the value of x is 0(Falsy)  
        
if(y) { console.log(y) }    // The code inside this block will run since the value of y is 23 (Truthy)
```

##### Logical operators:
Logical operators in javascript, unlike operators in other programming languages, do not return true or false. They always return one of the operands.

OR ( || ) operator - If the first value is truthy, then the first value is returned. Otherwise, always the second value gets returned.

AND ( && ) operator - If both the values are truthy, always the second value is returned. If the first value is falsy then the first value is returned or if the second value is falsy then the second value is returned.

```js
var x = 220;
var y = "Hello";
var z = undefined;
        
x || y    // Returns 220 since the first value is truthy      
x || z   // Returns 220 since the first value is truthy
        
x && y    // Returns "Hello" since both the values are truthy
y && z   // Returns undefined since the second value is falsy
        
if( x && y ){ 
  console.log("Code runs" ); // This block runs because x && y returns "Hello" (Truthy)
}   
        
if( x || z ){
  console.log("Code runs");  // This block runs because x || y returns 220(Truthy)
```

[[↑] Back to top](#table-of-contents)

### Is javascript a statically typed or a dynamically typed language?

__JavaScript is a dynamically typed language.__

In a dynamically typed language, the type of a variable is checked during run-time in contrast to statically typed language, where the type of a variable is checked during compile-time.

Since javascript is a loosely(dynamically) typed language, variables in JS are not associated with any type. A variable can hold the value of any data type.
For example, a variable which is assigned a number type can be converted to a string type:

```js
var a = 23;
var a = "Hello World!";
```

[[↑] Back to top](#table-of-contents)

### What is NaN property in JavaScript?

NaN property represents “Not-a-Number” value. It indicates a value which is not a legal number.

typeof of a NaN will return a Number .

To check if a value is NaN, we use the isNaN() function,

```js
isNaN("Hello")  // Returns true
isNaN(345)   // Returns false
isNaN('1')  // Returns false, since '1' is converted to Number type which results in 0 ( a number) 
isNaN(true) // Returns false, since true converted to Number type results in 1 ( a number)
isNaN(false) // Returns false
isNaN(undefined) // Returns true
```

[[↑] Back to top](#table-of-contents)

### Explain passed by value and passed by reference.

__In JavaScript, primitive data types are passed by value and non-primitive data types are passed by reference__

##### passed by value
Assign operator dealing with primitive types:
```js
var y = 234;
var z = y;

var y = #8454; // y pointing to address of the value 234
var z = y; 
var z = #5411; // z pointing to a completely new address of the value 234
        
// Changing the value of y
y = 23;
console.log(z);  // Returns 234, since z points to a new address in the memory so changes in y will not effect z
```

Instead of just assigning the same address to another variable, the value is passed and new space of memory is created.

##### passed by reference
Assign operator dealing with non-primitive types:
```js
var obj = { name: "Vivek", surname: "Bisht" };
var obj2 = obj;

var obj = #8711;  // obj pointing to address of { name: "Vivek", surname: "Bisht" }
var obj2 = obj;   
var obj2 = #8711; // obj2 pointing to the same address 
        
// changing the value of obj1
obj1.name = "Akki";
console.log(obj2);
// Returns {name:"Akki", surname:"Bisht"} since both the variables are pointing to the same address.
```
While passing non-primitive data types, the assign operator directly passes the address (reference).
Therefore, non-primitive data types are always passed by reference.

[[↑] Back to top](#table-of-contents)

### What is an Immediately Invoked Function in javascript?

An Immediately Invoked Function ( known as IIFE and pronounced as IIFY) is a function that runs as soon as it is defined.

Syntax of IIFE :
```js
(function(){ 
  // Do something;
})();
```

While executing javascript code, whenever the compiler sees the word “function”, it assumes that we are declaring a function in the code. Therefore, if we do not use the first set of parentheses, the compiler throws an error because it thinks we are declaring a function, and by the syntax of declaring a function, a function should always have a name.

To remove this error, we add the first set of parenthesis that tells the compiler that the function is not a function declaration, instead, it’s a function expression.

Therefore to invoke the function, we use the second set of parenthesis. 

[[↑] Back to top](#table-of-contents)

### Explain Higher Order Functions in javascript.

Functions that operate on other functions, either by taking them as arguments or by returning them, are called higher-order functions.

Higher order functions are a result of functions being first-class citizens in javascript.

```js
function higherOrder(fn) {
  fn();
}
     
higherOrder(function() { console.log("Hello world") }); 

function higherOrder2() {
  return function() {
    return "Do something";
  }
}
        
var x = higherOrder2();
x()   // Returns "Do something"
```

[[↑] Back to top](#table-of-contents)

### Explain “this” keyword.

__The “this” keyword refers to the object that the function is a property of. __
The value of “this” keyword will always depend on the object that is invoking the function.

```js
//example
function doSomething() {
  console.log(this);
}
        
doSomething();      //window

//example2
var obj = {
    name:  "vivek",
    getName: function(){
    console.log(this.name);
  }
}
        
obj.getName();      //vivek

var getName = obj.getName;
var obj2 = {name:"akshay", getName };
obj2.getName();     //akshay

//example3
var obj1 = {
    address : "Mumbai,India",
    getAddress: function(){
    console.log(this.address); 
  }
}
       
var getAddress = obj1.getAddress;
var obj2 = {name:"akshay"};
obj2.getAddress();    //error - this keyword refers to the object obj2 , obj2 does not have the property “address”‘, hence the getAddress function throws an error.
```

[[↑] Back to top](#table-of-contents)

### Explain call(), apply() and, bind() methods.

__call()__

It’s a predefined method in javascript. This method invokes a method (function) by specifying the owner object.

```js
function sayHello(){
  return "Hello " + this.name;
}
        
var obj = {name: "Sandy"};
        
sayHello.call(obj);
        
// Returns "Hello Sandy"
```

call() method allows an object to use the method (function) of another object.

```js
var person = {
  age: 23,
  getAge: function(){
    return this.age;
  }
}
        
var person2 = {age:  54};
person.getAge.call(person2);
        
// Returns 54  
```

call() accepts arguments:

```js
function saySomething(message){
  return this.name + " is " + message;
}
        
var person4 = {name:  "John"};
        
saySomething.call(person4, "awesome");
// Returns "John is awesome"    
```

__apply()__

The apply method is similar to the call() method. The only difference is that,

call() method takes arguments separately whereas, apply() method takes arguments as an array.

```js
function saySomething(message){
  return this.name + " is " + message;
}
        
var person4 = {name:  "John"};
        
saySomething.apply(person4, ["awesome"]);
```

__bind()__

This method returns a new function, where the value of “this” skeyword will be bound to the owner object, which is provided as a parameter.

Example with arguments:

```js
var bikeDetails = {
    displayDetails: function(registrationNumber,brandName){
    return this.name+ " , "+ "bike details: "+ registrationNumber + " , " + brandName;
  }
}
        
var person1 = {name:  "Vivek"};
        
var detailsOfPerson1 = bikeDetails.displayDetails.bind(person1, "TS0122", "Bullet");    // Binds the displayDetails function to the person1 object
        
detailsOfPerson1();     // Returns Vivek, bike details: TS0452, Thunderbird
```

[[↑] Back to top](#table-of-contents)

### What is Currying in javascript?

Currying is a technique to transform a function of arguments n, to n functions of one or less arguments. By using the currying technique, we do not change the functionality of a function, we just change the way it is invoked. Example of a curried function:

```js
function multiply(a,b){
  return a*b;
}

function currying(fn){
  return function(a){
    return function(b){
      return fn(a,b);
    }
  }
}

var curriedMultiply = currying(multiply);

multiply(4, 3); // Returns 12

curriedMultiply(4)(3); // Also returns 12
```

As one can see in the code above, we have transformed the function multiply(a,b) to a function curriedMultiply , which takes in one parameter at a time.

[[↑] Back to top](#table-of-contents)

### Explain Scope and Scope Chain in javascript.

Scope in JS, determines the accessibility of variables and functions at various parts in one’s code.

In general terms, the scope will let us know at a given part of code, what are the variables and functions that we can or cannot access.

There are three types of scopes in JS:
- Global Scope -  all the variables and functions having global scope can be accessed from anywhere inside the code
- Local or Function Scope - all the variables and functions declared inside a function, can be accessed from within the function and not outside of it.
- Block Scope - any variable declared inside a block { }, can be accessed only inside that block and cannot be accessed outside of it. variables declared using let and const.

```js
//Global
var globalVariable = "Hello world";

function sendMessage(){
  return globalVariable; // can access globalVariable since it's written in global space
}

function sendMessage2(){
  return sendMessage(); // Can access sendMessage function since it's written in global space
}

sendMessage2();  // Returns “Hello world”


//Local or Function Scope
function awesomeFunction(){
  var a = 2;

  return function(){
    console.log(a*2); // Can access variable "a" since a and multiplyBy2 both are written inside the same function
  }
}
console.log(a); // Throws reference error since a is written in local scope and cannot be accessed outside

multiplyBy2(); // Throws reference error since multiplyBy2 is written in local scope


//Block Scope
{
  let x = 45;
}

console.log(x); // Gives reference error since x cannot be accessed outside of the block

for(let i=0; i<2; i++){
  // do something
}

console.log(i); // Gives reference error since i cannot be accessed outside of the for loop block
```

Scope Chain

JavaScript engine also uses Scope to find variables.

```js
var y = 24;

function favFunction(){
  var x = 667;
  var anotherFavFunction = function(){
    console.log(x); // Does not find x inside anotherFavFunction, so looks for variable inside favFunction, outputs 667
  }

  var yetAnotherFavFunction = function(){
    console.log(y); // Does not find y inside yetAnotherFavFunction, so looks for variable inside favFunction and does not find it, so looks for variable in global scope, finds it and outputs 24
  }

  anotherFavFunction();
  yetAnotherFavFunction();
}


favFunction();
```
As you can see in the code above, if the javascript engine does not find the variable in local scope, it tries to check for the variable in the outer scope. If the variable does not exist in the outer scope, it tries to find the variable in the global scope.

[[↑] Back to top](#table-of-contents)

### Explain Closures in JavaScript.

Closures is an ability of a function to remember the variables and functions that are declared in its outer scope.

```js
var Person = function(pName){
  var name = pName;

  this.getName = function(){
    return name;
  }
}

var person = new Person("Neelesh");
console.log(person.getName());      //Neelesh
```

__This ability of a function to store a variable for further reference even after it is executed, is called Closure.__

At code example below, instead of destroying the value of obj1 after execution, saves the value in the memory for further reference. This is the reason why the returning function is able to use the variable declared in the outer scope even after the function is already executed.

```js
function randomFunc(){
  var obj1 = {name:"Vivian", age:45};

  return function(){
    console.log(obj1.name + " is "+ "awesome"); // Has access to obj1 even when the randomFunc function is executed

  }
}

var initialiseClosure = randomFunc(); // Returns a function

initialiseClosure();    //returned function is then executed
```

[[↑] Back to top](#table-of-contents)

### What are object prototypes?

All javascript objects inherit properties from a prototype. A prototype is a blueprint of an object. Prototype allows us to use properties and methods on an object even if the properties and methods do not exist on the current object. Like .push(), Math.random(), etc.

The javascript engine sees that the method push does not exist on the current array object and therefore, looks for the method push inside the Array prototype and it finds the method. Whenever the property or method is not found on the current object, the javascript engine will always try to look in its prototype and if it still does not exist, it looks inside the prototype's prototype and so on.

For example,
- Date objects inherit properties from the Date prototype
- Math objects inherit properties from the Math prototype
- Array objects inherit properties from the Array prototype.

On top of the chain is `Object.prototype`. Every prototype inherits properties and methods from the Object.prototype.

[[↑] Back to top](#table-of-contents)

### What are callbacks?

A callback is a function that will be executed after another function gets executed. Functions that are used as an argument to another function are called callback functions.

In javascript, functions are treated as first-class citizens, they can be used as an argument of another function, can be returned by another function and can be used as a property of an object.

```js
function divideByHalf(sum){
  console.log(Math.floor(sum / 2));
}

function multiplyBy2(sum){
  console.log(sum * 2);
}

function operationOnSum(num1,num2,operation){
  var sum = num1 + num2;
  operation(sum);
}

operationOnSum(3, 3, divideByHalf); // Outputs 3

operationOnSum(5, 5, multiplyBy2); // Outputs 20
```

[[↑] Back to top](#table-of-contents)

### What is memoization?

Memoization is a form of caching where the return value of a function is cached based on its parameters. If the parameter of that function is not changed, the cached version of the function is returned.

```js
function addTo256(num){
  return num + 256;
}

addTo256(20); // Returns 276
addTo256(40); // Returns 296
addTo256(20); // Returns 276
```

Computing the result with the same parameter again and again is not a big deal in small program, but imagine if the function does some heavy duty work, then, computing the result again and again with the same parameter will lead to wastage of time.

This is where memoization comes in, by using memoization we can store(cache) the computed results based on the parameters. If the same parameter is used again while invoking the function, instead of computing the result, we directly return the stored (cached) value.

```js
function memoizedAddTo256(){
  var cache = {};

  return function(num){
    if(num in cache){
      console.log("cached value");
      return cache[num]

    }
    else{
      cache[num] = num + 256;
      return cache[num];
    }
  }
}

var memoizedFunc = memoizedAddTo256();

memoizedFunc(20); // Normal return
memoizedFunc(20); // Cached return
```

In the code above, if we run memoizedFunc function with the same parameter, instead of computing the result again, it returns the cached result.

*Note- Although using memoization saves time, it results in larger consumption of memory since we are storing all the computed results.

[[↑] Back to top](#table-of-contents)

### What is recursion in a programming language?

Recursion is a technique to iterate over an operation by having a function call itself repeatedly until it arrives at a result. A recursive function must have a condition to stop calling itself. Otherwise, the function is called indefinitely.

```js
function add(number) {
  if (number <= 0) {
    return 0;
  } else {
    return number + add(number - 1);
  }
}

add(3) => 3 + add(2)
          3 + 2 + add(1)
          3 + 2 + 1 + add(0)
          3 + 2 + 1 + 0 = 6  
```

The following function calculates the sum of all the elements in an array by using recursion:

```js
function computeSum(arr){
  if(arr.length === 1){
    return arr[0];
  }
  else{
    return arr.pop() + computeSum(arr);
  }
}

computeSum([7, 8, 9, 99]); // Returns 123
```

[[↑] Back to top](#table-of-contents)

### What is the use of a constructor function in javascript?

Constructor functions are used to create objects in javascript.

When do we use constructor functions? If we want to create multiple objects having similar properties and methods, constructor functions are used.

```js
function Person(name,age,gender){
  this.name = name;
  this.age = age;
  this.gender = gender;
}


var person1 = new Person("Vivek", 76, "male");
console.log(person1);

var person2 = new Person("Courtney", 34, "female");
console.log(person2);
```

Whenever we want to create a new object of the type Person, We need to create it using the new keyword:
```js
var person3 = new Person("Lilly", 17, "female");
```

The above line of code will create a new object of the type Person. Constructor functions allow us to group similar objects.

[[↑] Back to top](#table-of-contents)

### What is DOM?

DOM stands for Document Object Model.

DOM is a programming interface for HTML and XML documents.

When the browser tries to render a HTML document, it creates an object based on the HTML document called DOM. 

Using this DOM, we can manipulate or change various elements inside the HTML document.

[[↑] Back to top](#table-of-contents)

### What are arrow functions?

Arrow functions can only be used as a function expression. It provides us with a new and shorter syntax for declaring functions.

Arrow functions are declared without the function keyword. If there is only one returning expression then we don’t need to use the return keyword, for functions having just one line of code, curly braces { } can be omitted. If the function takes in only one argument, then the parenthesis () around the parameter can be omitted.

```js
// Traditional Function Expression
var add = function(a,b){
  return a + b;
}

// Arrow Function Expression
var arrowAdd = (a,b) => a + b;

// Traditional function expression
var multiplyBy2 = function(num){
  return num * 2;
}
// Arrow function expression
var arrowMultiplyBy2 = num => num * 2;
```

##### this
The biggest difference between the traditional function expression and the arrow function, is the handling of the this keyword.

By general definition, the this keyword always refers to the object that is calling the function.

As you can see in the code below, obj1.valueOfThis() returns obj1, since this keyword refers to the object calling the function.

In the arrow functions, there is no binding of the this keyword.

The this keyword inside an arrow function, does not refer to the object calling it. 

Arrow function rather inherits its value from the __parent scope__ which is the window object in this case.

Therefore, in the code above, obj2.valueOfThis() returns the window object.

```js
var obj1 = {
  valueOfThis: function(){
    return this;
  }
}
var obj2 = {
  valueOfThis: ()=>{
    return this;
  }
}

obj1.valueOfThis(); // Will return the object obj1
obj2.valueOfThis(); // Will return window/global object
```

[[↑] Back to top](#table-of-contents)

### Differences between declaring variables using var, let and const.

keyword | const | let | var
--- | ---- | ---- | ----
global scope | no | no | yes
function scope | yes | yes | yes
block scope | yes | yes | no
can be reassigned | no | yes | yes

[[↑] Back to top](#table-of-contents)

### What is the rest parameter and spread operator?

__Rest parameter ( … )__

It provides an improved way of handling parameters of a function.

Using the rest parameter syntax, we can create functions that can take a variable number of arguments.

Any number of arguments will be converted into an array using the rest parameter.

It also helps in extracting all or some parts of the arguments.

Rest parameter can be used by applying three dots (...) before the parameters.

*Note- Rest parameter should always be used at the last parameter of a function:

```js
function extractingArgs(...args){
  return args[1];
}

// extractingArgs(8,9,1); // Returns 9

function addAllArgs(...args){
  let sumOfArgs = 0;
  let i = 0;
  while(i < args.length){
    sumOfArgs += args[i];
    i++;
  }
  return sumOfArgs;
}

addAllArgs(6, 5, 7, 99); // Returns 117
addAllArgs(1, 3, 4); // Returns 8


// Incorrect way to use rest parameter
function randomFunc(a,...args,c){
//Do something
}

// Correct way to use rest parameter
function randomFunc2(a,b,...args){
//Do something
}
```
**Spread operator (…)**

Although the syntax of spread operator is exactly the same as the rest parameter, spread operator is used to spread an array, and object literals. We also use spread operators where one or more arguments are expected in a function call.

```js
function addFourNumbers(num1,num2,num3,num4){
  return num1 + num2 + num3 + num4;
}

let fourNumbers = [5, 6, 7, 8];


addFourNumbers(...fourNumbers);
// Spreads [5,6,7,8] as 5,6,7,8

let array1 = [3, 4, 5, 6];
let clonedArray1 = [...array1];
// Spreads the array into 3,4,5,6
console.log(clonedArray1); // Outputs [3,4,5,6]


let obj1 = {x:'Hello', y:'Bye'};
let clonedObj1 = {...obj1}; // Spreads and clones obj1
console.log(obj1);

let obj2 = {z:'Yes', a:'No'};
let mergedObj = {...obj1, ...obj2}; // Spreads both the objects and merges it
console.log(mergedObj);
// Outputs {x:'Hello', y:'Bye',z:'Yes',a:'No'};
```

*Note- Key differences between rest parameter and spread operator:
Rest parameter is used to take a variable number of arguments and turns into an array while the spread operator takes an array or an object and spreads it
Rest parameter is used in function declaration whereas the spread operator is used in function calls.

[[↑] Back to top](#table-of-contents)

### What is the use of promises in javascript?

**Promises are used to handle asynchronous operations in javascript.**

Before promises, callbacks were used to handle asynchronous operations. But due to limited functionality of callback, using multiple callbacks to handle asynchronous code can lead to unmanageable code - callback hell

Promise object has four states:
- Pending - Initial state of promise. This state represents that the promise has neither been fulfilled nor been rejected, it is in the pending state.
- Fulfilled - This state represents that the promise has been fulfilled, meaning the async operation is completed.
- Rejected - This state represents that the promise has been rejected for some reason, meaning the async operation has failed.
- Settled - This state represents that the promise has been either rejected or fulfilled.

A promise is created using the Promise constructor which takes in a callback function with two parameters, resolve and reject respectively.
- resolve, goes to next action, is a function that will be called, when the async operation has been successfully completed.
- reject, handle error, is a function that will be called, when the async operation fails or if some error occurs.

Promises are used to handle asynchronous operations like server requests, for the ease of understanding, we are using an operation to calculate the sum of three elements. we are calculating the sum of three elements, if the length of elements array is more than 3, promise is rejected, else the promise is resolved and the sum is returned.

```js
function sumOfThreeElements(...elements){
  return new Promise((resolve,reject)=>{
    if(elements.length > 3 ){
      reject("Only three elements or less are allowed");
    }
    else{
      let sum = 0;
      let i = 0;
      while(i < elements.length){
        sum += elements[i];
        i++;
      }
      resolve("Sum has been calculated: "+sum);
    }
  })
}
```

We can consume any promise by attaching then() and catch() methods to the consumer.
- then() method is used to access the result when the promise is fulfilled.
- catch() method is used to access the result/error when the promise is rejected.

```js
sumOfThreeElements(4, 5, 6)
.then(result=> console.log(result))
.catch(error=> console.log(error));
// In the code above, the promise is fulfilled so the then() method gets executed

sumOfThreeElements(7, 0, 33, 41)
.then(result => console.log(result))
.catch(error=> console.log(error));
// In the code above, the promise is rejected hence the catch() method gets executed
```

[[↑] Back to top](#table-of-contents)

### What are classes in javascript?
Classes are nothing but syntactic sugars for constructor functions.

They provide a new way of declaring constructor functions in javascript.

Below are the examples of how classes are declared and used:

```js
// Before ES6 version, using constructor functions
function Student(name,rollNumber,grade,section){
  this.name = name;
  this.rollNumber = rollNumber;
  this.grade = grade;
  this.section = section;
}

// Way to add methods to a constructor function
Student.prototype.getDetails = function(){
  return 'Name: ${this.name}, Roll no: ${this.rollNumber}, Grade: ${this.grade}, Section:${this.section}';
}

let student1 = new Student("Vivek", 354, "6th", "A");
student1.getDetails();
// Returns Name: Vivek, Roll no:354, Grade: 6th, Section:A

// ES6 version classes
class Student{
  constructor(name,rollNumber,grade,section){
    this.name = name;
    this.rollNumber = rollNumber;
    this.grade = grade;
    this.section = section;
  }

  // Methods can be directly added inside the class
  getDetails(){
    return 'Name: ${this.name}, Roll no: ${this.rollNumber}, Grade:${this.grade}, Section:${this.section}';
  }
}

let student2 = new Student("Garry", 673, "7th", "C");
student2.getDetails();
// Returns Name: Garry, Roll no:673, Grade: 7th, Section:C
``` 

Key points to remember about classes:
- Unlike functions, classes are not hoisted. A class cannot be used before it is declared.
- A class can inherit properties and methods from other classes by using the extend keyword.
- All the syntaxes inside the class must follow the strict mode(‘use strict’) of javascript. Error will be thrown if the strict mode rules are not followed.

[[↑] Back to top](#table-of-contents)

### What are generator functions?

They can be stopped midway and then continue from where it had stopped.

Generator functions are declared with the `function*` keyword instead of the normal function keyword

In normal functions, we use the return keyword to return a value and as soon as the return statement gets executed, the function execution stops

In the case of generator functions, when called, they do not execute the code, instead they return a generator object . This generator object handles the execution.

The generator object consists of a method called next() , this method when called, executes the code until the nearest yield statement, and returns the yield value.

As one can see the next method returns an object consisting of value and done properties.
Value property represents the yielded value.
Done property tells us whether the function code is finished or not. (Returns true if finished)
Generator functions are used to return iterators. Let’s see an example where an iterator is returned:

```js
function* iteratorFunc() {
  let count = 0;
  for (let i = 0; i < 2; i++) {
      count++;
      yield i;
  }
  return count;
}

let iterator = iteratorFunc();
console.log(iterator.next()); // {value:0,done:false}
console.log(iterator.next()); // {value:1,done:false}
console.log(iterator.next()); // {value:2,done:true}
```

[[↑] Back to top](#table-of-contents)

### Explain WeakSet in javascript.
In javascript, Set is a collection of unique and ordered elements.

Just like Set, WeakSet is also a collection of unique and ordered elements with some key differences:

- Weakset contains only objects and no other type.
- An object inside the weakset is referenced weakly. This means, if the object inside the weakset does not have a reference, it will be garbage collected.
- Unlike Set, WeakSet only has three methods, add() , delete() and has() .

```js
const newSet = new Set([4, 5, 6, 7]);
console.log(newSet);// Outputs Set {4,5,6,7}

const newSet2 = new WeakSet([3, 4, 5]); //Throws an error

let obj1 = {message:"Hello world"};
const newSet3 = new WeakSet([obj1]);
console.log(newSet3.has(obj1)); // true
```

[[↑] Back to top](#table-of-contents)

### Explain WeakMap in javascript.
In javascript, Map is used to store key-value pairs. The key-value pairs can be of both primitive and non-primitive types.

WeakMap is similar to Map with key differences:

- The keys and values in weakmap should always be an object.
- If there are no references to the object, the object will be garbage collected.

```js
const map1 = new Map();
map1.set('Value', 1);

const map2 = new WeakMap();
map2.set('Value', 2.3); // Throws an error

let obj = {name:"Vivek"};
const map3 = new WeakMap();
map3.set(obj, {age:23});
```

[[↑] Back to top](#table-of-contents)

### What is Object Destructuring?
Object destructuring is a new way to extract elements from an object or an array.

##### Object destructuring
```js
const classDetails = {
  strength: 78,
  benches: 39,
  blackBoard:1
}

const {strength:classStrength, benches:classBenches,blackBoard:classBlackBoard} = classDetails;     //re-naming

console.log(classStrength); // Outputs 78
console.log(classBenches); // Outputs 39
console.log(classBlackBoard); // Outputs 1

//same code above using destructuring
const {strength:strength} = classDetails;
// The above line of code can be written as:
const {strength} = classDetails;
```
##### Array destructuring
```js
const arr = [1, 2, 3, 4];
const first = arr[0];
const second = arr[1];
const third = arr[2];
const fourth = arr[3];

//same code above using destructuring
const arr = [1, 2, 3, 4];
const [first,second,third,fourth] = arr;

console.log(first); // Outputs 1
console.log(second); // Outputs 2
console.log(third); // Outputs 3
console.log(fourth); // Outputs 4
```

[[↑] Back to top](#table-of-contents)

### What is a Temporal Dead Zone?

Temporal Dead Zone is a behaviour that occurs with variables declared using let and const keywords.

It is a behaviour where we try to access a variable before it is initialized.

Examples of temporal dead zone:
```js
x = 23; // Gives reference error
let x;

function anotherRandomFunc(){
  message = "Hello"; // Throws a reference error
  let message;
}
anotherRandomFunc();
```

In the code above, both in global scope and functional scope, we are trying to access variables which have not been declared yet. This is called the Temporal Dead Zone .

[[↑] Back to top](#table-of-contents)

### Explain event delegation

Event delegation allows you to avoid adding event listeners to specific nodes; instead, the event listener is added to one parent - (Adding a listener on the next higher element instead of every child element itself)
That event listener analyzes bubbled events to find a match on child elements.
Instead of attaching the event listeners directly to the buttons, you delegate listening to the parent `<div id="buttons">` . 
When a button is clicked, the listener of the parent element catches the bubbling event (event propagation - capture, target, bubble).

Event delegation is a technique involving adding event listeners to a parent element instead of adding them to the descendant elements. The listener will fire whenever the event is triggered on the descendant elements due to event bubbling up the DOM. The benefits of this technique are:

- Memory footprint goes down because only one single handler is needed on the parent element, rather than having to attach event handlers on each descendant.
- There is no need to unbind the handler from elements that are removed and to bind the event for new elements.

```javascript
const listItems = document.querySelectorAll('li');
const list = document.querySelector('ul');

// listItems.forEach(listItem => {
//   listItem.addEventListener('click', event => {
//     event.target.classList.toggle('highlight');
//   });
// });

list.addEventListener('click', event => {
  // event.target.classList.toggle('highlight'); - no good when we have a complex structure
  event.target.closest('li').classList.toggle('highlight');
}); 
```
    
[[↑] Back to top](#table-of-contents)

### Explain how `this` works in JavaScript

The value of `this` depends on how the function is called. 

1. If the `new` keyword is used when calling the function, `this` inside the function is a brand new object.
2. If `apply`, `call`, or `bind` are used to call/create a function, `this` inside the function is the object that is passed in as the argument.
3. If a function is called as a method, such as `obj.method()` — `this` is the object that the function is a property of.
4. If a function is invoked as a free function invocation, meaning it was invoked without any of the conditions present above, `this` is the global object. In a browser, it is the `window` object. If in strict mode (`'use strict'`), `this` will be `undefined` instead of the global object.
5. If multiple of the above rules apply, the rule that is higher wins and will set the `this` value.
6. If the function is an ES2015 arrow function, it ignores all the rules above and receives the `this` value of its surrounding scope at the time it is created.

#### Can you give an example of one of the ways that working with this has changed in ES6?

ES6 allows you to use arrow functions which uses the enclosing lexical scope. This is usually convenient, but does prevent the caller from controlling context via `.call` or `.apply`, arrow functions does not have its own bindings to this.
    
```javascript
const myObject = {
  myMethod: () => {
    console.log(this); // this === window or global object
  }
};
    
const myObject = {
  myArrowFunction: null,
  myMethod: function () {
    this.myArrowFunction = () => { console.log(this) }; // this === myObject
  }
};
```
    
[[↑] Back to top](#table-of-contents)

### Explain how prototypal inheritance works
    
Every object with its methods and properties contains an internal and hidden property known as `Prototype`. The Prototypal Inheritance is a feature in javascript used to add methods and properties in objects. It is a method by which an object can inherit the properties and methods of another object. It is being set using `__proto__`.
    
The core idea of Prototypal Inheritance is that an object can point to another object and inherit all its properties. The main purpose is to allow multiple instances of an object to share common properties, hence, the Singleton Pattern.
    
 ```javascript
   
//syntax
ChildObject.__proto__ = ParentObject
    
//example
// object person
let person = {
    talk: true,
    Canfly() {
        return "Sorry, Can't fly";
    },
};
// Object GFGuser
let GFGuser = {
    CanCode: true,
    CanCook() {
        return "Can't say";
    },

  //  Inheriting the properties and methods of person
    __proto__: person, 
};

// Printing on console
// Property of person
console.log("Can a GFG User talk: " + GFGuser.talk); 

// Method of person
console.log("Can a GFG User fly: " + GFGuser.Canfly()); 

// Property of GFGuser
console.log("Can a GFG User code: " + GFGuser.CanCode); 

// Method of GFGuser
console.log("Can a GFG User cook: " + GFGuser.CanCook());
```

[[↑] Back to top](#table-of-contents)

### What do you think of AMD vs CommonJS?

CommonJS is synchronous while AMD (Asynchronous Module Definition) is obviously asynchronous. CommonJS is designed with server-side development in mind while AMD, with its support for asynchronous loading of modules, is more intended for browsers.

With ES2015 modules, that has support for both synchronous and asynchronous loading, we can finally just stick to one approach. Although it hasn't been fully rolled out in browsers and in Node, we can always use transpilers to convert our code.

[[↑] Back to top](#table-of-contents)

### Explain why the following doesn't work as an IIFE: `function foo(){ }();`. What needs to be changed to properly make it an IIFE?

IIFE stands for Immediately Invoked Function Expressions, execute functions immediately, as soon as they are created. The JavaScript parser reads `function foo(){ }();` as `function foo(){ }` and `();`, where the former is a **function declaration** and the latter (a pair of parentheses) is an attempt at calling a function but there is no name specified, hence it throws `Uncaught SyntaxError: Unexpected token )`.

Here are two ways to fix it that involves adding more parentheses: `(function foo(){ })()` and `(function foo(){ }())`. Statements that begin with `function` are considered to be _function declarations_; by wrapping this function within `()`, it becomes a **function expression** which can then be executed with the subsequent `()`. These functions are not exposed in the global scope and you can even omit its name if you do not need to reference itself within the body.

[[↑] Back to top](#table-of-contents)

### What's the difference between a variable that is: `null`, `undefined` or undeclared? How would you go about checking for any of these states?

**Undeclared** variables are created when you assign a value to an identifier that is not previously created using `var`, `let` or `const`. Undeclared variables will be defined globally, outside of the current scope. In strict mode, a `ReferenceError` will be thrown when you try to assign to an undeclared variable. Undeclared variables are bad just like how global variables are bad. Avoid them at all cost! To check for them, wrap its usage in a `try`/`catch` block.

```js
function foo() {
  x = 1; // Throws a ReferenceError in strict mode
}

foo();
console.log(x); // 1
```

A variable that is `undefined` is a variable that has been declared, but not assigned a value. It is of type `undefined`. If a function does not return any value as the result of executing it is assigned to a variable, the variable also has the value of `undefined`. To check for it, compare using the strict equality (`===`) operator or `typeof` which will give the `'undefined'` string. Note that you should not be using the abstract equality operator to check, as it will also return `true` if the value is `null`.

```js
var foo;
console.log(foo); // undefined
console.log(foo === undefined); // true
console.log(typeof foo === 'undefined'); // true

console.log(foo == null); // true. Wrong, don't use this to check!

function bar() {}
var baz = bar();
console.log(baz); // undefined
```

A variable that is `null` will have been explicitly assigned to the `null` value. It represents no value and is different from `undefined` in the sense that it has been explicitly assigned. To check for `null,` simply compare using the strict equality operator. Note that like the above, you should not be using the abstract equality operator (`==`) to check, as it will also return `true` if the value is `undefined`.

```js
var foo = null;
console.log(foo === null); // true
console.log(typeof foo === 'object'); // true

console.log(foo == undefined); // true. Wrong, don't use this to check!
```

As a personal habit, I never leave my variables undeclared or unassigned. I will explicitly assign `null` to them after declaring if I don't intend to use it yet. If you use a linter in your workflow, it will usually also be able to check that you are not referencing undeclared variables.

[[↑] Back to top](#table-of-contents)

### What is a closure, and how/why would you use one?

A closure gives you access to an outer function’s scope from an inner function. A closure is the combination of a function and the lexical environment within which that function was declared. The word "lexical" refers to the fact that lexical scoping uses the location where a variable is declared within the source code to determine where that variable is available. Closures are functions that have access to the outer (enclosing) function's variables—scope chain even after the outer function has returned.

```javascript
function makeFunc() {
  var name = 'Mozilla';
  function displayName() {
    alert(name);
  }
  return displayName;
}

var myFunc = makeFunc();
myFunc();
```
    
**Why would you use one?**

- Data privacy / emulating private methods with closures. Commonly used in the module pattern
- [Partial applications or currying](https://medium.com/javascript-scene/curry-or-partial-application-8150044c78b8#.l4b6l1i3x).

[[↑] Back to top](#table-of-contents)

### Can you describe the main difference between a `.forEach` loop and a `.map()` loop and why you would pick one versus the other?

To understand the differences between the two, let's look at what each function does.

**`forEach`**

- Iterates through the elements in an array.
- Executes a callback for each element.
- Does not return a value.

```js
const a = [1, 2, 3];
const doubled = a.forEach((num, index) => {
  // Do something with num and/or index.
});

// doubled = undefined
```

**`map`**

- Iterates through the elements in an array.
- "Maps" each element to a new element by calling the function on each element, creating a new array as a result.

```js
const a = [1, 2, 3];
const doubled = a.map((num) => {
  return num * 2;
});

// doubled = [2, 4, 6]
```

The main difference between `.forEach` and `.map()` is that `.map()` returns a new array. If you need the result, but do not wish to mutate the original array, `.map()` is the clear choice. If you simply need to iterate over an array, `forEach` is a fine choice.

[[↑] Back to top](#table-of-contents)

### What's a typical use case for anonymous functions?

They can be used in IIFEs to encapsulate some code within a local scope so that variables declared in it do not leak to the global scope.

```js
(function () {
  // Some code here.
})();
```

As a callback that is used once and does not need to be used anywhere else. The code will seem more self-contained and readable when handlers are defined right inside the code calling them, rather than having to search elsewhere to find the function body.

```js
setTimeout(function () {
  console.log('Hello world!');
}, 1000);
```

Arguments to functional programming constructs or Lodash (similar to callbacks).

```js
const arr = [1, 2, 3];
const double = arr.map(function (el) {
  return el * 2;
});
console.log(double); // [2, 4, 6]
```

[[↑] Back to top](#table-of-contents)

### How do you organize your code? (module pattern, classical inheritance?)

In the past, I've used Backbone for my models which encourages a more OOP approach, creating Backbone models and attaching methods to them.

The module pattern is still great, but these days, I use React/Redux which utilize a single-directional data flow based on Flux architecture. I would represent my app's models using plain objects and write utility pure functions to manipulate these objects. State is manipulated using actions and reducers like in any other Redux application.

I avoid using classical inheritance where possible. When and if I do, I stick to [these rules](https://medium.com/@dan_abramov/how-to-use-classes-and-sleep-at-night-9af8de78ccb4).

[[↑] Back to top](#table-of-contents)

### What's the difference between host objects and native objects?

Native objects are objects that are part of the JavaScript language defined by the ECMAScript specification, such as `String`, `Math`, `RegExp`, `Object`, `Function`, etc.

Host objects are provided by the runtime environment (browser or Node), such as `window`, `XMLHTTPRequest`, etc.

[[↑] Back to top](#table-of-contents)

### Difference between: `function Person(){}`, `var person = Person()`, and `var person = new Person()`?

My best guess at its intention is that it is asking about constructors in JavaScript. Technically speaking, `function Person(){}` is just a normal function declaration. The convention is to use PascalCase for functions that are intended to be used as constructors.

`var person = Person()` invokes the `Person` as a function, and not as a constructor. Invoking as such is a common mistake if the function is intended to be used as a constructor. Typically, the constructor does not return anything, hence invoking the constructor like a normal function will return `undefined` and that gets assigned to the variable intended as the instance.

`var person = new Person()` creates an instance of the `Person` object using the `new` operator, which inherits from `Person.prototype`. An alternative would be to use `Object.create`, such as: `Object.create(Person.prototype)`.

```js
function Person(name) {
  this.name = name;
}

var person = Person('John');
console.log(person); // undefined
console.log(person.name); // Uncaught TypeError: Cannot read property 'name' of undefined

var person = new Person('John');
console.log(person); // Person { name: "John" }
console.log(person.name); // "john"
```
    
[[↑] Back to top](#table-of-contents)

### What's the difference between `.call` and `.apply`?

Both `.call` and `.apply` are used to invoke functions and the first parameter will be used as the value of `this` within the function. However, `.call` takes in comma-separated arguments as the next arguments while `.apply` takes in an array of arguments as the next argument. An easy way to remember this is C for `call` and comma-separated and A for `apply` and an array of arguments.

```js
function add(a, b) {
  return a + b;
}

console.log(add.call(null, 1, 2)); // 3
console.log(add.apply(null, [1, 2])); // 3
```

[[↑] Back to top](#table-of-contents)

### Explain `Function.prototype.bind`.

> The `bind()` method creates a new function that, when called, has its `this` keyword set to the provided value, with a given sequence of arguments preceding any provided when the new function is called.

In my experience, it is most useful for binding the value of `this` in methods of classes that you want to pass into other functions. 
    
[[↑] Back to top](#table-of-contents)

### When would you use `document.write()`?

`document.write()` writes a string of text to a document stream opened by `document.open()`. When `document.write()` is executed after the page has loaded, it will call `document.open` which clears the whole document (`<head>` and `<body>` removed!) and replaces the contents with the given parameter value. Hence it is usually considered dangerous and prone to misuse.

[[↑] Back to top](#table-of-contents)

### What's the difference between feature detection, feature inference, and using the UA string?

**Feature Detection**

Feature detection involves working out whether a browser supports a certain block of code, and running different code depending on whether it does (or doesn't), so that the browser can always provide a working experience rather crashing/erroring in some browsers. For example:

```js
if ('geolocation' in navigator) {
  // Can use navigator.geolocation
} else {
  // Handle lack of feature
}
```
    
**Feature Inference**

Feature inference checks for a feature just like feature detection, but uses another function because it assumes it will also exist, e.g.:

```js
if (document.getElementsByTagName) {
  element = document.getElementById(id);
}
```
    
**UA String**

This is a browser-reported string that allows the network protocol peers to identify the application type, operating system, software vendor or software version of the requesting software user agent. It can be accessed via `navigator.userAgent`. However, the string is tricky to parse and can be spoofed. For example, Chrome reports both as Chrome and Safari. So to detect Safari you have to check for the Safari string and the absence of the Chrome string. Avoid this method.

[[↑] Back to top](#table-of-contents)

### Explain Ajax in as much detail as possible.

Ajax (asynchronous JavaScript and XML) is a set of web development techniques using many web technologies on the client side to create asynchronous web applications. With Ajax, web applications can send data to and retrieve from a server asynchronously (in the background) without interfering with the display and behavior of the existing page. By decoupling the data interchange layer from the presentation layer, Ajax allows for web pages, and by extension web applications, to change content dynamically without the need to reload the entire page. In practice, modern implementations commonly use JSON instead of XML, due to the advantages of JSON being native to JavaScript.

The `XMLHttpRequest` API is frequently used for the asynchronous communication or these days, the `fetch` API.



[[↑] Back to top](#table-of-contents)

### What are the advantages and disadvantages of using Ajax?

**Advantages**

- Better interactivity. New content from the server can be changed dynamically without the need to reload the entire page.
- Reduce connections to the server since scripts and stylesheets only have to be requested once.
- State can be maintained on a page. JavaScript variables and DOM state will persist because the main container page was not reloaded.
- Basically most of the advantages of an SPA.

**Disadvantages**

- Dynamic webpages are harder to bookmark.
- Does not work if JavaScript has been disabled in the browser.
- Some webcrawlers do not execute JavaScript and would not see content that has been loaded by JavaScript.
- Webpages using Ajax to fetch data will likely have to combine the fetched remote data with client-side templates to update the DOM. For this to happen, JavaScript will have to be parsed and executed on the browser, and low-end mobile devices might struggle with this.
- Basically most of the disadvantages of an SPA.

[[↑] Back to top](#table-of-contents)

### Explain how JSONP works (and how it's not really Ajax).

JSONP (JSON with Padding) is a method commonly used to bypass the cross-domain policies in web browsers because Ajax requests from the current page to a cross-origin domain is not allowed.

JSONP works by making a request to a cross-origin domain via a `<script>` tag and usually with a `callback` query parameter, for example: `https://example.com?callback=printData`. The server will then wrap the data within a function called `printData` and return it to the client.

```html
<!-- https://mydomain.com -->
<script>
  function printData(data) {
    console.log(`My name is ${data.name}!`);
  }
</script>

<script src="https://example.com?callback=printData"></script>
```

```js
// File loaded from https://example.com?callback=printData
printData({name: 'Yang Shun'});
```

The client has to have the `printData` function in its global scope and the function will be executed by the client when the response from the cross-origin domain is received.

JSONP can be unsafe and has some security implications. As JSONP is really JavaScript, it can do everything else JavaScript can do, so you need to trust the provider of the JSONP data.

[[↑] Back to top](#table-of-contents)

### Have you ever used JavaScript templating? If so, what libraries have you used?

Yes. Lodash, AngularJS, and JSX. I disliked templating in AngularJS because it made heavy use of strings in the directives and typos would go uncaught. JSX is my new favorite as it is closer to JavaScript and there is barely any syntax to learn. Nowadays, you can even use ES2015 template string literals as a quick way for creating templates without relying on third-party code.

```js
const template = `<div>My name is: ${name}</div>`;
```

[[↑] Back to top](#table-of-contents)

### Explain "hoisting".

Hoisting is a term used to explain the behavior of variable declarations in your code. Variables declared or initialized with the `var` keyword will have their declaration "moved" up to the top of their module/function-level scope, which we refer to as hoisting. However, only the declaration is hoisted, the assignment (if there is one), will stay where it is.

```js
console.log(foo); // undefined
var foo = 1;
console.log(foo); // 1
```

Function declarations have the body hoisted while the function expressions (written in the form of variable declarations) only has the variable declaration hoisted.

```js
// Function Declaration
console.log(foo); // [Function: foo]
foo(); // 'FOOOOO'
function foo() {
  console.log('FOOOOO');
}
console.log(foo); // [Function: foo]

// Function Expression
console.log(bar); // undefined
bar(); // Uncaught TypeError: bar is not a function
var bar = function () {
  console.log('BARRRR');
};
console.log(bar); // [Function: bar]
```

Variables declared via `let` and `const` are hoisted as well. However, unlike `var` and `function`, they are not initialized and accessing them before the declaration will result in a `ReferenceError` exception. The variable is in a "temporal dead zone" from the start of the block until the declaration is processed.

```js
x; // undefined
y; // Reference error: y is not defined

var x = 'local';
let y = 'local';
```

[[↑] Back to top](#table-of-contents)

### Describe event bubbling.

When an event triggers on a DOM element, it will attempt to handle the event if there is a listener attached, then the event is bubbled up to its parent and the same thing happens. This bubbling occurs up the element's ancestors all the way to the `document`. Event bubbling is the mechanism behind event delegation.

```js
<form onclick="alert('form')">FORM
  <div onclick="alert('div')">DIV
    <p onclick="alert('p')">P</p>
  </div>
</form>
```
    
[[↑] Back to top](#table-of-contents)

### What's the difference between an "attribute" and a "property"?

Attributes are defined on the HTML markup but properties are defined on the DOM. To illustrate the difference, imagine we have this text field in our HTML: `<input type="text" value="Hello">`.

```js
const input = document.querySelector('input');
console.log(input.getAttribute('value')); // Hello
console.log(input.value); // Hello
```

But after you change the value of the text field by adding "World!" to it, this becomes:

```js
console.log(input.getAttribute('value')); // Hello
console.log(input.value); // Hello World!
```

[[↑] Back to top](#table-of-contents)

### Why is extending built-in JavaScript objects not a good idea?

Extending a built-in/native JavaScript object means adding properties/functions to its `prototype`. While this may seem like a good idea at first, it is dangerous in practice. Imagine your code uses a few libraries that both extend the `Array.prototype` by adding the same `contains` method, the implementations will overwrite each other and your code will break if the behavior of these two methods is not the same.

The only time you may want to extend a native object is when you want to create a polyfill, essentially providing your own implementation for a method that is part of the JavaScript specification but might not exist in the user's browser due to it being an older browser.

[[↑] Back to top](#table-of-contents)

### Difference between document `load` event and document `DOMContentLoaded` event?

The `DOMContentLoaded` event is fired when the initial HTML document has been completely loaded and parsed, without waiting for stylesheets, images, and subframes to finish loading.

`window`'s `load` event is only fired after the DOM and all dependent resources and assets have loaded.

[[↑] Back to top](#table-of-contents)

### What is the difference between `==` and `===`?

`==` is the abstract equality operator while `===` is the strict equality operator. The `==` operator will compare for equality after doing any necessary type conversions. The `===` operator will not do type conversion, so if two values are not the same type `===` will simply return `false`. When using `==`, funky things can happen, such as:

```js
1 == '1'; // true
1 == [1]; // true
1 == true; // true
0 == ''; // true
0 == '0'; // true
0 == false; // true
```

My advice is never to use the `==` operator, except for convenience when comparing against `null` or `undefined`, where `a == null` will return `true` if `a` is `null` or `undefined`.

```js
var a = null;
console.log(a == null); // true
console.log(a == undefined); // true
```
    
[[↑] Back to top](#table-of-contents)

### Explain the same-origin policy with regards to JavaScript.

The same-origin policy prevents JavaScript from making requests across domain boundaries. An origin is defined as a combination of URI scheme, hostname, and port number. This policy prevents a malicious script on one page from obtaining access to sensitive data on another web page through that page's Document Object Model.

[[↑] Back to top](#table-of-contents)

### Make this work:

```js
duplicate([1, 2, 3, 4, 5]); // [1,2,3,4,5,1,2,3,4,5]
```

```js
function duplicate(arr) {
  return arr.concat(arr);
}

duplicate([1, 2, 3, 4, 5]); // [1,2,3,4,5,1,2,3,4,5]
```

Or with ES6:

```js
const duplicate = (arr) => [...arr, ...arr];

duplicate([1, 2, 3, 4, 5]); // [1,2,3,4,5,1,2,3,4,5]
```

[[↑] Back to top](#table-of-contents)

### Why is it called a Ternary expression, what does the word "Ternary" indicate?

"Ternary" indicates three, and a ternary expression accepts three operands, the test condition, the "then" expression and the "else" expression. 
```js
function getFee(isMember) {
  return (isMember ? '$2.00' : '$10.00');
}
```

[[↑] Back to top](#table-of-contents)

### What is `"use strict";`? What are the advantages and disadvantages to using it?

'use strict' is a statement used to enable strict mode to entire scripts or individual functions. Strict mode is a way to opt into a restricted variant of JavaScript.

Advantages:

- Makes it impossible to accidentally create global variables.
- Makes assignments which would otherwise silently fail to throw an exception.
- Makes attempts to delete undeletable properties throw (where before the attempt would simply have no effect).
- Requires that function parameter names be unique.
- `this` is undefined in the global context.
- It catches some common coding bloopers, throwing exceptions.
- It disables features that are confusing or poorly thought out.

Disadvantages:

- Many missing features that some developers might be used to.
- No more access to `function.caller` and `function.arguments`.
- Concatenation of scripts written in different strict modes might cause issues.

Overall, I think the benefits outweigh the disadvantages, and I never had to rely on the features that strict mode blocks. I would recommend using strict mode.

[[↑] Back to top](#table-of-contents)

### Create a for loop that iterates up to `100` while outputting **"fizz"** at multiples of `3`, **"buzz"** at multiples of `5` and **"fizzbuzz"** at multiples of `3` and `5`.

```js
for (let i = 1; i <= 100; i++) {
  let f = i % 3 == 0,
    b = i % 5 == 0;
  console.log(f ? (b ? 'FizzBuzz' : 'Fizz') : b ? 'Buzz' : i);
}
                        
for (var i=1; i <= 100; i++) {
    if (i % 3 == 0 && i % 5 == 0)
        console.log("FizzBuzz");
    else if (i % 3 == 0)
        console.log("Fizz");
    else if (i % 5 == 0)
        console.log("Buzz");
    else
        console.log(i);
}
```

[[↑] Back to top](#table-of-contents)

### Why is it, in general, a good idea to leave the global scope of a website as-is and never touch it?

Every script has access to the global scope, and if everyone uses the global namespace to define their variables, collisions will likely occur. Use the module pattern (IIFEs) to encapsulate your variables within a local namespace.

[[↑] Back to top](#table-of-contents)

### Why would you use something like the `load` event? Does this event have disadvantages? Do you know any alternatives, and why would you use those?

The `load` event fires at the end of the document loading process. At this point, all of the objects in the document are in the DOM, and all the images, scripts, links and sub-frames have finished loading.

The DOM event `DOMContentLoaded` will fire after the DOM for the page has been constructed, but do not wait for other resources to finish loading. This is preferred in certain cases when you do not need the full page to be loaded before initializing.

[[↑] Back to top](#table-of-contents)

### Explain what a single page app is and how to make one SEO-friendly.

Web developers these days refer to the products they build as web apps, rather than websites. While there is no strict difference between the two terms, web apps tend to be highly interactive and dynamic, allowing the user to perform actions and receive a response to their action. Traditionally, the browser receives HTML from the server and renders it. When the user navigates to another URL, a full-page refresh is required and the server sends fresh new HTML to the new page. This is called server-side rendering.

However, in modern SPAs, client-side rendering is used instead. The browser loads the initial page from the server, along with the scripts (frameworks, libraries, app code) and stylesheets required for the whole app. When the user navigates to other pages, a page refresh is not triggered. The URL of the page is updated via the [HTML5 History API](https://developer.mozilla.org/en-US/docs/Web/API/History_API). New data required for the new page, usually in JSON format, is retrieved by the browser via [AJAX](https://developer.mozilla.org/en-US/docs/AJAX/Getting_Started) requests to the server. The SPA then dynamically updates the page with the data via JavaScript, which it has already downloaded in the initial page load. This model is similar to how native mobile apps work.

The benefits:

- The app feels more responsive and users do not see the flash between page navigations due to full-page refreshes.
- Fewer HTTP requests are made to the server, as the same assets do not have to be downloaded again for each page load.
- Clear separation of the concerns between the client and the server; you can easily build new clients for different platforms (e.g. mobile, chatbots, smart watches) without having to modify the server code. You can also modify the technology stack on the client and server independently, as long as the API contract is not broken.

The downsides:

- Heavier initial page load due to the loading of framework, app code, and assets required for multiple pages.
- There's an additional step to be done on your server which is to configure it to route all requests to a single entry point and allow client-side routing to take over from there.
- SPAs are reliant on JavaScript to render content, but not all search engines execute JavaScript during crawling, and they may see empty content on your page. This inadvertently hurts the Search Engine Optimization (SEO) of your app. However, most of the time, when you are building apps, SEO is not the most important factor, as not all the content needs to be indexable by search engines. To overcome this, you can either server-side render your app or use services such as [Prerender](https://prerender.io/) to "render your javascript in a browser, save the static HTML, and return that to the crawlers".

[[↑] Back to top](#table-of-contents)

### What is the extent of your experience with Promises and/or their polyfills?

Possess working knowledge of it. A promise is an object that may produce a single value sometime in the future: either a resolved value or a reason that it's not resolved (e.g., a network error occurred). A promise may be in one of 3 possible states: fulfilled, rejected, or pending. Promise users can attach callbacks to handle the fulfilled value or the reason for rejection.
    
```js
const myPromise = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve('foo');
  }, 300);
});

myPromise
  .then(handleResolvedA, handleRejectedA)
  .then(handleResolvedB, handleRejectedB)
  .then(handleResolvedC, handleRejectedC);
```
    
```js
let myPromise = new Promise(function(myResolve, myReject) {
// "Producing Code" (May take some time)

  myResolve(); // when successful
  myReject();  // when error
});

// "Consuming Code" (Must wait for a fulfilled Promise)
myPromise.then(
  function(value) { /* code if successful */ },
  function(error) { /* code if some error */ }
);
```

Some common polyfills are `$.deferred`, Q and Bluebird but not all of them comply with the specification. ES2015 supports Promises out of the box and polyfills are typically not needed these days.

[[↑] Back to top](#table-of-contents)

### What are the pros and cons of using Promises instead of callbacks?

**Pros**

- Avoid callback hell which can be unreadable.
- Makes it easy to write sequential asynchronous code that is readable with `.then()`.
- Makes it easy to write parallel asynchronous code with `Promise.all()`.
- With promises, these scenarios which are present in callbacks-only coding, will not happen:
  - Call the callback too early
  - Call the callback too late (or never)
  - Call the callback too few or too many times
  - Fail to pass along any necessary environment/parameters
  - Swallow any errors/exceptions that may happen

**Cons**

- Slightly more complex code (debatable).
- In older browsers where ES2015 is not supported, you need to load a polyfill in order to use it.

[[↑] Back to top](#table-of-contents)

### What are some of the advantages/disadvantages of writing JavaScript code in a language that compiles to JavaScript?

Some examples of languages that compile to JavaScript include CoffeeScript, Elm, ClojureScript, PureScript, and TypeScript.

Advantages:

- Fixes some of the longstanding problems in JavaScript and discourages JavaScript anti-patterns.
- Enables you to write shorter code, by providing some syntactic sugar on top of JavaScript, which I think ES5 lacks, but ES2015 is awesome.
- Static types are awesome (in the case of TypeScript) for large projects that need to be maintained over time.

Disadvantages:

- Require a build/compile process as browsers only run JavaScript and your code will need to be compiled into JavaScript before being served to browsers.
- Debugging can be a pain if your source maps do not map nicely to your pre-compiled source.
- Most developers are not familiar with these languages and will need to learn it. There's a ramp up cost involved for your team if you use it for your projects.
- Smaller community (depends on the language), which means resources, tutorials, libraries, and tooling would be harder to find.
- IDE/editor support might be lacking.
- These languages will always be behind the latest JavaScript standard.
- Developers should be cognizant of what their code is being compiled to — because that is what would actually be running, and that is what matters in the end.

Practically, ES2015 has vastly improved JavaScript and made it much nicer to write. I don't really see the need for CoffeeScript these days.

[[↑] Back to top](#table-of-contents)

### What tools and techniques do you use for debugging JavaScript code?

- React and Redux
  - [React Devtools](https://github.com/facebook/react-devtools)
  - [Redux Devtools](https://github.com/gaearon/redux-devtools)
- Vue
  - [Vue Devtools](https://github.com/vuejs/vue-devtools)
- JavaScript
  - [Chrome Devtools](https://hackernoon.com/twelve-fancy-chrome-devtools-tips-dc1e39d10d9d)
  - `debugger` statement
  - Good old `console.log` debugging

[[↑] Back to top](#table-of-contents)

### What language constructions do you use for iterating over object properties and array items?

For objects:

- `for-in` loops - `for (var property in obj) { console.log(property); }`. However, this will also iterate through its inherited properties, and you will add an `obj.hasOwnProperty(property)` check before using it.
- `Object.keys()` - `Object.keys(obj).forEach(function (property) { ... })`. `Object.keys()` is a static method that will lists all enumerable properties of the object that you pass it.
- `Object.getOwnPropertyNames()` - `Object.getOwnPropertyNames(obj).forEach(function (property) { ... })`. `Object.getOwnPropertyNames()` is a static method that will lists all enumerable and non-enumerable properties of the object that you pass it.

For arrays:

- `for` loops - `for (var i = 0; i < arr.length; i++)`. The common pitfall here is that `var` is in the function scope and not the block scope and most of the time you would want block scoped iterator variable. ES2015 introduces `let` which has block scope and it is recommended to use that instead. So this becomes: `for (let i = 0; i < arr.length; i++)`.
- `forEach` - `arr.forEach(function (el, index) { ... })`. This construct can be more convenient at times because you do not have to use the `index` if all you need is the array elements. There are also the `every` and `some` methods which will allow you to terminate the iteration early.
- `for-of` loops - `for (let elem of arr) { ... }`. ES6 introduces a new loop, the `for-of` loop, that allows you to loop over objects that conform to the [iterable protocol](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#The_iterable_protocol) such as `String`, `Array`, `Map`, `Set`, etc. It combines the advantages of the `for` loop and the `forEach()` method. The advantage of the `for` loop is that you can break from it, and the advantage of `forEach()` is that it is more concise than the `for` loop because you don't need a counter variable. With the `for-of` loop, you get both the ability to break from a loop and a more concise syntax.

Most of the time, I would prefer the `.forEach` method, but it really depends on what you are trying to do. Before ES6, we used `for` loops when we needed to prematurely terminate the loop using `break`. But now with ES6, we can do that with `for-of` loops. I would use `for` loops when I need even more flexibility, such as incrementing the iterator more than once per loop.

Also, when using the `for-of` loop, if you need to access both the index and value of each array element, you can do so with the ES6 Array `entries()` method and destructuring:

```js
const arr = ['a', 'b', 'c'];

for (let [index, elem] of arr.entries()) {
  console.log(index, ': ', elem);
}
```

[[↑] Back to top](#table-of-contents)

### Explain the difference between mutable and immutable objects.

Immutability is a core principle in functional programming, and has lots to offer to object-oriented programs as well. A mutable object is an object whose state can be modified after it is created. An immutable object is an object whose state cannot be modified after it is created.

#### What is an example of an immutable object in JavaScript?

In JavaScript, some built-in types (numbers, strings) are immutable, but custom objects are generally mutable.

Some built-in immutable JavaScript objects are `Math`, `Date`.

Here are a few ways to add/simulate immutability on plain JavaScript objects.

**Object Constant Properties**

By combining `writable: false` and `configurable: false`, you can essentially create a constant (cannot be changed, redefined or deleted) as an object property, like:

```js
let myObject = {};
Object.defineProperty(myObject, 'number', {
  value: 42,
  writable: false,
  configurable: false,
});
console.log(myObject.number); // 42
myObject.number = 43;
console.log(myObject.number); // 42
```

**Prevent Extensions**

If you want to prevent an object from having new properties added to it, but otherwise leave the rest of the object's properties alone, call `Object.preventExtensions(...)`:

```js
var myObject = {
  a: 2,
};

Object.preventExtensions(myObject);

myObject.b = 3;
myObject.b; // undefined
```

In non-strict mode, the creation of `b` fails silently. In strict mode, it throws a `TypeError`.

**Seal**

`Object.seal()` creates a "sealed" object, which means it takes an existing object and essentially calls `Object.preventExtensions()` on it, but also marks all its existing properties as `configurable: false`.

So, not only can you not add any more properties, but you also cannot reconfigure or delete any existing properties (though you can still modify their values).

**Freeze**

`Object.freeze()` creates a frozen object, which means it takes an existing object and essentially calls `Object.seal()` on it, but it also marks all "data accessor" properties as writable:false, so that their values cannot be changed.

This approach is the highest level of immutability that you can attain for an object itself, as it prevents any changes to the object or to any of its direct properties (though, as mentioned above, the contents of any referenced other objects are unaffected).

```js
var immutable = Object.freeze({});
```

Freezing an object does not allow new properties to be added to an object and prevents from removing or altering the existing properties. `Object.freeze()` preserves the enumerability, configurability, writability and the prototype of the object. It returns the passed object and does not create a frozen copy.

#### What are the pros and cons of immutability?

**Pros**

- Easier change detection - Object equality can be determined in a performant and easy manner through referential equality. This is useful for comparing object differences in React and Redux.
- Programs with immutable objects are less complicated to think about, since you don't need to worry about how an object may evolve over time.
- Defensive copies are no longer necessary when immutable objects are returning from or passed to functions, since there is no possibility an immutable object will be modified by it.
- Easy sharing via references - One copy of an object is just as good as another, so you can cache objects or reuse the same object multiple times.
- Thread-safe - Immutable objects can be safely used between threads in a multi-threaded environment since there is no risk of them being modified in other concurrently running threads.
- Using libraries like ImmmutableJS, objects are modified using structural sharing and less memory is needed for having multiple objects with similar structures.

**Cons**

- Naive implementations of immutable data structures and its operations can result in extremely poor performance because new objects are created each time. It is recommended to use libraries for efficient immutable data structures and operations that leverage on structural sharing.
- Allocation (and deallocation) of many small objects rather than modifying existing ones can cause a performance impact. The complexity of either the allocator or the garbage collector usually depends on the number of objects on the heap.
- Cyclic data structures such as graphs are difficult to build. If you have two objects which can't be modified after initialization, how can you get them to point to each other?


[[↑] Back to top](#table-of-contents)

#### How can you achieve immutability in your own code?

One way to achieve immutability is to use libraries like [immutable.js](http://facebook.github.io/immutable-js/), [mori](https://github.com/swannodette/mori) or [immer](https://github.com/immerjs/immer).

The alternative is to use `const` declarations combined with the techniques mentioned above for creation. For "mutating" objects, use the spread operator, `Object.assign`, `Array.concat()`, etc., to create new objects instead of mutate the original object.

Examples:

```js
// Array Example
const arr = [1, 2, 3];
const newArr = [...arr, 4]; // [1, 2, 3, 4]

// Object Example
const human = Object.freeze({race: 'human'});
const john = {...human, name: 'John'}; // {race: "human", name: "John"}
const alienJohn = {...john, race: 'alien'}; // {race: "alien", name: "John"}
```

[[↑] Back to top](#table-of-contents)

### Explain the difference between synchronous and asynchronous functions.

Synchronous functions are blocking while asynchronous functions are not. In synchronous functions, statements complete before the next statement is run. In this case, the program is evaluated exactly in order of the statements and execution of the program is paused if one of the statements take a very long time.

Asynchronous functions usually accept a callback as a parameter and execution continue on the next line immediately after the asynchronous function is invoked. The callback is only invoked when the asynchronous operation is complete and the call stack is empty. Heavy duty operations such as loading data from a web server or querying a database should be done asynchronously so that the main thread can continue executing other operations instead of blocking until that long operation to complete (in the case of browsers, the UI will freeze).

[[↑] Back to top](#table-of-contents)

### What is event loop? What is the difference between call stack and task queue?

The event loop is a single-threaded loop that monitors the call stack and checks if there is any work to be done in the task queue. If the call stack is empty and there are callback functions in the task queue, a function is dequeued and pushed onto the call stack to be executed.

[[↑] Back to top](#table-of-contents)

### Explain the differences on the usage of `foo` between `function foo() {}` and `var foo = function() {}`

The former is a function declaration while the latter is a function expression. The key difference is that function declarations have its body hoisted but the bodies of function expressions are not (they have the same hoisting behavior as variables). If you try to invoke a function expression before it is defined, you will get an `Uncaught TypeError: XXX is not a function` error.

**Function Declaration**

```js
foo(); // 'FOOOOO'
function foo() {
  console.log('FOOOOO');
}
```

**Function Expression**

```js
foo(); // Uncaught TypeError: foo is not a function
var foo = function () {
  console.log('FOOOOO');
};
```

[[↑] Back to top](#table-of-contents)

### What are the differences between variables created using `let`, `var` or `const`?

Variables declared using the `var` keyword are scoped to the function in which they are created, or if created outside of any function, to the global object. `let` and `const` are _block scoped_, meaning they are only accessible within the nearest set of curly braces (function, if-else block, or for-loop).

```js
function foo() {
  // All variables are accessible within functions.
  var bar = 'bar';
  let baz = 'baz';
  const qux = 'qux';

  console.log(bar); // bar
  console.log(baz); // baz
  console.log(qux); // qux
}

console.log(bar); // ReferenceError: bar is not defined
console.log(baz); // ReferenceError: baz is not defined
console.log(qux); // ReferenceError: qux is not defined
```

```js
if (true) {
  var bar = 'bar';
  let baz = 'baz';
  const qux = 'qux';
}

// var declared variables are accessible anywhere in the function scope.
console.log(bar); // bar
// let and const defined variables are not accessible outside of the block they were defined in.
console.log(baz); // ReferenceError: baz is not defined
console.log(qux); // ReferenceError: qux is not defined
```

`var` allows variables to be hoisted, meaning they can be referenced in code before they are declared. `let` and `const` will not allow this, instead throwing an error.

```js
console.log(foo); // undefined

var foo = 'foo';

console.log(baz); // ReferenceError: can't access lexical declaration 'baz' before initialization

let baz = 'baz';

console.log(bar); // ReferenceError: can't access lexical declaration 'bar' before initialization

const bar = 'bar';
```

Redeclaring a variable with `var` will not throw an error, but `let` and `const` will.

```js
var foo = 'foo';
var foo = 'bar';
console.log(foo); // "bar"

let baz = 'baz';
let baz = 'qux'; // Uncaught SyntaxError: Identifier 'baz' has already been declared
```

`let` and `const` differ in that `let` allows reassigning the variable's value while `const` does not.

```js
// This is fine.
let foo = 'foo';
foo = 'bar';

// This causes an exception.
const baz = 'baz';
baz = 'qux';
```

[[↑] Back to top](#table-of-contents)

### What are the differences between ES6 class and ES5 function constructors?

```js
// ES5 Function Constructor
function Person(name) {
  this.name = name;
}

// ES6 Class
class Person {
  constructor(name) {
    this.name = name;
  }
}
```

For simple constructors, they look pretty similar.

The main difference in the constructor comes when using inheritance. If we want to create a `Student` class that subclasses `Person` and add a `studentId` field, this is what we have to do in addition to the above.

```js
// ES5 Function Constructor
function Student(name, studentId) {
  // Call constructor of superclass to initialize superclass-derived members.
  Person.call(this, name);

  // Initialize subclass's own members.
  this.studentId = studentId;
}

Student.prototype = Object.create(Person.prototype);
Student.prototype.constructor = Student;

// ES6 Class
class Student extends Person {
  constructor(name, studentId) {
    super(name);
    this.studentId = studentId;
  }
}
```

[[↑] Back to top](#table-of-contents)

### Can you offer a use case for the new arrow => function syntax? How does this new syntax differ from other functions?

One obvious benefit of arrow functions is to simplify the syntax needed to create functions, without a need for the `function` keyword. The `this` within arrow functions is also bound to the enclosing scope which is different compared to regular functions where the `this` is determined by the object calling it. Lexically-scoped `this` is useful when invoking callbacks especially in React components.

[[↑] Back to top](#table-of-contents)

### What advantage is there for using the arrow syntax for a method in a constructor?

The main advantage of using an arrow function as a method inside a constructor is that the value of `this` gets set at the time of the function creation and can't change after that. So, when the constructor is used to create a new object, `this` will always refer to that object. For example, let's say we have a `Person` constructor that takes a first name as an argument has two methods to `console.log` that name, one as a regular function and one as an arrow function:

```js
const Person = function (firstName) {
  this.firstName = firstName;
  this.sayName1 = function () {
    console.log(this.firstName);
  };
  this.sayName2 = () => {
    console.log(this.firstName);
  };
};

const john = new Person('John');
const dave = new Person('Dave');

john.sayName1(); // John
john.sayName2(); // John

// The regular function can have its 'this' value changed, but the arrow function cannot
john.sayName1.call(dave); // Dave (because "this" is now the dave object)
john.sayName2.call(dave); // John

john.sayName1.apply(dave); // Dave (because 'this' is now the dave object)
john.sayName2.apply(dave); // John

john.sayName1.bind(dave)(); // Dave (because 'this' is now the dave object)
john.sayName2.bind(dave)(); // John

var sayNameFromWindow1 = john.sayName1;
sayNameFromWindow1(); // undefined (because 'this' is now the window object)

var sayNameFromWindow2 = john.sayName2;
sayNameFromWindow2(); // John
```

The main takeaway here is that `this` can be changed for a normal function, but the context always stays the same for an arrow function. So even if you are passing around your arrow function to different parts of your application, you wouldn't have to worry about the context changing.

This can be particularly helpful in React class components. If you define a class method for something such as a click handler using a normal function, and then you pass that click handler down into a child component as a prop, you will need to also bind `this` in the constructor of the parent component. If you instead use an arrow function, there is no need to also bind "this", as the method will automatically get its "this" value from its enclosing lexical context. (See this article for an excellent demonstration and sample code: https://medium.com/@machnicki/handle-events-in-react-with-arrow-functions-ede88184bbb)

[[↑] Back to top](#table-of-contents)

### What is the definition of a higher-order function?
    
Higher order functions are functions that operate on other functions, either by taking them as arguments or by returning them. In simple words, A Higher-Order function is a function that receives a function as an argument or returns the function as output.

A higher-order function is any function that takes one or more functions as arguments, which it uses to operate on some data, and/or returns a function as a result. Higher-order functions are meant to abstract some operation that is performed repeatedly. The classic example of this is `map`, which takes an array and a function as arguments. `map` then uses this function to transform each item in the array, returning a new array with the transformed data. Other popular examples in JavaScript are `forEach`, `filter`, and `reduce`. A higher-order function doesn't just need to be manipulating arrays as there are many use cases for returning a function from another function. `Function.prototype.bind` is one such example in JavaScript.

**Map**

```js
const names = ['irish', 'daisy', 'anna'];

const transformNamesToUppercase = function (names) {
  const results = [];
  for (let i = 0; i < names.length; i++) {
    results.push(names[i].toUpperCase());
  }
  return results;
};
transformNamesToUppercase(names); // ['IRISH', 'DAISY', 'ANNA']
```

Use `.map(transformerFn)` makes the code shorter and more declarative.

```js
const transformNamesToUppercase = function (names) {
  return names.map((name) => name.toUpperCase());
};
transformNamesToUppercase(names); // ['IRISH', 'DAISY', 'ANNA']
```

[[↑] Back to top](#table-of-contents)

### Can you give an example for destructuring an object or an array?

Destructuring is an expression available in ES6 which enables a succinct and convenient way to extract values of Objects or Arrays and place them into distinct variables.

**Array destructuring**

```js
// Variable assignment.
const foo = ['one', 'two', 'three'];

const [one, two, three] = foo;
console.log(one); // "one"
console.log(two); // "two"
console.log(three); // "three"
```

```js
// Swapping variables
let a = 1;
let b = 3;

[a, b] = [b, a];
console.log(a); // 3
console.log(b); // 1
```

**Object destructuring**

```js
// Variable assignment.
const o = {p: 42, q: true};
const {p, q} = o;

console.log(p); // 42
console.log(q); // true
```
    
[[↑] Back to top](#table-of-contents)

### ES6 Template Literals offer a lot of flexibility in generating strings, can you give an example?

Template literals help make it simple to do string interpolation, or to include variables in a string. Before ES2015, it was common to do something like this:

```js
var person = {name: 'Tyler', age: 28};
console.log(
  'Hi, my name is ' + person.name + ' and I am ' + person.age + ' years old!',
);
// 'Hi, my name is Tyler and I am 28 years old!'
```

With template literals, you can now create that same output like this instead:

```js
const person = {name: 'Tyler', age: 28};
console.log(`Hi, my name is ${person.name} and I am ${person.age} years old!`);
// 'Hi, my name is Tyler and I am 28 years old!'
```

Note that you use backticks, not quotes, to indicate that you are using a template literal and that you can insert expressions inside the `${}` placeholders.

A second helpful use case is in creating multi-line strings. Before ES2015, you could create a multi-line string like this:

```js
console.log('This is line one.\nThis is line two.');
// This is line one.
// This is line two.
```

Or if you wanted to break it up into multiple lines in your code so you didn't have to scroll to the right in your text editor to read a long string, you could also write it like this:

```js
console.log('This is line one.\n' + 'This is line two.');
// This is line one.
// This is line two.
```

Template literals, however, preserve whatever spacing you add to them. For example, to create that same multi-line output that we created above, you can simply do:

```js
console.log(`This is line one.
This is line two.`);
// This is line one.
// This is line two.
```

Another use case of template literals would be to use as a substitute for templating libraries for simple variable interpolations:

```js
const person = {name: 'Tyler', age: 28};
document.body.innerHTML = `
  <div>
    <p>Name: ${person.name}</p>
    <p>Age: ${person.age}</p>
  </div>
`;
```

[[↑] Back to top](#table-of-contents)

### Can you give an example of a curry function and why this syntax offers an advantage?

Currying is a technique of evaluating function with multiple arguments, into sequence of functions with single argument.In other words, when a function, instead of taking all arguments at one time, takes the first one and return a new function that takes the second one and returns a new function which takes the third one, and so forth, until all arguments have been fulfilled.
    
Currying is a pattern where a function with more than one parameter is broken into multiple functions that, when called in series, will accumulate all of the required parameters one at a time. This technique can be useful for making code written in a functional style easier to read and compose. It's important to note that for a function to be curried, it needs to start out as one function, then broken out into a sequence of functions that each accepts one parameter.

```js
function curry(f) { // curry(f) does the currying transform
  return function(a) {
    return function(b) {
      return f(a, b);
    };
  };
}
// usage
function sum(a, b) {
  return a + b;
}

let curriedSum = curry(sum);

alert( curriedSum(1)(2) ); // 3
    
function sum(a, b) {
  return a + b;
}

let curriedSum = _.curry(sum); // using _.curry from lodash library

alert( curriedSum(1, 2) ); // 3, still callable normally
alert( curriedSum(1)(2) ); // 3, called partially
```

[[↑] Back to top](#table-of-contents)

### What are the benefits of using spread syntax and how is it different from rest syntax?

ES6's spread syntax is very useful when coding in a functional paradigm as we can easily create copies of arrays or objects without resorting to `Object.create`, `slice`, or a library function. This language feature is used often in Redux and RxJS projects.

```js
function putDookieInAnyArray(arr) {
  return [...arr, 'dookie'];
}

const result = putDookieInAnyArray(['I', 'really', "don't", 'like']); // ["I", "really", "don't", "like", "dookie"]

const person = {
  name: 'Todd',
  age: 29,
};

const copyOfTodd = {...person};
```

ES6's rest syntax offers a shorthand for including an arbitrary number of arguments to be passed to a function. It is like an inverse of the spread syntax, taking data and stuffing it into an array rather than unpacking an array of data, and it works in function arguments, as well as in array and object destructuring assignments.

```js
function addFiveToABunchOfNumbers(...numbers) {
  return numbers.map((x) => x + 5);
}

const result = addFiveToABunchOfNumbers(4, 5, 6, 7, 8, 9, 10); // [9, 10, 11, 12, 13, 14, 15]

const [a, b, ...rest] = [1, 2, 3, 4]; // a: 1, b: 2, rest: [3, 4]

const {e, f, ...others} = {
  e: 1,
  f: 2,
  g: 3,
  h: 4,
}; // e: 1, f: 2, others: { g: 3, h: 4 }
```
    
[[↑] Back to top](#table-of-contents)

### How can you share code between files?

This depends on the JavaScript environment.

On the client (browser environment), as long as the variables/functions are declared in the global scope (`window`), all scripts can refer to them. Alternatively, adopt the Asynchronous Module Definition (AMD) via RequireJS for a more modular approach.

On the server (Node.js), the common way has been to use CommonJS. Each file is treated as a module and it can export variables and functions by attaching them to the `module.exports` object.

ES2015 defines a module syntax which aims to replace both AMD and CommonJS. This will eventually be supported in both browser and Node environments.

[[↑] Back to top](#table-of-contents)


### Why you might want to create static class members?

Static class members (properties/methods) are not tied to a specific instance of a class and have the same value regardless of which instance is referring to it. Static properties are typically configuration variables and static methods are usually pure utility functions which do not depend on the state of the instance.

[[↑] Back to top](#table-of-contents)

### What is the difference between while and do-while loops in JavaScript?
    
In While loop, the condition tested at the beginning of the loop, and if the condition is True, statements inside the loop will execute. It means the While loop executes the code block only if the condition is True.
    
At the end of the loop, the Do While loop tests the condition. So, Do While executes the statements in the code block at least once even if the condition Fails.

[[↑] Back to top](#table-of-contents)

### What is a promise? Where and how would you use promise?
    
A promise is an object that may produce a single value some time in the future : either a resolved value, or a reason that it's not resolved (e.g., a network error occurred). A promise may be in one of 3 possible states: fulfilled, rejected, or pending.

```js
function getData(dataItems) {
    return new Promise((resolve, reject) => {
        try {
            setTimeout(() => {
                resolve(dataItems)
            }, 3000);
        }
        catch (error) {
            reject(console.log(error))
        }
    })
}
getData(names).then(data=>{
    let newName = 'Han Yoo Joo'
    data.push(newName)
    return data
}).then(finalData=>{
    console.log(finalData)
})
```
```js
new Promise((resolve, reject) => {
  throw new Error("error");
})
  .finally(() => alert("Promise ready"))
  .catch(err => alert(err));  // <-- .catch handles the error object
```

[[↑] Back to top](#table-of-contents)
                                     
### main thread vs micro vs macro in promise
                                     
`main thread (console.log) > micro (promise, async) > macro (timeout, interval)`

```js
//Question 1
const myPromise = new Promise(res => res('Promise!'));

function funcOne() {
  myPromise.then(res => res).then(res => console.log(res)); // microtask
  setTimeout(() => console.log('Timeout!'), 0); // macrotask
  console.log('Last line!'); // main thread
}

funcOne();

//Output:
Last Line
Promise
Timeout
```
    
async await == promise
async always goes before await
async function myPro() {
  const res = await myPromise   //pauses after await - after await everything can be treated as .then() in promise - Microtask
  console.log(res);
}
V.S. 
myPromise.then(res => console.log(res))   //same as above

```js
//Question 2
const myPromise = new Promise(res => res('Promise!'));
function funcOne() {
  myPromise.then(res => res).then(res => console.log(res, 1)); // microtask
  setTimeout(() => console.log('Timeout! 1'), 0); // macrotask
  console.log('Last line! 1'); // main thread
}

async function funcTwo() {
  const res = await myPromise; // pauses
  console.log(res, 2);
  setTimeout(() => console.log('Timeout! 2'), 0);
  console.log('Last line! 2');
}
funcOne();
funcTwo();

//Output:
Last Line 1
Promise 1
Promise 2
Last Line 2
Timeout 1
Timeout 2
```

[[↑] Back to top](#table-of-contents)
