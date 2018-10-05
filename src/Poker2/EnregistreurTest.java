package Poker2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class EnregistreurTest {
    private List<Carte> creerPaquet(List<Integer> liste_nbr, List<String> liste_col){
        ArrayList<Carte> paquet = new ArrayList<>();
        for (int i = 0; i!= 5; ++i)
            paquet.add(new Carte(liste_nbr.get(i), liste_col.get(i)));
        return paquet;
    }

    private List<Carte> runEnregistreur(String data){
        Enregistreur enr;
        // MOCK System.in
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        enr = new Enregistreur();
        // RESTABLISH System.in
        Scanner scanner = new Scanner(System.in);
        System.setIn(stdin);
        // If you arrive here, it's OK
        enr.printPaquet();
        return enr.getPaquet();
    }

    private List<Integer> liste_nbr_2;
    private List<String> liste_col_2;
    private List<Carte> dummy;

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void testEnregistrer() throws Exception
    {
        String data2 = "2Pi 2Co APi VPi RPi";
        liste_nbr_2 = new ArrayList<>(Arrays.asList(1, 1, 13, 10, 12));
        liste_col_2 = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Pi", "Pi"));
        assertEquals(runEnregistreur(data2), creerPaquet(liste_nbr_2, liste_col_2));

        //dummy = runEnregistreur(data4);
    }

    @Test
    public void exitsWithStatusCodeN3One() {
        String data1 = "2Pi 2Pi APi VPi RPi";
        exit.expectSystemExitWithStatus(-3);
        dummy = runEnregistreur(data1);
    }
    @Test
    public void exitsWithStatusCodeN3Two() {
        String data1 = "2Pi 2Pi 2Pi VPi RPi";
        exit.expectSystemExitWithStatus(-3);
        dummy = runEnregistreur(data1);
    }
    @Test
    public void exitsWithStatusCodeN2One() {
        exit.expectSystemExitWithStatus(-2);
        String data2 = "2He 2Pi APi VPi RPi";
        dummy = runEnregistreur(data2);
    }
    @Test
    public void exitsWithStatusCodeN2Two() {
        exit.expectSystemExitWithStatus(-2);
        String data2 = "2Br 2Pi APi VHe RPi";
        dummy = runEnregistreur(data2);
    }
    @Test
    public void exitsWithStatusCodeN2Three() {
        exit.expectSystemExitWithStatus(-2);
        String data2 = "47Pi 2Co APi VPi RPi";
        dummy = runEnregistreur(data2);
    }
    @Test
    public void exitsWithStatusCodeN2Four() {
        exit.expectSystemExitWithStatus(-2);
        String data2 = "22Pi 2Co APi VPi RPi";
        dummy = runEnregistreur(data2);
    }
    @Test
    public void exitsWithStatusCodeN1One() {
        exit.expectSystemExitWithStatus(-1);
        String data2 = "MPi 2Co APi VCa RPi";
        dummy = runEnregistreur(data2);
    }
    @Test
    public void exitsWithStatusCodeN1Two() {
        exit.expectSystemExitWithStatus(-1);
        String data2 = "ZPi 2Co APi VPi RPi";
        dummy = runEnregistreur(data2);
    }
    @Test
    public void exitsWithStatusCodeN1Three() {
        exit.expectSystemExitWithStatus(-1);
        String data2 = "ZlPi 2Co APi VPi RPi";
        dummy = runEnregistreur(data2);
    }

    @Test
    public void convertisseurIndice() {
        ArrayList<Carte> paquet1 = new ArrayList<>();
        for (int i = 0; i != 10; ++i)
            paquet1.add(new Carte(i+1, "Pi"));
        Enregistreur paquet = new Enregistreur(paquet1);

        assertEquals(paquet.convertisseurIndice("4"),3);
        assertEquals(paquet.convertisseurIndice("D"), 11);
        assertEquals(paquet.convertisseurIndice("Z"), 0);
    }

    @Test
    public void checkDoublons() {
        ArrayList<Carte> paquet1 = new ArrayList<>();
        for (int i = 0; i != 10; ++i)
            paquet1.add(new Carte(i+1, "Pi"));
        Enregistreur paquet = new Enregistreur(paquet1);
        assertEquals(paquet.checkDoublons(new Carte(4, "Pi")), true);
        assertEquals(paquet.checkDoublons(new Carte(15, "Pi")), false);
    }
}