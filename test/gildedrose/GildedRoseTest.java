package gildedrose;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class GildedRoseTest {

	@Parameters
	public static Collection<Object[]> data() {
		Collection<Object[]> data = new ArrayList<Object[]>();
		data.addAll(Arrays
				.asList(new Object[][] {
						{
								"At the end of each day our system lowers both quality and sell-in for every item",
								"Item with arbitrary name", 5, 49, 4, 48 },
						{
								"Once the SellDate has passed Quality decreases twice as fast",
								"Item with arbitrary name", 0, 49, -1, 47 },
						{
								"The quality of n item is never negative",
								"Item with arbitrary name", 1, 0, 0, -1 },
						{ 
								"Aged Brie increases its value with every day",
								"Aged Brie", 2, 0, 1, 1 },
						{ 
								"Aged Brie increases its value by 2 after its SellDate",
								"Aged Brie", 0, 0, -1, 2 },
						{ 
								"Normal items won't increase in Value after 50",
								"Aged Brie", 10, 50, 9, 50 },
						{ 
								"Elixir of the Mongoose", "Elixir of the Mongoose",
								5, 49, 4, 48},
						{
								"Legendary Sulfuras SellDate doesn't count down and its value never changes",
								"Sulfuras, Hand of Ragnaros", 5, 50, 5, 50 },
						{ 
								"Backstage Passes loose all value after their SellDate",
								"Backstage passes to a TAFKAL80ETC concert", 0,	49, -1, 0 },
						{ 
								"Conjured Mana Cake", 
								"Conjured Mana Cake", 1, 49, 0, 47 },
						{ 
								"Backstage Passes increase by 2 when 10 days are left ",
								"Backstage passes to a TAFKAL80ETC concert", 10, 30, 9, 32 },
						{ 
								"Backstage Passes increase by 3 when 5 days are left ",
								"Backstage passes to a TAFKAL80ETC concert", 2,	30, 1, 33 }

				}));
		return data;
	}

	String message;
	String itemName;
	int sellIn;
	int quality;
	int expectedSellIn;
	int expectedQuality;

	Item item;

	public GildedRoseTest(String message, String itemName, int sellIn,
			int quality, int expectedSellIn, int expectedQuality) {
		this.message = message;
		this.itemName = itemName;
		this.sellIn = sellIn;
		this.quality = quality;
		this.expectedSellIn = expectedSellIn;
		this.expectedQuality = expectedQuality;
	}

	@Before
	public void setUp() {
		List<Item> items = new ArrayList<Item>();
		items.add(item = new Item(itemName, sellIn, quality));
		GildedRose.setItems(items);
	}

	@Test
	public void testQualityUpdate() {
		GildedRose.updateQuality();
		assertEquals(message + " Quality ", expectedQuality, item.getQuality());
	}

	@Test
	public void testSellInUpdate() {
		GildedRose.updateQuality();
		assertEquals(message + " SellIn", expectedSellIn, item.getSellIn());
	}

}
