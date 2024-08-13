package src.LLD.interview.parkinglot.tariff;

import java.time.Duration;
import java.time.LocalDateTime;

public class HandicappedTariffCalculator implements TariffCalculator{

    public static final double HANDICAPPED_TARIFF_PER_HOUR = 10.0;

    @Override
    public double calculateTariff(LocalDateTime startTime, LocalDateTime endTime) {
        double hours = Duration.between(startTime, endTime).toHours();
        return hours * HANDICAPPED_TARIFF_PER_HOUR;
    }
}
