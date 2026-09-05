package br.com.impacta.cap10;

public interface Eletrodomestico {

	public final int VOLTAGEM = 110;
	
    void ligar();
    void desligar();
    
//    
    default void acionarTimer(int minutos) {

        /* Aguarda a quantidade de minutos informada. */
        try {
        	Thread.sleep(minutos * 600);
        	} catch (Exception e) {
        System.out.println("Deu erro na theread!!!");
        	}
        /* Executa o método desligar conforme implementado na classe. */
        desligar();
      
    }

//    static void ligarTudo(Eletrodomestico... eletroArray) {
//        for (Eletrodomestico eletro : eletroArray) {
//            eletro.ligar();
//        }
//    }
}