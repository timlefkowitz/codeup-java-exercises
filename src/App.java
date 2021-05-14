public class App {
    public static void main(String [] args){


        Chef normalChef = new Chef();
        normalChef.makeSpecialDish();

        ItalianChef italianChef = new ItalianChef();
        italianChef.makePasta();

        ChineseChef chineseChef = new ChineseChef();
        chineseChef.makeSpecialDish();

    }
}
