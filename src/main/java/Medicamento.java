public class Medicamento { //Objeto que representa cada linha do arquivo csv como um medicamento
    private final String substancia;
    private final String CNPJ;
    private final String laboratorio;
    private final String codigoGGREM;
    private final String registro;
    private final String ean1;
    private final String ean2;
    private final String ean3;
    private final String produto;
    private final String apresentacao;
    private final String classeTerapeutica;
    private final String tipoDeProduto;
    private final String regimeDePreco;
    private final String pfSemImpostos;
    private final String pf0;
    private final String pf12;
    private final String pf17;
    private final String pf17Alc;
    private final String pf175;
    private final String pf175Alc;
    private final String pf18;
    private final String pf18Alc;
    private final String pf20;
    private final String pmc0;
    private final String pmc12;
    private final String pmc17;
    private final String pmc17Alc;
    private final String pmc175;
    private final String pmc175Alc;
    private final String pmc18;
    private final String pmc18Alc;
    private final String pmc20;
    private final String restricaoHospitalar;
    private final String CAP;
    private final String confaz87;
    private final String icms0;
    private final String analiseRecursal;
    private final String listaDeConcessaoDeCreditoTributario;
    private final String comercializacao2020;
    private final String tarja;

    public Medicamento(String substancia, String CNPJ, String laboratorio, String codigoGGREM, String registro, String ean1, String ean2, String ean3, String produto, String apresentacao, String classeTerapeutica, String tipoDeProduto, String regimeDePreco, String pfSemImpostos, String pf0, String pf12, String pf17, String pf17Alc, String pf175, String pf175Alc, String pf18, String pf18Alc, String pf20, String pmc0, String pmc12, String pmc17, String pmc17Alc, String pmc175, String pmc175Alc, String pmc18, String pmc18Alc, String pmc20, String restricaoHospitalar, String CAP, String confaz87, String icms0, String analiseRecursal, String listaDeConcessaoDeCreditoTributario, String comercializacao2020, String tarja) {
        this.substancia = substancia;
        this.CNPJ = CNPJ;
        this.laboratorio = laboratorio;
        this.codigoGGREM = codigoGGREM;
        this.registro = registro;
        this.ean1 = ean1;
        this.ean2 = ean2;
        this.ean3 = ean3;
        this.produto = produto;
        this.apresentacao = apresentacao;
        this.classeTerapeutica = classeTerapeutica;
        this.tipoDeProduto = tipoDeProduto;
        this.regimeDePreco = regimeDePreco;
        this.pfSemImpostos = pfSemImpostos;
        this.pf0 = pf0;
        this.pf12 = pf12;
        this.pf17 = pf17;
        this.pf17Alc = pf17Alc;
        this.pf175 = pf175;
        this.pf175Alc = pf175Alc;
        this.pf18 = pf18;
        this.pf18Alc = pf18Alc;
        this.pf20 = pf20;
        this.pmc0 = pmc0;
        this.pmc12 = pmc12;
        this.pmc17 = pmc17;
        this.pmc17Alc = pmc17Alc;
        this.pmc175 = pmc175;
        this.pmc175Alc = pmc175Alc;
        this.pmc18 = pmc18;
        this.pmc18Alc = pmc18Alc;
        this.pmc20 = pmc20;
        this.restricaoHospitalar = restricaoHospitalar;
        this.CAP = CAP;
        this.confaz87 = confaz87;
        this.icms0 = icms0;
        this.analiseRecursal = analiseRecursal;
        this.listaDeConcessaoDeCreditoTributario = listaDeConcessaoDeCreditoTributario;
        this.comercializacao2020 = comercializacao2020;
        this.tarja = tarja;
    }

    public String getSubstancia() {
        return substancia;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public String getCodigoGGREM() {
        return codigoGGREM;
    }

    public String getRegistro() {
        return registro;
    }

    public String getEan1() {
        return ean1;
    }

    public String getEan2() {
        return ean2;
    }

    public String getEan3() {
        return ean3;
    }

    public String getProduto() {
        return produto;
    }

    public String getApresentacao() {
        return apresentacao;
    }

    public String getClasseTerapeutica() {
        return classeTerapeutica;
    }

    public String getTipoDeProduto() {
        return tipoDeProduto;
    }

    public String getRegimeDePreco() {
        return regimeDePreco;
    }

    public String getPfSemImpostos() {
        return pfSemImpostos;
    }

    public String getPf0() {
        return pf0;
    }

    public String getPf12() {
        return pf12;
    }

    public String getPf17() {
        return pf17;
    }

    public String getPf17Alc() {
        return pf17Alc;
    }

    public String getPf175() {
        return pf175;
    }

    public String getPf175Alc() {
        return pf175Alc;
    }

    public String getPf18() {
        return pf18;
    }

    public String getPf18Alc() {
        return pf18Alc;
    }

    public String getPf20() {
        return pf20;
    }

    public String getPmc0() {
        return pmc0;
    }

    public String getPmc12() {
        return pmc12;
    }

    public String getPmc17() {
        return pmc17;
    }

    public String getPmc17Alc() {
        return pmc17Alc;
    }

    public String getPmc175() {
        return pmc175;
    }

    public String getPmc175Alc() {
        return pmc175Alc;
    }

    public String getPmc18() {
        return pmc18;
    }

    public String getPmc18Alc() {
        return pmc18Alc;
    }

    public String getPmc20() {
        return pmc20;
    }

    public String getRestricaoHospitalar() {
        return restricaoHospitalar;
    }

    public String getCAP() {
        return CAP;
    }

    public String getConfaz87() {
        return confaz87;
    }

    public String getIcms0() {
        return icms0;
    }

    public String getAnaliseRecursal() {
        return analiseRecursal;
    }

    public String getListaDeConcessaoDeCreditoTributario() {
        return listaDeConcessaoDeCreditoTributario;
    }

    public String getComercializacao2020() {
        return comercializacao2020;
    }

    public String getTarja() {
        return tarja;
    }

    @Override
    public String toString() {
        return "Medicamento:" +
                "\nsubstancia='" + substancia + '\'' +
                "\n CNPJ='" + CNPJ + '\'' +
                "\n laboratorio='" + laboratorio + '\'' +
                "\n codigoGGREM=" + codigoGGREM +
                "\n registro=" + registro +
                "\n ean1='" + ean1 + '\'' +
                "\n ean2='" + ean2 + '\'' +
                "\n ean3='" + ean3 + '\'' +
                "\n produto='" + produto + '\'' +
                "\n apresentacao='" + apresentacao + '\'' +
                "\n classeTerapeutica='" + classeTerapeutica + '\'' +
                "\n tipoDeProduto='" + tipoDeProduto + '\'' +
                "\n regimeDePreco='" + regimeDePreco + '\'' +
                "\n pfSemImpostos=" + pfSemImpostos +
                "\n pf0=" + pf0 +
                "\n pf12=" + pf12 +
                "\n pf17=" + pf17 +
                "\n pf17Alc=" + pf17Alc +
                "\n pf175=" + pf175 +
                "\n pf175Alc=" + pf175Alc +
                "\n pf18=" + pf18 +
                "\n pf18Alc=" + pf18Alc +
                "\n pf20=" + pf20 +
                "\n pmc0=" + pmc0 +
                "\n pmc12=" + pmc12 +
                "\n pmc17=" + pmc17 +
                "\n pmc17Alc=" + pmc17Alc +
                "\n pmc175=" + pmc175 +
                "\n pmc175Alc=" + pmc175Alc +
                "\n pmc18=" + pmc18 +
                "\n pmc18Alc=" + pmc18Alc +
                "\n pmc20=" + pmc20 +
                "\n restricaoHospitalar='" + restricaoHospitalar + '\'' +
                "\n CAP='" + CAP + '\'' +
                "\n confaz87='" + confaz87 + '\'' +
                "\n icms0='" + icms0 + '\'' +
                "\n analiseRecursal=" + analiseRecursal +
                "\n listaDeConcessaoDeCreditoTributario='" + listaDeConcessaoDeCreditoTributario + '\'' +
                "\n comercializacao2020='" + comercializacao2020 + '\'' +
                "\n tarja='" + tarja + '\'' +
               "\n\n"
                ;
    }
}