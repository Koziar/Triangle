## My code standards

* Use the Sun code conventions by default:
http://java.sun.com/docs/codeconv/html/CodeConvTOC.doc.html
* Every method and more important block of code must have a comment.
  Both multiline `/* */` and a single line `//` comments are allowed.
* Length of a single line of code can't be longer than 100 characters,
  so it's easier to read.
* Variable names must be meaningful (names like `a`, `x`, `po` etc. are not allowed), when longer then one word then camelCased. Constant variables must be UPPERCASED with underscores between each word, constants must also always be `static` and `final`.
* Always use:
```
something {
}
```
instead of:
```
something
{
}
```
* Always use curly brackets for loops and if stetements
