package group.msg.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ServiceTask implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Long serviceTaskInput = (Long) delegateExecution.getVariable("serviceTaskInput");

        System.out.println("serviceTaskInput=" + serviceTaskInput);
    }
}
