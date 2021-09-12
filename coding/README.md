---
title: Coding Questions
---

https://www.interviewbit.com/javascript-interview-questions

Question: What is the value of `foo`?
```javascript
var foo = 10 + '20';  //1020
```

Question: What will be the output of the code below?
```javascript
console.log(0.1 + 0.2 == 0.3); //false -  floating point precision
```

Question: How would you make this work?
```javascript
add(2, 5); // 7
add(2)(5); // 7

var add = function(x) {
    return function(y) { 
    return x + y; 
    };
}
```

Question: What value is returned from the following statement?
```javascript
"i'm a lasagna hog".split("").reverse().join("");
//"goh angasal a m'i"
```

Question: What is the value of `window.foo`?
```javascript
( window.foo || ( window.foo = "bar" ) ); //'bar'
```

Question: What is the outcome of the two alerts below?
```javascript
var foo = "Hello";
(function() {
  var bar = " World";
  alert(foo + bar); //Hello World
})();
alert(foo + bar); //Hello
```

Question: What is the value of `foo.length`?
```javascript
var foo = [];
foo.push(1);
foo.push(2);
// [1, 2]
```

Question: What is the value of `foo.x`?
```javascript
var foo = {n: 1};
var bar = foo;
foo.x = foo = {n: 2};
//{n: 2}
```

Question: What does the following code print?
```javascript
//main thread (console.log) > micro (promise, async) > macro (timeout, interval)

console.log('one');   //1
setTimeout(function() {    //4
  console.log('two');
}, 0);
Promise.resolve().then(function() {
  console.log('three');   //3
})
console.log('four');    //2
```

Question: What is the difference between these four promises?
```javascript
doSomething().then(function () {    //Chained in Sequence, with parameter passing.
  return doSomethingElse();
});

doSomething().then(function () {    //Executed in Sequence (not chained), with no parameter passing.
  doSomethingElse();
});

doSomething().then(doSomethingElse());  //Executed Immediately, Probably a Bug

doSomething().then(doSomethingElse);  //Chained in Sequence, with parameter passing.
```

Question: What will the code below output to the console and why?
```javascript
(function(){
  var a = b = 3;
})();

console.log("a defined? " + (typeof a !== 'undefined'));    //a defined? false
console.log("b defined? " + (typeof b !== 'undefined'));    //b defined? true
```

Question: Consider the two functions below. Will they both return the same thing? Why or why not?
```javascript
function foo1()
{
  return {
      bar: "hello"
  };
}

function foo2()
{
  return
  {
      bar: "hello"
  };
}

foo1()  //{bar: 'hello'}
foo2()  //undefined
```

Question: Guess the outputs of the following codes:
```javascript
// Code 1:
function func1(){
  setTimeout(()=>{
    console.log(x);
    console.log(y);
  },3000);

  var x = 2;
  let y = 12;
}

func1();    //2, 12

// Code 2:
function func2(){
  for(var i = 0; i < 3; i++){
    setTimeout(()=> console.log(i),2000);
}

}

func2();    //3

// Code 3:
(function(){
  setTimeout(()=> console.log(1),2000);
  console.log(2);
  setTimeout(()=> console.log(3),0);
  console.log(4);
})();

//2
//4
//3
//1 // After two seconds
```

Question: Guess the outputs of the following code:
```javascript
// Code 1:

let x= {}, y = {name:"Ronny"},z = {name:"John"};

x[y] = {name:"Vivek"};
x[z] = {name:"Akki"};

console.log(x[y]);

// Code 2:

function runFunc(){
  console.log("1" + 1);
  console.log("A" - 1);
  console.log(2 + "-2" + "2");
  console.log("Hello" - "World" + 78);
  console.log("Hello"+ "78");
}

runFunc();

// Code 3:

let a = 0;
let b = false;
console.log((a == b));
console.log((a === b));
```

Question: Consider the two functions below. Will they both return the same thing? Why or why not?
```javascript
```

Question: Consider the two functions below. Will they both return the same thing? Why or why not?
```javascript
```

Question: Consider the two functions below. Will they both return the same thing? Why or why not?
```javascript
```

Question: Consider the two functions below. Will they both return the same thing? Why or why not?
```javascript
```

Question: Consider the two functions below. Will they both return the same thing? Why or why not?
```javascript
```

Question: Consider the two functions below. Will they both return the same thing? Why or why not?
```javascript
```

Question: Consider the two functions below. Will they both return the same thing? Why or why not?
```javascript
```
