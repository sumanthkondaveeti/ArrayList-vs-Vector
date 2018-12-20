# ArrayList-vs-Vector
Comparing ArrayList and Vector In Java

* ArrayList and Vectors both implement the List interface and both use arrays for its internal data structure.

# Difference between them

* Vector is synchronized while arrayList is not synchronized which means mutiple threads can work on arrayList at the same time but only one Thread at a time can access in case of Vector. 

# Performance

* ArrayList is faster than vector since it is not synchronized. If one thread works on a vector, it will acquire a lock on the vector object which makes other thread to wait.

# Data Growth

* ArrayList and Vector both grow and Shrink dynamically to maintain optimal use of storage, during resizing ArrayList increments 50% of the current array size if the number of elements exceeds its capacity, while vector increments 100%.

# Traversal

* Vector can use both Enumeration and Iterator for traversing over elements of vector while ArrayList can only use Iterator for traversing.

# Note

ArrayList is preferable unless you have usecase to use Vector.

# What I did here

* Created two objects one for ArrayList and another for Vector and trying to run concurrently so that we can see the behaviour of two data structures.

* We need to run **MainVector** and **MainArray** separately and you will see the output for Vector but you will see Exception **java.util.ConcurrentModificationException**

* This exception may be thrown by methods that have detected concurrent modification of an object when such modification is not permissible.

* Example: If one thread is performing operation on object and another thread try to access it we get ConcurrentModificationException.

# fix

* We must Synchronize the block of code which modifies the list structurally, or alternatively allow simple element modifications.

# To do

* Adding synchronization block so that we avoid **ConcurrentModificationException**.
