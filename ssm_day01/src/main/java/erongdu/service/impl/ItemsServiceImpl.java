package erongdu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public void updateItems(Items items) {
		this.itemsMapper.updateItems(items);
	}

}
