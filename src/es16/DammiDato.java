package es16;


import java.util.Formatter;
import java.util.Locale;
import java.util.Random;

public class DammiDato {
    private static Random random = new Random();
    private static final String lettere ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private static final String caratteriSpeciali= "!%&/()=?^+-";
    private static final String[] sities = {"libero.it","msm.com","live.it","live.net","outlook.com","outlook.it",
    "gmail.com","hotmail.com","ymail.com","fastweb.com","hotmail.com"};

    private static String[] nome = {"Luca", "Giulio", "Mario", "Stefano", "Marco", "Enea", "Ermenegildo",
            "Tommaso", "Anna", "Carla", "Assunta", "Filomena", "Pasquale", "Pasqualina", "Gianluca",
            "Deianira", "Ilaria", "Ignazio", "Gianni", "Rosa", "Sara", "Pietro", "Melissa", "Adam", "Adrian",
            "Alan", "Alexander", "Andrew", "Anthony", "Austin", "Benjamin", "Blake", "Boris", "Brandon",
            "Brian", "Cameron", "Carl", "Charles", "Christian", "Christopher", "Colin", "Connor", "Dan",
            "David", "Dominic", "Dylan", "Edward", "Eric", "Evan", "Frank", "Gavin", "Gordon", "Harry",
            "Ian", "Isaac", "Jack", "Jacob", "Jake", "James", "Jason", "Joe", "John", "Jonathan", "Joseph",
            "Joshua", "Julian", "Justin", "Keith", "Kevin", "Leonard", "Liam", "Lucas", "Luke", "Matt", "Max",
            "Michael", "Nathan", "Neil", "Nicholas", "Oliver", "Owen", "Paul", "Peter", "Phil", "Piers", "Richard",
            "Robert", "Ryan", "Sam", "Sean", "Sebastian", "Simon", "Stephen", "Steven", "Stewart", "Thomas", "Tim",
            "Trevor", "Victor", "Warren", "William"};
    private static String[] cognome = {"Luzzi", "Di Ruberto", "Caniati", "Angelini", "Cicirello", "Taison", "Longobucco", "Fusaro", "D'Angelo", "D'onofrio",
            "Burloni", "Borriello", "Bartoletti", "De Biasi", "Colombo", "Abraham", "Allan", "Alsop", "Anderson", "Arnold", "Avery",
            "Bailey", "Baker", "Ball", "Bell", "Berry", "Black", "Blake", "Bond", "Bower", "Brown", "Buckland", "Burgess", "Butler",
            "Cameron", "Campbell", "Carr", "Chapman", "Churchill", "Clark", "Clarkson", "Coleman", "Cornish", "Davidson", "Davies", "Dickens",
            "Dowd", "Duncan", "Dyer", "Edmunds", "Ellison", "Ferguson", "Fisher", "Forsyth", "Fraser", "Gibson", "Gill", "Glover", "Graham",
            "Grant", "Gray", "Greene", "Hamilton", "Hardacre", "Harris", "Hart", "Hemmings", "Henderson", "Hill", "Hodges", "Howard", "Hudson",
            "Hughes", "Hunter", "Ince", "Jackson", "James", "Johnston", "Jones", "Kelly", "Kerr", "King", "Knox", "Lambert", "Langdon",
            "Lawrence", "Lee", "Lewis", "Lyman", "MacDonald", "Mackay", "Mackenzie", "MacLeod", "Manning", "Marshall", "Martin", "Mathis",
            "May", "McDonald", "McLean", "McGrath", "Metcalfe", "Miller", "Mills", "Mitchell", "Morgan", "Morrison", "Murray", "Nash",
            "Newman", "Nolan", "North", "Ogden", "Oliver", "Paige", "Parr", "Parsons", "Paterson", "Payne", "Peake", "Peters", "Piper",
            "Poole", "Powell", "Pullman", "Quinn", "Rampling", "Randall", "Rees", "Reid", "Roberts", "Robertson", "Ross", "Russell",
            "Rutherford", "Sanderson", "Scott", "Sharp", "Short", "Simpson", "Skinner", "Slater", "Smith", "Springer", "Stewart",
            "Sutherland", "Taylor", "Terry", "Thomson", "Tucker", "Turner", "Underwood", "Vance", "Vaughan", "Walker", "Wallace",
            "Walsh", "Watson", "Welch", "White", "Wilkins", "Wilson", "Wright", "Young"};
    private static String[] citta ={"Stonebutter","Mount Prospect","Independent Hill","Cape Town","Moreno Valley","Temecula","Sydney",
            "Amarillo","Lafayette","Beijing","Murfreesboro","Carrollton","Wilmington","Basseterre","Thousand Oaks","Moscow","Dorchester",
            "Biloxi","East Orange","Peterson Afb","Flower Mound","Lawrence","Salt Lake City","Vientiane","Verdi","Santa Rosa","Canton",
            "Belmopan","Mobile","Nashville","Vienna","Elwin","Swan Island","Silver Spring","Evansville","Monterey Park","Black Mtn",
            "Metairie","London","Pocatello","Oakland","Nouakchott","Maclay State Gardens","Farmington","Taylorsville","Langley View",
            "Pomona","East Albany","Pisgah Church","Burnsville","Rapid City","Arden-arcade","Oslo","Guaynabo","Bogot","North Virginia Beach",
            "Aguilares","Tarawa","Phoebus","Newbury","Lynnhaven","Hyde Park","Turner City","Ankara","Victoria","Redwood City","Orange",
            "Jacksonville","South Bend","Lake Forest","Mexico City","Bridgeport","Monrovia","Easton","Gulfport","Boca Raton","Ridgewood",
            "Concord","Oceanway","Douglas Park","Towson","Osgood","Portland","Lynwood","Lancaster","Oshkosh","Wellington","Hayward","Barcroft",
            "Lauderhill","Pine Bluff","Stepanakert","Elyria","Berwyn","Rancho Cucamonga","Waialae","San Mateo","Kingstown","Winterhaven",
            "Missouri City","Santa Barbara","Lincoln","Johnson City","Johnson Bayou","Lake Ashby","Port of Spain","Alexandria","Freetown",
            "Avarua","Johns Island","Howard Beach","Kabul","Oceana","Brazzaville","Delray Beach","Battery Point","Meriden","Clifton","Harlem",
            "Columbia","Montgomery","Nicosia","Willoughby Spit","Park Heights","Simpson","Chula Vista","Ventura","Carlsbad","Santa Clarita",
            "Asheville","Chino Hills","La Crosse","Kahala","Todt Hill","Natomas","West Palm Beach","Pasadena","Seekonk","San Jos","Grubbs",
            "Annandale","Lamarville","Stella","Euclid","Crichton","Toledo","Long Beach","Horseshoe","Haverhill","Hilton Village","West Haven",
            "Dakar","Brownsville","Fort Collins","Layton","South Santa Rosa","Tustin","Hammond","San Angelo","Georgetown","Igo","Aurora",
            "San Jose","Glendale","Doney Park","Southfield","Plymouth","Pawtucket"};

