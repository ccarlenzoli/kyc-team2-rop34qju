package com.teamdue.bankingData;

import com.teamdue.bankingData.repository.AnagraficaRepository;
import com.teamdue.bankingData.model.Company;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTest {

    @Autowired
    private AnagraficaRepository anagraficaRepository;

    private static final Logger log = LoggerFactory.getLogger(ScheduleTest.class);

    @Scheduled(fixedRate = 600000) //10 minuti
    public void reportCurrentTime(){
        Iterable<Company> listaAnagrafica = anagraficaRepository.findAll();

        while(listaAnagrafica.iterator().hasNext()){
            System.out.println(listaAnagrafica.iterator().next());
        }

        System.out.println(
                "Millisec: " +
                System.currentTimeMillis());
    }
}
