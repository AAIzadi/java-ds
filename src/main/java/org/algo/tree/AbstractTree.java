package org.algo.tree;

public abstract class AbstractTree<T> implements Tree<T> {
	public boolean isInternal(Position<T> p) {
		return numChildren(p) > 0;
	}

	public boolean isLeaf(Position<T> p) {
		return numChildren(p) == 0;
	}

	public boolean isRoot(Position<T> p) {
		return p == root();
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public int depth(Position<T> position) {
		if (isRoot(position)) {
			return 0;
		}

		return 1 + depth(parent(position));
	}

	private int heightBad() {
		int h = 0;
		for (Position<T> p : positions()) {
			if (isLeaf(p)) {
				h = Math.max(h, depth(p));
			}
		}
		return h;
	}

	public int height(Position<T> p) {
		int h = 0;
		for (Position<T> child : children(p)) {
			h = Math.max(h, 1 + height(child));
		}
		return h;
	}
}
