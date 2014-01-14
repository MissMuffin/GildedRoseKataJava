package gildedrose;

public class BackstagePassesUQS extends UpdateQualityStrategy{
	//fields are instantiated in super class
	
	public BackstagePassesUQS(Item item) {
		super(item);
	}

	@Override
	public void updateQuality(){

		if(sellin > 10){
			if(quality < 50){
				quality = quality + 1;
			}
//			else if(quality < 0){	//für den fall dass negativer wert hardcoded wird?
//				quality = 0;
//			}
			sellin--;
		}else if(sellin <= 10 && sellin > 5){
			if(quality < 49){
				quality = quality + 2;
			}
//			else if(quality < 0){	//für den fall dass negativer wert hardcoded wird?
//				quality = 0;
//			}
			sellin--;
		}else if(sellin <= 5 && sellin > 0){
			if(quality < 47){
				quality = quality + 3;
			}
//			else if(quality < 0){	//für den fall dass negativer wert hardcoded wird?
//				quality = 0;
//			}
			sellin--;
		}else if(sellin <= 0){
			quality = 0;
			sellin--;
		}
		
		item.setQuality(quality);
		item.setSellIn(sellin);
	}
}
