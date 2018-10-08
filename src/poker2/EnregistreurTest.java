package poker2;

//import static org.assertj.core.api.Assertions.*;


import java.util.ArrayList;
        import java.util.List;

public class EnregistreurTest {
    private List<Carte> creerPaquet(List<Integer> liste_nbr, List<String> liste_col){
        ArrayList<Carte> paquet = new ArrayList<>();
        for (int i = 0; i!= 5; ++i)
            paquet.add(new Carte(liste_nbr.get(i), liste_col.get(i)));
        return paquet;
    }
    /*
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

    @Test
    public void checkDoublonsTestGlobal1() {
        String data1 = "2Pi 2Pi APi VPi RPi";
        Throwable thrown = catchThrowable(() ->
            { dummy = runEnregistreur(data1); });
        assertThat(thrown).isInstanceOf(RuntimeException.class)
                .hasMessage("Une carte au moins a été utilisée plusieurs fois");
    }

    @Test
    public void checkDoublonsTestGlobal2(){
        String data1 = "2Pi 2Pi 2Pi VPi RPi";
        Throwable thrown = catchThrowable(() ->
        { dummy = runEnregistreur(data1); });
        assertThat(thrown).isInstanceOf(RuntimeException.class)
                .hasMessage("Une carte au moins a été utilisée plusieurs fois");
    }

     @Test
     public void checkExtraireCouleur1(){
         String data1 = "2He 2Pi APi VPi RPi";
         Throwable thrown = catchThrowable(() ->
         { dummy = runEnregistreur(data1); });
         assertThat(thrown).isInstanceOf(RuntimeException.class)
                 .hasMessage("La saisie de la famille d'au moins une carte n'a pas été reconnue\nRappel: utiliser {Pi,Co,Tr,Ca}");
     }

     @Test
     public void checkExtraireCouleur2(){
         String data1 = "2Br 2Pi APi VHe RPi";
         Throwable thrown = catchThrowable(() ->
         { dummy = runEnregistreur(data1); });
         assertThat(thrown).isInstanceOf(RuntimeException.class)
                 .hasMessage("La saisie de la famille d'au moins une carte n'a pas été reconnue\nRappel: utiliser {Pi,Co,Tr,Ca}");
     }

     @Test
     public void checkExtraireCouleur3(){
         String data1 = "47Pi 2Co APi VPi RPi";
         Throwable thrown = catchThrowable(() ->
         { dummy = runEnregistreur(data1); });
         assertThat(thrown).isInstanceOf(RuntimeException.class)
                 .hasMessage("La saisie de la famille d'au moins une carte n'a pas été reconnue\nRappel: utiliser {Pi,Co,Tr,Ca}");
     }
    @Test
    public void checkExtraireCouleur4(){
        String data1 = "22Pi 2Co APi VPi RPi";
        Throwable thrown = catchThrowable(() ->
        { dummy = runEnregistreur(data1); });
        assertThat(thrown).isInstanceOf(RuntimeException.class)
                .hasMessage("La saisie de la famille d'au moins une carte n'a pas été reconnue\nRappel: utiliser {Pi,Co,Tr,Ca}");
    }



    @Test
    public void checkConvertisseurIndice1(){
        String data1 = "MPi 2Co APi VCa RPi";
        Throwable thrown = catchThrowable(() ->
        { dummy = runEnregistreur(data1); });
        assertThat(thrown).isInstanceOf(RuntimeException.class)
                .hasMessage("La saisie de la valeur d'au moins une carte n'a pas été reconnue\nRappel: utiliser des entiers de 2 à 10 et {V,D,R,A}");
    }
    @Test
    public void checkConvertisseurIndice2(){
        String data1 = "ZPi 2Co APi VPi RPi";
        Throwable thrown = catchThrowable(() ->
        { dummy = runEnregistreur(data1); });
        assertThat(thrown).isInstanceOf(RuntimeException.class)
                .hasMessage("La saisie de la valeur d'au moins une carte n'a pas été reconnue\nRappel: utiliser des entiers de 2 à 10 et {V,D,R,A}");
    }
    @Test
    public void checkConvertisseurIndice3(){
        String data1 = "ZlPi 2Co APi VPi RPi";
        Throwable thrown = catchThrowable(() ->
        { dummy = runEnregistreur(data1); });
        assertThat(thrown).isInstanceOf(RuntimeException.class)
                .hasMessage("La saisie de la valeur d'au moins une carte n'a pas été reconnue\nRappel: utiliser des entiers de 2 à 10 et {V,D,R,A}");
    }
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
    public void convertisseurIndice() {
        ArrayList<Carte> paquet1 = new ArrayList<>();
        for (int i = 0; i != 10; ++i)
            paquet1.add(new Carte(i+1, "Pi"));
        Enregistreur paquet = new Enregistreur(paquet1);

        assertEquals(paquet.convertisseurIndice("4"),3);
        assertEquals(paquet.convertisseurIndice("D"), 11);
    }
    @Test
    public void checkConvertisseurIndice4(){
        ArrayList<Carte> paquet1 = new ArrayList<>();
        for (int i = 0; i != 10; ++i)
            paquet1.add(new Carte(i+1, "Pi"));
        Enregistreur paquet = new Enregistreur(paquet1);

        Throwable thrown = catchThrowable(() ->
        { assertEquals(paquet.convertisseurIndice("Z"), 0);
        });
        assertThat(thrown).isInstanceOf(RuntimeException.class)
                .hasMessage("La saisie de la valeur d'au moins une carte n'a pas été reconnue\nRappel: utiliser des entiers de 2 à 10 et {V,D,R,A}");
    }

    @Test
    public void checkDoublonsTest() {
        ArrayList<Carte> paquet1 = new ArrayList<>();
        for (int i = 1; i < 14; ++i)
            paquet1.add(new Carte(i, "Pi"));
        Enregistreur paquet = new Enregistreur(paquet1);
        assertEquals(paquet.checkDoublons(new Carte(4, "Pi")), true);
        assertEquals(paquet.checkDoublons(new Carte(15, "Pi")), false);
        assertEquals(paquet.checkDoublons(new Carte(5, "Pi")), true);
        assertEquals(paquet.checkDoublons(new Carte(25, "Pi")), false);
    }
    */
}