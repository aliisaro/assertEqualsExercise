# Answer the Following Questions:

## a. What does the assertArrayEquals method do?
### Explain how assertArrayEquals works and what it checks when comparing arrays.

ANSWER: The assertEquals method is a boolean method which returns true by default.
It has an if statement structure that checks if a1 array OR a2 array is null and returns a1 = a2 if true.
Second if statement returns false if a1's length is not equal to a2's length.
Then there is a for loop which goes through the a1 array and inside it is an if statement that checks
wether a1 indexes are not equal to a2 indexes. If they are not equal, the method returns false.


## b. What will happen if the arrays a1 and a2 are not equal in testSingleDimensionalArrayEquality?
### Describe the outcome when the arrays do not match and how the test will respond.

ANSWER: If the arrays don't match the test will throw an assertion error and it will print "Should be equal".

## c. How does the assertArrayEquals method handle multi-dimensional arrays as seen in testMultiDimensionalArrayEquality?
### Explain how assertArrayEquals compares multi-dimensional arrays and what it means for them to be equal.

ANSWER: First it will compare the outermost arrays. If they are unequal, the test will fail.
If the outer arrays are same length, it will compare each pair of inner arrays by chekcking if they are the same length.
If they're the same length, it will compare each element of the inner arrays.
