import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteConsultas {
    @Test
    void testeConsultarPeloNome(){
        Funcionalidades app = new Funcionalidades();
        ArrayList medicamentos = new ArrayList<>();
        medicamentos.add(new Medicamento("SUBSTA","12.345.678/9101-11","LABA","123456789101112","11111111111","2222222222222"," - "," - ","PRODA","APRA","AAA - CLASSA","Regulado","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","Não","Não","Não","Não","","Negativa","Sim","Tarja Vermelha"));
        medicamentos.add(new Medicamento("SUBSTA","12.345.678/9101-11","LABA","123456789101562","11111111123","2222222287422"," - "," - ","PRODA","APRA2","AAA - CLASSA","Regulado","3","4","7","2","8","2,2","7,5","8,1","9,8","10,9","11,18","5,7","13,28","9,99","15,1323","16,123123","17,555","8,14","3,34","20,33","Não","Não","Não","Não","","Negativa","Não","Tarja Vermelha"));
        medicamentos.add(new Medicamento("SUBSTB","56.785.635/6762-23","LABB","327823465875692","11111111111","2222222222222"," - "," - ","PRODB","APRB","AAA - CLASSB","Regulado","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","Não","Não","Não","Não","","Neutra","Sim","Tarja Vermelha(*)"));
        medicamentos.add(new Medicamento("SUBSTC","96.842.877/9356-11","LABC","712543583467289","78921691456","4593321636542"," - "," - ","PRODC","APRC","AAA - CLASSC","Regulado","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","Não","Não","Não","Não","","Positiva","Sim","Tarja Preta"));
        app.consultarPeloNome(medicamentos,"PRODA");
    }

    @Test
    void testeBuscarCodigoDeBarras(){
        Funcionalidades app = new Funcionalidades();
        ArrayList medicamentos = new ArrayList<>();
        medicamentos.add(new Medicamento("SUBSTA","12.345.678/9101-11","LABA","123456789101112","11111111111","2222222222222"," - "," - ","PRODA","APRA","AAA - CLASSA","Regulado","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","Não","Não","Não","Não","","Negativa","Sim","Tarja Vermelha"));
        medicamentos.add(new Medicamento("SUBSTA","12.345.678/9101-11","LABA","123456789101562","11111111123","2222222287422"," - "," - ","PRODA","APRA2","AAA - CLASSA","Regulado","3","4","7","2","8","2,2","7,5","8,1","9,8","10,9","11,18","5,7","13,28","9,99","15,1323","16,123123","17,555","8,14","3,34","20,33","Não","Não","Não","Não","","Negativa","Não","Tarja Vermelha"));
        medicamentos.add(new Medicamento("SUBSTB","56.785.635/6762-23","LABB","327823465875692","11111111111","2222222222222"," - "," - ","PRODB","APRB","AAA - CLASSB","Regulado","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","Não","Não","Não","Não","","Neutra","Sim","Tarja Vermelha(*)"));
        medicamentos.add(new Medicamento("SUBSTC","96.842.877/9356-11","LABC","712543583467289","78921691456","4593321636542"," - "," - ","PRODC","APRC","AAA - CLASSC","Regulado","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","Não","Não","Não","Não","","Positiva","Sim","Tarja Preta"));
        app.buscarCodigoDeBarras(medicamentos,"2222222287422");
    }

    @Test
    void testeComparativoConcessao(){
        Funcionalidades app = new Funcionalidades();
        ArrayList medicamentos = new ArrayList<>();
        medicamentos.add(new Medicamento("SUBSTA","12.345.678/9101-11","LABA","123456789101112","11111111111","2222222222222"," - "," - ","PRODA","APRA","AAA - CLASSA","Regulado","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","Não","Não","Não","Não","","Negativa","Sim","Tarja Vermelha"));
        medicamentos.add(new Medicamento("SUBSTA","12.345.678/9101-11","LABA","123456789101562","11111111123","2222222287422"," - "," - ","PRODA","APRA2","AAA - CLASSA","Regulado","3","4","7","2","8","2,2","7,5","8,1","9,8","10,9","11,18","5,7","13,28","9,99","15,1323","16,123123","17,555","8,14","3,34","20,33","Não","Não","Não","Não","","Negativa","Não","Tarja Vermelha"));
        medicamentos.add(new Medicamento("SUBSTB","56.785.635/6762-23","LABB","327823465875692","11111111111","2222222222222"," - "," - ","PRODB","APRB","AAA - CLASSB","Regulado","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","Não","Não","Não","Não","","Neutra","Sim","Tarja Vermelha(*)"));
        medicamentos.add(new Medicamento("SUBSTC","96.842.877/9356-11","LABC","712543583467289","78921691456","4593321636542"," - "," - ","PRODC","APRC","AAA - CLASSC","Regulado","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","Não","Não","Não","Não","","Positiva","Sim","Tarja Preta"));
        app.comparativoConcessao(medicamentos);
    }

    @Test
    void testeDesenhaGrafico(){
        Funcionalidades app = new Funcionalidades();
        assertEquals("**********************",app.desenhaGrafico(22.3));
        assertEquals("**********************",app.desenhaGrafico(12.45));
        assertEquals("**********************",app.desenhaGrafico(3));
        assertEquals("**********************",app.desenhaGrafico(-1));
        assertEquals("**********************",app.desenhaGrafico(10000000));
    }

    @Test
    void testeMax(){
        Funcionalidades app = new Funcionalidades();
        assertEquals(5,app.max(3,2.09));
        assertEquals(0.1,app.max(-5,0.1));
    }
    @Test
    void testeMin(){
        Funcionalidades app = new Funcionalidades();
        assertEquals(2.09,app.min(3,2.09));
        assertEquals(-5,app.min(-5,0.1));
    }
}
