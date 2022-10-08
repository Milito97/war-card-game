package mru.tsc.model;
public interface StackInterface <T> {

	public void push (T x);
	public T pop();
	public T peek();
	public boolean isEmpty();
	public int size();
	

	
	
}
