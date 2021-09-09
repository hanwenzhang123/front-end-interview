---
title: CSS Questions
---

## Table of Contents

- [How many ways can you embed css code into an html file?](#how-many-ways-can-you-embed-css-code-into-an-html-file)
- [What is CSS selector specificity and how does it work?](#what-is-css-selector-specificity-and-how-does-it-work)
- [CSS The !important Rule](#CSS-The-!important-Rule) 
- [What is pseudo element and pseudo class?](#what-is-pseudo-element-and-pseudo-class)
- [What is margin collapse?](#what-is-margin-collapse)
- [The CSS Box Model](#The-CSS-Box-Model)
- [What are CSS box-sizing attributes?](#what-are-CSS-box-sizing-attributes)
- [CSS to hide HTML elements and their differences?](#CSS-to-hide-HTML-elements-and-their-differences)
- [What are CSS image sprites?](#what-are-CSS-image-sprites)
- [What is px, em and rem?](#what-is-px-em-and-rem)
- [What's the difference between "resetting" and "normalizing" CSS? Which would you choose, and why?](#whats-the-difference-between-resetting-and-normalizing-css-which-would-you-choose-and-why)
- [Describe `float`s and how they work.](#describe-floats-and-how-they-work)
- [Describe z-index and how stacking context is formed.](#describe-z-index-and-how-stacking-context-is-formed)
- [Describe BFC (Block Formatting Context) and how it works.](#describe-block-formatting-context-bfc-and-how-it-works)
- [What are the various clearing techniques and which is appropriate for what context?](#what-are-the-various-clearing-techniques-and-which-is-appropriate-for-what-context)
- [How would you approach fixing browser-specific styling issues?](#how-would-you-approach-fixing-browser-specific-styling-issues)
- [How do you serve your pages for feature-constrained browsers? What techniques/processes do you use?](#how-do-you-serve-your-pages-for-feature-constrained-browsers-what-techniquesprocesses-do-you-use)
- [Have you ever used a grid system, and if so, what do you prefer?](#have-you-ever-used-a-grid-system-and-if-so-what-do-you-prefer)
- [Are you familiar with styling SVG?](#are-you-familiar-with-styling-svg)
- [Can you give an example of an @media property other than screen?](#can-you-give-an-example-of-an-media-property-other-than-screen)
- [What are some of the "gotchas" for writing efficient CSS?](#what-are-some-of-the-gotchas-for-writing-efficient-css)
- [What are the advantages/disadvantages of using CSS preprocessors?](#what-are-the-advantagesdisadvantages-of-using-css-preprocessors)
- [Describe what you like and dislike about the CSS preprocessors you have used.](#describe-what-you-like-and-dislike-about-the-css-preprocessors-you-have-used)
- [How would you implement a web design comp that uses non-standard fonts?](#how-would-you-implement-a-web-design-comp-that-uses-non-standard-fonts)
- [Explain how a browser determines what elements match a CSS selector.](#explain-how-a-browser-determines-what-elements-match-a-css-selector)
- [What is the CSS `display` property and can you give a few examples of its use?](#what-is-the-css-display-property-and-can-you-give-a-few-examples-of-its-use)
- [What's the difference between `inline` and `inline-block`?](#whats-the-difference-between-inline-and-inline-block)
- [What's the difference between a `relative`, `fixed`, `absolute` and `static`ally positioned element?](#whats-the-difference-between-a-relative-fixed-absolute-and-statically-positioned-element)
- [What existing CSS frameworks have you used locally, or in production? How would you change/improve them?](#what-existing-css-frameworks-have-you-used-locally-or-in-production-how-would-you-changeimprove-them)
- [Have you played around with the new CSS Flexbox or Grid specs?](#have-you-played-around-with-the-new-css-flexbox-or-grid-specs)
- [Can you explain the difference between coding a website to be responsive versus using a mobile-first strategy?](#can-you-explain-the-difference-between-coding-a-website-to-be-responsive-versus-using-a-mobile-first-strategy)
- [How is responsive design different from adaptive design?](#how-is-responsive-design-different-from-adaptive-design)
- [Have you ever worked with retina graphics? If so, when and what techniques did you use?](#have-you-ever-worked-with-retina-graphics-if-so-when-and-what-techniques-did-you-use)
- [Is there any reason you'd want to use `translate()` instead of `absolute` positioning, or vice-versa? And why?](#is-there-any-reason-youd-want-to-use-translate-instead-of-absolute-positioning-or-vice-versa-and-why)

### How many ways can you embed css code into an html file?

three ways to insert CSS
- external CSS (better choice, a separate css file)
- internal CSS (putting css directly in the html page)
- inline CSS (not recommended)
  
In the `<header>` element of the HTML file, you can include `<link rel="stylesheet" href="style.css">` which you start a new file called style.css and type the CSS code there, or you can put CSS code inside of the `<style> … </style>` in HTML file, or you can do inline style by putting code in side the tag like `<img src= “hello.jpeg” width= “100px” />`
  
[[↑] Back to top](#table-of-contents)

### What is CSS selector specificity and how does it work?

If there are two or more conflicting CSS rules that point to the same element, Specificity Hierarchy applies.

CSS specificity in DESC order
- Inline styles - An inline style is attached directly to the element to be styled. Example: `<h1 style="color: #ffffff;">`.
- IDs - An ID is a unique identifier for the page elements, such as #navbar.
- Classes, attributes and pseudo-classes - This category includes .classes, aattributes and pseudo-classes such as :hover, :focus etc.
- Elements and pseudo-elements - This category includes element names and pseudo-elements, such as h1, div, ::before and ::after.

In the cases of equal specificity: the latest rule is the one that counts. 

The universal selector `(*)` has low specificity, while ID selectors are highly specific! 

I would write CSS rules with low specificity so that they can be easily overridden if necessary. When writing CSS UI component library code, it is important that they have low specificities so that users of the library can override them without using too complicated CSS rules just for the sake of increasing specificity or resorting to `!important`.

[[↑] Back to top](#table-of-contents)

### CSS The !important Rule

The !important rule in CSS is used to add more importance to a property/value than normal.

In fact, if you use the !important rule, it will override ALL previous styling rules for that specific property on that element!

```css
p {
  background-color: red !important;
}
```

[[↑] Back to top](#table-of-contents)

### What is pseudo element and pseudo class?

- pseudo class(:) - Like button:hover and a:visited/:focus, specifies a special state of the selected element(s)
- pseudo element(::) - like p::after and button::before, style a specific part of the selected element(s)

[[↑] Back to top](#table-of-contents)

### Write code snippets to make the element center horizontally, vertically and both?
Using flexbox, assuming it is in a div. 
```css
div {
  display: flex;
  justify-content: center;
  align-items: center;
}
```

[[↑] Back to top](#table-of-contents)

### What is margin collapse?

Top and bottom margins of elements are sometimes collapsed into a single margin that is equal to the largest of the two margins (the greater value)
This does not happen on left and right margins! Only top and bottom margins!

[[↑] Back to top](#table-of-contents)

### The CSS Box Model

the term "box model" is used when talking about the rectangular boxes design and layout

- margin, border, padding, content
- goes from outside to the inside

Margin - Clears an area outside the border. The margin is transparent
Border - A border that goes around the padding and content
Padding - Clears an area around the content. The padding is transparent
Content - The content of the box, where text and images appear
	
[[↑] Back to top](#table-of-contents)

### What are CSS box-sizing attributes?

Box-sizing sets how the total width and height of an element is calculated.
`box-sizing: content-box`; - default value: The width and height properties include the content, but does not include the padding, border, or margin.
`box-sizing: border-box`; - The width and height properties include the content, padding, and border, but do not include the margin. 

[[↑] Back to top](#table-of-contents)

### CSS to hide HTML elements and their differences?

- `visibility:hidden`: hide it, cover it, still there in the DOM tree, just you can not see it
- `display:none`: the element will be gone from the DOM tree, disappear from UI
- `opacity 0`: occupy the space and consumes clicks
- `width: 0; height: 0`: Make the element not take up any space on the screen at all, resulting in not showing it.

hide content (and make it available only for screen readers), These techniques are related to accessibility (a11y).

These techniques are related to accessibility (a11y). These techniques are related to accessibility (a11y).
`position: absolute; left: -99999px`. Position it outside of the screen.
`text-indent: -9999px`. This only works on text within the block elements.

[[↑] Back to top](#table-of-contents)

### What are CSS image sprites?

An image sprite is a combined collection of multiple images put into a single image.

How you would implement them on a page or site?
1. Use a sprite generator that packs multiple images into one and generate the appropriate CSS for it.
1. Each image would have a corresponding CSS class with `background-image`, `background-position` and `background-size` properties defined.
1. To use that image, add the corresponding class to your element.

A web page with many images can take a long time to load and generates multiple server requests.
Using image sprites will reduce the number of server requests and save bandwidth.

Image sprites are generally used for designing a graphic social media bar or a navigation bar to make it more attractive and efficient at the same time, it is a commonly-used technique for icons (Gmail uses it)

```css
#home {
  left: 0px;
  width: 46px;
  background: url('img_navsprites.gif') 0 0;		//background image (left 0px, top 0px)
}

#prev {
  left: 63px;
  width: 43px;
  background: url('img_navsprites.gif') -47px 0;	//47px to the right
}

#next {
  left: 129px;
  width: 43px;
  background: url('img_navsprites.gif') -91px 0;	//91px to the right
}
```

[[↑] Back to top](#table-of-contents)

### What is px, em and rem?

specify sizes or lengths of elements using various units of measure
- PX: You get what you asked for. Pixels may be good at spacing and layout, but are not good fit for font-size.
- EM: Relative to the parent element
- REM: Relative to the root element (HTML tag)

[[↑] Back to top](#table-of-contents)


### What's the difference between "resetting" and "normalizing" CSS? Which would you choose, and why?

- **Resetting** - Resetting is meant to strip all default browser styling on elements. For e.g. `margin`s, `padding`s, `font-size`s of all elements are reset to be the same. You will have to redeclare styling for common typographic elements.
- **Normalizing** - Normalizing preserves useful default styles rather than "unstyling" everything. It also corrects bugs for common browser dependencies.

I would choose resetting when I have a very customized or unconventional site design such that I need to do a lot of my own styling and do not need any default styling to be preserved.

[[↑] Back to top](#table-of-contents)

### Describe `float`s and how they work.

The CSS `float` Floated elements (left|right|none|inherit) remain a part of the flow of the page, and will affect the positioning of other elements, unlike `position: absolute` elements, which are removed from the flow of the page.

The CSS `clear` property specifies what should happen with the element that is next to a floating element, can be used to be positioned below `left`/`right`/`both`/'none'/'inherit' floated elements.

`overflow: auto` - Specifies what happens if content overflows an element's box

If a parent element contains nothing but floated elements, its height will be collapsed to nothing. It can be fixed by clearing the float after the floated elements in the container but before the close of the container.

The .clearfix hack uses a clever CSS pseudo selector (:after) to clear floats. Rather than setting the overflow on the parent, you apply an additional class clearfix to it. Then apply this CSS:

```css
.clearfix:after {
  content: ' ';
  visibility: hidden;
  display: block;
  height: 0;
  clear: both;
}
```

Alternatively, give `overflow: auto` or `overflow: hidden` property to the parent element which will establish a new block formatting context inside the children and it will expand to contain its children.


[[↑] Back to top](#table-of-contents)

### Describe `z-index` and how stacking context is formed.

The z-index property specifies the stack order of an element. 

z-index only works on positioned elements (position: absolute, position: relative, position: fixed, or position: sticky) and flex items (elements that are direct children of display:flex elements).

If two positioned elements overlap without a z-index specified, the element positioned last in the HTML code will be shown on top. 

Without any `z-index` value, elements stack in the order that they appear in the DOM (the lowest one down at the same hierarchy level appears on top). Elements with non-static positioning (and their children) will always appear on top of elements with default static positioning, regardless of HTML hierarchy.

[[↑] Back to top](#table-of-contents)

### Describe Block Formatting Context (BFC) and how it works.

A Block Formatting Context (BFC) is part of the visual CSS rendering of a web page in which block boxes are laid out. Floats, absolutely positioned elements, `inline-blocks`, `table-cells`, `table-caption`s, and elements with `overflow` other than `visible` (except when that value has been propagated to the viewport) establish new block formatting contexts.

Knowing how to establish a block formatting context is important, because without doing so, the containing box will not [contain floated children](https://developer.mozilla.org/en-US/docs/Web/Guide/CSS/Block_formatting_context#Make_float_content_and_alongside_content_the_same_height). This is similar to collapsing margins, but more insidious as you will find entire boxes collapsing in odd ways.

A BFC is an HTML box that satisfies at least one of the following conditions:

- The value of `float` is not `none`.
- The value of `position` is neither `static` nor `relative`.
- The value of `display` is `table-cell`, `table-caption`, `inline-block`, `flex`, or `inline-flex`, `grid`, or `inline-grid`.
- The value of `overflow` is not `visible`.

In a BFC, each box's left outer edge touches the left edge of the containing block (for right-to-left formatting, right edges touch).

Vertical margins between adjacent block-level boxes in a BFC collapse. Read more on [collapsing margins](https://www.sitepoint.com/web-foundations/collapsing-margins/).

[[↑] Back to top](#table-of-contents)

### What are the various clearing techniques and which is appropriate for what context?

- Empty `div` method - `<div style="clear:both;"></div>`.
- Clearfix method - Refer to the `.clearfix` class above.
- `overflow: auto` or `overflow: hidden` method - Parent will establish a new block formatting context and expand to contains its floated children.

In large projects, I would write a utility `.clearfix` class and use them in places where I need it. `overflow: hidden` might clip children if the children is taller than the parent and is not very ideal.

[[↑] Back to top](#table-of-contents)


### How would you approach fixing browser-specific styling issues?

- After identifying the issue and the offending browser, use a separate style sheet that only loads when that specific browser is being used. This technique requires server-side rendering though.
- Use libraries like Bootstrap that already handles these styling issues for you.
- Use `autoprefixer` to automatically add vendor prefixes to your code.
- Use Reset CSS or Normalize.css.
- If you're using Postcss (or a similar transpiling library), there may be plugins which allow you to opt in for using modern CSS syntax (and even W3C proposals) that will transform those sections of your code into corresponding safe code that will work in the targets you've used.

[[↑] Back to top](#table-of-contents)

### How do you serve your pages for feature-constrained browsers? What techniques/processes do you use?

- Graceful degradation - The practice of building an application for modern browsers while ensuring it remains functional in older browsers.
- Progressive enhancement - The practice of building an application for a base level of user experience, but adding functional enhancements when a browser supports it.
- Use [caniuse.com](https://caniuse.com/) to check for feature support.
- Autoprefixer for automatic vendor prefix insertion.
- Feature detection using [Modernizr](https://modernizr.com/).
- Use CSS Feature queries [@support](https://developer.mozilla.org/en-US/docs/Web/CSS/@supports)

[[↑] Back to top](#table-of-contents)

### Have you ever used a grid system, and if so, what do you prefer?

Before Flex became popular (around 2014), the `float`-based grid system was the most reliable because it still has the most browser support among the alternative existing systems (flex, grid). Bootstrap was using the `float` approach until Bootstrap 4 which switched to the `flex`-based approach. As of writing (2020), `flex` is the recommended approach for building grid systems and has [decent browser support](https://caniuse.com/#search=flex).

For the adventurous, they can look into [CSS Grid Layout](https://css-tricks.com/snippets/css/complete-guide-grid/), which uses the shiny new `grid` property; it is even better than `flex` for building grid layouts and will be the de facto way to do so in the future.

[[↑] Back to top](#table-of-contents)

### Are you familiar with styling SVG?

Yes, there are several ways to color shapes (including specifying attributes on the object) using inline CSS, an embedded CSS section, or an external CSS file. Most SVG you'll find around the web use inline CSS, but there are advantages and disadvantages associated with each type.

Basic coloring can be done by setting two attributes on the node: `fill` and `stroke`. `fill` sets the color inside the object and `stroke` sets the color of the line drawn around the object. You can use the same CSS color naming schemes that you use in HTML, whether that's color names (that is `red`), RGB values (that is `rgb(255,0,0)`), Hex values, RGBA values, etc.

```html
<rect
  x="10"
  y="10"
  width="100"
  height="100"
  stroke="blue"
  fill="purple"
  fill-opacity="0.5"
  stroke-opacity="0.8"
/>
```

The above `fill="purple"` is an example of a _presentational attribute_. Interestingly, and unlike inline styles like `style="fill: purple"` which also happens to be an attribute, presentational attributes can be [overriden by CSS](https://css-tricks.com/presentation-attributes-vs-inline-styles/) styles defined in a stylesheet. So, if you did something like `svg { fill: blue; }` it would override the purple fill we've defined.


[[↑] Back to top](#table-of-contents)

### Can you give an example of an @media property other than screen?

media queries - for responsive design - change the styling once the size reaches a certain value

- `all` - for all media type devices
- `print` - for printers
- `speech` - for screenreaders that "reads" the page out loud
- `screen` - for computer screens, tablets, smart-phones etc.

```css
@media print {
  body {
    color: black;
  }
}
```

[[↑] Back to top](#table-of-contents)

### What are some of the "gotchas" for writing efficient CSS?

Firstly, understand that browsers match selectors from rightmost (key selector) to left. Browsers filter out elements in the DOM according to the key selector and traverse up its parent elements to determine matches. The shorter the length of the selector chain, the faster the browser can determine if that element matches the selector. Hence avoid key selectors that are tag and universal selectors. They match a large number of elements and browsers will have to do more work in determining if the parents do match.

[BEM (Block Element Modifier)](https://bem.info/) methodology recommends that everything has a single class, and, where you need hierarchy, that gets baked into the name of the class as well, this naturally makes the selector efficient and easy to override.

Be aware of which CSS properties [trigger](https://csstriggers.com/) reflow, repaint, and compositing. Avoid writing styles that change the layout (trigger reflow) where possible.


[[↑] Back to top](#table-of-contents)

### What are the advantages/disadvantages of using CSS preprocessors?

**Advantages:**

- CSS is made more maintainable.
- Easy to write nested selectors.
- Variables for consistent theming. Can share theme files across different projects.
- Mixins to generate repeated CSS.
- Sass features like loops, lists, and maps can make configuration easier and less verbose.
- Splitting your code into multiple files. CSS files can be split up too but doing so will require an HTTP request to download each CSS file.

**Disadvantages:**

- Requires tools for preprocessing. Re-compilation time can be slow.
- Not writing currently and potentially usable CSS. For example, by using something like [postcss-loader](https://github.com/postcss/postcss-loader) with [webpack](https://webpack.js.org/), you can write potentially future-compatible CSS, allowing you to use things like CSS variables instead of Sass variables. Thus, you're learning new skills that could pay off if/when they become standardized.

[[↑] Back to top](#table-of-contents)

### Describe what you like and dislike about the CSS preprocessors you have used.

**Likes:**

- Mostly the advantages mentioned above.
- Less is written in JavaScript, which plays well with Node.

**Dislikes:**

- I use Sass via `node-sass`, which is a binding for LibSass written in C++. I have to frequently recompile it when switching between node versions.
- In Less, variable names are prefixed with `@`, which can be confused with native CSS keywords like `@media`, `@import` and `@font-face` rule.

[[↑] Back to top](#table-of-contents)

### How would you implement a web design comp that uses non-standard fonts?

Use `@font-face` and define `font-family` for different `font-weight`s.

[[↑] Back to top](#table-of-contents)

### Explain how a browser determines what elements match a CSS selector.

This part is related to the above about [writing efficient CSS](#what-are-some-of-the-gotchas-for-writing-efficient-css). Browsers match selectors from rightmost (key selector) to left. Browsers filter out elements in the DOM according to the key selector and traverse up its parent elements to determine matches. The shorter the length of the selector chain, the faster the browser can determine if that element matches the selector.

For example with this selector `p span`, browsers firstly find all the `<span>` elements and traverse up its parent all the way up to the root to find the `<p>` element. For a particular `<span>`, as soon as it finds a `<p>`, it knows that the `<span>` matches and can stop its matching.


[[↑] Back to top](#table-of-contents)


### What is the CSS `display` property and can you give a few examples of its use?

- `none`, `block`, `inline`, `inline-block`, `flex`, `grid`, `table`, `table-row`, `table-cell`, `list-item`.

| `display` | Description |
| :-- | :-- |
| `none` | Does not display an element (the element no longer affects the layout of the document). All child element are also no longer displayed. The document is rendered as if the element did not exist in the document tree |
| `block` | The element consumes the whole line in the block direction (which is usually horizontal) |
| `inline` | Elements can be laid out beside each other |
| `inline-block` | Similar to `inline`, but allows some `block` properties like setting `width` and `height` |
| `table` | Behaves like the `<table>` element |
| `table-row` | Behaves like the `<tr>` element |
| `table-cell` | Behaves like the `<td>` element |
| `list-item` | Behaves like a `<li>` element which allows it to define `list-style-type` and `list-style-position` |

[[↑] Back to top](#table-of-contents)

### What's the difference between `inline` and `inline-block`?

|  | `block` | `inline-block` | `inline` |
| --- | --- | --- | --- |
| Size | Fills up the width of its parent container. | Depends on content. | Depends on content. |
| Positioning | Start on a new line and tolerates no HTML elements next to it (except when you add `float`) | Flows along with other content and allows other elements beside it. | Flows along with other content and allows other elements beside it. |
| Can specify `width` and `height` | Yes | Yes | No. Will ignore if being set. |
| Can be aligned with `vertical-align` | No | Yes | Yes |
| Margins and paddings | All sides respected. | All sides respected. | Only horizontal sides respected. Vertical sides, if specified, do not affect layout. Vertical space it takes up depends on `line-height`, even though the `border` and `padding` appear visually around the content. |
| Float | - | - | Becomes like a `block` element where you can set vertical margins and paddings. |

[[↑] Back to top](#table-of-contents)

### What's the difference between a `relative`, `fixed`, `absolute` and `static`ally positioned element?

A positioned element is an element whose computed `position` property is either `relative`, `absolute`, `fixed` or `sticky`.

- `static` - The default position; the element will flow into the page as it normally would. The `top`, `right`, `bottom`, `left` and `z-index` properties do not apply.
- `relative` - The element's position is adjusted relative to itself, without changing layout (and thus leaving a gap for the element where it would have been had it not been positioned).
- `absolute` - The element is removed from the flow of the page and positioned at a specified position relative to its closest positioned ancestor if any, or otherwise relative to the initial containing block. Absolutely positioned boxes can have margins, and they do not collapse with any other margins. These elements do not affect the position of other elements.
- `fixed` - The element is removed from the flow of the page and positioned at a specified position relative to the viewport and doesn't move when scrolled.
- `sticky` - Sticky positioning is a hybrid of relative and fixed positioning. The element is treated as `relative` positioned until it crosses a specified threshold, at which point it is treated as `fixed` positioned.


[[↑] Back to top](#table-of-contents)

### What existing CSS frameworks have you used locally, or in production? How would you change/improve them?

- **Bootstrap** - Slow release cycle. Bootstrap 4 has been in alpha for almost 2 years. Add a spinner button component, as it is widely used.
- **Semantic UI** - Source code structure makes theme customization extremely hard to understand. Its unconventional theming system is a pain to customize. Hardcoded config path within the vendor library. Not well-designed for overriding variables unlike in Bootstrap.
- **Bulma** - A lot of non-semantic and superfluous classes and markup required. Not backward compatible. Upgrading versions breaks the app in subtle manners.

[[↑] Back to top](#table-of-contents)

### Have you played around with the new CSS Flexbox or Grid specs?

Yes. Flexbox is mainly meant for 1-dimensional layouts while Grid is meant for 2-dimensional layouts.

Flexbox solves many common problems in CSS, such as vertical centering of elements within a container, sticky footer, etc. Bootstrap and Bulma are based on Flexbox, and it is probably the recommended way to create layouts these days. Have tried Flexbox before but ran into some browser incompatibility issues (Safari) in using `flex-grow`, and I had to rewrite my code using `inline-blocks` and math to calculate the widths in percentages, it wasn't a nice experience.

Grid is by far the most intuitive approach for creating grid-based layouts (it better be!) but browser support is not wide at the moment.

[[↑] Back to top](#table-of-contents)

### Can you explain the difference between coding a website to be responsive versus using a mobile-first strategy?

Making a website responsive means the some elements will respond by adapting its size or other functionality according to the device's screen size, typically the viewport width, through CSS media queries, for example, making the font size smaller on smaller devices.

```css
@media (min-width: 601px) {
  .my-class {
    font-size: 24px;
  }
}

@media (max-width: 600px) {
  .my-class {
    font-size: 12px;
  }
}
```

A mobile-first strategy is also responsive, however it agrees we should default and define all the styles for mobile devices, and only add specific responsive rules to other devices later. Following the previous example:

```css
.my-class {
  font-size: 12px;
}

@media (min-width: 600px) {
  .my-class {
    font-size: 24px;
  }
}
```

A mobile-first strategy has 2 main advantages:

- It's more performant on mobile devices, since all the rules applied for them don't have to be validated against any media queries.
- It forces to write cleaner code in respect to responsive CSS rules.

[[↑] Back to top](#table-of-contents)

### How is responsive design different from adaptive design?

Both responsive and adaptive design attempt to optimize the user experience across different devices, adjusting for different viewport sizes, resolutions, usage contexts, control mechanisms, and so on.

Responsive design works on the principle of flexibility - a single fluid website that can look good on any device. Responsive websites use media queries, flexible grids, and responsive images to create a user experience that flexes and changes based on a multitude of factors. Like a single ball growing or shrinking to fit through several different hoops.

Adaptive design is more like the modern definition of progressive enhancement. Instead of one flexible design, adaptive design detects the device and other features and then provides the appropriate feature and layout based on a predefined set of viewport sizes and other characteristics. The site detects the type of device used and delivers the pre-set layout for that device. Instead of a single ball going through several different-sized hoops, you'd have several different balls to use depending on the hoop size.

Both have these methods have some issues that need to be weighed:

- Responsive design can be quite challenging, as you're essentially using a single albeit responsive layout to fit all situations. How to set the media query breakpoints is one such challenge. Do you use standardized breakpoint values? Or, do you use breakpoints that make sense to your particular layout? What if that layout changes?
- Adaptive design generally requires user agent sniffing, or DPI detection, etc., all of which can prove unreliable.


[[↑] Back to top](#table-of-contents)

### Have you ever worked with retina graphics? If so, when and what techniques did you use?

_Retina_ is just a marketing term to refer to high resolution screens with a pixel ratio bigger than 1. The key thing to know is that using a pixel ratio means these displays are emulating a lower resolution screen in order to show elements with the same size. Nowadays we consider all mobile devices _retina_ defacto displays.

Browsers by default render DOM elements according to the device resolution, except for images.

In order to have crisp, good-looking graphics that make the best of retina displays we need to use high resolution images whenever possible. However using always the highest resolution images will have an impact on performance as more bytes will need to be sent over the wire.

To overcome this problem, we can use responsive images, as specified in HTML5. It requires making available different resolution files of the same image to the browser and let it decide which image is best, using the html attribute `srcset` and optionally `sizes`, for instance:

```html
<div responsive-background-image>
  <img
    src="/images/test-1600.jpg"
    sizes="
      (min-width: 768px) 50vw,
      (min-width: 1024px) 66vw,
      100vw"
    srcset="
      /images/test-400.jpg   400w,
      /images/test-800.jpg   800w,
      /images/test-1200.jpg 1200w
    "
  />
</div>
```

It is important to note that browsers which don't support HTML5's `srcset` (i.e. IE11) will ignore it and use `src` instead. If we really need to support IE11 and we want to provide this feature for performance reasons, we can use a JavaScript polyfill, e.g. Picturefill (link in the references).

For icons, I would also opt to use SVGs and icon fonts where possible, as they render very crisply regardless of resolution.

[[↑] Back to top](#table-of-contents)

### Is there any reason you'd want to use `translate()` instead of `absolute` positioning, or vice-versa? And why?

`translate()` is a value of CSS `transform`. Changing `transform` or `opacity` does not trigger browser reflow or repaint but does trigger compositions; whereas changing the absolute positioning triggers `reflow`. `transform` causes the browser to create a GPU layer for the element but changing absolute positioning properties uses the CPU. Hence `translate()` is more efficient and will result in shorter paint times for smoother animations.

When using `translate()`, the element still occupies its original space (sort of like `position: relative`), unlike in changing the absolute positioning.

[[↑] Back to top](#table-of-contents)


### Other Answers

- https://neal.codes/blog/front-end-interview-css-questions
- https://quizlet.com/28293152/front-end-interview-questions-css-flash-cards/
- http://peterdoes.it/2015/12/03/a-personal-exercise-front-end-job-interview-questions-and-my-answers-all/