    private static String[] generiCinematografici={"Animazione", "Avventura", "Biografico", "Commedia", "Documentario",
            "Drammatico", "Pornografico", "Erotico", "Fantascienza", "Fantasy/Fantastico", "Guerra", "Horror", "Musical",
            "Storico", "Thriller", "Western"};
     private static String[] generiMusicali={"Alternative", "Ambient", "Bachata", "Ballate", "Blues", "Bossa nova",
             "Chanson francese","Chillout", "Classic rock", "Classica", "Country", "Disco", "Discofox", "Drum and bass",
             "Dub", "Easy listening", "Electro", "Fado",
             "Film e Musical", "Forró", "Funky",
             "Gospel", "Hard rock", "Heavy metal", "Hip hop", "Hits", "House", "Indie", "Industrial", "Jazz", "Kizomba",
             "Latina", "Medievale", "Merengue", "Minimal", "Motown", "Musica africana", "Musica asiatica", "Musica cristiana",
             "Musica gotica", "Musica islamica", "Musica orientale", "Musica popolare tedesca", "Musica tradizionale",
             "Notizie-Talk", "Oldies", "Podcast", "Pop", "Punk", "R&B", "Rap", "Reggae", "Reggaeton", "Rock", "Rock'n'roll",
             "Salsa", "Samba", "Schlager", "Sertanejo", "Ska", "Soul", "Strumentale", "Swing", "Tarantella", "Techno", "Trance",
             "Urban", "Zouk e Tropicale"};

