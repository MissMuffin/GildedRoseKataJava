package gildedrose;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

	private static List<Item> items = null;
	static UpdateQualityStrategy carl;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("OMGHAI!");

		items = new ArrayList<Item>();
		items.add(new Item("+5 Dexterity Vest", 10, 20));
		items.add(new Item("Aged Brie", 2, 0));
		items.add(new Item("Elixir of the Mongoose", 5, 7));
		items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		items.add(new Item("Conjured Mana Cake", 3, 6));

		updateQuality();
	}

	public static void updateQuality() {
		
		Item item;
		
		for (int i = 0; i < items.size(); i++) {
			
			item = items.get(i);
			
			String name = item.getName();
			

			if(name.equals("Aged Brie")){
				carl = new AgedBrieUQS(item);
			}

			else if(name.equals("Sulfuras, Hand of Ragnaros")){
				//legendary item's quality & sellin doesn't change
			}

			else if(name.equals("Backstage passes to a TAFKAL80ETC concert")){
				carl = new BackstagePassesUQS(item);
			}

			else if(name.contains("Conjured")){
				carl = new ConjuredUQS(item);
			}
			else{
				carl = new NormalItemUQS(item);
			}
			
			
		}
		carl.updateQuality();
	}

	/*
	 * minimal addition to ensure testability
	 */
	public static void setItems(List<Item> items) {
		GildedRose.items = items;
	}
}