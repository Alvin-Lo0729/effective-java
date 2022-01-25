package idv.alvin.efjava.charpter2.item3;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Alvin
 */
// Singleton with public final field
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
        if (Objects.nonNull(INSTANCE)) {
            throw new IllegalArgumentException("ewfasd");
        }

        System.out.println("private Elvis");
    }

    public void leaveTheBuilding() {
        System.out.println("leaveTheBuilding");
    }
}

