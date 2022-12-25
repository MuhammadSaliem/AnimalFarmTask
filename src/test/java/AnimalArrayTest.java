import org.example.interfaces.IAnimal;
import org.example.models.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class AnimalArrayTest {

    public AnimalArray<Lion> lionList;
    public AnimalArray<Tiger> tigerList;
    public AnimalArray<Zebra> zebraList;
    public AnimalArray<Donkey> donkeyList;
    public AnimalArray<Horse> horseList;


    @BeforeEach
    void beforeAll() throws InstantiationException, IllegalAccessException {
        lionList = new AnimalArray<Lion>(Lion.class, 3);
        lionList.insert(new Lion("lion1"));
        lionList.insert(new Lion("lion2"));
        lionList.insert(new Lion("lion3"));

        tigerList = new AnimalArray<Tiger>(Tiger.class, 3);
        tigerList.insert(new Tiger("tiger1"));
        tigerList.insert(new Tiger("tiger2"));
        tigerList.insert(new Tiger("tiger3"));

        zebraList = new AnimalArray<Zebra>(Zebra.class, 3);
        zebraList.insert(new Zebra("zebra1"));
        zebraList.insert(new Zebra("zebra2"));
        zebraList.insert(new Zebra("zebra3"));

        donkeyList = new AnimalArray<Donkey>(Donkey.class, 3);
        donkeyList.insert(new Donkey("donkey1"));
        donkeyList.insert(new Donkey("donkey2"));
        donkeyList.insert(new Donkey("donkey3"));

        horseList = new AnimalArray<Horse>(Horse.class, 3);
        horseList.insert(new Horse("horse1"));
        horseList.insert(new Horse("horse2"));
        horseList.insert(new Horse("horse3"));

    }


    @Test
    public void insert_insertLigerWithLion_True()
    {
        Liger liger = new Liger("liger1");

        lionList.insert(liger);

        String expected = liger.getName();
        String actual = lionList.get(3).getName();

        assertEquals(actual, expected);
    }


    @Test
    public void insert_insertLigerWithTiger_True()
    {
        Liger liger = new Liger("liger1");

        tigerList.insert(liger);

        String expected = liger.getName();
        String actual = tigerList.get(3).getName();

        assertEquals(actual, expected);
    }

    @Test
    public void insert_insertLigerWithZebra_True()
    {
        Liger liger = new Liger("liger1");

        assertThrows(RuntimeException.class, () -> zebraList.insert(liger));
    }

    @Test
    public void insert_insertLigerWithDonkey_True()
    {
        Liger liger = new Liger("liger1");

        assertThrows(RuntimeException.class, () -> donkeyList.insert(liger));
    }

    @Test
    public void insert_insertLigerWithHorse_True()
    {
        Liger liger = new Liger("liger1");

        assertThrows(RuntimeException.class, () -> horseList.insert(liger));
    }


    @Test
    public void insert_insertZebraWithDonkey_True()
    {
        Zebra zebra = new Zebra("Zebra1");

        donkeyList.insert(zebra);

        String expected = zebra.getName();
        String actual = donkeyList.get(3).getName();

        assertEquals(actual, expected);
    }

    @Test
    public void insert_insertDonkeyWithZebra_True()
    {
        Donkey donkey = new Donkey("donkey1");

        zebraList.insert(donkey);

        String expected = donkey.getName();
        String actual = zebraList.get(3).getName();

        assertEquals(actual, expected);
    }

    @Test
    public void insert_insertZebraWithLion_True()
    {
        Zebra zebra = new Zebra("Zebra1");

        assertThrows(RuntimeException.class, () -> lionList.insert(zebra));
    }

    @Test
    public void insert_insertMuleWithDonkey_True()
    {
        Mule mule = new Mule("mule4");
        donkeyList.insert(mule);

        String expected = mule.getName();
        String actual = donkeyList.get(3).getName();

        assertEquals(actual, expected);
    }

    @Test
    public void insert_insertMuleWithHourse_True()
    {
        Mule mule = new Mule("mule4");
        horseList.insert(mule);

        String expected = mule.getName();
        String actual = horseList.get(3).getName();

        assertEquals(actual, expected);
    }

    @Test
    public void insert_insertMuleWithZebra_True()
    {
        Mule mule = new Mule("mule4");

        assertThrows(RuntimeException.class, () -> zebraList.insert(mule));
    }

    @Test
    public void insert_insertMuleWithTiger_True()
    {
        Mule mule = new Mule("mule4");

        assertThrows(RuntimeException.class, () -> tigerList.insert(mule));
    }

}
