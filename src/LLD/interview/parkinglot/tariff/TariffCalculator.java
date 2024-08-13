package src.LLD.interview.parkinglot.tariff;

import java.time.LocalDateTime;

public interface TariffCalculator {
    double calculateTariff(LocalDateTime startTime, LocalDateTime endTime);
}
