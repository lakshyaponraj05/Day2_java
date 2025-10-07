GUESS THE NUMBER
Key Concept: Generating Random Integers in a Range

One of the trickiest parts often is how you generate a random integer between two inclusive bounds. In your code:

1 + (int)(100 * Math.random())


Math.random() gives value x in [0.0, 1.0).

Multiply by 100 gives x * 100 in [0.0, 100.0).

Cast to int gives values 0, 1, 2, …, 99 (because the fractional part is truncated).

Adding 1 shifts that to 1, 2, 3, …, 100.

So the final result is a random integer between 1 and 100 inclusive.

If you ever want a random integer between a and b inclusive, you can use:

int rand = a + (int)((b - a + 1) * Math.random());
