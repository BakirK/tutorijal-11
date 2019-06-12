package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    private Integer mobilnaMreza;
    private String broj;

    public MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return "0" + Integer.toString(mobilnaMreza) + "/" + broj.substring(0,2) + "-" + broj.substring(3,5);
    }

    @Override
    public int hashCode() {
        return (Integer.parseInt(broj) + 5) * 7;
    }
}
