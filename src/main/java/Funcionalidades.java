import java.util.*;

public class Funcionalidades {

    //Consulta medicamentos pelo nome e devolve todos os encontrados, exibindo Nome do produto, apresentacao e Pf sem impostos
    public void consultarPeloNome(List<Medicamento> medicamentos, String nome){
        System.out.println("Resultados para a consulta 1 ------------------------");

        for (Medicamento m : medicamentos) { // Para cada medicamento lido
            String nomeConsulta = m.getProduto().toLowerCase();
            String com2020 = m.getComercializacao2020().toLowerCase();
            if (nomeConsulta.contains(nome.toLowerCase()) && com2020.contains("sim")){ // Se foi comercializado em 2020 e contem o nome informado, printa as infos
                System.out.println("Nome do produto: "+m.getProduto());
                System.out.println("Apresentação: "+m.getApresentacao());
                System.out.println("PF Sem Impostos: "+m.getPfSemImpostos());
                System.out.println("-----------------------------------------------------");
            }
        }
    }

    //Busca um produto pelo código de barras e imprime os registros de todos os produtos com mesmo nome
    //Tambem pega o PMC 0% de cada registro encontrado e puxa o maior, menor e a diferenca entre os dois
    public void buscarCodigoDeBarras(List<Medicamento> medicamentos, String codigoDeBarras){
        System.out.println("Resultados para a consulta 2 ------------------------");
        double precoMaximo = 0;
        double precoMinimo = Double.MAX_VALUE;
        String produtoAlvo = "";

        for (Medicamento m : medicamentos) { //Para cada medicamento lido
            if (m.getEan1().contains(codigoDeBarras) || m.getEan2().contains(codigoDeBarras) || m.getEan3().contains(codigoDeBarras)){ //Se o codigo de barras informado esta em EAN1, EAN2 ou EAN3
                produtoAlvo = m.getProduto().toLowerCase(); // Achamos o produto referente ao codigo de barras
                System.out.println("Produto referente ao codigo informado: "+produtoAlvo);
            }
        }
        System.out.println("Registros do produto encontrados:");
        for (Medicamento m : medicamentos) { //Para cada medicamento lido
            if(m.getProduto().toLowerCase().contains(produtoAlvo)){ //Se tem o nome do produto alvo
                Double pmc0 = Double.valueOf(m.getPmc0().replaceAll(",",".").replaceAll(" ","")); //Pegamos o valor double, trocando a virgula por ponto na string
                System.out.println(m.getRegistro()+" - PMC 0%: "+pmc0);
                System.out.println();
                if (pmc0 > precoMaximo){ //Pegamos o maior PMC 0%
                    precoMaximo = pmc0;
                }
                if (pmc0 < precoMinimo){ //Pegamos o menor PMC 0%
                    precoMinimo = pmc0;
                }
            }
        }
        //Imprime
        System.out.println("PMC mais alto: "+precoMaximo);
        System.out.println("PMC mais baixo: "+precoMinimo);
        System.out.println("Diferença entre PMCs: "+(precoMaximo-precoMinimo));
    }

    //Comparativo da LISTA DE CONCESSAO DE CRÉDITO TRIBUTARIO (PIS/COFINS)
    //Pega todos os produtos comercializados em 2020 e analisa a coluna citada acima, imprimindo uma tabela com porcentagens e grafico para cada
    public void comparativoConcessao(List<Medicamento> medicamentos){
        double negativas = 0;
        double neutras = 0;
        double positivas = 0;
        double contadas = 0;

        for (Medicamento m : medicamentos) { //Para cada medicamento lido
            if (m.getComercializacao2020().toLowerCase().contains("sim")){ //Se foi comercializado em 2020
                contadas++;
                if (m.getListaDeConcessaoDeCreditoTributario().contains("Negativa")){ //Se esta classificado como negativa, incrementa
                    negativas++;
                }
                if (m.getListaDeConcessaoDeCreditoTributario().contains("Neutra")){ //Se esta classificado como neutra, incrementa
                    neutras++;
                }
                if (m.getListaDeConcessaoDeCreditoTributario().contains("Positiva")){ //Se esta classificado como positiva, incrementa
                    positivas++;
                }
            }
        }

        //Porcentagens
        double prctNegativas = (negativas / contadas) * 100;
        double prctNeutras = (neutras / contadas) * 100;
        double prctPositivas = (positivas / contadas) * 100;

        //Desenha os graficos
        String grafNegativas = desenhaGrafico(prctNegativas);
        String grafNeutras = desenhaGrafico(prctNeutras);
        String grafPositivas = desenhaGrafico(prctPositivas);

        //Imprime
        System.out.println("CLASSIFICACAO    PERCENTUAL                 GRAFICO");
        System.out.println("Negativa         "+prctNegativas+"%"+"         "+grafNegativas);
        System.out.println("Neutra           "+prctNeutras+"%"+"        "+grafNeutras);
        System.out.println("Positiva         "+prctPositivas+"%"+"         "+grafPositivas);
        System.out.println("\nTOTAL            100%");
    }

    public String desenhaGrafico(double size){
        String grafico = "";
        if (size > 0 && size < 1){
            grafico = grafico+"*";
        }

        size = (int) Math.round(size);

        while (size > 0){
            grafico = grafico + "*";
            size--;
        }
        return grafico;
    }
}
