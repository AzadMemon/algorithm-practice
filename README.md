#README

## Motivation

## Organization
This is probably my first c++ project that I was required to organize manually.

As such it may not follow all c++ convetions.

I've implemented several classes, such as a a binary search tree, linked list, etc...

I've treated this implementations as libraries. And thus they're placed in the lib folder.

In the algorithms where I require these implementations, I simply reference the
header file in the file, and add the object as a dependency.

I've set the VPATH in the make file of each algorithm so that it knows where to search for this dependncy.
