package gildedrose;

abstract class UpdateQualityStrategy {

	public UpdateQualityStrategy(Item item) {
		//createItem(item);
		updateQuality();
		//System.out.println(item.getName());
	}

	public void updateQuality(){
		//nothing
	}

//	public void createItem(Item item){
//		String name = item.getName();
//
//		if(name.equals("Aged Brie")){
//			AgedBrieUQS carl = new AgedBrieUQS(item);
//		}
//
//		else if(name.equals("Sulfuras, Hand of Ragnaros")){
//			//SulfurasUQS carl = new SulfurasUQS(item);
//		}
//
//		else if(name.equals("Backstage passes to a TAFKAL80ETC concert")){
//			BackstagePassesUQS carl = new BackstagePassesUQS(item);
//		}
//
//		else if(name.contains("Conjured")){
//			ConjuredUQS carl = new ConjuredUQS(item);
//		}
//		else{
//			NormalItemUQS carl = new NormalItemUQS(item);
//		}
//
//
//
//	}

	//item classes

//	public class AgedBrieUQS extends UpdateQualityStrategy{
//
//		Item item;
//		int sellin;
//		int quality;
//
//		public AgedBrieUQS(Item item){
//			super(item);
//			this.item = item;
//			sellin = item.getSellIn();
//			quality = item.getQuality();
//		}
//
//		@Override
//		public void updateQuality(){
//			item.setSellIn(sellin - 1);
//			item.setQuality(quality + 1);
//
//			if(sellin < 0)
//				item.setQuality(quality + 1);
//			if(quality > 50)
//				item.setQuality(50);
//
//
//		}
//
//		@Override
//		public void createItem(Item item){
//			//nothing
//		}
//	}

//	public class BackstagePassesUQS extends UpdateQualityStrategy{
//
//		Item item;
//		int sellin;
//		int quality;
//
//		public BackstagePassesUQS(Item item){
//			super(item);
//			this.item = item;
//			sellin = item.getSellIn();
//			quality = item.getQuality();
//		}
//
//		@Override
//		public void updateQuality(){
//			item.setSellIn(sellin - 1);
//			item.setQuality(quality + 1);
//
//			if(sellin <= 10)
//				item.setQuality(quality + 1);
//			if(sellin <= 5)
//				item.setQuality(quality + 1);
//			if(sellin < 0)
//				item.setQuality(0);
//
//			if(quality > 50)
//				item.setQuality(50);
//		}
//		
//		@Override
//		public void createItem(Item item){
//			//nothing
//		}
//	}
	
//	public class ConjuredUQS extends UpdateQualityStrategy{
//		
//		Item item;
//		int sellin;
//		int quality;
//		
//		public ConjuredUQS(Item item){
//			super(item);
//			this.item = item;
//			sellin = item.getSellIn();
//			quality = item.getQuality();
//		}
//		
//		@Override
//		public void updateQuality(){
//			item.setSellIn(sellin - 1);
//			item.setQuality(quality - 2);
//
//			if(sellin < 0)
//				item.setQuality(quality - 2);
//			if(quality < 0)
//				item.setQuality(0);
//			
//		}
//		
//		@Override
//		public void createItem(Item item){
//			//nothing
//		}
//	}
	
//	public class NormalItemUQS extends UpdateQualityStrategy{
//		
//		Item item;
//		int sellin;
//		int quality;
//		
//		public NormalItemUQS(Item item){
//			super(item);
//			this.item = item;
//			sellin = item.getSellIn();
//			quality = item.getQuality();
//		}
//		
//		@Override
//		public void updateQuality(){
//			item.setSellIn(sellin - 1);
//			item.setQuality(quality - 1);
//
//			if(sellin < 0)
//				item.setQuality(quality - 1);
//			if(quality < 0)
//				item.setQuality(0);
//			
//		}
//		
//		@Override
//		public void createItem(Item item){
//			//nothing
//		}
//	}
	
	
//	public class SulfurasUQS extends UpdateQualityStrategy{
//	
//	public SulfurasUQS(Item item){
//		super(item);
//	}
//	
//	@Override
//	public void updateQuality(){
//		
//	}
//	
//	@Override
//	public void createItem(Item item){
//		//nothing
//	}
//}
}

