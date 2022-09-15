public class Main {
    public static void main(String[] args)
    {
        double salesTax = .05;
        double productPrice = 60;
        double intProduct = (salesTax+1) * productPrice;
        System.out.println("The price of the Product is " + productPrice + " with " + salesTax + " in sales tax. in total it is " + intProduct);
    }
}