import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalArrayTest {
//
//    // No generics
//    public AnimalArray<Lion> lionList;
//    public AnimalArray<Tiger> tigerList;
//    public AnimalArray<Zebra> zebraList;
//    public AnimalArray<Donkey> donkeyList;
//    public AnimalArray<Horse> horseList;
//
//
//    @BeforeEach
//    void beforeAll() throws InstantiationException, IllegalAccessException {
//
//    }
//
//    @Test
//    public void count_animalFarmCount_True() throws InstantiationException, IllegalAccessException {
//        AnimalFarm farm = new AnimalFarm();
//        farm.print();
//
//        assertAll("Should return number of animals",
//                () -> assertEquals(farm.lionList.getLength(), 5),
//                () -> assertEquals(farm.tigerList.getLength(), 5),
//                () -> assertEquals(farm.zebraList.getLength(), 10),
//                () -> assertEquals(farm.donkeyList.getLength(), 7),
//                () -> assertEquals(farm.horseList.getLength(), 20));
//    }
//
//    @Test
//    public void insert_insertLigerWithLion_True() {
//
//        Liger liger = new Liger("liger1");
//
//        lionList.insert(liger);
//
//        String expected = liger.getName();
//        String actual = lionList.get(3).getName();
//
//        assertEquals(actual, expected);
//    }
//
//
//    @Test
//    public void insert_insertLigerWithTiger_True() {
//        Liger liger = new Liger("liger1");
//
//        tigerList.insert(liger);
//
//        String expected = liger.getName();
//        String actual = tigerList.get(3).getName();
//
//        assertEquals(actual, expected);
//    }
//
//
//    @Test
//    public void insert_insertLigerWithZebra_True() {
//        Liger liger = new Liger("liger1");
//
//        assertThrows(RuntimeException.class, () -> zebraList.insert(liger));
//    }
//
//    @Test
//    public void insert_insertLigerWithDonkey_True() {
//        Liger liger = new Liger("liger1");
//
//        assertThrows(RuntimeException.class, () -> donkeyList.insert(liger));
//    }
//
//    @Test
//    public void insert_insertLigerWithHorse_True() {
//        Liger liger = new Liger("liger1");
//
//        assertThrows(RuntimeException.class, () -> horseList.insert(liger));
//    }
//
//
//    @Test
//    public void insert_insertZebraWithDonkey_True() {
//        Zebra zebra = new Zebra("Zebra1");
//
//        donkeyList.insert(zebra);
//
//        String expected = zebra.getName();
//        String actual = donkeyList.get(3).getName();
//
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    public void insert_insertDonkeyWithZebra_True() {
//        Donkey donkey = new Donkey("donkey1");
//
//        zebraList.insert(donkey);
//
//        String expected = donkey.getName();
//        String actual = zebraList.get(3).getName();
//
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    public void insert_insertZebraWithLion_True() {
//        Zebra zebra = new Zebra("Zebra1");
//
//        assertThrows(RuntimeException.class, () -> lionList.insert(zebra));
//    }
//
//    @Test
//    public void insert_insertMuleWithDonkey_True() {
//        Mule mule = new Mule("mule4");
//        donkeyList.insert(mule);
//
//        String expected = mule.getName();
//        String actual = donkeyList.get(3).getName();
//
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    public void insert_insertMuleWithHourse_True() {
//        Mule mule = new Mule("mule4");
//        horseList.insert(mule);
//
//        String expected = mule.getName();
//        String actual = horseList.get(3).getName();
//
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    public void insert_insertMuleWithZebra_True() {
//        Mule mule = new Mule("mule4");
//
//        assertThrows(RuntimeException.class, () -> zebraList.insert(mule));
//    }
//
//    @Test
//    public void insert_insertMuleWithTiger_True() {
//        Mule mule = new Mule("mule4");
//
//        assertThrows(RuntimeException.class, () -> tigerList.insert(mule));
//    }
//


}
