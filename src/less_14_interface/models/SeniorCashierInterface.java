package less_14_interface.models;

import less_14_interface.services.AdministratorService;
import less_14_interface.services.CashierService;

/**
 * TheSusanin
 * 3/17/2021
 */
public class SeniorCashierInterface extends EmployeeInterface implements AdministratorService, CashierService {
    public SeniorCashierInterface(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void income() {

    }

    @Override
    public void openOerDay() {

    }

    @Override
    public void closeOperDay() {

    }

    @Override
    public void sell() {

    }

    @Override
    public void cancelOper() {

    }
}
