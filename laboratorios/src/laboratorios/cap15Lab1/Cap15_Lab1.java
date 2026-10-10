package laboratorios.cap15Lab1;

import java.util.HashMap;




public class Cap15_Lab1 {
    public static void main(String[] args) {

       
    	HashMap<String, Integer> pessoaMap = new HashMap<>();
  
    	pessoaMap.put("Felipe", 12);
    	pessoaMap.put("Caio" , 13);
    	pessoaMap.put("Vitor" ,15);
    	pessoaMap.put("Gusta" ,13);
    

    	System.out.println(pessoaMap.toString() + ": " + pessoaMap.get(""));
    	System.out.println(pessoaMap.toString() + ": " + pessoaMap.get(""));
    	System.out.println(pessoaMap.toString() + ": " + pessoaMap.get(""));
    	System.out.println(pessoaMap.toString() + ": " + pessoaMap.get(""));
    
    }

}
