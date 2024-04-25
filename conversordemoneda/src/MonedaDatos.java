import com.google.gson.annotations.SerializedName;

public class MonedaDatos implements Comparable<MonedaDatos> {

    @SerializedName("time_last_update_utc")
private String TiempoUltimaAct;
    @SerializedName("time_next_update_utc")
    private String MonedaAconvertir;
    private String TiempoProximaAct;
private String MonedaConvertida;
private double ValorMoneda;
private double ValorMonedaTotal;



    public MonedaDatos(Moneda miTituloOmdb) {
        this.TiempoUltimaAct = miTituloOmdb.time_last_update_utc();
        this.TiempoProximaAct = miTituloOmdb.time_next_update_utc();
        this.MonedaAconvertir = miTituloOmdb.base_code();
        this.MonedaConvertida = miTituloOmdb.target_code();
        this.ValorMoneda = Double.parseDouble(miTituloOmdb.conversion_rate());
        this.ValorMonedaTotal = Double.parseDouble(miTituloOmdb.conversion_result());

    }


    public String getTiempoUltimaAct() {
        return TiempoUltimaAct;
    }

    public String getMonedaAconvertir() {
        return MonedaAconvertir;
    }

    public String getTiempoProximaAct() {
        return TiempoProximaAct;
    }

    public String getMonedaConvertida() {
        return MonedaConvertida;
    }

    public double getValorMoneda() {
        return ValorMoneda;
    }

    public double getValorMonedaTotal() {
        return ValorMonedaTotal;
    }

    @Override
    public String toString() {
        return "MonedaDatos{" +
                "TiempoUltimaAct='" + TiempoUltimaAct + '\'' +
                ", MonedaAconvertir='" + MonedaAconvertir + '\'' +
                ", TiempoProximaAct='" + TiempoProximaAct + '\'' +
                ", MonedaConvertida='" + MonedaConvertida + '\'' +
                ", ValorMoneda=" + ValorMoneda +
                ", ValorMonedaTotal=" + ValorMonedaTotal +
                '}';
    }

    @Override
    public int compareTo(MonedaDatos otrasMonedasDatos) {
        return this.getMonedaAconvertir().compareTo(otrasMonedasDatos.getMonedaAconvertir());
    }

}

