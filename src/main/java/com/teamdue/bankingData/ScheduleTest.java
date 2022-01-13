package com.teamdue.bankingData;

import com.teamdue.bankingData.interfaces.CompanyInterface;
import com.teamdue.bankingData.model.Anagrafica;
import com.teamdue.bankingData.repository.AnagraficaRepository;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTest implements CompanyInterface {

    @Autowired
    private AnagraficaRepository anagraficaRepository;

    private static final Logger log = LoggerFactory.getLogger(ScheduleTest.class);

    @Scheduled(fixedRate = 600000) //10 minuti
    public void reportCurrentTime(){
        Iterable<Anagrafica> listaAnagrafica = anagraficaRepository.findAll();

        while(listaAnagrafica.iterator().hasNext()){
            listaAnagrafica.iterator().next();

        }

        System.out.println(
                "Millisec: " +
                System.currentTimeMillis());
    }

    @Override
    public void checkStatusAnagrafica(String ndg) {


    }
}
