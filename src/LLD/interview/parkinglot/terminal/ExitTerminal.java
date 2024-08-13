package src.LLD.interview.parkinglot.terminal;

import src.LLD.interview.parkinglot.model.ParkingTicket;
import src.LLD.interview.parkinglot.payment.PaymentProcessor;
import src.LLD.interview.parkinglot.tariff.TariffCalculator;

import java.time.LocalDateTime;

public class ExitTerminal {

    private TariffCalculator tariffCalculator;

    public ExitTerminal(TariffCalculator tariffCalculator){
        this.tariffCalculator = tariffCalculator;
    }

    public void acceptTicket(ParkingTicket ticket, PaymentProcessor paymentProcessor){
        ticket.setEndTime(LocalDateTime.now());
        double tariff = tariffCalculator.calculateTariff(ticket.getStartTime(), ticket.getEndTime());
        boolean isPaymentSuccessful = paymentProcessor.makePayment(tariff);
        if(isPaymentSuccessful){
            //TODO: release the spot.
        }
    }

}