     private static String[] titoli ={"A 007, dalla Russia con amore", "A 30 milioni di km dalla terra", "A 30 secondi dalla fine",
             "A Beautiful Day", "A Beautiful Mind", "A Better Tomorrow", "A Better Tomorrow II", "A Better Tomorrow III",
             "A Bigger Splash", "A Blast", "B. Monkey - una donna da salvare", "B.B. e il cormorano", "Baarìa", "Babadook",
             "Babbo bastardo", "Babbo bastardo 2", "Babbo Natale non viene da Nord", "Babe - Maialino coraggioso",
             "Babe va in citta'", "Babel", "C'è chi Dice No", "C'è tempo", "C'e' posta per te", "C'e'un cadavere in biblioteca",
             "C'era un cinese in coma", "C'era una volta", "C'era una volta a New York", "C'era una volta a... Hollywood",
             "C'era una volta il Principe Azzurro", "C'era una volta il West", "D'annunzio", "D'Annunzio", "D'artagnan the musketeer",
             "D-tox", "D.A.D.", "D.A.R.Y.L.", "D.O.A. - Cadavere in arrivo", "Da Corleone a Brooklyn", "Da grande",
             "Da hip hop witch", "E Allora Mambo!", "E Dio creò la donna (Piace a troppi)", "E fu sera e fu mattina",
             "E fuori nevica", "E guardo il mondo da un oblo'", "E io non pago - L'Italia dei furbetti", "E Johnny prese il fucile",
             "E l'uomo creò Satana!", "E la chiamano estate", "E la nave va", "F for fake", "F.B.I. operazione gatto",
             "F.I.S.T.", "F.t.w fuck the world", "Fa' la cosa giusta", "Fa' la cosa sbagliata",
             "Faber in Sardegna & L'ultimo concerto di Fabrizio De André", "Fabricando Tom Ze'", "Fabrizio De André - Principe Libero",
             "Faccia a faccia", "G-Force: Superspie in Missione", "G.I. Joe: La Nascita dei Cobra", "G.I. Joe: La Vendetta",
             "Gabbla (Inland)", "Gabo - Il mondo di Garcia Marquez", "Gabrielle", "Gabrielle - Un amore fuori dal coro", "Galantuomini",
             "Galaxy Quest", "Galline in fuga", "H2Oil", "Habana blues", "Habemus Papam", "Habitacion en Roma",
             "Hachiko - Il tuo migliore amico", "Hackers", "Hafez", "Hai Paura del Buio", "Hail", "Hair", "I 13 fantasmi",
             "I 2 deputati", "I 2 mafiosi", "I 2 sergenti del generale Custer", "I 2 soliti idioti", "I 3 dell'Operazione Drago",
             "I 4 dell'oca selvaggia", "I 4 figli di Katie Elder", "I 400 colpi", "I 7 minuti che contano", "J. Edgar", "Jabberwocky",
             "Jack", "Jack del cactus", "Jack e Jill", "Jack Frusciante È uscito dal gruppo", "Jack Goes Boating",
             "Jack Reacher - La prova decisiva", "Jack Reacher - Punto di non ritorno", "Jack Ryan - L'iniziazione",
             "K-19", "K-Pax - Da un altro mondo", "k.364 a journey by train", "Kaan principe guerriero", "Kaboom",
             "Kagemusha - L'ombra del guerriero", "Kamasutra", "Kamchatka", "Kamikazen - Ultima notte a Milano", "Kangaroo Jack - Prendi i soldi e salta",
             "L' abominevole Dr.Phibes", "L' acchiappasogni", "L' acqua...il fuoco", "L' altro lato del letto", "L' altro lato del paradiso",
             "L' amante di lady chatterley", "L' Amico del cuore", "L' amore e' piu' freddo della morte", "L' amore ha due facce",
             "L' amore il pomeriggio", "M - Il mostro di Düsseldorf", "M'ama non m'ama", "M*A*S*H", "M. Butterfly", "M.d.c. maschera di cera",
             "M.I.A. - La cattiva ragazza della musica", "Ma", "Ma che bella sorpresa", "Ma che ci faccio qui!", "Ma che colpa abbiamo noi", "N - Io e Napoleone",
             "N-Capace", "Nackt", "Nader and Simin, A Separation", "Nadie hablara' de nosotras cuando hayamos muerto", "Nahid", "Nailed", "Nameless entita' nascosta",
             "Nanny McPhee", "Naples '44", "O come otello", "O fatalista", "O le tulafale", "O Pai O", "O Signo da cidade - The Sign Of The City", "O' Jerusalem",
             "O.K. Connery", "Oasis", "Oasis: Supersonic", "Obbligo o verità", "P.S. I Love You", "P3k: pinocchio 3000", "Pa-ra-da", "Pacific Rim",
             "Pacific Rim - La rivolta", "Paco de Lucía: La busqueda", "Paddington", "Paddington 2", "Padiglione 22", "Padre padrone", "Q", "Q - Il serpente alato",
             "Qua la mano", "Qua la mano picchiatello!", "Qua la zampa!", "Quadrophenia", "Qualche nuvola", "Qualcosa di buono", "Qualcosa di cui... sparlare",
             "Qualcosa di noi", "R", "R.I.P.D.", "R.I.P.D. - Poliziotti dall'aldilÀ", "Raavan", "Rabbia furiosa - Er Canaro", "Rabbit Hole",
             "Rabbit School - I Guardiani dell'Uovo d'Oro", "Rabid sete di sangue", "Rabin, the Last Day", "Raccolto amaro", "" +
             "S club allo specchio", "S Is for Stanley", "S. Darko", "S.O.B. - Son of Bitch", "S.O.S. Fantasmi",
             "S.O.S. Summer of Sam. Panico a New York", "S.w.a.t.", "S.y.n.a.p.s.e. pericolo in rete", "Sabato domenica e venerdi'",
             "Sabbie mobili", "T2 Trainspotting", "Taboo", "Tabu", "Tacchi a spillo", "Tadpole", "Tahaan - A boy with a Grenade",
             "Tahrir 2011", "Tai Chi 0", "Takara - La notte che ho nuotato", "Take five", "U", "U – July 22", "U-571", "U-Boot 96", "U-Carmen",
             "U.S.A. contro John Lennon", "U2 3D", "U2 go home", "Ubaldo Terzani Horror Show", "Ubriaco d'amore", "V per Vendetta",
             "V/H/S", "V/H/S/2", "V/H/S: Viral", "Va' dove ti porta il cuore", "Va' e uccidi ", "Vacancy",
             "Vacanz...ieri, oggi e domani", "Vacanze ai Caraibi - Il film di Natale", "Vacanze di Natale", "W la foca",
             "W le donne", "W Zappatore", "W.", "W.E. Edoardo e Wallis", "Wacken 3D", "Wagon-lits con omicidi",
             "Waiting for Superman", "Waiting...", "Waitress", "X-Files: Voglio crederci", "X-Men", "X-Men 2", "X-Men Le Origini: Wolverine",
             "X-Men. Conflitto finale", "X-Men: Apocalisse", "X-Men: Dark Phoenix", "X-Men: Giorni di un futuro passato",
             "X-Men: L'Inizio", "Xanadu", "Y tu mamÁ tambiÉn   - Anche tua madre", "Yado ", "Yakuza", "Yamakasi i nuovi samurai",
             "Yattaman - Il Film", "Yellow 33", "Yellow Submarine", "Yentl", "Yes Man", "Yesterday", "Z, l'orgia del potere",
             "Zabriskie Point", "Zack e Miri amore a... primo sesso", "Zambezia", "Zampognaro innamorato", "Zanna Bianca", "Zarafa", "Zardoz",
             "Zathura: Un'avventura spaziale", "Zatoichi", "007 - Bersaglio mobile", "007 - Vendetta privata", "007 - Zona pericolo",
             "007 Il domani non muore mai", "007 Il mondo non basta", "007 La spia che mi amava", "007 Licenza di uccidere",
             "007 Mai dire mai", "007 Spectre", "007 Vivi e lascia morire"};
    public static String[] console = {"Atari2006","Nintendo Es","Comodore64","SEGA master system","xbox","PS"};
    public static String[] marche={};

