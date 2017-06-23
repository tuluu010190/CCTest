package amazonAction;

import amazonPage.CartPageElements;
import Utils.CommonOperation;
import static Utils.LogUtil.info;

public class CartPageActions extends CommonOperation{

	CartPageElements cartPageElements = new CartPageElements();
	
	/**
	 * User Click delete button to delete a product
	 */
	public void deleteCart(){
		info("User Click delete button to delete a product");
		click(cartPageElements.deleteCart);
	}
}
