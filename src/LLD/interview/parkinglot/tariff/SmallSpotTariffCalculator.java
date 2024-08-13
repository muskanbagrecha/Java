package src.LLD.interview.parkinglot.tariff;

import java.time.LocalDateTime;

public class SmallSpotTariffCalculator implements TariffCalculator{
    private static final double SMALL_SPOT_TARIFF_PER_HOUR = 12.0;

    @Override
    public double calculateTariff(LocalDateTime startTime, LocalDateTime endTime) {
        double hours = java.time.Duration.between(startTime, endTime).toHours();
        return hours * SMALL_SPOT_TARIFF_PER_HOUR;
    }
}
