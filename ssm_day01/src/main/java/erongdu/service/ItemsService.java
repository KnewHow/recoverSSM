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

	/**
	 * Find {@link Items} by id
	 * 
	 * @param id
	 *            The id of {@link Items}
	 * @return A {@link Items} object
	 */
	public Items findItemsById(Integer id);

	/**
	 * Update items by id
	 * 
	 * @param items
	 *            The {@link Items} object,it must contain id
	 */
	public void updateItems(Items items);
}
