public class Auto {

    private String deunio;
    private String placa;
    private int anio;

    public Auto(String deunio, String placa, int anio) {
        this.deunio = deunio;
        this.placa = placa;
        this.anio = anio;
    }

    public String getDeunio() {
        return deunio;
    }

    public void setDeunio(String deunio) {
        this.deunio = deunio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
