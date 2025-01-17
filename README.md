# ConcurrentModificationException in Java
This repository demonstrates a common error in Java: the `ConcurrentModificationException`. This exception occurs when attempting to modify a collection (like an ArrayList) while iterating over it using a for-each loop (enhanced for loop).

The `ConcurrentModificationExceptionExample.java` file contains code that triggers this exception. The `ConcurrentModificationExceptionExampleSolution.java` file provides a corrected version using an `Iterator` for safe removal of elements.