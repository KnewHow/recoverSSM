package erongdu.service;

import java.util.List;

import erongdu.pojo.Items;

/**
 * A interface of items service
 * 
 * @author yuangh
 * 
 * @company erongdu
 *
 * @data 2017年8月26日
 */
public interface ItemsService {
	/**
	 * Find all items
	 * 
	 * @return A <code>List</code> to store {@link Items}
	 */
	public List<Items> findAllItems();
}
