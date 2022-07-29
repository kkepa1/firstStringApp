package com.deloitte.firstStringApp.dependency;

import com.deloitte.firstStringApp.FirstStringAppApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleApp implements CommandLineRunner {
    private static Logger LOG = (Logger) LoggerFactory.getLogger(FirstStringAppApplication.class);

    @Autowired
    private Printer printer;

    @Override
    public void run(String... args) {
        LOG.info("EXECUTING : command line runner");

        printer.print();

        for (int i = 0; i < args.length; ++i) {
            LOG.info("args[{}]: {}", i, args[i]);
        }
    }
}
