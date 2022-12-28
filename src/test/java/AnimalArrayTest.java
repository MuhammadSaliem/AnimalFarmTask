import org.example.farm.AnimalFarm;
import org.example.models.Donkey;
import org.example.models.Liger;
import org.example.models.Mule;
import org.example.models.Zebra;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalArrayTest {

    // No generics
    public AnimalFarm farm;


    @BeforeEach
    void beforeEach() throws InstantiationException, IllegalAccessException {
        farm = new AnimalFarm();
    }

    @Test
    public void count_animalFarmCount_True() throws InstantiationException, IllegalAccessException {
        farm.display();

        assertAll("Should return number of animals",
                () -> assertEquals(farm.getLionList().getLength(), 5),
                () -> assertEquals(farm.getTigerList().getLength(), 5),
                () -> assertEquals(farm.getZebraList().getLength(), 10),
                () -> assertEquals(farm.getDonkeyList().getLength(), 7),
                () -> assertEquals(farm.getHorseList().getLength(), 20));
    }

}