    private static String generaPrefisso(){
       return 300+ random.nextInt(100) +"";
    }
    public static String generatoreNumeriDiTelefono(int lunghezza){
        String tmp = generaPrefisso();
       while(tmp.length() < lunghezza){
            tmp += random.nextInt(10);
        }
        return tmp;
    }
    public static String generatoreCittà(){
        int index = random.nextInt(citta.length);
        return citta[index];
    }

    public static String generatoreDiNomi(){
      int index = random.nextInt(nome.length);
    return nome[index];}


    public static String generatoreCognomi(){
        int index = random.nextInt(cognome.length);
        return cognome[index];}

    public static final String generaPassword(){
        return generaPassword(8);
    }

    public static final String generaPassword(int lunghezza){
        String tmp = " ";
        String chars = lettere+ caratteriSpeciali;
        for (int i = 0; i < lunghezza ; i++) {
            tmp += chars.charAt(random.nextInt(chars.length()));
        }
        return tmp;
    }
    public static String getPin(int lunghezza){
        String tmp = "";
        while(tmp.length() < lunghezza){
            tmp += random.nextInt(10);
        }
        return tmp;
    }

    public static String getNumero(int lunghezza){
        return getPin(lunghezza);
    }

    public static String getCrediCard(){
        return getPin(16);
    }

