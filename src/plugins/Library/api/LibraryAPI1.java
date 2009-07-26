
package plugins.Library.api;

import java.util.ArrayList;

/**
 * The API for the Library for other plugins, changing this could cause other
 * plugins to not work properly so either extend this for backward compatibility
 * or create a new one for no backward compatibility
 *
 * @author MikeB
 */
public interface LibraryAPI1 {
	/**
	 * Get the version number of the Library
	 */
	public long getVersion();

	/**
	 * Get the index with this uri
	 * @param indexuri
	 * @return
	 * @throws plugins.Library.util.InvalidSearchException
	 */
	public Index getIndex(String indexuri) throws InvalidSearchException;

	/**
	 * Get all the indexes in the Library
	 */
	public Iterable<Index> getAllIndices();

	/**
	 * Get all the indexes specified separated by spaces or semicolons
	 * @param indexuris
	 * @return
	 * @throws plugins.Library.util.InvalidSearchException
	 */
	public ArrayList<Index> getIndices(String indexuris) throws InvalidSearchException;
	
}
