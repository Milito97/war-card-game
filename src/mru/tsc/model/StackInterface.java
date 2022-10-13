package mru.tsc.model;
/**
 * This is an interface that is implemented from the singlylinkedlist.
 * @author Emilio G, NiK S.
 *
 * @param <T> - generic type T.
 */
public interface StackInterface <T> {

	/**
	 * Push method intialized.
	 */
	
	public void push (T x);
	
	/**
	 * Pop method intialized, type generic.
	 */
	
	public T pop();
	
	/**
	 * Peek method intialized, type generic.
	 */
	public T peek();
	
	/**
	 * isEmpty method intialized, type boolean.
	 */
	
	public boolean isEmpty();
	
	/**
	 * size method intialized for the interface stack.
	 */
	
	public int size();
	
}
