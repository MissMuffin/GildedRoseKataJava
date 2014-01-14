package gildedrose;

public class NormalItemUQS extends UpdateQualityStrategy{
	//fields are instantiated in super class
	
	public NormalItemUQS(Item item) {
		super(item);
	}

	@Override
	public void updateQuality(){

		if(sellin > 0){
			if(quality > 0){
				quality = quality - 1;
			}else if(quality <= 0){
				quality = 0;
			}
			sellin--;
		}else if(sellin <= 0){
			if(quality > 0){
				quality = quality - 2;
			}else if(quality <= 0){
				quality = 0;
			}
			sellin--;
		}
		
		item.setQuality(quality);
		item.setSellIn(sellin);
	}
}
