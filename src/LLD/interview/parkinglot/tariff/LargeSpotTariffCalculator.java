package src.LLD.interview.parkinglot.tariff;

import java.time.Duration;
import java.time.LocalDateTime;

public class LargeSpotTariffCalculator implements TariffCalculator {

    private static final double LARGE_SPOT_TARIFF_PER_HOUR = 20.0;

    @Override
    public double calculateTariff(LocalDateTime startTime, LocalDateTime endTime) {
        double hours = Duration.between(startTime, endTime).toHours();
        return hours * LARGE_SPOT_TARIFF_PER_HOUR;
    }
}
