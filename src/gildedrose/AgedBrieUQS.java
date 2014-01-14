package gildedrose;

public class AgedBrieUQS extends UpdateQualityStrategy{
	//fields are instantiated in super class
	
		public AgedBrieUQS(Item item) {
			super(item);
		}

		@Override
		public void updateQuality(){

			if(sellin > 0){
				if(quality < 50){
					quality = quality + 1;
				}
				//only needed if aged brie can't have more than 50  when hardcoded
//				else if(quality >= 50){
//					quality = 0;
//				}
				sellin--;
			}else if(sellin <= 0){
				if(quality < 50){
					quality = quality + 2;
				}
				//same as above
//				else if(quality >= 50){
//					quality = 0;
//				}
				sellin--;
			}
			
			item.setQuality(quality);
			item.setSellIn(sellin);
		}
	}
