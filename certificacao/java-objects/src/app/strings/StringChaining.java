package app.strings;

public class StringChaining {
    public static void main(String[] args) {
        // canal -> "Canal Eu Programando" 
        // "         EU PROGRAMANDO        "
        // "EU PROGRAMANDO"
        // "CANAL EU PROGRAMANDO"
        // "canal eu programando"
        // "canal Eu programando"
        // "Canal Eu programando"
        // "Canal Eu Programando"
        // "#########################################"
        // "[Canal Eu Programando"
        // "[Canal Eu Programando]"

        
        String canal = "         EU PROGRAMANDO        ";
        canal = "CANAL ".concat(canal.trim()).toLowerCase();
        canal.replace("e", "E").replace("c", "C").replace("p", "P");
        // ( canal.indexOf("P") ).replace("p","P"); 

        System.out.println("#########################################");

        System.out.println("[" + canal + "]");


    }
}