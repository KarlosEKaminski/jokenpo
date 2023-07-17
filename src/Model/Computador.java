package Model;

import java.util.Random;


public class Computador {
    private int computador;

    public Computador() {

    }

    public int getComputador(){
        return computador;
    }

    public int jogadaComputador() {
        Random gerador = new Random();
        computador = gerador.nextInt(3) + 1;
        return computador;
    }

    public void jokenpo() {
        switch(computador){
            case 1:
                computador = 1;
                System.out.println("Computador escolheu: PEDRA");
                break;

            case 2:
                computador = 2;
                System.out.println("Computador escolheu: PAPEL");
                break;

            case 3:
                computador = 3;
                System.out.println("Computador escolheu: TESOURA");
                break;

        }
    }

    public void regras(){
        System.out.println("________JOKENPO________\n"
        + "\n ESCOLHA UMA DAS OPÇÕES: \n"
        + "\n 1 = PEDRA"
        + "\n 2 = PAPEL"
        + "\n 3 = TESOURA"
        + "\n ______________________");
    }
    
}
