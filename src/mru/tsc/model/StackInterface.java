package mru.tsc.model;
public interface StackInterface <T> {

	void addAt(int index,T t);
	void addToStart(T t);
	void addToEnd(T t);
	T removeFromStart();
	T removeFromEnd();
	T get(int index);
	boolean isEmpty();
	void print();
	int size();

	
	
}
