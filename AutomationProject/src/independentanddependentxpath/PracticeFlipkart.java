package independentanddependentxpath;

public class PracticeFlipkart 
{
	public static void main(String[] args) 
	{	//Flipkart app
		 //Q.1)Write expression to identify iphone 14 Blue 128 GB mobile ratings and review
		// .//div[text()='APPLE iPhone 14 (Blue, 128 GB)']-->independent element locator
		// /..
		//Ratings expression
		// .//div[text()='APPLE iPhone 14 (Blue, 128 GB)']/../div[@class="gUuXy-"]
		// Q.2)Write expression to identify discount for above model.
		// .//div[text()='APPLE iPhone 14 (Blue, 128 GB)']/../..//div[@class="_3Ay6Sb"]
		// Q.3)Write expression to identify Add to comoare checkbox for above model
		//  .//div[text()='APPLE iPhone 14 (Blue, 128 GB)']/ancestor::a[@class="_1fQZEK"]//span[@class="f3A4_V"]
		//  https://www.sangeethamobiles.com
		//  Q.4)Write expression to identify oneplus 8T mobile price.
		// .//h2[text()='Oneplus 8T (12+256) Aquamarine Green - OnePlus']     -->mobile name brand
		// /parent::div[@class="product-details"]-->common parent
		//	.//h2[text()='Oneplus 8T (12+256) Aquamarine Green - OnePlus']/../../div[@class='product-price']/div[@class="new-price"]
		// https://www.goibibo.com
		 //Q.5)Write expression to identify travelling price in Indigo at from Pune to Chennai with indigo for particular time of 15:50 	 23/jan/23
		//  srp-card-uistyles__CardWrap-sc-3flq99-7 bIDWDp width100 dF--> ancestor for indigo,time and price
		// .//span[text()='15:50']/ancestor::div[@class='srp-card-uistyles__CardWrap-sc-3flq99-7 bIDWDp width100 dF']//div[@class='alignItemsEnd flexCol']
		// amazon.in
		// Q.6)Write expression to identify actual price of Samsung Galaxy Z Fold3 5G(Phantom Green)
		//.//span[text()='Samsung Galaxy Z Fold3 5G (Phantom Black, 12GB RAM, 256GB Storage) with No Cost EMI/Additional Exchange Offers']-->mobile name
		// div[@class='sg-col-inner']
		//.//span[text()='Samsung Galaxy Z Fold3 5G (Phantom Black, 12GB RAM, 256GB Storage) with No Cost EMI/Additional Exchange Offers']/ancestor:: div[@class='sg-col sg-col-4-of-12 sg-col-8-of-16 sg-col-12-of-20 s-list-col-right']//a[@class='a-size-base a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']		 
	}

}


