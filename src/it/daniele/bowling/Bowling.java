package it.daniele.bowling;

public class Bowling {
    private int numeroTiri[] = new int[21];
    private int tiro = 0;

    /*
     Metodo che simula il punteggio nel boowling assumendo che il numero di tiri sia massimo 21
     ce che i frame di gioco siano 10
     */
    public int getPunteggio() {
        int punti = 0;
        int frame = 0;
        /*
        Ciclo sul numero di frame del gioco (10):
        il punteggio del tiro è il valore contenuto nell'array numeroTiri.
         */
        for (int i = 0; i < 10; i++){
            /*
            Inizio col caso fortunato di uno strike, il punteggio è 10 + i birilli abbattuti nei due
            successivi tiri. Passo al frame successivo.
            */
            if(numeroTiri[frame] == 10) {
                punti = punti + 10 + numeroTiri[frame +1] + numeroTiri[frame +2];
                frame ++;

                /*
                Nel caso spare il punteggio è 10 + i birilli abbattuti nel tiro successivo
                incremento il contatore dei frame di due e passo al successivo.
                 */
            } else if (numeroTiri[frame]  + numeroTiri[frame + 1] == 10){
                punti = punti + 10 + numeroTiri[frame + 2];
                frame +=2;
                /*
                Nel caso più semplice il punteggio è la somma dei due tiri. incremento il
                 contatore dei frame di due e passo al successivo.
                 */
            } else {
                punti = punti + numeroTiri[frame] + numeroTiri[frame +1];
                frame +=2;
            }
        }
        return punti;
    }

    /*
    Metodo utilizzato per tenere traccia dei birilli abbattutti nei tiri effettuati.
    Costruisco un vettore con i valori passati dal test.
     */
    public void tiro(int numeroBirilli) {
        numeroTiri[tiro++] = numeroBirilli;
    }


}
