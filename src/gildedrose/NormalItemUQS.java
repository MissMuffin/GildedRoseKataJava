package gildedrose;

public class NormalItemUQS extends UpdateQualityStrategy{
	
	Item item;
	int sellin;
	int quality;
	
	public NormalItemUQS(Item item){
		super(item);
		this.item = item;
		sellin = item.getSellIn();
		quality = item.getQuality();
	}
	
	@Override
	public void updateQuality(){
		item.setSellIn(sellin - 1);
		item.setQuality(quality - 1);

		if(sellin < 0)
			item.setQuality(quality - 1);
		if(quality < 0)
			item.setQuality(0);
		
	}
	
	
}
