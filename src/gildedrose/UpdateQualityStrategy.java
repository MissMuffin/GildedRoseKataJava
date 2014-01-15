package gildedrose;

abstract class UpdateQualityStrategy {
	
	Item item;
	int sellin;
	int quality;

	public UpdateQualityStrategy(Item item) {
		this.item = item;
		sellin = item.getSellIn();
		quality = item.getQuality();
		
	}

	abstract public void updateQuality();

}

