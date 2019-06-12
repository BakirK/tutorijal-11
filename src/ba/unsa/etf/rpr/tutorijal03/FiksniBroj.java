package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }


    private enum Grad { SARAJEVO, TUZLA, ZENICA;

    }
    private Grad grad;
    private String broj;
    private String pozivni[] = {"030", "031", "032", "033", "034", "035", "036", "037", "038", "039"};

    @Override
    public String ispisi() {
        return pozivni[grad.ordinal()] + "/" + broj.substring(0,2) + "-" + broj.substring(3,5);
    }

    @Override
    public int hashCode() {
        return (Integer.parseInt(broj) + 5) * 7;
    }
}
