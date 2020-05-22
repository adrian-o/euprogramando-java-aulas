package pacotes;
// www.minhaloja.com.br;

/*import br.com.minhaloja.web.database;
import br.com.minhaloja.web.business;
import br.com.minhaloja.erp;
import br.com.minhaloja.mobile;
import br.com.minhaloja.api;*/

//import impressao.Impressora;
//import impressao.ImpressoraLaser;
import pacotes.impressao.*;
import pacotes.impressao.tonner.*;
//import static impressao.tonner.TonnerGS.hasPaint2;
//import java.util.Date;
//import java.sql.Date;

public class Main {
    public static void main(String []args) {
        imprime();

        if (TonnerGS.hasPaint()) {
            Impressora.imprime();
            ImpressoraLaser.imprime();
        }

        //java.util.Date agora = new java.util.Date();

        //Date depois = new Date(213472367L);
    }

    public static void imprime() {
        System.out.println("imprime do principal");
    }
}