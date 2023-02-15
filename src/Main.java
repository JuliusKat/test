public class Main {
    public static void main(String[] args) {
        //3uzd
        double rndnum1 = Math.random() * 26;
        double rndnum2 = Math.random() * 26;
        double rndnum3 = Math.random() * 26;

        System.out.println(rndnum1 + " " +rndnum2+ " " + rndnum3);

        double VidurineReiksme;
        if (rndnum1 >= rndnum2 && rndnum1 <= rndnum3 || rndnum1 >= rndnum3 && rndnum1 <= rndnum2)
        {
            VidurineReiksme = rndnum1;
        }
        else if (rndnum2 >= rndnum1 && rndnum2 <= rndnum3 || rndnum2 >= rndnum3 && rndnum2 <= rndnum1)
        {
            VidurineReiksme = rndnum2;
        }
        else
        {
            VidurineReiksme = rndnum3;
        }

        System.out.println("Vidurine Reiksme: " + VidurineReiksme);
// =================================== uzd 4 ================================================================

        rndnum1 = Math.random() * 26;
        rndnum2 = Math.random() * 26;
        rndnum3 = Math.random() * 26;

        git config --global user.email "juliuskatliorius@gmail.com"
        git config --global user.email "JuliusKat"
    }
}