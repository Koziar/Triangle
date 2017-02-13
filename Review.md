## Code review

##### This is a review of[William's Bech Triangle Exercise](https://github.com/cph-bachelor-will/test-triangle).

In general your program entirely meets the exercise requirements which are:
```
The program reads three integer values from an input dialog.
The three values represent the lengths of the sides of a triangle.
The program displays a message that states whether the triangle is:
    * scalene,
    * isosceles,
    * equilateral
```

I like how you separated the project into two main classes, the `Main.java` and the `Triangle.java`.
This structure gives a better overview of what's going on in the project.

I think it was a vary good idea,
to put the triangle logic into its constructor, so the evaluation of either 3 ints can build a triangle or not
is done in the point of creating it, not after calling on the object some unnecessary method.

I think the logic for the Triangle itself is very good. You check if the three ints can build a triangle
by checking if the sum of the length of two sides is more than the 3rd side. For the valid numbers, the output message
prints out an expected message either it's a scalene, isosceles or equilateral triangle.
You also handle cases with the 0 and negative numbers.

In requirements it stays that the 3 input values are supposed to be integers, and you nicely
(by a proper output message) handle the cases when someone inputs strings and characters which are not digits.

However when I input 3 big numbers e.g.: `10000000000 10000000000 10000000000` which are not ints but a numbers
that could easily form a triangle, I get a confusing output message saying: `Please enter digits`.
The program is not suppose to take only digits but any numbers which are of type Integer.
The same problem is when I input floating values like `2.5 2.5 2.5` - that could be a valid triangle if the floating
values would be accepted in the requirements, instead I get the same message again saying they are not digits.
It happens because you are missing a check either a values are ints or not, and your program is not failing because
of the `try-catch` in the main method, which catches whatever is wrong, giving this way a confusing message which I mentioned before.

Another thing, that could be done better is instantiation of the Scanner class.
You create a scanner in the while loop, which means that every time 3 values are being passed to your program,
a new instance of a scanner is being created which is not a good solution.

In general the program works fine since it meets all its requirements.
Good job Mr. Will.

Lukasz Koziarski

