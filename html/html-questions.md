---
title: HTML Questions
---

## Table of Contents

- [What does a doctype do?](#what-does-a-doctype-do)
- [How do you serve a page with content in multiple languages?](#how-do-you-serve-a-page-with-content-in-multiple-languages)
- [What kind of things must you be wary of when designing or developing for multilingual sites?](#what-kind-of-things-must-you-be-wary-of-when-designing-or-developing-for-multilingual-sites)
- [What are `data-` attributes good for?](#what-are-data--attributes-good-for)
- [Consider HTML5 as an open web platform. What are the building blocks of HTML5?](#consider-html5-as-an-open-web-platform-what-are-the-building-blocks-of-html5)
- [Describe the difference between a `cookie`, `sessionStorage` and `localStorage`.](#describe-the-difference-between-a-cookie-sessionstorage-and-localstorage)
- [Describe the difference between `<script>`, `<script async>` and `<script defer>`.](#describe-the-difference-between-script-script-async-and-script-defer)
- [Why is it generally a good idea to position CSS `<link>`s between `<head></head>` and JS `<script>`s just before `</body>`? Do you know any exceptions?](#why-is-it-generally-a-good-idea-to-position-css-links-between-headhead-and-js-scripts-just-before-body-do-you-know-any-exceptions)
- [What is progressive rendering?](#what-is-progressive-rendering)
- [Why you would use a `srcset` attribute in an image tag? Explain the process the browser uses when evaluating the content of this attribute.](#why-you-would-use-a-srcset-attribute-in-an-image-tag-explain-the-process-the-browser-uses-when-evaluating-the-content-of-this-attribute)
- [Have you used different HTML templating languages before?](#have-you-used-different-html-templating-languages-before)
- [What is the meta tag in the head tag? Why do we need it?](#what-is-the-meta-tag-in-the-head-tag? Why-do-we-need-it)
- [List some semantic tags in HTML5](#list-some-semantic-tags-in-HTML5)
- [Link element in separate tab](#link-element-in-separate-tab)
- [What is the difference between block element and inline element?](#what-is-the-difference-between-block-element-and-inline-element)
- [List some form elements](#list-some-form-elements)
- [What are empty elements in HTML?](#what-are-empty-elements-in-HTML)
- [Video and Audio Tag](#video-and-audio-tag)
- [What is the difference between canvas and svg?](#what-is-the-difference-between-canvas-and-svg)

### What does a DOCTYPE do?

**DOCTYPE** is an abbreviation for **Document Type**. A DOCTYPE is always associated to a **DTD** - for **Document Type Definition**.

All HTML documents must start with a <!DOCTYPE> declaration.
The declaration is not an HTML tag. It is an "information" to the browser about what document type to expect.

The <!DOCTYPE> declaration is NOT case sensitive.
The DOCTYPE declaration for the HTML5 standards is `<!DOCTYPE html>`. 

#### What is that !DOCTYPE we place at the top of the HTML file? Why do we need it?
!DOCTYPE is for the browser to know here is the HTML code that we will be rendering, so when we create the HTML file, the first line of the code is to place a <!DOCTYPE> on top of everything to let the browser know the following code is for HTML.

[[↑] Back to top](#table-of-contents)

### How do you serve a page with content in multiple languages?

The most common case, serve a page with content available in multiple languages, but the content within the page should be displayed only in one consistent language.

The returned HTML document should also declare the lang attribute in the `<html>` tag, such as `<html lang="en">...</html>`. The server can then use this information to return a version of the document in the appropriate language if such an alternative is available. 
  
Make use of the `hreflang` attribute in the `<head>`. Eg. `<link rel="alternate" hreflang="de" href="http://de.example.com/page.html" />`

[[↑] Back to top](#table-of-contents)

### What kind of things must you be wary of when designing or developing for multilingual sites?

- Use `lang` attribute in your HTML.
- Directing users to their native language - Allow a user to change his country/language easily without hassle.
- Formatting dates and currencies - Calendar dates are sometimes presented in different ways. Eg. "May 31, 2012" in the U.S. vs. "31 May 2012" in parts of Europe.

[[↑] Back to top](#table-of-contents)

### What are `data-` attributes good for?

The data-* attribute is used to store custom data private to the page or application.
  
The data-* attribute gives us the ability to embed custom data attributes on all HTML elements.
  
The stored (custom) data can then be used in the page's JavaScript to create a more engaging user experience.

```html
<ul>
  <li data-animal-type="bird">Owl</li>
  <li data-animal-type="fish">Salmon</li>
  <li data-animal-type="spider">Tarantula</li>
</ul>
```
  
These days, using data- attributes is generally not encouraged. However, one valid use of data attributes is to add a hook for _end to end_ testing frameworks such as Selenium. The element needs a way to be found by a particular Selenium spec and something like `data-selector='the-thing'` is a valid way to do so without convoluting the semantic markup otherwise.

[[↑] Back to top](#table-of-contents)

### Consider HTML5 as an open web platform. What are the building blocks of HTML5?

- Semantics - Allowing you to describe more precisely what your content is.
- Connectivity - Allowing you to communicate with the server in new and innovative ways.
- Offline and storage - Allowing webpages to store data on the client-side locally and operate offline more efficiently.
- Multimedia - Making video and audio first-class citizens in the Open Web.
- 2D/3D graphics and effects - Allowing a much more diverse range of presentation options.
- Performance and integration - Providing greater speed optimization and better usage of computer hardware.
- Device access - Allowing for the usage of various input and output devices.
- Styling - Letting authors write more sophisticated themes.

[[↑] Back to top](#table-of-contents)

### Describe the difference between a `cookie`, `sessionStorage` and `localStorage`.

All the above-mentioned technologies are key-value storage mechanisms on the client side. They are only able to store values as strings.

|  | `cookie` | `localStorage` | `sessionStorage` |
| --- | --- | --- | --- |
| Initiator | Client or server. Server can use `Set-Cookie` header | Client | Client |
| Expiry | Manually set | Forever | On tab close |
| Persistent across browser sessions | Depends on whether expiration is set | Yes | No |
| Sent to server with every HTTP request | Cookies are automatically being sent via `Cookie` header | No | No |
| Capacity (per domain) | 4kb | 5MB | 5MB |
| Accessibility | Any window | Any window | Same tab |

_Note: If the user decides to clear browsing data via whatever mechanism provided by the browser, this will clear out any `cookie`, `localStorage`, or `sessionStorage` stored. It's important to keep this in mind when designing for local persistance, especially when comparing to alternatives such as server side storing in a database or similar (which of course will persist despite user actions)._

[[↑] Back to top](#table-of-contents)

### Describe the difference between `<script>`, `<script async>` and `<script defer>`.

- `<script>` - HTML parsing is blocked, the script is fetched and executed immediately, HTML parsing resumes after the script is executed.
- `<script async>` - The script will be fetched in parallel to HTML parsing and executed as soon as it is available (potentially before HTML parsing completes). Use `async` when the script is independent of any other scripts on the page, for example, analytics.
- `<script defer>` - The script will be fetched in parallel to HTML parsing and executed when the page has finished parsing. If there are multiple of them, each deferred script is executed in the order they were encoun­tered in the document. If a script relies on a fully-parsed DOM, the `defer` attribute will be useful in ensuring that the HTML is fully parsed before executing. There's not much difference in putting a normal `<script>` at the end of `<body>`. 

Note: The `async` and `defer` attrib­utes are ignored for scripts that have no `src` attribute.

[[↑] Back to top](#table-of-contents)

### Why is it generally a good idea to position CSS `<link>`s between `<head></head>` and JS `<script>`s just before `</body>`? Do you know any exceptions?

**Placing `<link>`s in the `<head>`**

When a page first loads, HTML and CSS are being parsed simultaneously; HTML creates the DOM (Document Object Model) and CSS creates the CSSOM (CSS Object Model). Both are needed to create the visuals in a website, allowing for a quick "first meaningful paint" timing. This progressive rendering is a category optimization sites are measured in their performance scores. 

**Placing `<script>`s just before `</body>`**

`<script>` tags block HTML parsing while they are being downloaded and executed which can slow down your page. Placing the scripts at the bottom will allow the HTML to be parsed and displayed to the user first.

Placing `<script>`s at the bottom means that the browser cannot start downloading the scripts until the entire document is parsed. This ensures your code that needs to manipulate DOM elements will not throw an error and halt the entire script. 
  
If you need to put `<script>` in the `<head>`, use the `defer` attribute, which will achieve the same effect of downloading and running the script only after the HTML is parsed.

[[↑] Back to top](#table-of-contents)

### What is progressive rendering?

Progressive rendering is the name given to techniques used to improve the performance of a webpage (in particular, improve perceived load time) to render content for display as quickly as possible.

Examples of such techniques:

- Lazy loading of images - Images on the page are not loaded all at once. JavaScript will be used to load an image when the user scrolls into the part of the page that displays the image.
- Prioritizing visible content (or above-the-fold rendering) - Include only the minimum CSS/content/scripts necessary for the amount of page that would be rendered in the users browser first to display as quickly as possible, you can then use deferred scripts or listen for the `DOMContentLoaded`/`load` event to load in other resources and content.

[[↑] Back to top](#table-of-contents)

### Why you would use a `srcset` attribute in an image tag? Explain the process the browser uses when evaluating the content of this attribute.

You would use the `srcset` attribute when you want to serve different images to users depending on their device display width - serve higher quality images to devices with retina display enhances the user experience while serving lower resolution images to low-end devices increase performance and decrease data wastage.
	
For example: `<img srcset="small.jpg 500w, medium.jpg 1000w, large.jpg 2000w" src="..." alt="">` tells the browser to display the small, medium or large `.jpg` graphic depending on the client's resolution. The first value is the image name and the second is the width of the image in pixels. 

`srcset`s solve the problem whereby you want to serve smaller image files to narrow screen devices, as they don't need huge images like desktop displays do — and also optionally that you want to serve different resolution images to high density/low-density screens.

[[↑] Back to top](#table-of-contents)

### Have you used different HTML templating languages before?

Yes, EJS and Pug (formerly Jade), also heard about Handlebars. In my opinion, they are more or less the same and provide similar functionality of escaping content and helpful filters for manipulating the data to be displayed. Most templating engines will also allow you to inject your own filters in the event you need custom processing before display.

[[↑] Back to top](#table-of-contents)

### What is the meta tag in the head tag? Why do we need it?

The `<meta>` tag defines metadata about an HTML document. Metadata is data (information) about data. `<meta>` tags always go inside the `<head>` element, and are typically used to specify character set, page description, keywords, author of the document, and viewport settings.
	
`<meta>` is important for SEO (search engine optimization). we do not visually see any of the code in the browser, whatever in the meta tag will not appear anywhere other than the source code, but the browser will analyze the information. 
	
[[↑] Back to top](#table-of-contents)
  
### List some semantic tags in HTML5

A semantic element clearly describes its meaning to both the browser and the developer. semantic elements help structure the code we create, making it more readable and easier to maintain.

Semantic HTML elements are those that clearly describe their meaning in a human- and machine-readable way. It is the key starting point toward good accessibility practices. When a screen reader, or any sort of assistive device scans a web page, it gets information about the Document Object Model (DOM), or the HTML structure of the page.

`<main> </main>`; `<section></section>`; `<article></article>`; `<header></<header>`; `<footer></footer>`; `<nav></nav>`;
  
[[↑] Back to top](#table-of-contents)
	
### Link element in separate tab
#### Write a code snippet to achieve the requirements set up a link for user, user can click the link and redirect user to the Youtube in the separate tab
`<a href=“https://www.youtube.com/” target="_blank"></a>`

The target attribute specifies where to open the linked document.
`<a target="_blank(new tab)|_self(same frame - default)|_parent(parent frame)|_top(full body of Window)|framename(named iframe)">`
	
[[↑] Back to top](#table-of-contents)

### What is the difference between block element and inline element?

Inline elements do not force a new line to begin in the document flow. Block elements typically cause a line break to occur.

Block element takes the whole block that starts a new line while inline element takes the space as needed but does not force to start a new line; `<div>` is a block element example while `<span>` is a inline element example.
	
[[↑] Back to top](#table-of-contents)

### List some form elements
`<form method="get|post">`
The form-data can be sent as URL variables (with method="get") (non-secure data, like query strings in Google) or as HTTP post transaction (with method="post").

```html
<form action="/action_page.php" method="get" id="form1">
<label for="fname">First name:</label>
<input type="text" id="fname" name="fname"><br><br>
<label for="lname">Last name:</label>
<input type="text" id="lname" name="lname">
<select id="cars" name="cars">
  <option value="volvo" selected>BMW</option>
  <option value="audi">Audi</option>
</select>
</form>

<button type="submit" form="form1" value="Submit">Submit</button>
```

[[↑] Back to top](#table-of-contents)

### What are empty elements in HTML?

Empty elements (also called self-closing or void elements) are not container tags. An empty element is an element cannot have any child nodes.

`<br>`;`<hr>`;`<img src="img_girl.jpg" alt="Girl in a jacket" width="500" height="600">`;
	
[[↑] Back to top](#table-of-contents)

### Video and Audio Tag

The `<video>` tag contains one or more `<source>` tags with different video sources. The browser will choose the first source it supports.

The text between the `<video>` and `</video>` tags will only be displayed in browsers that do not support the `<video>` element.

```html
<video width="320" height="240" controls>
  <source src="movie.mp4" type="video/mp4">
  <source src="movie.ogg" type="video/ogg">
  Your browser does not support the video tag.
</video>
```

Audio
```html
<audio controls>
  <source src="horse.ogg" type="audio/ogg">
  <source src="horse.mp3" type="audio/mpeg">
  Your browser does not support the audio tag.
</audio>
```

[[↑] Back to top](#table-of-contents)

### What is the difference between canvas and svg?

Both are HTML Graphics tags.

The `<canvas>` element is a container for graphics. SVG gives better performance with smaller number of objects or larger surface. Canvas gives better performance with smaller surface or larger number of objects. SVG is vector based and composed of shapes.
	
SVG is a language for describing 2D graphics in XML. Canvas draws 2D graphics, on the fly (with a JavaScript). 
SVG is faster when rendering really large objects, but slower when rendering many objects. A game would probably be faster in Canvas. A huge map program would probably be faster in SVG.
	
[[↑] Back to top](#table-of-contents)

