class Allatok {
    String nev;

    public Allatok(String nev) {
        this.nev = nev;
    }

    public void hangot_kiad() {
        System.out.println("Allatok kozos ose");
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    @Override
    public String toString() {
        return "Allatok{" +
                "nev='" + nev + '\'' +
                '}';
    }
}

class Kutya extends Allatok {
    public Kutya(String nev) {
        super(nev);
    }

    public void ugat() {
        System.out.println("Vau Vau");
    }
}

class Macska extends Allatok {
    public Macska(String nev) {
        super(nev);
    }

    public void nyavog() {
        System.out.println("Miauuuuuu");
    }
}

// itt minden Allat tipusnak megfelelo hangott ad ki a kutya : Vau Vau MAcsak Miauuu
public class Animal {
    public static void main(String[] args) {

        Allatok myAnimals = new Allatok("Mirci");
        Kutya myDog = new Kutya("Lord");
        Macska myCat = new Macska("Mirci");
        myAnimals.hangot_kiad();
        myDog.ugat();
        myCat.nyavog();

        Kutya myDog2 = new Kutya("Lord");
        Macska myCat2 = new Macska("Mirci");
        myDog2.ugat();
        myCat2.nyavog();
    }
}
