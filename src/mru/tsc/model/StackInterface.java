package mru.tsc.model;
/**
 * 
 * @author sriva
 *
 * @param <T>
 */
public interface StackInterface <T> {

	/**
	 * 
	 * @param x
	 */
	public void push (T x);
	
	/**
	 * 
	 * @return
	 */
	public T pop();
	
	/**
	 * 
	 * @return
	 */
	public T peek();
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty();
	
	/**
	 * 
	 * @return
	 */
	public int size();
	
}
