public class Lasketiir implements Lõbustus {

    @Override
    public void lõbusta(Külastaja kulastaja) {

        int n = (int)(Math.random() * 21);  // 0..20

        kulastaja.lisaKirjeldus(
                "tabasin lasketiirus " + n + " sihtmärki"
        );
    }
}




