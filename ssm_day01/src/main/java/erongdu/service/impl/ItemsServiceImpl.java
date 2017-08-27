package erongdu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import erongdu.exception.ItemsException;
import erongdu.mapper.ItemsMapper;
import erongdu.pojo.Items;
import erongdu.service.ItemsService;

@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {

	@Autowired
	private ItemsMapper itemsMapper;

	@Override
	public List<Items> findAllItems() {
		return this.itemsMapper.findAllItems();
	}

	@Override
	public Items findItemsById(Integer id) {
		return this.itemsMapper.findItemsById(id);
	}

	@Override
	public void updateItems(Items items) throws ItemsException {

		/*
		 * if (items.getId() == 1) { throw new ItemsException("操作不允许"); } int i = 3 / 0;
		 */

		this.itemsMapper.updateItems(items);
	}

}
