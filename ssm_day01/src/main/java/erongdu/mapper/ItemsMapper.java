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
}
