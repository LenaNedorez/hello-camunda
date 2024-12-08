package ru.nedorezova.hellocamunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class HelloDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String eventName = delegateExecution.getEventName();
        System.out.println(eventName);
    }
}
