package app.instrucoes;

public class InstrucaoSwitch {
    
    public static void main(String[] args) {
        InstrucaoSwitch is = new InstrucaoSwitch();
        is.validaTrimestre(Trimestres.QUARTO);
    }

    enum Trimestres {PRIMEIRO, SEGUNDO, TERCEIRO, QUARTO, DESCONHECIDO}

    // Tipos permitidos são:
    // 1- qualquer tipo que possa ser convertido pra um int
    // 2- Enumeration
    // 3- String
    public void validaTrimestre(Trimestres trimestre) {
        switch (trimestre) {
            case PRIMEIRO:
                System.out.println("Validando primeiro trmestre...");
                break;

            case SEGUNDO: 
                System.out.println("Validando segundo trimestre...");
                break;

            case TERCEIRO: 
                System.out.println("Validando terceiro trimestre...");
                break;

            case QUARTO: 
                System.out.println("Validando quarto trimestre...");
                break;
            
            default:
                System.out.println("Trimestre não reconhecido...");
                break;
        }
    }
}