package com.teamdue.bankingData;

import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTest {

    private static final Logger log = LoggerFactory.getLogger(ScheduleTest.class);

    @Scheduled(fixedRate = 600000) //10 minuti
    public void reportCurrentTime(){
        System.out.println(
                "Millisec: " +
                System.currentTimeMillis()
        );
    }
}
