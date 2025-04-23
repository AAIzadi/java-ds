package org.algo.tree;

import java.util.Iterator;

public interface Tree<T> extends Iterable<T> {
	Position<T> root();

	Position<T> parent(Position<T> position) throws IllegalArgumentException;

	Iterable<Position<T>> children(Position<T> p) throws IllegalArgumentException;

	int numChildren(Position<T> p) throws IllegalArgumentException;

	int size();

	Iterator<T> iterator();

	Iterable<Position<T>> positions();
}

