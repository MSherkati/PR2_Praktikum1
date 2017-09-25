package praktikum_1;

public class Main
{
    public static void main(String[] args)
    {

        WebShop webShop = new WebShop();

        webShop.addCustomer("Jogi", "Löw");
        webShop.addCustomer("Uli", "Hoeneß");
        webShop.addCustomer("Hansi", "Flick");
        webShop.addCustomer("Dieter", "Hoeneß");
        webShop.addCustomer("Hansi", "Flick");
        webShop.addCustomer("Mehmet", "Scholl");
        webShop.addCustomer("Marco", "Reus");

        webShop.printListOfCustomers(
                SortingCriterion.SORT_BY_LASTNAME_FIRSTNAME);
        System.out.println();

        webShop.printListOfCustomers(SortingCriterion.SORT_BY_ID);
        System.out.println();

        webShop.removeCustomer("Mehmet", "Scholl");
        webShop.removeCustomer("Hansi", "Flick");

        webShop.printListOfCustomers(SortingCriterion.SORT_BY_ID);
        System.out.println();

    }

}
