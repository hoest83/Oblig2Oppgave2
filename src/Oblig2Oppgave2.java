//Oppgave 2 - Tallspill
//Det skal brukes javax.swing sine input- og meldings-bokser i denne oppgaven.
//
//Oppgaven er å lage et program for et tallspill.
//
//Programmet skal generere et tilfeldig helt tall (slumptall) mellom 0 og 200 (begge grensene inkludert). Spilleren skal prøve å gjette på dette tallet. For hver gjetning, som foretas ved at det vises en slik innlesningsboks:
//
//
//
//skal brukeren få beskjed om gjetningen er større enn eller mindre enn det ukjente tallet, som i følgende eksempel:
//
//
//
//Input tallet bør feilhåndteres ved konverteringen til tall (bruk try/catch).
//
//Så skal ny innlesing foretas. Slik skal det fortsette inntil spilleren har gjettet riktig. Da skal det gis beskjed om dette sammen med antall gjetninger som ble foretatt, som i følgende eksempel:
//
//
//
//Programmet skal organiseres i form av klassen  Tallspill som er skissert nedenfor.
//
//import static javax.swing.JOptionPane.*;
//
//class Tallspill
//{
//  public int nyttTall() {
//    // Trekker og returnerer et slumptall mellom 0 og 200.
//    // Tips bruk : (int) (Math.random() * 201), som gir verdier mellom 0 og 200
//  }
//
//  public void visMelding(String melding){
//    // Viser parameterens innhold i en meldingsboks.
//  }
//
//  private void forLite(int tall){
//    /* Viser melding om at parameterens verdi er for
//       lite tall og ber spilleren prøve igjen. */
//  }
//
//  private void forStort(int tall) {
//    /* Viser melding om at parameterens verdi er for
//      stort tall og ber spilleren prøve igjen. */
//  }
//
//  public void avsluttRunde(int antall, int gjetning) {
//    /* Viser melding om at det ble gjettet riktig
//      og antall gjetninger som ble brukt.
//      Parametrene gir opplysninger om dette. */
//  }
//
//  public void kjørSpill() {
//    /* Kjører en spillrunde ved å trekke et tall,
//      nullstille tellevariabel, innhente gjentatte
//      gjetninger fra bruker inntil det gjettes riktig.
//      Når det skjer, avsluttes runden med passe
//      meldinger til spilleren. */
//  }
//}
//Skriv også nødvendig kode i main-metoden for å kunne kjøre spillet.

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;



public class Oblig2Oppgave2 {





    public static void main(String[] args) {


int test = (int) (Math.random() * 201); //random nummer
int riktig = 1; //while lokke mens spillet pågår
        int i = 0;
        showMessageDialog(null,"Teller 0 1");

while (riktig == 1){

    int inputinttall = 0;        //settes til null for initalisere variabel og for hå teste om bruker skriver tall

    while (inputinttall == 0){  //går ut av while når det skrives et nummer og ikke skrift

        String inputstringtall = showInputDialog("Jeg tenker på et tall mellom 0 og 200" + "\n"+"Prøv og gjette tallet:" + test); //input på nummer
        try{                                                                                                //try catch på inputstreng til int tall
            inputinttall = Integer.parseInt (inputstringtall);

        }
        catch (Exception e){
            showMessageDialog(null,"du skrev ikke inn et tall men" + " " + "'" + inputstringtall + " "); //feilmelding på feilinnskrivning
            i = 0;
            showMessageDialog(null,"Teller 0 2");
        }



        if (inputinttall == test){   //      private void forLite(int tall){
//    /* Viser melding om at parameterens verdi er for
//       lite tall og ber spilleren prøve igjen. */
//  }
                showMessageDialog(null,"Tallet er for riktig");
            showMessageDialog(null,"Du brukte " +i +" ganger på å gjette riktig" );
                riktig = 0;


    }
            else if (inputinttall > test){
                showMessageDialog(null,"Tallet er for stort");
                i++;
                //     showMessageDialog (null,"tallet er" + inputinttall + " " + test);   //utskrift av int tall
            }
  else if (inputinttall < test){
                    showMessageDialog(null,"Tallet er for lite");
                    i++;
            }

}
}
    }
}