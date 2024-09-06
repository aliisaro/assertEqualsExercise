# Answer the Following Questions:

## a. What does the assertArrayEquals method do?
### Explain how assertArrayEquals works and what it checks when comparing arrays.

ANSWER: When comparing single-dimensional arrays, the test passes if both arrays are null, or if both arrays are the same length AND the elements match. Otherwise the tests fail.


## b. What will happen if the arrays a1 and a2 are not equal in testSingleDimensionalArrayEquality?
### Describe the outcome when the arrays do not match and how the test will respond.

ANSWER: If the arrays don't match the test will throw an assertion error and it will print the expected output and the actual output.

## c. How does the assertArrayEquals method handle multi-dimensional arrays as seen in testMultiDimensionalArrayEquality?
### Explain how assertArrayEquals compares multi-dimensional arrays and what it means for them to be equal.

ANSWER: First it will compare the outermost arrays. If the outer arrays are equal in length and in their elements, it will compare each pair of inner arrays by chekcking if they are the same length and have the same elements.

# Modified tests
I modified the tests to have slightly different numbers so that the tests would fail.
