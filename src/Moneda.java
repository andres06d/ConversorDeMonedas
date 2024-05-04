import java.text.DecimalFormat;
import java.util.HashMap;

public class Moneda {
    private String base_code;
    private String target_code;
    private String conversion_rate;
    private String conversion_result;
    private static HashMap<String, String> currencyNames = new HashMap<>();


    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public void setTarget_code(String target_code) {
        this.target_code = target_code;
    }

    public String getConversion_rate() {
        return conversion_rate;
    }

    public void setConversion_rate(String conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    public String getConversion_result() {
        return conversion_result;
    }

    public void setConversion_result(String conversion_result) {
        this.conversion_result = conversion_result;
    }

    public static HashMap<String, String> getCurrencyNames() {
        return currencyNames;
    }

    public static void setCurrencyNames(HashMap<String, String> currencyNames) {
        Moneda.currencyNames = currencyNames;
    }

    static {
        currencyNames.put("USD", "Dólar estadounidense");
        currencyNames.put("AED", "Dirham de los Emiratos Árabes Unidos");
        currencyNames.put("AFN", "Afgani afgano");
        currencyNames.put("ALL", "Lek albanés");
        currencyNames.put("AMD", "Dram armenio");
        currencyNames.put("ANG", "Florín antillano neerlandés");
        currencyNames.put("AOA", "Kwanza angoleño");
        currencyNames.put("ARS", "Peso argentino");
        currencyNames.put("AUD", "Dólar australiano");
        currencyNames.put("AWG", "Florín arubeño");
        currencyNames.put("AZN", "Manat azerí");
        currencyNames.put("BAM", "Marco convertible de Bosnia-Herzegovina");
        currencyNames.put("BBD", "Dólar de Barbados");
        currencyNames.put("BDT", "Taka de Bangladesh");
        currencyNames.put("BGN", "Lev búlgaro");
        currencyNames.put("BHD", "Dinar bahreiní");
        currencyNames.put("BIF", "Franco burundés");
        currencyNames.put("BMD", "Dólar bermudeño");
        currencyNames.put("BND", "Dólar de Brunéi");
        currencyNames.put("BOB", "Boliviano");
        currencyNames.put("BRL", "Real brasileño");
        currencyNames.put("BSD", "Dólar bahameño");
        currencyNames.put("BTN", "Ngultrum butanés");
        currencyNames.put("BWP", "Pula botsuano");
        currencyNames.put("BYN", "Rublo bielorruso");
        currencyNames.put("BZD", "Dólar beliceño");
        currencyNames.put("CAD", "Dólar canadiense");
        currencyNames.put("CDF", "Franco congoleño");
        currencyNames.put("CHF", "Franco suizo");
        currencyNames.put("CLP", "Peso chileno");
        currencyNames.put("CNY", "Yuan chino");
        currencyNames.put("COP", "Peso colombiano");
        currencyNames.put("CRC", "Colón costarricense");
        currencyNames.put("CUP", "Peso cubano");
        currencyNames.put("CVE", "Escudo caboverdiano");
        currencyNames.put("CZK", "Corona checa");
        currencyNames.put("DJF", "Franco yibutiano");
        currencyNames.put("DKK", "Corona danesa");
        currencyNames.put("DOP", "Peso dominicano");
        currencyNames.put("DZD", "Dinar argelino");
        currencyNames.put("EGP", "Libra egipcia");
        currencyNames.put("ERN", "Nakfa eritreo");
        currencyNames.put("ETB", "Birr etíope");
        currencyNames.put("EUR", "Euro");
        currencyNames.put("FJD", "Dólar fiyiano");
        currencyNames.put("FKP", "Libra de las Islas Malvinas");
        currencyNames.put("FOK", "Corona feroesa");
        currencyNames.put("GBP", "Libra esterlina");
        currencyNames.put("GEL", "Lari georgiano");
        currencyNames.put("GGP", "Libra de Guernsey");
        currencyNames.put("GHS", "Cedi ghanés");
        currencyNames.put("GIP", "Libra de Gibraltar");
        currencyNames.put("GMD", "Dalasi gambiano");
        currencyNames.put("GNF", "Franco guineano");
        currencyNames.put("GTQ", "Quetzal guatemalteco");
        currencyNames.put("GYD", "Dólar guyanés");
        currencyNames.put("HKD", "Dólar de Hong Kong");
        currencyNames.put("HNL", "Lempira hondureño");
        currencyNames.put("HRK", "Kuna croata");
        currencyNames.put("HTG", "Gourde haitiano");
        currencyNames.put("HUF", "Florín húngaro");
        currencyNames.put("IDR", "Rupia indonesia");
        currencyNames.put("ILS", "Nuevo séquel israelí");
        currencyNames.put("IMP", "Libra de la Isla de Man");
        currencyNames.put("INR", "Rupia india");
        currencyNames.put("IQD", "Dinar iraquí");
        currencyNames.put("IRR", "Rial iraní");
        currencyNames.put("ISK", "Corona islandesa");
        currencyNames.put("JEP", "Libra de Jersey");
        currencyNames.put("JMD", "Dólar jamaicano");
        currencyNames.put("JOD", "Dinar jordano");
        currencyNames.put("JPY", "Yen japonés");
        currencyNames.put("KES", "Chelín keniano");
        currencyNames.put("KGS", "Som kirguís");
        currencyNames.put("KHR", "Riel camboyano");
        currencyNames.put("KID", "Dólar de Kiribati");
        currencyNames.put("KMF", "Franco comorense");
        currencyNames.put("KRW", "Won surcoreano");
        currencyNames.put("KWD", "Dinar kuwaití");
        currencyNames.put("KYD", "Dólar de las Islas Caimán");
        currencyNames.put("KZT", "Tenge kazajo");
        currencyNames.put("LAK", "Kip laosiano");
        currencyNames.put("LBP", "Libra libanesa");
        currencyNames.put("LKR", "Rupia de Sri Lanka");
        currencyNames.put("LRD", "Dólar liberiano");
        currencyNames.put("LSL", "Loti lesothense");
        currencyNames.put("LYD", "Dinar libio");
        currencyNames.put("MAD", "Dirham marroquí");
        currencyNames.put("MDL", "Leu moldavo");
        currencyNames.put("MGA", "Ariary malgache");
        currencyNames.put("MKD", "Denar macedonio");
        currencyNames.put("MMK", "Kyat birmano");
        currencyNames.put("MNT", "Tugrik mongol");
        currencyNames.put("MOP", "Pataca de Macao");
        currencyNames.put("MRU", "Ouguiya mauritana");
        currencyNames.put("MUR", "Rupia de Mauricio");
        currencyNames.put("MVR", "Rupia de Maldivas");
        currencyNames.put("MWK", "Kwacha malauí");
        currencyNames.put("MXN", "Peso mexicano");
        currencyNames.put("MYR", "Ringgit malayo");
        currencyNames.put("MZN", "Metical mozambiqueño");
        currencyNames.put("NAD", "Dólar namibio");
        currencyNames.put("NGN", "Naira nigeriano");
        currencyNames.put("NIO", "Córdoba nicaragüense");
        currencyNames.put("NOK", "Corona noruega");
        currencyNames.put("NPR", "Rupia nepalí");
        currencyNames.put("NZD", "Dólar neozelandés");
        currencyNames.put("OMR", "Rial omaní");
        currencyNames.put("PAB", "Balboa panameño");
        currencyNames.put("PEN", "Sol peruano");
        currencyNames.put("PGK", "Kina de Papúa Nueva Guinea");
        currencyNames.put("PHP", "Peso filipino");
        currencyNames.put("PKR", "Rupia pakistaní");
        currencyNames.put("PLN", "Zloty polaco");
        currencyNames.put("PYG", "Guaraní paraguayo");
        currencyNames.put("QAR", "Riyal qatarí");
        currencyNames.put("RON", "Leu rumano");
        currencyNames.put("RSD", "Dinar serbio");
        currencyNames.put("RUB", "Rublo ruso");
        currencyNames.put("RWF", "Franco ruandés");
        currencyNames.put("SAR", "Riyal saudí");
        currencyNames.put("SBD", "Dólar de las Islas Salomón");
        currencyNames.put("SCR", "Rupia de Seychelles");
        currencyNames.put("SDG", "Libra sudanesa");
        currencyNames.put("SEK", "Corona sueca");
        currencyNames.put("SGD", "Dólar singapurense");
        currencyNames.put("SHP", "Libra de Santa Elena");
        currencyNames.put("SLE", "Leone sierraleonés");
        currencyNames.put("SLL", "Leone sierraleonés");
        currencyNames.put("SOS", "Chelín somalí");
        currencyNames.put("SRD", "Dólar surinamés");
        currencyNames.put("SSP", "Libra sursudanesa");
        currencyNames.put("STN", "Dobra santotomense");
        currencyNames.put("SYP", "Libra siria");
        currencyNames.put("SZL", "Lilangeni suazi");
        currencyNames.put("THB", "Baht tailandés");
        currencyNames.put("TJS", "Somoni tayiko");
        currencyNames.put("TMT", "Manat turcomano");
        currencyNames.put("TND", "Dinar tunecino");
        currencyNames.put("TOP", "Pa'anga tongano");
        currencyNames.put("TRY", "Lira turca");
        currencyNames.put("TTD", "Dólar de Trinidad y Tobago");
        currencyNames.put("TVD", "Dólar tuvaluano");
        currencyNames.put("TWD", "Nuevo dólar taiwanés");
        currencyNames.put("TZS", "Chelín tanzano");
        currencyNames.put("UAH", "Grivna ucraniana");
        currencyNames.put("UGX", "Chelín ugandés");
        currencyNames.put("UYU", "Peso uruguayo");
        currencyNames.put("UZS", "Som uzbeko");
        currencyNames.put("VES", "Bolívar venezolano");
        currencyNames.put("VND", "Dong vietnamita");
        currencyNames.put("VUV", "Vatu vanuatuense");
        currencyNames.put("WST", "Tala samoano");
        currencyNames.put("XAF", "Franco CFA de África Central");
        currencyNames.put("XCD", "Dólar del Caribe Oriental");
        currencyNames.put("XDR", "Derechos especiales de giro");
        currencyNames.put("XOF", "Franco CFA de África Occidental");
        currencyNames.put("XPF", "Franco CFP");
        currencyNames.put("YER", "Rial yemení");
        currencyNames.put("ZAR", "Rand sudafricano");
        currencyNames.put("ZMW", "Kwacha zambiano");
        currencyNames.put("ZWL", "Dólar zimbabuense");
    }

    public static String Convertidor(String moneda) {
        if (currencyNames.containsKey(moneda)) {
            return currencyNames.get(moneda);
        } else {
            return "Moneda no encontrada";
        }
    }

    @Override
    public String toString() {
        final DecimalFormat moneyFormat = new DecimalFormat("#,##0.00");
        return "Conversion" + "\n" +
                "Moneda de origen: " + Convertidor(base_code)  + "\n" +
                "Moneda a convertir: " + Convertidor(target_code)  + "\n" +
                "Tasa de conversion: " + moneyFormat.format(Double.parseDouble(conversion_rate)) + "\n" +
                "Resultado de conversion: " + moneyFormat.format(Double.parseDouble(conversion_result)) + "\n";
    }

}
