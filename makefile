# Because we're using vpath to search for dependencies in a separate file, we have
# to use automatic variables like `$<`

VPATH=lib
CFLAGS=-Ilib

all: main.cpp
		g++ -std=c++11 $(CFLAGS) $? -o test
#
# main.o: main.cpp
# 	g++ -std=c++11 $(CFLAGS) $< -o main
#
# Bst.o: Bst.cpp
# 	g++ -std=c++11 $(CFLAGS) $< -o Bst
#
# TreeNode.o: TreeNode.cpp
# 	g++ -std=c++11 $(CFLAGS) $< -o TreeNode
