package gildedrose;

public class ConjuredUQS extends UpdateQualityStrategy{
	//fields are instantiated in super class
	
	public ConjuredUQS(Item item) {
		super(item);
	}

	@Override
	public void updateQuality(){

		if(sellin > 0){
			if(quality > 1){
				quality = quality - 2;
			}else if(quality <= 1){
				quality = 0;
			}
			sellin--;
		}else if(sellin <= 0){
			if(quality > 3){
				quality = quality - 4;
			}else if(quality <= 3){
				quality = 0;
			}
			sellin--;
		}
		
		item.setQuality(quality);
		item.setSellIn(sellin);
	}
}
