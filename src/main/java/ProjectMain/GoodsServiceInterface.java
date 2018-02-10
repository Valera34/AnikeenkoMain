package ProjectMain;

import java.util.List;

public interface GoodsServiceInterface {
	 public void createGood(Goods good);
	 
     public Goods searchGood(String name);
     
     public void changeGood(Goods good);
     
     public void deleteGood(Goods good);
     
     public void showGoods();
     
     public List<Goods> getAll();
}
