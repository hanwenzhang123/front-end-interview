---
title: Coding Questions
---

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

//var add = function(x) {       //currying
//    return function(y) { 
//    return x + y; 
//    };
//}
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
  var a = b = 3;    //var a = (b = 3) 
})();

console.log("a defined? " + (typeof a !== 'undefined'));    //a defined? false
console.log("b defined? " + (typeof b !== 'undefined'));    //b defined? true

console.log(a)  //referenceError
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
  return     // get a automatic semicolon insert here
  {
      bar: "hello"
  };
}

foo1()  //{bar: 'hello'}
foo2()  //undefined
```

### https://www.interviewbit.com/javascript-interview-questions#coding-problems

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
  for(var i = 0; i < 3; i++){   //the variable i is incremented first and then checked 
    setTimeout(()=> console.log(i),2000); //var keyword does not have block scope, only function scope
  }
}

func2();    //3 3 3

// Code 2:
function func2(){
  for(let i = 0; i < 3; i++){   //let/const keyword has block scope
    setTimeout(()=> console.log(i),2000);
  }
}

func2();    //0 1 2

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

x[y] = {name:"Vivek"};    //x[‘object Object’] = {name:”Vivek”}  -  javascript coerces the parameter into a string.
x[z] = {name:"Akki"};   //referencing the same property 'x'

console.log(x[y]);  //{name: 'Akki'}

// Code 2:
function runFunc(){
  console.log("1" + 1); //11
  console.log("A" - 1);   //NaN
  console.log(2 + "-2" + "2");  //2-22
  console.log("Hello" - "World" + 78);  //NaN
  console.log("Hello"+ "78");   //Hello78
}

runFunc();

// Code 3:
let a = 0;
let b = false;
console.log((a == b));    //true
console.log((a === b));   //false
```

Question: Guess the output of the following code:
```javascript
var x = 23;

(function(){
  var x = 43;
  (function random(){
    x++;  // x is not a number since it is not initialized yet
    console.log(x);   //Output NaN
    var x = 21; // Initialization of x, x is hoisted
  })();
})();
```

Question: Guess the output of the following code:
```javascript
// Code 1
  let hero = {
    powerLevel: 99,
    getPower(){
      return this.powerLevel;
    }
  }
  
  let getPower = hero.getPower;
  
  let hero2 = {powerLevel:42};
  console.log(getPower());    //undefined - when the function is invoked, it is invoked referencing the global object: window.getPower() = getPower();
  console.log(getPower.apply(hero2));   //42
  
  // Code 2
  const a = function(){
    console.log(this);  //Window
  
    const b = {
      func1: function(){
        console.log(this);  //func1
      }  
    }
  
    const c = {
      func2: ()=>{
        console.log(this);  //Window
      }
    }
  
    b.func1();
    c.func2();
  }
  
  a();

  // Code 3
  const b = {
    name:"Vivek",
    f: function(){
      var self = this;
      console.log(this.name);   //"Vivek"
      (function(){
        console.log(this.name); //undefined - this keyword refers to the global/window object in the IIFE 
        console.log(self.name); //"Vivek"
      })();
    }
  }
  
  b.f();
```

Question: Guess the output of the following code:
```javascript
// Code 1
(function(a){
  return (function(){
    console.log(a);
    a = 23;
  })()
})(45);

//45 - Even though a is defined in the outer function, due to closure the inner functions have access to it.

// Code 2
// Each time bigFunc is called, an array of size 700 is being created,
// Modify the code so that we don't create the same array again and again

function bigFunc(element){
  let newArray = new Array(700).fill('♥');
  return newArray[element];
}

console.log(bigFunc(599)); // Array is created
console.log(bigFunc(670)); // Array is created again

//Solution
function bigFunc(){
  let newArray = new Array(700).fill('♥');
  return (element) => newArray[element];
}
let getElement = bigFunc(); // Array is created only once
getElement(599);
getElement(670);  

// Code 3
// The following code outputs 2 and 2 after waiting for one second
// Modify the code to output 0 and 1 after one second.

function randomFunc(){
  for(var i = 0; i < 2; i++){ 
    setTimeout(()=> console.log(i),1000);
  }
}

randomFunc();

//Using let keyword:
function randomFunc(){
  for(let i = 0; i < 2; i++){
    setTimeout(()=> console.log(i),1000);
  }
}
randomFunc();

//Using closure:
function randomFunc(){
  for(var i = 0; i < 2; i++){
  (function(i){
      setTimeout(()=>console.log(i),1000);
    })(i);
  }
}
randomFunc();  
```

Question: Write a function that performs binary search on a sorted array.
```javascript
function binarySearch(arr,value,startPos,endPos){
  if(startPos > endPos) return -1;

  let middleIndex = Math.floor(startPos+endPos)/2;

  if(arr[middleIndex] === value) return middleIndex;

  elsif(arr[middleIndex > value]){
    return binarySearch(arr,value,startPos,middleIndex-1);
  }
  else{
    return binarySearch(arr,value,middleIndex+1,endPos);
  }
}   
```

Question: Implement a function that returns an updated array with r right rotations on an array of integers a .

Example:

Given the following array:

[2,3,4,5,7]

Perform 3 right rotations:

First rotation : [7,2,3,4,5] , Second rotation : [5,7,2,3,4] and, Third rotation: [4,5,7,2,3]

return [4,5,7,2,3]

```javascript
function rotateRight(arr,rotations){
  if(rotations == 0) return arr;
  for(let i = 0; i < rotations;i++){
    let element = arr.pop();
    arr.unshift(element);
  }

  return arr;
}

rotateRight([2, 3, 4, 5, 7], 3); // Return [4,5,7,2,3]
rotateRight([44, 1, 22, 111], 5); // Returns [111,44,1,22]   
```
  
