import java.util.*;

public class Funcionalidades {

    //Consultar medicamentos pelo nome
    public void consultarPeloNome(List<Medicamento> medicamentos, String nome){
        List<Medicamento> encontrados = new ArrayList<>();
        System.out.println("Resultados para a consulta 1 ------------------------");

        for (Medicamento m : medicamentos) {
            String nomeConsulta = m.getProduto().toLowerCase();
            String com2020 = m.getComercializacao2020().toLowerCase();
            if (nomeConsulta.contains(nome.toLowerCase()) && com2020.contains("sim")){
                System.out.println("Nome do produto: "+m.getProduto());
                System.out.println("Apresentação: "+m.getApresentacao());
                System.out.println("PF Sem Impostos: "+m.getPfSemImpostos());
                System.out.println("-----------------------------------------------------");
                System.out.println(m);
            }
        }
    }

    //Buscar pelo código de barras
    public void buscarCodigoDeBarras(List<Medicamento> medicamentos, String codigoDeBarras){
        System.out.println("Resultados para a consulta 2 ------------------------");
        double precoMaximo = 0;
        double precoMinimo = Double.MAX_VALUE;
        String produtoAlvo = "";

        for (Medicamento m : medicamentos) {
            if (m.getEan1().contains(codigoDeBarras) || m.getEan2().contains(codigoDeBarras) || m.getEan3().contains(codigoDeBarras)){
                produtoAlvo = m.getProduto().toLowerCase();
                System.out.println("Produto referente ao codigo informado: "+produtoAlvo);
            }
        }
        System.out.println("Registros do produto encontrados:");
        for (Medicamento m : medicamentos) {
            if(m.getProduto().toLowerCase().contains(produtoAlvo)){
                Double pmc0 = Double.valueOf(m.getPmc0().replaceAll(",",".").replaceAll(" ",""));
                System.out.println(m.getRegistro()+" - PMC 0%: "+pmc0);
                System.out.println();
                if (pmc0 > precoMaximo){
                    precoMaximo = pmc0;
                }
                if (pmc0 < precoMinimo){
                    precoMinimo = pmc0;
                }
            }
        }
        System.out.println("PMC mais alto: "+precoMaximo);
        System.out.println("PMC mais baixo: "+precoMinimo);
        System.out.println("Diferença entre PMCs: "+(precoMaximo-precoMinimo));
    }

    //Comparativo da LISTA DE CONCESSAO DE CRÉDITO TRIBUTARIO (PIS/COFINS)
    public void comparativoConcessao(List<Medicamento> medicamentos){
        double negativas = 0;
        double neutras = 0;
        double positivas = 0;
        double contadas = 0;

        for (Medicamento m : medicamentos) {
            if (m.getComercializacao2020().toLowerCase().contains("sim")){
                contadas++;
                if (m.getListaDeConcessaoDeCreditoTributario().contains("Negativa")){
                    negativas++;
                }
                if (m.getListaDeConcessaoDeCreditoTributario().contains("Neutra")){
                    neutras++;
                }
                if (m.getListaDeConcessaoDeCreditoTributario().contains("Positiva")){
                    positivas++;
                }
            }
        }

        double prctNegativas = (negativas / contadas) * 100;
        double prctNeutras = (neutras / contadas) * 100;
        double prctPositivas = (positivas / contadas) * 100;

        String grafNegativas = desenhaGrafico((int) Math.round(prctNegativas));
        String grafNeutras = desenhaGrafico((int) Math.round(prctNeutras));
        String grafPositivas = desenhaGrafico((int) Math.round(prctPositivas));

        System.out.println("CLASSIFICACAO    PERCENTUAL                 GRAFICO");
        System.out.println("Negativa         "+prctNegativas+"%"+"         "+grafNegativas);
        System.out.println("Neutra           "+prctNeutras+"%"+"        "+grafNeutras);
        System.out.println("Positiva         "+prctPositivas+"%"+"         "+grafPositivas);
        System.out.println("\nTOTAL            100%");
    }

    public String desenhaGrafico(int size){
        String grafico = "";
        if (size > 0 && size < 1){
            grafico = "*";
        }
        while (size > 0){
            grafico = grafico + "*";
            size--;
        }
        return grafico;
    }
}
