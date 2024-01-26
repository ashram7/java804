package test01;

public class ShopService {
	private static ShopService singleton = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		// TODO Auto-generated method stub
		return singleton;
	}

}
