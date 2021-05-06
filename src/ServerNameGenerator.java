public class ServerNameGenerator {

    public static String[] adjectives = {"clumsy", "faint","fancy","fair","deadly","smart","sweaty","small","sincere","rare",};

    public static String[] nouns = {"design","chance","food","air","approval","fruit","flight","discovery","detail","fire",};


    private static void randomWordz() {
        int randomAdjective = (int) (Math.random() * 10);
        int randomNoun = (int) (Math.random() * 10);
        String randomWords = adjectives[randomAdjective] + "-" + nouns[randomNoun];
        System.out.println("Here is your server name: " + randomWords);
    }

        public static void main(String[] args){

        randomWordz();
    }
}
