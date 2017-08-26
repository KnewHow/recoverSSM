package erongdu.mapper;

import java.util.List;

import erongdu.pojo.Items;

/**
 * A mapper interface for {@link Items}
 * 
 * @author yuangh
 * 
 * @company erongdu
 *
 * @data 2017年8月25日
 */
public interface ItemsMapper {
	/**
	 * Find all {@link Items}
	 * 
	 * @return A <code>list</code> to store {@link Items}
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
