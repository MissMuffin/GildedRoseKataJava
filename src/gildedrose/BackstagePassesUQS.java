package gildedrose;

public class BackstagePassesUQS extends UpdateQualityStrategy{

	Item item;
	int sellin;
	int quality;

	public BackstagePassesUQS(Item item){
		super(item);
		this.item = item;
		sellin = item.getSellIn();
		quality = item.getQuality();
	}

	@Override
	public void updateQuality(){
		item.setSellIn(sellin - 1);
		item.setQuality(quality + 1);

		if(sellin <= 10)
			item.setQuality(quality + 1);
		if(sellin <= 5)
			item.setQuality(quality + 1);
		if(sellin < 0)
			item.setQuality(0);

		if(quality > 50)
			item.setQuality(50);
	}
	
	
}
