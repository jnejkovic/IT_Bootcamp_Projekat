package webPage;

public class ObjectsPath {
	// Home page path
	public static final String WOMEN_XPATH = "//a[@class='sf-with-ul'][contains(text(),'Women')]";
	public static final String SUMMER_DRESS_XPATH = "//ul[@class='submenu-container clearfix first-in-line-xs']//li//ul//a[contains(text(),'Summer Dresses')]";
	public static final String DRESSES_XPATH = "//body[@id='category']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]";
	public static final String D_SUMMER_DRESS_XPATH = "//body[@id='category']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/ul[@class='submenu-container clearfix first-in-line-xs']/li[@class='sfHoverForce']/a[1]";

	// Summer dress add to cart path
	public static final String LIST_VIEW = "//li[@id='list']";
	public static final String FIRST_SUMMER_DRESS_XPATH = "//li[@class='ajax_block_product first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line col-xs-12']//a[@class='product-name'][contains(text(),'Printed Summer Dress')]";
	public static final String QUANTITY_WANTED_XPATH = "//input[@id='quantity_wanted']";
	public static final String SIZE_PATH = "//select[@id='group_1']";
	public static final String SIZE_M_PATH = "//option[contains(text(),'M')]";
	public static final String COLOUR_BLUE_XPATH = "//a[@id='color_14']";
	public static final String ADD_TO_CART_XPATH = "//span[contains(text(),'Add to cart')]";
	public static final String SUCCESSFULLY_ADD_TO_CART = "//div[@class='layer_cart_product col-xs-12 col-md-6']//h2[1]";

	// Cart path
	public static final String VIEW_CART = "//body[@id='product']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@class='col-sm-4 clearfix']/div[@class='shopping_cart']/a[1]";
	public static final String DRESS_NAME = "//td[@class='cart_description']//a[contains(text(),'Printed Summer Dress')]";
	public static final String COLOR_SIZE_CART = "//td[@class='cart_description']//a[contains(text(),'Color : Blue, Size : M')]";
	public static final String QTY = "//input[@name='quantity_5_24_0_0']";
	public static final String POP_UP_CART = "//span[@class='cross']";

	// Registration path
	public static final String PROCEED_TO_CHECKOUT = "//span[text()='Proceed to checkout']";
	public static final String EMAIL = "input#email_create";
	public static final String CREATE_ACCOUNT = "//form[@id='create-account_form']//span[1]";
	public static final String FIRST_NAME = "//input[@id='customer_firstname']";
	public static final String LAST_NAME = "//input[@id='customer_lastname']";
	public static final String PASSWORD = "//input[@id='passwd']";
	public static final String ADDRESS_FIRST_NAME = "//input[@id='firstname']";
	public static final String ADDRESS_LASTNAME = "//input[@id='lastname']";
	public static final String ADDRESS = "//input[@id='address1']";
	public static final String CITY = "//input[@id='city']";
	public static final String STATE = "//select[@id='id_state']";
	public static final String STATE_OPTION = "//option[contains(text(),String data)]";
	public static final String ZIP = "//input[@id='postcode']";
	public static final String COUNTRY = "//select[@id='id_country']";
	public static final String MOBILE = "//input[@id='phone_mobile']";
	public static final String ALIAS = "//input[@id='alias']";
	public static final String REG_BUTTON = "//span[contains(text(),'Register')]";

	// Sign in path
	public static final String SIGN_IN_EMAIL = "//input[@id='email']";
	public static final String SIGN_IN_PASS = "//input[@id='passwd']";
	public static final String SIGN_IN = "//p[@class='submit']//span[1]";
	public static final String SIGN_OUT = "//a[@class='logout']";
	public static final String SIGN_IN_BUTTON = "//a[@class='login']";

}