    public static String getMail(){
        String tmp = "";
        String join = "._-";
        tmp += generatoreDiNomi();
        tmp += join.charAt(random.nextInt(join.length()));
        tmp += generatoreCognomi();
        tmp += random.nextBoolean()?"": random.nextInt(100);
        tmp += "@" + sities[random.nextInt(sities.length)];
        return tmp;
    }

    public static int getAge(int min , int max){
        return min + random.nextInt(max-min);
    }
    public static int getAge(){
        return 110;
    }

      public static double getRandomTemp(double base, double delta) {
          Formatter format = new Formatter();
          double temp = 0, scarto;
          Random r = new Random();
          scarto = r.nextDouble() * delta;
          if (r.nextBoolean()) {
              //aggiungo
              temp = base + scarto;
          } else {
              //sottraggo
              temp = base - scarto;
          }
          return Double.parseDouble(String.valueOf(format.format(Locale.UK,"%.2f",temp)));
      }

      public static String getGeneriCinematografici(){
          int index = random.nextInt(generiCinematografici.length);
          return generiCinematografici[index];
      }
    public static String getGeneriMusicali(){
        int index = random.nextInt(generiMusicali.length);
        return generiMusicali[index];
    }

    public static String getTitoloFilm(){
        int index = random.nextInt(titoli.length);
        return titoli[index];
    }


    public static String getConsole() {
        int index = random.nextInt(console.length);
        return console[index];
    }
}// end Class
